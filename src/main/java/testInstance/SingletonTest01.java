package testInstance;

/**
 * Created by Administrator on 2017/7/25.
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 */
public class SingletonTest01 {
    private static SingletonTest01 instance;
    private SingletonTest01 (){}

    public static SingletonTest01 getInstance() {
        if (instance == null) {
            instance = new SingletonTest01();
        }
        return instance;
    }
}
