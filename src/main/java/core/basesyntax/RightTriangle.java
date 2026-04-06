package core.basesyntax;

import java.util.Locale;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return (this.firstLeg * this.secondLeg) / 2;
    }

    @Override
    public String draw() {
        return String.format(Locale.US,
                "Figure: RightTriangle, color: %s, area: %.2f sq. units, firstLeg: %.1f units, "
                        + "secondLeg: %.1f units",
                this.color, this.getArea(), this.firstLeg, this.secondLeg);
    }
}
