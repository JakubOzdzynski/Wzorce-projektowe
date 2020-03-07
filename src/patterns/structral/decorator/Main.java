package patterns.structral.decorator;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.assamble();
        System.out.println("=========================");
        Car sportCar = new SportPackage(new BasicCar(),true );
        sportCar.assamble();
        System.out.println("=========================");
        Car winterCar = new WinterPackage(new BasicCar(), true);
        winterCar.assamble();
        System.out.println("=========================");
        Car sportWinterCar = new SportPackage(new WinterPackage(new BasicCar(), true), true);
        sportWinterCar.assamble();
        System.out.println("=========================");
    }
}
