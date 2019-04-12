package designPatterns.strategy;

public class DonaldDuck extends Duck  {


    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public DonaldDuck() {
        flyBehavior=new FlyWithShoes();
        quackBehavior=new MimiQuack();
    }


    void display() {
        System.out.println("大噶好 唔係 唐老鴨");
    }

    void fly() {
        flyBehavior.fly();
    }

    void quack() {
        quackBehavior.quack();
    }


}
