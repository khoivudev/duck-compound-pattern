public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }
}
