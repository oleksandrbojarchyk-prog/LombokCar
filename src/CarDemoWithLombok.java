public class CarDemoWithLombok {
    public static void main(String[] args) {

        CarWithLombook car1 = new CarWithLombook(
                "GLE", "Mercedes", 2020, 350000, "white", 5);

        CarWithLombook car2 = new CarWithLombook(
                "GLE", "Mercedes", 2020, 350000, "white", 5);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.getColor());

        int year = car1.getYear();

        System.out.println("Are these objects equal? "
                + car1.equals(car2));

        System.out.println("The HashCode of this object is: "
                + car2.hashCode());

        System.out.println("The HashCode of this object is: "
                + car1.hashCode());

        car1.setColor("black");
    }
}
