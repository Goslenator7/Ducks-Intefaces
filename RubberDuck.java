public class RubberDuck implements Quack, Swim {

    // Constructor
    public RubberDuck() {}

    // super keyword allows access to the methods of Duck abstract class,
    // so I can reuse without rewriting + can override if I need to change output
    public void quack() {
        System.out.println("RUBBER QUACK!");
    }

    public void swim() {
        System.out.println("The duck is technically just floating.");
    }

}
