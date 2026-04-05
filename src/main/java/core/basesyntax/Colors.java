package core.basesyntax;

public enum Colors{
    WHITE,
    BLACK,
    RED,
    BLUE,
    GREEN,
    YELLOW,
    ORANGE,
    PURPLE,
    BROWN,
    GREY;

    public String getName(){
        return this.name().toLowerCase();
    }
}
