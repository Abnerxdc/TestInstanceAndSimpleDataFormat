package testInstance;

/**
 * Created by Administrator on 2017/7/25.
 * 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，虽然导致类装载的原因有很多种，
 * 在单例模式中大多数都是调用getInstance方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
 * 这时候初始化instance显然没有达到lazy loading的效果
 */
public class SingletonTest03 {
    private static SingletonTest03 instance = new SingletonTest03();
    private SingletonTest03 (){}
    public static SingletonTest03 getInstance() {
        return instance;
    }
}
