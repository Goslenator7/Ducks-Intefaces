public class Mallard implements Quack, Fly, Swim {

    // Constructor
    public Mallard() {};

    // super keyword allows access to the methods of Duck abstract class,
    // so I can reuse without rewriting + can override if I need to change output

    public void quack() {
        System.out.println("QUACK!");
    }

    public void fly() {
        System.out.println("The duck is flying.");
    }

    public void swim() {
        System.out.println("The duck is swimming.");
    }

}
