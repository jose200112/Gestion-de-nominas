package Laboral;

public class CalculaNominas {
	public static void main(String[] args) throws DatosNoCorrectosException {
		Empleado e1 = new Empleado("James Cosling","32000032G",'M',4,7);
		Empleado e2 = new Empleado("Ada Lovelace","32000031R",'F');
		
		CalculaNominas n = new CalculaNominas();
		n.escribe(e2, "James Cosling","32000032G",'M',4,7);
		n.escribe(e1, "Ada Lovelace","32000031R",'F',0,0);
		
		e2.incrAnyo();
		e1.setCategoria(9);
		
	}
	
	

	private void escribe(Empleado e, String nombre, String dni, char sexo, int categoria, int anyos) {
		Nomina n = new Nomina();
		System.out.println("El empleado de nombre: " + nombre + " de dni:" + dni + " sexo:" + sexo +
				" categoria:" + categoria + " anyos:" + anyos + " y sueldo:" + n.sueldo(e));
	}
}
