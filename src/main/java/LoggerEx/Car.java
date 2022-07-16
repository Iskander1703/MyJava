package LoggerEx;

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
}
