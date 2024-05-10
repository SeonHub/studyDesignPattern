package Decorator.Starbuzz;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "이것은 아주 맛있게 만든 하우스 블렌드죠. 집에서 만들어서 하우스 일까요?";
    }

    @Override
    public double cost(){
        return 0.89;
    }
}
