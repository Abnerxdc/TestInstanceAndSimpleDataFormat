package testInstance;

/**
 * Created by Administrator on 2017/7/25.
 * 这个是第二种方式的升级版，俗称双重检查锁定，在JDK1.5之后，双重检查锁定才能够正常达到单例效果。
 */
public class SingletonTest07 {
    private volatile static SingletonTest07 singleton;

    private SingletonTest07() {
        System.out.println("创建了Singleton04实例!");
    }

    public static SingletonTest07 getSingleton() {
        if (singleton == null) {
            synchronized (SingletonTest07.class) {
                if (singleton == null) {
                    singleton = new SingletonTest07();
                }
                return singleton;
            }
        }
        return singleton;
    }
}
