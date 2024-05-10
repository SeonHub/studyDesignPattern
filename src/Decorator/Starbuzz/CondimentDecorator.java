package Decorator.Starbuzz;

// 추상 클래스를 확장한 추상 클래스는, 추상 메소드를 오버라이딩 하지 않아도 되나요 ? cost의 경우 구현 클래스에서만 구현을 합니다.
//AI Says..
//네, 추상 클래스를 확장한 추상 클래스는 부모 클래스의 추상 메소드를 오버라이딩하지 않아도 됩니다.
//다만, 구체적인 구현 클래스에서는 반드시 모든 추상 메소드를 오버라이딩해야 합니다.

// 왜 Beverage로 확장하느냐 ===> 데코레이터는 감쌀 객체와 동일한 슈퍼클래스를 가져야 합니다.
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

}
