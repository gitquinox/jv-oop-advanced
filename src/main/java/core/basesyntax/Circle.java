package core.basesyntax;

import java.util.Locale;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        double result = Math.PI * Math.pow(this.radius, 2);
        return (int) (result * 100) / 100.0;
    }

    @Override
    public String draw() {
        return String.format(Locale.US,
                "Figure: Circle, color: %s, area: %.2f sq. units, radius: %.1f units",
                this.color, this.getArea(), this.radius);
    }
}
