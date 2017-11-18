package com.mycompany.clientcalculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraInterface extends Remote {

    public int soma(int argA, int ArgB) throws RemoteException;

    public int sub(int argA, int ArgB) throws RemoteException;

    public int multi(int argA, int ArgB) throws RemoteException;

    public double div(int argA, int ArgB) throws RemoteException;

}
