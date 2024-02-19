import strategy.ConcreteStrategyA;
import strategy.ConcreteStrategyB;
import strategy.Strategy;

public class Main {
    public static void main(String[] args) {

        Context context = new Context();

        Strategy strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);
        String result = context.executeStrategy();

        System.out.println("I am using the " + result);

        System.out.println("---------------------------------------------------------------------------");

        strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);
        result = context.executeStrategy();

        System.out.println("I am using the " + result);


    }
}