package patterns.ServiceLocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> servicesList =new ArrayList<>();
    public Service getService(String serviceName){
        for (Service service:servicesList){
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached "+serviceName+" object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
            System.out.println("Add new object to cach "+newService.getName());
            servicesList.add(newService);
    }
}
