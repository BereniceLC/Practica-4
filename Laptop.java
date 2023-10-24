//nueva clase que hereda de DispositivoMovil
public class Laptop extends DispositivoMovil{
	//nuevo constructor
	public Laptop(){
		//sentencia super
		super(0);
		velocidadProcesador = 2.47f;
		cargaBateria = 4096;
		sistemaOperativo = "Microsoft Windows 7";
		marca = "HP";
		modelo = "Pavilion dv5-2247la";
	}
}