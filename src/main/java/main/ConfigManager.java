package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by Administrator on 2017/7/26.
 */
public class ConfigManager {
    private Properties mProps;


//    private static ConfigManager instance;
//    public static ConfigManager getInstance() {
//        if (instance == null) {
//            instance = new ConfigManager();
//        }
//        return instance;
//    }
    private volatile static ConfigManager instance;
    public static ConfigManager getInstance() {
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
                return instance;
            }
        }
        return instance;
    }

    private ConfigManager(){
        mProps = new Properties();
        try{
            System.out.println("------单例类被初始化-----");
            InputStreamReader in = new InputStreamReader(new FileInputStream("./conf/application.properties"),"UTF-8");
            BufferedReader reader = new BufferedReader(in);
            mProps.load(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String getDb(){
        String db = mProps.getProperty("metaDbDriver").toString();
        return db;
    }
    public String getUser(){
        String user = mProps.getProperty("User").toString();
        return user;
    }

}
