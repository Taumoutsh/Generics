
public class Alumno extends Persona{

	private int asignaturas;
	
	public Alumno() {
		super();
	}
	
	public Alumno(String nombre, String apellido, int asignaturas) {
		super(nombre, apellido);
		this.asignaturas = asignaturas;
	}

	public int getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}
	
}
