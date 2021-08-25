package Utils;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;
import java.util.Map;
import java.util.Properties;

import static Utils.ConstantsUtils.CONFIG_FILE;
import static Utils.ConstantsUtils.CONFIG_PATH;

public class ConfigReader {

    public static String URL;
    public static String ENV;
    public static String BROWSER;
    public static boolean WEBDRIVER_MANAGER;


    public static void readConfigFile() {
        try(InputStream input = new FileInputStream(  CONFIG_PATH + CONFIG_FILE)) {
            Properties props = new Properties();
            props.load(input);
            String port = props.getProperty("URL_PORT", "80");
            String hostname = props.getProperty("URL_HOSTNAME", "localhost");
            String proto = props.getProperty("URL_PROTOCOL", "http");
            URL = proto + "://" + hostname + ":" + port + "/";
            ENV = props.getProperty("CURRENT_ENV");
            BROWSER = props.getProperty("RUN_BROWSER");
            WEBDRIVER_MANAGER = Boolean.parseBoolean(props.getProperty("WEB_DRIVER_MANAGER"));
            //Log.info(URL);
        }

        catch(FileNotFoundException fnf){
            Log.error("File not found: "+ CONFIG_PATH + CONFIG_FILE);
            Log.fatal(GeneralUtils.stackTraceConvert(fnf.getStackTrace()));
        }
        catch (IOException ioex){
            Log.error(ioex.getMessage());
            Log.fatal(GeneralUtils.stackTraceConvert((ioex.getStackTrace())));
        }
    }

    public static void writeConfigFIle(Map<String, String> configs){
        try(OutputStream output = new FileOutputStream( CONFIG_PATH + CONFIG_FILE)) {
            Properties props = new Properties();
            for (String key: configs.keySet()){
                props.setProperty(key, configs.get(key));
            }
            props.store(output, null);
        }

        catch(FileNotFoundException fnf){
            Log.error("File not found: "+ CONFIG_PATH + CONFIG_FILE);
            Log.fatal(GeneralUtils.stackTraceConvert(fnf.getStackTrace()));

        }
        catch (IOException ioex){
            Log.error(ioex.getMessage());
            Log.fatal(GeneralUtils.stackTraceConvert((ioex.getStackTrace())));
        }

    }


}
