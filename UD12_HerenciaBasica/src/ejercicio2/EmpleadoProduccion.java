package ejercicio2;

public class EmpleadoProduccion extends Asalariado{//Hereda de asalariado
	
	private String turno;

	//Constructor
	public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno) {
		super(nombre, dni, diasVacaciones);
		this.turno = turno;
	}
	
	//Genero los getters y setters
	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	//Genero el toString
	@Override
	public String toString() {
		return "EmpleadoProduccion [turno=" + turno + ", Nombre=" +super.getNombre()+", Dni="+super.getDni()+", DiasVacaciones="+super.getDiasVacaciones()+"]";
	}
	
	
	
	
	
	

}
