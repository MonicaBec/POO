package segundo;

public class Persona {

	String nombre;
    byte edad;
    double altura;
    
    public void saludar() {
    	System.out.println("Hola mi nombre es : " +nombre+" encantado de conocerte");
    }
   
    public void cumpliranios() {
    	edad++;
    }
    
    public void crecer (double incremento) {
    	altura+=incremento;//la estatura aumenta según el incremento 
    }
}
