package datos;

import java.util.ArrayList;
import java.util.List;
import modelo.Curso;

public class Auxiliar {

	static List<Curso> listaCurso = new ArrayList<>();
	
	public String verCursos() {
		String salida="";
		for(Curso temp : listaCurso) {
			salida = salida + temp.toString() +"\n";
		}
		return salida;
	}
	
	public void precarga() {
		listaCurso.add(new Curso("ING1","Inglés", "Curso completo desde nivel básico hasta avanzado de inglés. 80 horas"));
		listaCurso.add(new Curso("COAF1","Comunicación efectiva", "Fundamentos de la comunicación efectiva para el fortalecimiento de las relaciones interpersonales en espacios de trabajo. 100 horas"));
		listaCurso.add(new Curso("EXC2","Excel Avanzado", "Formulas, listas y plantillas en Excel. 50 horas"));
		listaCurso.add(new Curso("WOR1","Word básico", "Uso de elementos básicos en Word. Creación de Curriculum Vitae. 20 horas"));
	
	}
	
}
