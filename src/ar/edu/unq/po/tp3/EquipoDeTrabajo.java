package ar.edu.unq.po.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private String nombre;
	private ArrayList<Persona11> personas;
	
	public EquipoDeTrabajo(String nombre, ArrayList<Persona11> personas) {
		this.nombre = nombre;
		this.personas = personas;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Persona11> getPersonas() {
		return personas;
	}
	
    public void agregarPersona(Persona11 persona) {
		
		this.getPersonas().add(persona);	
	}

	public double promedioDeEdades() {
		
		if(personas.isEmpty()) {
			return 0;
		}
		
		int total = 0;
		for (Persona11 persona : this.personas) {
			total+=persona.getEdad();
		}
		
		int tamaño = personas.size();
		return (double) total / tamaño;
	}



}
