package core.basesyntax;

import java.util.Locale;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String draw() {
        return String.format(Locale.US,
                "Figure: Square, color: %s, area: %.1f sq. units, side: %.1f units",
                this.color, this.getArea(), this.side);
    }
}
