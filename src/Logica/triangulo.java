package Logica;

public class triangulo extends Figura{
	private float base = 0;
	private static triangulo unica_instancia;
	
	public static triangulo getInstancia() {
		if(unica_instancia==null)
			unica_instancia = new triangulo();
		return unica_instancia;
	}
	
	private triangulo() {}
	
	@Override
	public float calculara(){
		area = (float)(base*base / 2);
		return area;
	}
	
	@Override 
	public float calcularp(){
		perimetro = (float) (base * 3) ;
		return perimetro;
	}
	
	public float setb (float valor){
		base = valor ;
		return base;
	}
	
}
