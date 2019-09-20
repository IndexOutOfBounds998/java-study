package designpatterns.singleton;

/**
 * 饿汉式 见名知意  就是很饿  立刻初始化的意思
 */
public class Hungry {

    /**
     * 直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。（不用的时候也会创建出来）
     */
    private static volatile Hungry hungry = new Hungry();

    /**
     * 返回创建的hungry
     *
     * @return
     */
    public Hungry getHungry() {
        return hungry;
    }

}
