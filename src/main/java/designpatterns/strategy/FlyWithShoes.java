package designpatterns.strategy;

public class FlyWithShoes implements FlyBehavior {
    public void fly() {
        System.out.println("穿着鞋飞");
    }
}
