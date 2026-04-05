package core.basesyntax;

import java.util.Locale;

public class Square extends Figure implements Drawable{
    private final double side;

    public Square(String color, double side){
        super(color);
        this.side = side;
    }

    public double getArea(){
        return side * 4;
    }

    @Override
    public String draw() {
        return String.format(Locale.US, "Figure: Square, color: %s, area: %.1f sq. units, side: %.1f units", color, getArea(), side);
    }




}
