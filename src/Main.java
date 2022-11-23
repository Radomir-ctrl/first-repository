import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point("Mariana Trench", 10000, 280),
                new Point("Southern Trench", 9000, -60)
        };
        Arrays.sort(points);
        for (Point point : points){
            System.out.println(point);
        }

        Car[] cars = {
                new Car("Lamborghini", 300, 40),
                new Car("Buggati", 240, 80),
                new Car("Telsa", 250, 60)

        };
        Arrays.sort(cars, new CarComparator());
        for (Car car : cars){
            System.out.println(car);
        }
    }
}
