package strategy;

public class ConcreteStrategyA implements Strategy {

    @Override
    public String execute() {
        String result = "strategy A";
        return result;
    }
}