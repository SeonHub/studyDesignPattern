package Decorator.Starbuzz;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast... 자동 완성이 좋긴 좋군요?";
    }

    @Override
    public double cost() {
        return 3;
    }
}
