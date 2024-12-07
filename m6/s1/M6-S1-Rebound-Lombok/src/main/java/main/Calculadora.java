package main;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
 
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Calculadora implements ICalculadora{
	
	List<Alumno> alumnos;
 
	@Override
	public List<Alumno> calcularPromedios() {
		
		int index=0;
		
		for(Alumno alumnoTemp : alumnos) {
			//Para cada alumno
			 Float sumaNotas = 0f;
			 int cantidadNotas=0;
			
			 for(Integer nota : alumnoTemp.getNotas()) {
				 sumaNotas = sumaNotas + nota;
				 cantidadNotas++;
			 }
			 alumnoTemp.setPromedio(sumaNotas/cantidadNotas);
			 alumnos.set(index, alumnoTemp);
			 index++;
		}
		
		return alumnos;
	}
 
}
