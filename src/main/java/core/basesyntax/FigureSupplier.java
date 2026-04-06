package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final int randomNumber = random.nextInt(10) + 1;
    private final int figureCount = 5;
    private final int defaultRadius = 10;

    public Figure getRandomFigure() {
        int figureType = random.nextInt(figureCount);
        String randomColor = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Circle(randomColor, randomNumber);
            case 1 -> new Square(randomColor, randomNumber);
            case 2 -> new RightTriangle(randomColor, randomNumber, randomNumber);
            case 3 -> new Rectangle(randomColor, randomNumber, randomNumber);
            default -> new IsoscelesTrapezoid(randomColor,
                    randomNumber, randomNumber, randomNumber, randomNumber);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.getName(), defaultRadius);
    }
}
