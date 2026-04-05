package core.basesyntax;

import java.util.Random;

public class FigureSupplier implements Drawable{
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();


    public Figure getRandomFigure() {
        // Тут вибирається тип фігури який ми хочемо рандомно
        int figureType = random.nextInt(5);
        String randomColor = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Circle(randomColor, random.nextInt(10) + 1);
            case 1 -> new Square(randomColor, random.nextInt(10) + 1);
            case 2 -> new RightTriangle(randomColor, random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 3 -> new Rectangle(randomColor, random.nextInt(10) + 1, random.nextInt(10) + 1);
            default -> new IsoscelesTrapezoid(randomColor, random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1);
        };
    }

    public String getDefaultFigure(){
        Figure defaultFigure = new Circle(Colors.WHITE.getName(), 10);
        return defaultFigure.draw();
    }

    public double getArea(double radius){
        double result = Math.PI * Math.pow(radius, 2);
        return (int)(result * 100) / 100.0;
    }


    @Override
    public String draw() {
        return "";
    }
}
