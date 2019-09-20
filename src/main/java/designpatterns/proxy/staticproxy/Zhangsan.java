package designpatterns.proxy.staticproxy;

/**
 * @author by chu_yang_yang
 * @Classname Zhangsan
 * @Description
 * @Date 2019/9/20 10:14
 */
public class Zhangsan extends BaseWorker implements Worker {


    public Zhangsan(String name) {
        super(name);
    }

    @Override
    public void playGames() {
        System.out.println("my name is " + name + " i am playing games now");
    }
}
