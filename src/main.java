import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		List<Persona> personas = new ArrayList<Persona>();
		
		alumnos.add(new Alumno("Thomas", "SINAN", 4));
		alumnos.add(new Alumno("Arthur", "ALEIXO", 3));
		alumnos.add(new Alumno("Alexandre", "GRENON", 2));
	
		personas.add(new Persona("Unai", "Aguileira"));
		
		imprimirPersonas(personas);
		imprimirPersonas(alumnos);

	}
	// "List<? extends Persona" permet de retrouver les méthodes héritantes de Persona
	public static void imprimirPersonas(List<? extends Persona> personas) {
		for(Persona p : personas) {
			System.out.println(p.getApellido()+" "+p.getNombre());
		}
	}

}
