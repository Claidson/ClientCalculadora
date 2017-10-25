package com.mycompany.clientcalculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraInterface extends Remote {

	public int add(int vlrA, int vlrB) throws RemoteException;
	public int sub(int vlrA, int vlrB) throws RemoteException;
	public int mult(int vlrA, int vlrB) throws RemoteException;
	public double div(int vlrA, int vlrB) throws RemoteException;
	
}
