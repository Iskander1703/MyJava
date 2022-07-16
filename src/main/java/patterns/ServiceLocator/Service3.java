package patterns.ServiceLocator;

public class Service3 implements Service{
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void execute() {
        System.out.println("Executing "+this.getClass().getSimpleName());
    }
}