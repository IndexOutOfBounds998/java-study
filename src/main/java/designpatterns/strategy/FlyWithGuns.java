package designpatterns.strategy;

public class FlyWithGuns implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("带着枪飞");
    }
}
