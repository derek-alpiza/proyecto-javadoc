
public class Utilidades {

	/**
	 * Clase de utilidades 
	 * @author Derek Alpiza
	 * @version 1.0
	 */
	

	    /**
	     * Comprueba si un numero entero es par
	     * @param numero El numero entero a evaluar
	     * @return true si el numero es par, false en caso contrario
	     */
	    public static boolean esPar(int numero) {
	        return numero % 2 == 0;
	    }

	    /**
	     * Compara tres numeros enteros y muesttrame el mayor de ellos 
	     * @param a Primer numero entero
	     * @param b Segundo numero entero
	     * @param c Tercer numero entero
	     * @return El valor maximo entre a, b y c
	     */
	    public static int mayorDeTres(int a, int b, int c) {
	        int mayor = a;
	        
	        if (b > mayor) {
	            mayor = b;
	        }
	        
	        if (c > mayor) {
	            mayor = c;
	        }
	        
	        return mayor;
	    }

	    /**
	     * Calcula el area de un rectangulo
	     * @param base La longitud de la base del rectangulo
	     * @param altura La longitud de la altura del rectangulo
	     * @return El area calculada (base * altura)
	     */
	    public static double areaRectangulo(double base, double altura) {
	        return base * altura;
	    }

	    /**
	     * Comprueba si un texto comienza con un caracter especifico
	     * @param texto que se a verificar
	     * @param letra el caracter que se desea comprobar por donde empieza el texto
	     * @return true si el texto empieza con la letra indicada, false en caso contrario
	     */
	    public static boolean empiezaPor(String texto, char letra) {
	        return texto.charAt(0) == letra;
	    }

	    /**
	     * Mostrar por la consola la tabla de multiplicar de un número (del 1 al 12)
	     * @param El número del cual se quiere mostrar la tabla de multiplicar
	     */
	    public static void mostrarTabla(int numero) {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	    }

	    /**
	     * Ejecutar unas pruebas para cada uno de los metodos de la clase
	     * @param Argumentos de la linea de comandos
	     */
	    public static void main(String[] args) {
	        System.out.println("¿7 es par? " + esPar(7));
	        System.out.println("Mayor de 4, 9 y 2: " + mayorDeTres(4, 9, 2));
	        System.out.println("Área de 5 x 3: " + areaRectangulo(5, 3));
	        System.out.println("¿\"Holanda\" empieza por H? " + empiezaPor("Holanda", 'H'));
	        mostrarTabla(3);
	    }
	}
	
