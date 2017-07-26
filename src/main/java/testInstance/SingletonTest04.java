package testInstance;

/**
 * Created by Administrator on 2017/7/25.
 * 表面上看起来差别挺大，其实更第三种方式差不多，都是在类初始化即实例化instance。
 */
public class SingletonTest04 {
    private static SingletonTest04 instance = null;
    static {
        instance = new SingletonTest04();
    }
    private SingletonTest04 (){}
    public static SingletonTest04 getInstance() {
        return instance;
    }
}
