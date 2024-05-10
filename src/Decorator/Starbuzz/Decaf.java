package Decorator.Starbuzz;

public class Decaf extends Beverage {
    public Decaf() {
        description = "이건 자동완성을 안해주네요. Decaf 입니다. 예전엔 이걸 왜 마시는지 몰랐으나 나이가 들면서 알게되는게 슬프네요";
    }

    @Override
    public double cost() {
        return 1;
    }
}
