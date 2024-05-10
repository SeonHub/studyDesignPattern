package Decorator.Starbuzz;

public class Espresso extends Beverage {
    public Espresso() {
        description = "아주 맛있는 에스프레소 입니다.";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
