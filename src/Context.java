import strategy.Strategy;

public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy() {
        if (strategy != null) {
            return strategy.execute();
        } else {
            System.out.println("There is no defined strategy");
            return "";
        }
    }
}