
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Civic", "Honda", 2022, 25000, "Black", 5);

        System.out.println(car);

        car.sell();

        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setModel("Accord");
        car.setYear(2024);
        car.setPrice(30000);
        car.setColor("White");

        System.out.println("After changes:");
        System.out.println(car);
    }
}
