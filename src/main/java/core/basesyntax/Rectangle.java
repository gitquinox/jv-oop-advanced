package core.basesyntax;

import java.util.Locale;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return (this.width * this.height);
    }

    @Override
    public String draw() {
        return String.format(Locale.US,
                "Figure: Rectangle, color: %s, area: %.2f sq. units, width: %.1f units, "
                        + "height: %.1f units",
                this.color, this.getArea(), this.width, this.height);
    }
}
