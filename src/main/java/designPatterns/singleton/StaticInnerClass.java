package designPatterns.singleton;


/**
 * 静态内部类的方式
 */
public class StaticInnerClass {

    /**
     * 当 Singleton 类加载时，静态内部类 SingletonHolder 没有被加载进内存。
     * 只有当调用 getUniqueInstance() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，
     * 此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
     * <p>
     * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
     *
     * @return
     */
    public StaticInnerClass getInstance() {
        return StaticInnerClassHoler.innerClass;
    }

    static class StaticInnerClassHoler {
        static final StaticInnerClass innerClass = new StaticInnerClass();
    }
}
