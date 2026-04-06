package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String randomColor = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Circle(randomColor, random.nextInt(10) + 1);
            case 1 -> new Square(randomColor, random.nextInt(10) + 1);
            case 2 -> new RightTriangle(randomColor, random.nextInt(10) + 1,
                    random.nextInt(10) + 1);
            case 3 -> new Rectangle(randomColor, random.nextInt(10) + 1,
                    random.nextInt(10) + 1);
            default -> new IsoscelesTrapezoid(randomColor, random.nextInt(10) + 1,
                    random.nextInt(10) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.getName(), 10);
    }
}
