package main;
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

public class Profesor {
	ICalculadora calculadora;

	public void mosatrarAlumnosPromedios() {
		System.out.println(calculadora.calcularPromedios());
	}

}
