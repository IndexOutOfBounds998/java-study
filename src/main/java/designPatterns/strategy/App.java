package designPatterns.strategy;

public class App {
    public static void main(String[] args) {
        /**
         * 這是一個奇怪的唐老鴨
         */
        DonaldDuck donaldDuck = new DonaldDuck();
        donaldDuck.display();
        donaldDuck.fly();
        donaldDuck.quack();
        donaldDuck.setFlyBehavior(new FlyWithGuns());
        donaldDuck.fly();
    }
}
