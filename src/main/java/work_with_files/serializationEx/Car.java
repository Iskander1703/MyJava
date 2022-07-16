package work_with_files.serializationEx;

import java.io.Serializable;

public class Car implements Serializable {
    String model;
    int loshadSil;

    public Car(String model, int loshadSil) {
        this.model = model;
        this.loshadSil = loshadSil;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", loshadSil=" + loshadSil +
                '}';
    }
}
