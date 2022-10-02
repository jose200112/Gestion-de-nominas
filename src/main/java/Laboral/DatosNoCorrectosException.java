package Laboral;

public class DatosNoCorrectosException extends Exception {
	public DatosNoCorrectosException(String message) {
		super (message);
		
		message = "Datos no correctos";
	}
}
