package Lambda.Supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList=new ArrayList<>();
        Supplier<Car> nissanMuranoSup=()->new Car("Nissan Murano", "black", 2.0);
        Supplier<Car> ladaVestaSup=()->new Car("Lada Vesta", "metallic", 1.6);
        carArrayList.add(nissanMuranoSup.get());
        carArrayList.add(ladaVestaSup.get());

        System.out.println(carArrayList);
    }

}
