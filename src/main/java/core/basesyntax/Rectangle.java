package core.basesyntax;

import java.util.Locale;

public class Rectangle extends Figure implements Drawable{
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return (width * height) * 0.5;
    }

    @Override
    public String draw() {
        return String.format(Locale.US, "Figure: Rectangle, color: %s, area: %.2f sq. units, width: %.1f units, height: %.1f units", color, getArea(), width, height);
    }
}
