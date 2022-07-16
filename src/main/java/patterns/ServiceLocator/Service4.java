package patterns.ServiceLocator;

public class Service4 implements Service{
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void execute() {
        System.out.println("Executing "+this.getClass().getSimpleName());
    }
}