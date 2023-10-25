public class Tablet extends DispositivoMovil{
	private String aplicacion;

	public Tablet(){
		super(0);
	}

	public void abrirAplicacion(String aplicacion){
		System.out.println("Se esta abriendo " + aplicacion);
	}
}