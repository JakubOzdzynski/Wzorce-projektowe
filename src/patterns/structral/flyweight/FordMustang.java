package patterns.structral.flyweight;

public class FordMustang {
    private FordMustangBase fordMustangBase;
    private String engineSize;

    public FordMustang(String color, String engineSize) {
        System.out.println(this.getClass() + " constructor");
        this.fordMustangBase = FordMustangBaseFactory.getMustangBase(color);
        this.engineSize = engineSize;
    }
}
