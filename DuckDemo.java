public class DuckDemo {
    public static void main(String[] args) {

        Mallard m = new Mallard();
        RubberDuck duckie = new RubberDuck();
        DecoyDuck smithereens = new DecoyDuck();

        m.quack();
        m.swim();
        m.fly();

        duckie.quack();
        duckie.swim();

        smithereens.swim();
    }
}
