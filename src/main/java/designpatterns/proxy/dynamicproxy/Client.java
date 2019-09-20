package designpatterns.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author by chu_yang_yang
 * @Classname Client
 * @Description
 * @Date 2019/9/20 10:31
 */
public class Client {
    public static void main(String[] args) {
        ProxyHandle handle = new ProxyHandle(new Dack()) {
            @Override
            void doBefore() {
                System.out.println("减减肥------------");
            }

            @Override
            void doAfter() {
                System.out.println("飞起来真爽------------");
            }
        };
        Animal animal = (Animal) Proxy.newProxyInstance(handle.getClass().getClassLoader(), new Class[]{Animal.class}, handle);
        animal.fly();

    }
}
