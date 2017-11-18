package com.mycompany.clientcalculadora;

//import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculadoraClient {

    public static void main(String[] args) {
        System.out.println("Iniciando cliente...");

        try {
            /* Intancia a interface */
            CalculadoraInterface calc;

            /* Registrando o SecurityManager */
            System.out.println("\tRegistrando o SecurityManager...");
           // System.setSecurityManager(new SecurityManager());

            /* Obtem o objeto remoto */
	     //calc = (CalculadoraInterface)Naming.lookup("Calculadora");
            //System.setProperty("java.rmi.server.hostname", "192.168.2.195");
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 50000);
            calc = (CalculadoraInterface) reg.lookup("calculadora");

            /* Realiza operacoes com o objeto remoto */
            System.out.println("ADD 2 + 2 => " + calc.soma(2, 2));
            System.out.println("SUB 2 - 2 => " + calc.sub(2, 2));
            System.out.println("MULT 2 x 2 => " + calc.multi(2, 2));
            System.out.println("DIV 2 / 2 => " + calc.div(2, 2));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }

    }

}
