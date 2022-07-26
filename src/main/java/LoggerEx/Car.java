package LoggerEx;

import java.util.Objects;

public class Car {
    private String title;
    private int yearOfIssue;
    private int engineHorse;
    private String color;

    public Car(String title, int yearOfIssue, int engineHorse, String color) {
        this.title = title;
        this.yearOfIssue = yearOfIssue;
        this.engineHorse = engineHorse;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int getEngineHorse() {
        return engineHorse;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getYearOfIssue() == car.getYearOfIssue() && getEngineHorse() == car.getEngineHorse() && Objects.equals(getTitle(), car.getTitle()) && Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getYearOfIssue(), getEngineHorse(), getColor());
    }
}
