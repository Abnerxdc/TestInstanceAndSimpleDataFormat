package testInstance;

/**
 * Created by Administrator on 2017/7/25.
 * 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，
 * 但是，遗憾的是，效率很低，99%情况下不需要同步。
 */
public class SingletonTest02 {
    private static SingletonTest02 instance;
    private SingletonTest02 (){}
    public static synchronized SingletonTest02 getInstance() {
        if (instance == null) {
            instance = new SingletonTest02();
        }
        return instance;
    }
}
