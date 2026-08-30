package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
        return this.arregloEnteros.clone();
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        return this.arregloCadenas.clone();
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return this.arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return this.arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int valor = this.arregloEnteros.length;
    	int[] newEnteros = new int[valor+1] ;
    	
    	for (int i = 0 ; i< this.arregloEnteros.length  ; i++) {
    		int newValor = this.arregloEnteros[i];
    		newEnteros[i] = newValor;
    	}
    	this.arregloEnteros = newEnteros;
    	this.arregloEnteros[valor] = entero;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int valor = this.arregloCadenas.length;
    	String[] newCadenas = new String[valor+1] ;
    	
    	for (int i = 0 ; i< this.arregloCadenas.length  ; i++) {
    		String newValor = this.arregloCadenas[i];
    		newCadenas[i] = newValor;
    	}
    	this.arregloCadenas = newCadenas;
    	this.arregloCadenas[valor] = cadena;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int size = this.arregloEnteros.length;
    	int count = 0;
    	
    	for (int i = 0 ; i < size ; i++) {
    		int curr = this.arregloEnteros[i];
    		if (curr != valor) {
    			count++;
    		}
    	}
    	int contador = 0;
    	int[] temp = new int[count];
    	
    	for (int i = 0 ; i < size ; i++) {
    		int curr = this.arregloEnteros[i];
    		if (curr != valor) {
    			temp[contador] = curr;
    			contador++;
    		}
    	}
    	
    	this.arregloEnteros = temp;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int size = this.arregloCadenas.length;
    	int count = 0;
    	
    	for (int i = 0 ; i < size ; i++) {
    		String curr = this.arregloCadenas[i];
    		if (!curr.equals(cadena)) {
    			count++;
    		}
    	}
    	
    	int contador = 0;
    	String[] temp = new String[count];
    	
    	for (int i = 0 ; i < size ; i++) {
    		String curr = this.arregloCadenas[i];
    		if (!curr.equals(cadena)) {
    			temp[contador] = curr;
    			contador++;
    		}
    	}
    	
    	this.arregloCadenas = temp;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int size = this.arregloEnteros.length;
    	
    	if (posicion > size) {
    		posicion = size;
    	}
    	else if (posicion < 0) {
    		posicion = 0;
    	}
    	
    	int[] temp = new int[size+1];
    	
    	for (int i = 0; i<= posicion; i++ ) {
    		if(i==posicion) {
    			temp[i] = entero;
    		}
    		else {
    			temp[i] = this.arregloEnteros[i];
    		}
    	}
    	
    	for (int i = posicion+1; i< size +1;i++) {
    		temp[i] = this.arregloEnteros[i-1];
    	}
    	this.arregloEnteros = temp;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int size = this.arregloEnteros.length;
    	if (posicion >= size || posicion < 0) {
    		return;
    	}
    	
    	int[] temp = new int[size - 1];
    	
    	for (int i = 0; i < posicion; i++) {
    		temp[i] = this.arregloEnteros[i];
    	}
    	
    	for (int i = posicion + 1; i < size; i++) {
    		temp[i - 1] = this.arregloEnteros[i];
    	}
    	
    	this.arregloEnteros = temp;
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int[] temp = new int[valores.length];
    	
    	for (int i = 0; i< valores.length; i++) {
    		temp[i] = (int) valores[i];
    	}
    	
    	this.arregloEnteros = temp;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String[] temp = new String[objetos.length];
    	
    	for (int i = 0; i< objetos.length; i++) {
    		temp[i] =  objetos[i].toString();
    	}
    	
    	this.arregloCadenas = temp;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	for(int i = 0; i < this.arregloEnteros.length; i++) {
    		int curr = arregloEnteros[i];
    		arregloEnteros[i] = Math.abs(curr);
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	int size = this.arregloEnteros.length;
    	for (int i = 0; i < size; i++) {
    		int minPos = i;
    		
    		for (int j = i; j< size; j++) {
    			int testing = this.arregloEnteros[j];
    			if (testing < this.arregloEnteros[minPos]) {
    				minPos = j;
    			}
    		}
    			
    		int temp = this.arregloEnteros[i];
    		this.arregloEnteros[i] = this.arregloEnteros[minPos];
    		this.arregloEnteros[minPos] = temp;
    		
    	}
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	int size = this.arregloCadenas.length;
    	for (int i = 0; i < size - 1; i++) {
    		int minPos = i;
    		
    		for (int j = i + 1; j < size; j++) {
    			String testing = this.arregloCadenas[j];
    			if (testing.compareTo(this.arregloCadenas[minPos]) < 0) {
    				minPos = j;
    			}
    		}
    			
    		String temp = this.arregloCadenas[i];
    		this.arregloCadenas[i] = this.arregloCadenas[minPos];
    		this.arregloCadenas[minPos] = temp;
    	}
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int curr = 0;
    	for (int i : this.arregloEnteros) {
    		if (valor == i) {
    			curr++;
    		}
    	}
        return  curr;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int curr = 0;
    	
    	for (String i : this.arregloCadenas) {
    		if(cadena.equalsIgnoreCase(i)) {
    			curr++;
    		}
    	}
        return curr;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
        int num = this. contarApariciones(valor );
        
        int[] result = new int[num];
        
        int pos = 0;
        for (int i = 0; i < this.arregloEnteros.length ; i++) {
        	if (this.arregloEnteros[i] == valor) {
        		result[pos] = i;
        		pos++;
        	}
        }
        return result;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	
    	
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	
    	for (int i: this.arregloEnteros) {
    		if( i < min) min = i;
    		if (i > max) max = i;
    	}
    	
    	if (this.arregloEnteros.length == 0) {
    		int[] result = new int[0];
    		return result;
    	}
    	else {
    	int[] result = new int[2];
    	result[0] = min;
    	result [1] = max;
    	return result;
    	}
    	
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
    	for (int i : this.arregloEnteros) {
    		result.put(i, this.contarApariciones(i));
    	}
        return result;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>(this.calcularHistograma());
    	int contador = 0;
    	
    	for (Map.Entry<Integer,Integer> pareja : temp.entrySet()) {
    		if (pareja.getValue() >1) contador ++;
    	}
        return contador;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	
    	if (this.arregloEnteros.length != otroArreglo.length) return false;
    	
    	for (int i = 0; i < this.arregloEnteros.length; i++ ) {
    		if ( this.arregloEnteros[i] != otroArreglo[i]) return false;
    	}
        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if (otroArreglo == null) {
    		return false;
    	}
    	if (this.arregloEnteros.length != otroArreglo.length) {
    		return false;
    	}
    	int[] temp1 = this.arregloEnteros.clone();
    	int[] temp2 = otroArreglo.clone();
    	for (int i = 0; i < temp1.length - 1; i++) {
    		int minPos = i;
    		for (int j = i + 1; j < temp1.length; j++) {
    			if (temp1[j] < temp1[minPos]) {
    				minPos = j;
    			}
    		}
    		int aux = temp1[i];
    		temp1[i] = temp1[minPos];
    		temp1[minPos] = aux;
    	}
    	for (int i = 0; i < temp2.length - 1; i++) {
    		int minPos = i;
    		for (int j = i + 1; j < temp2.length; j++) {
    			if (temp2[j] < temp2[minPos]) {
    				minPos = j;
    			}
    		}
    		int aux = temp2[i];
    		temp2[i] = temp2[minPos];
    		temp2[minPos] = aux;
    	}
    	
    	for (int i = 0; i < temp1.length; i++) {
    		if (temp1[i] != temp2[i]) {
    			return false;
    		}
    	}
    	
    	return true;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int[] temp = new int[cantidad];
    	
    	for (int i = 0; i < cantidad; i++) {
    		temp[i] = (int)(Math.random() * (maximo - minimo + 1)) + minimo;
    	}
    	this.arregloEnteros = temp;
    }
    

}
