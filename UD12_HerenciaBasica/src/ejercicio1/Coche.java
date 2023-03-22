package ejercicio1;

public class Coche extends Vehiculo{//Heredo de la clase vehiculo
	
	private int combustible;

	public Coche(int ruedas, int velocidad, int combustible) {
		super(ruedas, velocidad);
		this.combustible = combustible;
	}

	public Coche(int combustible) {
		this(0,0,0);
	}
	
	public void repostar(int mas) {
		int total=combustible+mas; //Guardo el total para saber si es mayor o menor a 60
		if(total<60) {
			combustible+=mas;
		}
		System.out.println("Ejecutado desde la clase hija");
	}
	public void consumir(int menos) {
		int total=combustible-menos;//creo una variable para saber si el cmbustible es negativo
		if(total>=0) {
			combustible-=menos;
		}
		System.out.println("Ejecutado desde la clase hija");
	}

	//Genero el getter
	public int getCombustible() {
		System.out.println("Ejecutado desde la clase hija");
		return combustible;
	}
	
	
	

}
