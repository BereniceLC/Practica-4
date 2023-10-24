//no utilizar "final" aqui y borrar
public class DispositivoMovil {
	
	//cambiamos atributos private por protected
	public float velocidadProcesador;
	public int cargaBateria;
	protected int memoria;
	protected String sistemaOperativo;
	protected String marca;
	protected String modelo;
	
	//nuevo constructor
	public DispositivoMovil(int x){
		System.out.println("Haré que Laptop deje de funcionar! :D");
	}
	
	public void encender() {
		System.out.println("Starting up...");		
	}
	
	//modifar a final
	public final void apagar() {
		System.out.println("Shutting down...");
	}
	
	public int verCargaBateria() {
		System.out.println("Queda un " + cargaBateria + "% de bateria.");
		return cargaBateria;
	}
	
}