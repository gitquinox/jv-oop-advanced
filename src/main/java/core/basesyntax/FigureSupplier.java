package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int RANDOM_NUMBER = random.nextInt(10) + 1;

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String randomColor = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Circle(randomColor, RANDOM_NUMBER);
            case 1 -> new Square(randomColor, RANDOM_NUMBER);
            case 2 -> new RightTriangle(randomColor, RANDOM_NUMBER, RANDOM_NUMBER);
            case 3 -> new Rectangle(randomColor, RANDOM_NUMBER, RANDOM_NUMBER);
            default -> new IsoscelesTrapezoid(randomColor,
                    RANDOM_NUMBER, RANDOM_NUMBER, RANDOM_NUMBER, RANDOM_NUMBER);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.getName(), 10);
    }
}
