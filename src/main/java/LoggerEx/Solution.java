package LoggerEx;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        CarShowRoom carShowRoom=new CarShowRoom();
        Car car1=new Car("Mitsubishi Outlander", 2020, 232, "black");
        Car car2=new Car("Mitsubishi Outlander", 2020, 232, "black");
        System.out.println(car1.equals(car2));
        carShowRoom.deleteCar(car1);
        carShowRoom.addCar(car1);
        carShowRoom.addCar(car1);
        carShowRoom.addCar(car1);
        carShowRoom.addCar(car1);
        carShowRoom.deleteCar(car1);
    }
}
