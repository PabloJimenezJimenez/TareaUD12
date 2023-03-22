package ejercicio1;

public class Vehiculo {
	private int ruedas;
	private int velocidad;
	public Vehiculo(int ruedas, int velocidad) {
		this.ruedas = ruedas;
		this.velocidad = velocidad;
	}
	public Vehiculo() {
		this(0,0);//Llamo al constructor anterior
	}
	
	public void acelerar(int mas) {
		int total=velocidad+mas;//creo una variable total para saber si la velocidad va a ser superior a 120
		if(total<120) {
			velocidad+=mas;
		}
		System.out.println("Ejecutado desde la clase padre");
	}
	
	public void frenar(int menos) {
		int total=velocidad-menos;//creo una variable para saber si la velocidad es negativa
		if(total>-1) {
			velocidad-=menos;
		}
		System.out.println("Ejecutado desde la clase padre");
	}
	
	//Creo los getters
	public int getRuedas() {
		System.out.println("Ejecutado desde la clase padre");
		return ruedas;
	}
	public int getVelocidad() {
		System.out.println("Ejecutado desde la clase padre");
		return velocidad;
	}
	
}
