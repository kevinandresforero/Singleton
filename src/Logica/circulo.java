package Logica;

public class circulo extends Figura{
	
	private float radio=5;
	private float pi = (float) 3.14159265358979323846;
	private static circulo unica_instancia;
	
	public static circulo getInstancia() {
		if (unica_instancia == null)
			unica_instancia = new circulo();
		return unica_instancia;
	}
	
	private circulo() {}
	
	@Override
	public float calculara(){
		area = (float)Math.pow(radio,2)*pi;
		return area;
	}
	
	@Override 
	public float calcularp(){
		perimetro = (2*radio)*pi;
		return perimetro;
	}
	
	public void setRadio(float radio) {
		this.radio = radio;
	    }
	
}

