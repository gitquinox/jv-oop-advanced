package core.basesyntax;

import java.util.Locale;

public class RightTriangle extends Figure implements Drawable{
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg){
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getHypotenuse(){
        return Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
    }

    public double getArea(){
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return String.format(Locale.US, "Figure: RightTriangle, color: %s, area: %.2f sq. units, firstLeg: %.1f units, secondLeg: %.1f units ", color, getArea(), firstLeg, secondLeg);
    }
}
