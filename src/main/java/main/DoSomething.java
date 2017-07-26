package main;

/**
 * Created by Administrator on 2017/7/26.
 */
public class DoSomething implements Runnable  {

    public void run() {
        for(int i=0 ; i<5 ; i++){
            String metaDbDriver = ConfigManager.getInstance().getDb();
            System.out.println("起用线程 ：metaDbDriver值 : "+metaDbDriver);
            String user = ConfigManager.getInstance().getUser();
            System.out.println("起用线程 ：user : "+user);
        }
    }
}
