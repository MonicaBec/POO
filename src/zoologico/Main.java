package zoologico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//instanciar la clase, declarar miAnimal como un objeto de la clase animales
		//es decir que mi objeto hereda atributos de la clase animales
		Animales miAnimal= new Animales();
	    miAnimal.nombre="Misifu"; //de este animal en especifico
	    miAnimal.mostrarNombre();
	    miAnimal.iD=1;
	    miAnimal.edad=14;
	    miAnimal.mostrarCaracteristicas(miAnimal.nombre, miAnimal.edad,miAnimal.iD);
	    miAnimal.nombre="Goofy";
	    miAnimal.mostrarNombre();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	}

	



	
	
	
}
