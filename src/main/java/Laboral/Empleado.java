package Laboral;

public class Empleado extends Persona {
	private int categoria;
	public int anyos;

	public Empleado(String nombre, String dni, char sexo) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
	}

	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
		this.categoria = categoria;
		this.anyos = anyos;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public void incrAnyo() {
		anyos++;
	}
	
	public void imprime() {
		System.out.println(toString());
	}
	
	
}
