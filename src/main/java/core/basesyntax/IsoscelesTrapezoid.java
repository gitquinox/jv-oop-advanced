package core.basesyntax;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure implements Drawable{
    private final double baseBottom;
    private final double baseTop;
    private final double side;
    private final double height;



    public IsoscelesTrapezoid(String color, double baseBottom, double baseTop, double side, double height){
        super(color);
        this.baseBottom = baseBottom;
        this.baseTop = baseTop;
        this.side = side;
        this.height = height;
    }

    public double getArea(){
        return (baseTop + baseBottom) / 2 * height;
    }

    @Override
    public String draw() {
        return String.format(Locale.US, "Figure: IsoscelesTrapezoid, color: %s, area: %.2f sq. units, baseTop: %.1f units, baseBottom: %.1f units, side: %.1f units, height: %.1f units", color,getArea(), baseTop, baseBottom, side, height);
    }
}
