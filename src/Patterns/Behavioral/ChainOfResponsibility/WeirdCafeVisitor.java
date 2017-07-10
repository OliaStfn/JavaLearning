package Patterns.Behavioral.ChainOfResponsibility;

public abstract class WeirdCafeVisitor {
    protected WeirdCafeVisitor visitor;

    public WeirdCafeVisitor() {
    }

    //Параметризований - обов'язково
    public WeirdCafeVisitor(WeirdCafeVisitor visitor) {
        this.visitor = visitor;
    }

    public abstract void handleFood(Food food) throws Exception;
}
