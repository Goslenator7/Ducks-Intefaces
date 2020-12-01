public class DecoyDuck implements Swim {

    public DecoyDuck() {}

    // super keyword allows access to the methods of Duck abstract class,
    // so I can reuse without rewriting + can override if I need to change output

    public void swim() {
        System.out.println("The duck is technically just floating.");
    }
}
