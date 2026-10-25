package ar.edu.unq.po.tp3;

import java.util.ArrayList;

/*
   Ejercicio 6
   
   Programe la clase Multioperador, que permite aplicar las operaciones de suma, resta y multiplicación
   sobre ArrayLists de enteros. Es decir, poder sumar todos los números que contiene, poder restar todos los
   números que contiene y poder multiplicar a todos los números que contiene entré si
*/

public class Multioperador {

	private ArrayList<Integer> numeros;

	public Multioperador() {
		this.numeros = new ArrayList<>();
	}
	
	public void addNumber(int i) {
		this.numeros.add(i);
	}

	public int sumaTotal() {
	 int total = 0;
	  for(int numero : numeros) {
		if(!numeros.isEmpty()) {	
		  total = total + numero;
	    }
	  }
	  return total;
	}

	public int restaTotal() {
	  int total = 0;
	   for(int numero : numeros) {
	     if(!numeros.isEmpty()) {
		  total = total - numero;
	     }
	   }
	  return total;
	}

	public int multiplicacionTotal() {
	  int total = 1;
	    for(int numero : numeros) {
	      if(!numeros.isEmpty()) {
	    	  total = total * numero;
	      }
	    }
	    return total;
    }
}
	
