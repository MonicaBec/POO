package zoologico;

public class Animales {

	//atributos
	
	 String nombre;
	int iD;
	int edad;
	
	
	//metodos
	
	public void mostrarNombre() {
		System.out.println(nombre);
	}

	
	public void mostrarCaracteristicas(String nomString, int edad, int iD) {
		System.out.println("Mi animal se llama "+nomString+" tiene "+edad+" años, y su id es "+iD);
		
	}
	
}
