package Lambda.Consumer;


import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerEx {
    public static void main(String[] args) {
        Supplier<Car> nissanMuranoSup = () -> new Car("Nissan Murano", "black", 2.0);
        Supplier<Car> ladaVestaSup = () -> new Car("Lada Vesta", "metallic", 1.6);
        Car car1 = nissanMuranoSup.get();
        Car car2 = ladaVestaSup.get();

        Consumer<Car> carConsumer = a -> {
            a.engine = 3.0;
            System.out.println("Car model: "+a.model+" was update");
        };
        carConsumer.accept(car1);
        carConsumer.accept(car2);

        System.out.println(car1);
        System.out.println(car2);


    }
}
