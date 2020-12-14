package server;

import rminterface.RMInterface;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerOperation extends UnicastRemoteObject implements RMInterface  {

    protected ServerOperation() throws RemoteException{
        super();
    }

    @Override
    public String helloTo(String nome) throws RemoteException {
       System.err.println(nome + " Entrando contato");
       return "Servidor diz Olá " + nome;
    }

    public static void main(String[] args) {

        try {

            Naming.rebind("//localhost/MyServer", new ServerOperation());
            System.err.println("Server Pronto");

        } catch (Exception e){

            System.err.println("Server excessao: " + e.toString());
            e.printStackTrace();
        }
    }

}
