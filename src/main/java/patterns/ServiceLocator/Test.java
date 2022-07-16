package patterns.ServiceLocator;

public class Test {
    public static void main(String[] args) {
        Service service=ServiceLocator.getService("Service1");
        Service service2=ServiceLocator.getService("Service1");
        Service service3=ServiceLocator.getService("Service2");
        Service service4=ServiceLocator.getService("Service2");
        Service service5=ServiceLocator.getService("Service3");
        Service service6=ServiceLocator.getService("Service3");
        Service service7=ServiceLocator.getService("Service4");
        Service service8=ServiceLocator.getService("Service4");
        Service service9=ServiceLocator.getService("Service5");
        Service service10=ServiceLocator.getService("Service5");
        Service service11=ServiceLocator.getService("Service5");
}
}
