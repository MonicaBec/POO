package segundo;

import java.security.Timestamp;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p= new Persona();
		
		p.edad=18;
		p.nombre="Carmen alicia";
		p.altura=1.56;
		
		p.cumpliranios();
		p.saludar();
		System.out.println("cuando cumplas años tendrás" +p.edad);
		System.out.println("¿Cuanto has crecido?");
		double incremento= new Scanner(System.in).nextDouble();
		p.crecer(incremento);
		System.out.printf("Tu estatura ahora es ->%.2f",p.altura);
	}

}
