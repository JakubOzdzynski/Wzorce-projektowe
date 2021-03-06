package patterns.structral.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    private List<Shape> shapes;

    public Drawing() {
       shapes = new ArrayList<>();
    }
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public void draw() {
        System.out.println("Drawing and it's shapes:");
        shapes.forEach(Shape::draw);
    }
}
