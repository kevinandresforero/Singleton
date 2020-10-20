package Vista;

import java.util.Scanner;

import Logica.circulo;
import Logica.rectangulo;
import Logica.triangulo;

public class subinterfaz {
	public subinterfaz(int option) {
		
		switch (option) {
		case 0:
			circulo.getInstancia();
			System.out.println(" ----- Ingrese el valor del rádio del circulo -----");
			Scanner rr = new Scanner(System.in);
			float radio = rr.nextFloat();
			circulo.getInstancia().setRadio(radio);
			rr.close();
			
			System.out.println("	El valor del área es :	"+circulo.getInstancia().calculara());
			System.out.println("	El valor del perímetro :	"+circulo.getInstancia().calcularp());
					
			break;
		case 1:
			
			rectangulo.getInstancia();
			
			System.out.println("");
			System.out.println(" ----- Ingrese el valor de la base del recangulo -----");			
			Scanner rb = new Scanner(System.in);
			float base = rb.nextFloat();
			rectangulo.getInstancia().setb(base);
			
			System.out.println("");
			System.out.println(" ----- Ingrese el valor de la altura del recangulo -----");			
			Scanner ra = new Scanner(System.in);
			float altura = ra.nextFloat();
			rectangulo.getInstancia().seta(altura);
			
			rb.close();
			
			System.out.println("	El valor del área es :		"+rectangulo.getInstancia().calculara());
			System.out.println("	El valor del perímetro :	"+rectangulo.getInstancia().calcularp());
			
			break;
			
		case 2:
			
			triangulo.getInstancia();
			
			System.out.println("");
			System.out.println(" ----- Ingrese el valor de un lado del triangulo equilatero -----");			
			Scanner rbt = new Scanner(System.in);
			float lado = rbt.nextFloat();
			triangulo.getInstancia().setb(lado);
			
			rbt.close();
			
			System.out.println("	El valor del área es :		"+triangulo.getInstancia().calculara());
			System.out.println("	El valor del perímetro :	"+triangulo.getInstancia().calcularp());
			
			break;
			
		default:
			System.out.println(" ----- Ingresaste una opción invalida, vuelve a iniciar el programa ----- ");
			
			break;
		}
		
	}
}
