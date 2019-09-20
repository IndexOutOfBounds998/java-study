package designpatterns.strategy;

public class MimiQuack implements QuackBehavior {
    public void quack() {
        System.out.println("我会咪咪叫");
    }
}
