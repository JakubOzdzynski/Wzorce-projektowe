package patterns.structral.flyweight;

import java.util.HashSet;
import java.util.Set;

public class FordMustangBaseFactory {
    private static Set<FordMustangBase> fordMustangBases = new HashSet<>();

    public static FordMustangBase getMustangBase(String color) {
        FordMustangBase fordMustangBase;
        System.out.println(FordMustangBaseFactory.class + "getMustangBase");
        if (fordMustangBases.size() > 0) {
            fordMustangBase = fordMustangBases.stream().filter(f -> color.equals(f.getColor())).findAny().orElse(new FordMustangBase(color));
        } else {
            fordMustangBase = new FordMustangBase(color);
        }
        fordMustangBases.add(fordMustangBase);
        return fordMustangBase;
    }
}
