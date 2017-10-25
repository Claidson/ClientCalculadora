package com.mycompany.clientcalculadora;

import java.rmi.Naming;

public class CalculadoraClient {

	public static void main(String[] args) {
		System.out.println("Iniciando cliente...");
		
		try {
			/* Intancia a interface */
			CalculadoraInterface calc;
			
			/* Registrando o SecurityManager */
			System.out.println("\tRegistrando o SecurityManager...");
			System.setSecurityManager(new SecurityManager());
			
			/* Obt�m o objeto remoto */
			calc = (CalculadoraInterface)Naming.lookup("Calculadora");
			
			/* Realiza opera��es com o objeto remoto */
			System.out.println("ADD 2 + 2 => "+calc.add(2, 2));
			System.out.println("SUB 2 - 2 => "+calc.sub(2, 2));
			System.out.println("MULT 2 x 2 => "+calc.mult(2, 2));
			System.out.println("DIV 2 / 2 => "+calc.div(2, 2));
			
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}

	}

}
