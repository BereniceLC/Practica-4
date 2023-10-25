public class Controladora{
	public static void main(String[]args){
		//Llamar clase Audifonos
		Audifonos a1 = new Audifonos();
		a1.encender(true);
		
		//Llamar clase Tablet
		Tablet t1 = new Tablet();
		t1.abrirAplicacion("Bloc de Notas");
	}
}