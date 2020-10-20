package Vista;

import java.util.Scanner;

import Logica.circulo;

public class pricipal {
	public static void main(String[] args) {
		
		System.out.println(" ----- CALCULO DE ÁREAS Y PERIMETROS ----- ");
		System.out.println("");
		System.out.println(" ----- Ingrese el valor de la opción ----- ");
		System.out.println("");
		System.out.println(" ----- 0 para círculo");
		System.out.println(" ----- 1 para rectángulo");
		System.out.println(" ----- 2 para Tríangulo");
		System.out.println("");
		
		Scanner reader = new Scanner(System.in);
		
//		ISP
		subinterfaz menu = new subinterfaz(reader.nextInt());
		
	}

}
