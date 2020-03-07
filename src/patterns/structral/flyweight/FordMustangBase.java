package patterns.structral.flyweight;

public class FordMustangBase {
    private String color;

    public FordMustangBase(String color) {
        System.out.println(FordMustangBaseFactory.class + " construct for " + color);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
