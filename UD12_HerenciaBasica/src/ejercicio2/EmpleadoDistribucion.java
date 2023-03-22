package ejercicio2;

public class EmpleadoDistribucion extends Asalariado{//Hereda de Asalariado
	private String zona;
	
	//Constructor
	public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String zona) {
		super(nombre, dni, diasVacaciones);
		this.zona = zona;
	}
	
	//Getters y Setters
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	//Genero toString
	@Override
	public String toString() {
		return "EmpleadoDistribucion [zona=" + zona + ", Nombre=" +super.getNombre()+", Dni="+super.getDni()+", DiasVacaciones="+super.getDiasVacaciones()+"]";
	}
	
	
	
	
	
	
	

}
