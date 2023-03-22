package ejercicio2;

public class Test {

	public static void main(String[] args) {
		EmpleadoProduccion emP= new EmpleadoProduccion("Jose", 1234567890L, 22, "Tarde");
		EmpleadoDistribucion emD= new EmpleadoDistribucion("Francisco", 9876543210L, 21, "Sur");
		System.out.println(emP.toString());
		System.out.println(emD.toString());
	}

}
