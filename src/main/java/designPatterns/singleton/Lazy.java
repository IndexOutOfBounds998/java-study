package designPatterns.singleton;

/**
 * 懒汉式1 线程不安全
 */
public class Lazy {

    private static Lazy lazy;

    /**
     * 线程不安全 在判断是否为空的时候 多线程同时进入 就会同时实例化多次 （如何改进 ?  查看 LazeThreadSafety 类）
     *
     * @return
     */
    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;

    }

}
