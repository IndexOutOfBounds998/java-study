package designPatterns.proxy.staticproxy;

/**
 * @author by chu_yang_yang
 * @Classname Client
 * @Description
 * @Date 2019/9/20 10:19
 */
public class Client {
    public static void main(String[] args) {

        Worker zhang = new Zhangsan("张三");

        ProxyHandle handle = new ProxyHandle(zhang) {
            @Override
            void doBefore() {
                System.out.println("begin do before");
            }

            @Override
            void doAfter() {
                System.out.println("begin do After");
            }
        };
        handle.playGames();
    }
}
