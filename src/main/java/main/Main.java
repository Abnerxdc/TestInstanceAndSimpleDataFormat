package main;

/**
 * Created by Administrator on 2017/7/26.
 */
public class Main {
    public static void main(String []args){
//        String metaDbDriver = ConfigManager.getInstance().getDb();
//        String abc = ConfigManager.getInstance().getDb();
//        String abc1 = ConfigManager.getInstance().getDb();
//        System.out.println("不起用线程 ：metaDbDriver值 : "+metaDbDriver);

        DoSomething ds1 = new DoSomething();
        DoSomething ds2 = new DoSomething();
        DoSomething ds3 = new DoSomething();
        DoSomething ds4 = new DoSomething();
        DoSomething ds5 = new DoSomething();


        Thread t1 = new Thread(ds1);
        Thread t2 = new Thread(ds2);
        Thread t3 = new Thread(ds3);
        Thread t4 = new Thread(ds4);
        Thread t5 = new Thread(ds5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
