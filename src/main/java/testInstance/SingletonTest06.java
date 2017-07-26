package testInstance;

/**
 * Created by Administrator on 2017/7/25.
 * 种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，
 * 可谓是很坚强的壁垒啊，不过，个人认为由于1.5中才加入enum特性，用这种方式写不免让人感觉生疏，在实际工作中，我也很少看见有人这么写过。
 * 上面的类Resource是我们要应用单例模式的资源，具体可以表现为网络连接，数据库连接，线程池等等。
 * 获取资源的方式很简单，只要 Singleton.INSTANCE.getInstance() 即可获得所要实例。
 *
 */
public enum SingletonTest06 {
    INSTANCE;
    private Resource instance;

    SingletonTest06() {
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }

    public static class Resource {
        private Resource() {
            System.out.println("创建了Resource实例!");
        }

        public void whoAmI() {
            System.out.println(this.toString());
        }
    }
}
