public class Audifonos extends DispositivoMovil{
	private boolean estado;

	public Audifonos(){
		super(0);
	}
	
	public void encender(boolean estado){
		if(estado = false){
			System.out.println("Los audifonos estan encedidos");
		}else{
			System.out.println("Los audifonos estan apagados");
		}
	}
}