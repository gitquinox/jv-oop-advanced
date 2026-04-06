package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                System.out.println(figureSupplier.getRandomFigure().draw());
            } else {
                System.out.println(figureSupplier.getDefaultFigure().draw());
            }
        }
    }
}
