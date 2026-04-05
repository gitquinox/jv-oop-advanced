package core.basesyntax;

public class Figure implements Drawable{
    String color;

    public Figure(String color) {
        this.color = color;
    }


    @Override
    public String draw() {
        return "";
    }
}
