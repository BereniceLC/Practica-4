public class TestDispositivo {
	public static void main(String[] args){
		Laptop lap = new Laptop();
		lap.encender();
		lap.verCargaBateria();
		lap.apagar();

		//nuevo objeto y llamada de metodos
		Celular cel = new Celular("123-456-7890");
		cel.encender();
		cel.verCargaBateria();
		cel.llamar("098-765-4321");

		//llamada de metodo para laptop y no compila
		//lap.llamar("123-456-7890");
		
		//llamar metodo apagar
		lap.apagar();
		cel.apagar();

		//lo ultimito del codigo
		Laptop lap2 = new Laptop();
		System.out.println("¿Lap es igual a Lap2? : " + lap.equals(lap2));
		System.out.println("El objeto de " + lap2.getClass().toString() + "llamado lap2 vive en " + lap2.toString());
	}
}