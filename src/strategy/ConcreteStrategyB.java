package strategy;

public class ConcreteStrategyB implements Strategy {

    @Override
    public String execute() {
        String result="strategy B";
        return result;
    }
}
