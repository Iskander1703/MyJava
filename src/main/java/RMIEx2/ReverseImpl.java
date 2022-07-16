package RMIEx2;

import java.rmi.RemoteException;

class ReverseImpl implements Reverse
{
    public String reverse(String str) throws RemoteException
    {
        return new StringBuffer(str).reverse().toString();
    }
}
