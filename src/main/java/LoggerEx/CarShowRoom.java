package LoggerEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class CarShowRoom {
    private ArrayList<Car> carArrayList;
    private final static Logger logger=LoggerFactory.getLogger(CarShowRoom.class);

    public CarShowRoom() {
        this.carArrayList =new ArrayList<>() ;
    }

    public void deleteCar(Car car){
        for (Car a:carArrayList){
            if (car.equals(a)){
                carArrayList.remove(a);
                logger.info(String.format("Car model: %s, color: %s, year of issue: %d,  horsepower: %d" +
                        " was deleted", car.getTitle(), car.getColor(), car.getYearOfIssue(),car.getEngineHorse()));
                return;
            }
        }

        logger.warn(String.format("Car model: %s, color: %s, year of issue: %d,  horsepower: %d" +
                " does not exists", car.getTitle(), car.getColor(), car.getYearOfIssue(),car.getEngineHorse()));
    }
     public void addCar(Car car){
         for (Car a:carArrayList){
             if (car.equals(a)){
                 logger.warn(String.format("Car model: %s, color: %s, year of issue: %d,  horsepower: %d" +
                         " already exists", car.getTitle(), car.getColor(), car.getYearOfIssue(),car.getEngineHorse()));
                 return;
             }
         }
         logger.info(String.format("Car model: %s, color: %s, year of issue: %d,  horsepower: %d" +
                 " was added", car.getTitle(), car.getColor(), car.getYearOfIssue(),car.getEngineHorse()));
         carArrayList.add(car);
     }
}
