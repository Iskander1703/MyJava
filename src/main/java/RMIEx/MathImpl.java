package RMIEx;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathImpl extends UnicastRemoteObject implements Math{
    protected MathImpl() throws RemoteException {
    }

    @Override
    public int add(int a, int b) throws RemoteException{
        return a+b;
    }
}
