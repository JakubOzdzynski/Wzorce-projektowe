package patterns.structral.composite;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        System.out.println("=============");
        Shape triangle = new Triangle();
        Drawing drawing1 = new Drawing();
        drawing1.addShape(triangle);
        drawing1.addShape(circle);
        drawing1.draw();
        System.out.println("=============");
    }
}
