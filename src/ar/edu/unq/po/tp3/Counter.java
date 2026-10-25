package ar.edu.unq.po.tp3;

import java.util.ArrayList;

public class Counter {

    private ArrayList <Integer> numeros;
    
    public Counter() {
    	this.numeros = new ArrayList<>();
    }

	public void addNumber(int i) {
		this.numeros.add(i);
		
	}
	
	/* Ejercicio 1
	   Cree un nuevo proyecto de Java en Eclipse. Cree una clase llamada Counter dentro del paquete
       ar.edu.unq.po2.tp3 que, a partir de un ArrayList que mantiene como variable privada, sea capaz de contar:
         1. La cantidad de pares
         2. La cantidad de impares
         3. La cantidad de múltiplos de un cierto número
	*/

	public int cantidadDePares() {
	  
	  int contador = 0;
	  for(int numero : numeros) {
		if (numero % 2 == 0) {
		   contador++;
		}
	  }
		return contador;
	}

	public int cantidadDeImpares() {
	 int contador = 0;
	 for(int numero : numeros) {
	   if (numero % 2 == 1)
		 contador++;
	 }
		return contador;
	}

	public int cantidadDeMultiplosDelNumero(int divisor) {
	
	 int contador = 0;
	 for(int numero : numeros) {
	   if (numero % divisor == 0) {
		   contador++;
	   }
	 }
	 return contador;
    }
	
	/* Ejercicio 2 DESARMANDO NUMEROS
	   Diseñe e implemente una función Java que reciba una rreglo de números enteros y
       devuelva el número que tiene la mayor cantidad dedígitos pares. No puede utilizar
       String!!. Por lo cual, debe razonar cómo desarmar el número utilizando los operadores
       de los números enteros (div y mod)
	*/

	public int numeroConMasDigitosPares() {
	   if (numeros.isEmpty()) {
		   return 0;   
	   }
	   int mejorNumero = numeros.get(0);
	   int maxPares = contarDigitosPares(this.numeros.get(0));
	   for(int i = 1; i < numeros.size(); i++) {
		   int numActual = this.numeros.get(i);
		   int paresActuales = this.contarDigitosPares(numActual);
		   
	       if (paresActuales > maxPares) {
		     maxPares = paresActuales;
		     mejorNumero = numActual;
	       }
	   }
	   return mejorNumero;
	}

	private int contarDigitosPares(int numero) {
	    if (numero < 0) {
	      numero = -numero;
	    }
	    if (numero == 0) {
            return 1;
        }
	    
	    int contadorPares = 0;
	    while (numero > 0) {
            int digito = numero % 10; // Extrae el último dígito
            if (digito % 2 == 0) {  // Evalúa si el dígito es par
                contadorPares++;
            }
            numero = numero / 10; // Quita el último dígito
        }

        return contadorPares;
    }
	
	/*
	 *  Ejercicio 3 MULTIPLOS
	*/

	public int multiploMasAltoEntre0y1000De(int x, int y) {
	
	int numeroMasAlto = 1000;
	while(numeroMasAlto > 0) {
	  if (numeroMasAlto % x == 0 && numeroMasAlto % y == 0){
		  return numeroMasAlto;
	  }
	  numeroMasAlto--;
	}
		return -1; // Si no existe un numero mas alto que sea multiplo entre los valores dado, devuelve -1
	}
}

/* Ejercicio 4 Examinar las expresiones

Dado el siguiente código:
 String a = "abc";
 String s = a;
 String t;
 
Indique que valores retornan las siguientes expresiones o, si dan error, por qué se producen:

● s.length();
 Devuelve 3 porque a vale "abc", y s apunta a "abc". La cantidad de caracteres de "abc" es 3
 
● t.length(); 
 Devuelve error porque La variable t fue declarada (String t;), pero no fue inicializada 
 (no se le asignó ningún valor). Java no permite usar variables locales sin inicializar.
 
● 1 + a;
 Devuelve "1abc", porque En Java, si usas el operador + y uno de los operandos es un String (en este caso a es "abc"), 
 el otro operando se convierte automáticamente a String y se concatenan.
 
● a.toUpperCase();
 Devuelve el valor de la variable a en formato de Mayusculas

● "Libertad".indexOf("r");
 Devuelve 4 porque siendo "Libertad" un string (lista de caracteres) cada caracter esta ubicado en
 un indice diferente, a partir del 0. la Letra r se encuentra ubicada en el indice 4

● "Universidad".lastIndexOf('i');
 Devuelve 6, Contando desde 0: U(0), n(1), i(2), v(3), e(4), r(5), s(6)... la segunda 'i' está en la posición 6. La última posición (7) corresponde a la 'd'.
 
● "Quilmes".substring(2,4);
  Devuelve un valor de tipo string desde los indices dados, en este caso el valor
  sera "il" El método substring(inicio, fin) incluye el índice de inicio pero excluye el índice de fin 
  (toma desde inicio hasta fin - 1). En "Quilmes": Q(0), u(1), i(2), l(3), m(4). Toma los índices 2 y 3: "il".

● (a.length() + a).startsWith("a");
  Devuelve False porque:
  a.length() devuelve 3 (un int).

  3 + "abc" realiza una concatenación y resulta en el String "3abc".

  "3abc".startsWith("a") evalúa si empieza con "a". Como empieza con "3", devuelve false. 
  Es una expresión válida en Java.

● s == a;
 Devuelve True, ya que la variable s esta definida asi: s = a; 

● a.substring(1,3).equals("bc")
 Devuelve true. a.substring(1,3) toma los índices 1 y 2 de "abc", obteniendo "bc", lo cual es igual a "bc".

*/

/* Ejercicio 5 Examinar las expresiones
 
   5.1 ¿Qué son los tipos de datos primitivos?
   
   Los tipos de datos primitivos son datos que ya vienen predefinidos en el lenguaje Java
   
   5.2 ¿Cuál es la diferencia entre un int y un Integer?
   
   La diferencia entre un int y un Integer es que el int es un tipo de dato predefinido 
   y el Integer es una clase contenedora 
   
   5.3 ¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? 
       ¿Y si se define una de tipo Integer? Haga la prueba en Eclipse.

   "Habiendo hecho la prueba en Eclipse, cuando se define una variable de instancia de tipo int su 
    valor predeterminado es 0 (tipo primitivo). 
    En cambio, cuando se define una variable de instancia de tipo Integer (que es un objeto/clase envolvente), 
    su valor predeterminado es null, lo que indica que no hace referencia a ningún objeto en memoria."
    
   5.4 Responder la pregunta del punto anterior (3), pero ahora en lugar de definir una 
       variable de instancia se define una variable de método.
        
   "A diferencia de las variables de instancia, las variables de método (locales) no poseen valores predeterminados. 
    En Java es obligatorio inicializar una variable local antes de poder leer su valor. Si se intenta utilizar 
    una variable local de tipo int o Integer sin haberle asignado un valor previamente, el compilador lanza un error 
    de compilación indicando que la variable no ha sido inicializada."
        
 */

