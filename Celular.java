public class Celular extends DispositivoMovil{
	private String numero;

	public Celular(String numero){
		super(0);
		this.numero = numero;
	}

	public void llamar(String numero){
		System.out.println("Llamando... " + numero);
	}

	//redefinir metodo apagar
	//public void apagar(){
	//	System.out.println("No quiero apagarme! T.T");
	//}

	public	void	encender(){
		super.encender();							System.out.println("No quiero apagarme! :D");
		System.out.println("Prueba de cambio T.T");
	}				
}