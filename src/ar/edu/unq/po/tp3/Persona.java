package ar.edu.unq.po.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	/* Ejercicio 10.3
	
	    ACLARACION DECIDI USAR LOCAL DATE Y NO DATE
	    
	    Agregue a la clase Persona un método (de clase) de creación, respetando la siguiente firma:
		Persona(String nombre, Date fechaNacimiento)
		que recibe como parámetros el nombre y la fecha de nacimiento de la persona a crear, crea una
		nueva instancia de Persona y la retorna inicializada con los valores recibidos como parámetro.

    */
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

/* Ejercicio 10.1
 
    Responder: Si un objeto cualquiera que le pide la edad a una Persona: ¿Conoce cómo ésta calcula u
    obtiene tal valor? ¿Cómo se llama el mecanismo de abstracción que permite esto
    
    No, el objeto externo no conoce cómo se calcula u obtiene la edad. Solo sabe que puede invocar el método getEdad() 
    para recibir un número entero, pero desconoce la lógica interna (por ejemplo, si la edad es un atributo almacenado o si 
    se calcula  dinámicamente comparando la fecha de nacimiento con la fecha actual).

    Este mecanismo se conoce como encapsulamiento (u ocultamiento de información).

*/

/* Ejercicio 10.2
   
   Agregue a la clase Persona definida anteriormente el método menorQue(Persona persona)
   que recibe como parámetro a otra persona y retorna true en caso de que el receptor sea menor en
   edad que el parámetro, o false en caso contrario.
 
 */

   public boolean menorQue(Persona persona) {
	   
	   return (edad(this) < edad(persona));

   }

   public int edad(Persona persona) {
	  LocalDate hoy = LocalDate.now();
	  LocalDate fechaDeNacimiento = persona.getFechaDeNacimiento();
	  
	  Period periodo = Period.between(fechaDeNacimiento, hoy);
	  
	  int edadDePersona = periodo.getYears();
	  
	   return edadDePersona;
			   
    }
   
   
}
