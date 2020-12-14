package cliente;

import rminterface.RMInterface;

import javax.swing.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientOperation {

    private static RMInterface look_up;

    public static void main(String[] args)
    throws MalformedURLException, RemoteException, NotBoundException {

        look_up = (RMInterface) Naming.lookup("//localhost/MyServer");
        String txt = JOptionPane.showInputDialog("Qual é o seu nome?");

        String response = look_up.helloTo(txt);
        JOptionPane.showMessageDialog(null,response);
    }
}
