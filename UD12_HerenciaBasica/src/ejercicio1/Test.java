package ejercicio1;

public class Test {

	public static void main(String[] args) {
		Coche damcar= new Coche(4, 0, 60);//Creo un objeto coche
		damcar.acelerar(100);//Acelera hasta 100
		damcar.consumir(20);//Consume 20
		damcar.frenar(40);//Frena hasta 60
		System.out.println(damcar.getCombustible());//Consulto el combustible
		damcar.acelerar(30);//Acelera hasta 90
		damcar.consumir(10);//Consume 10
		damcar.frenar(90);//Frema hasta 0
		damcar.acelerar(130);//Intenta acelerar a 130
		System.out.println(damcar.getCombustible());//Consulto el combustible
		
	}

}
