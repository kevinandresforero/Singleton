package Logica;

public class rectangulo extends Figura{
	
	private float base = 0;
	private float altura = 0;
	private static rectangulo unica_instancia;
	
	public static rectangulo getInstancia() {
		if (unica_instancia == null)
			unica_instancia = new rectangulo();
		return unica_instancia;
	}
	
	private rectangulo() {}
	
	@Override
	public float calculara(){
		area = (float)(base*altura);
		return area;
	}
	
	@Override 
	public float calcularp(){
		perimetro = (float) (2*base + 2*altura) ;
		return perimetro;
	}
	
	public float setb (float valor){
		base = valor ;
		return base;
	}
	
	public float seta (float valor){
		altura = valor ;
		return altura;
	}
}
