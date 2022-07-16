package patterns.ServiceLocator;

public class InitialContext {
    public Object lookup(String  jndiName){
        if (jndiName.equalsIgnoreCase("SERVICE1")){
            return new Service1();
        }
        else if (jndiName.equalsIgnoreCase("SERVICE2")){
            return new Service2();
        }
      else if (jndiName.equalsIgnoreCase("SERVICE3")){
            return new Service3();
        }
      else if (jndiName.equalsIgnoreCase("SERVICE4")){
            return new Service4();
        }
        else if (jndiName.equalsIgnoreCase("SERVICE5")){
            return new Service5();
        }
        return null;
    }
}
