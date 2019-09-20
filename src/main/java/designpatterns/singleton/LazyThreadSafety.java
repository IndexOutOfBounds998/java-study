package designpatterns.singleton;

/**
 * 懒汉式 2 线程安全
 */
public class LazyThreadSafety {


    private static volatile LazyThreadSafety lazy;

    /**
     * 线程安全  用 synchronized 来同步线程 (性能有问题？)  因为每次调用该方法的时候 多线程都会同步 性能下降 如何改进?
     * 优化版 getInstance2
     *
     * @return
     */
    public static synchronized LazyThreadSafety getInstance() {
        if (lazy == null) {
            lazy = new LazyThreadSafety();
        }
        return lazy;

    }

    /**
     * 线程安全  优化点：这里的处理是降低锁的颗粒度  由每次都锁类变成实例化的时候才会锁 性能增加！！！
     *
     * @return
     */
    public static LazyThreadSafety getInstance2() {
        if (lazy == null) {
            synchronized (LazyThreadSafety.class) {
                if (lazy == null) {
                    lazy = new LazyThreadSafety();
                }
            }

        }
        return lazy;

    }

}
