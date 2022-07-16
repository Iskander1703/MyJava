package RMIEx;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Serv{
    public static void main(String[] args) throws NamingException, RemoteException, MalformedURLException, AlreadyBoundException {
        Context context=new InitialContext();
        System.out.println(args[0]);
        context.rebind("rmi://localhost:1099/imath", new MathImpl());
//        context.rebind("rmi:imath", new MathImpl());
//        Naming.bind("imath", new MathImpl());
    }
}
