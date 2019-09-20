package designpatterns.factory;


/**
 * 简单静态工厂
 */
public class SimpleStaticFactory {

    public static Person createMan() {
        return new Man();
    }

    public static Person createWoman() {
        return new Woman();
    }

    public static void main(String[] args) {
        Person man = SimpleStaticFactory.createMan();
        man.sayName();
        Person woman = SimpleStaticFactory.createWoman();
        woman.sayName();
    }
}
