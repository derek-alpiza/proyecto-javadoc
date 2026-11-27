package javadoc2;

/**
 * Calcula precios de una tienda online.
 * 
 * @author Derek
 * @version 1.2
 */

public class Tienda {

    /** IVA general en España, en tanto por uno. */
    public static final double IVA = 0.21;

    /**
     * Calcula el precio de un producto con el IVA incluido.
     *
     * @param precio el precio sin IVA, en euros
     * @return el precio con el IVA incluido, en euros
     */
    
    public static double precioConIva(double precio) {
        return precio + precio * IVA;
    }

    /**
     * Aplica un descuento a un precio.
     *
     * @param precio el precio original, en euros
     * @param descuento el porcentaje de descuento a aplicar
     * @return el precio con el descuento aplicado, en euros
     */
    
    public static double aplicarDescuento(double precio, int descuento) {
        return precio - precio * descuento / 100;
    }

    /**
     * Comprueba si el pedido tiene envío gratuito (precio >= 50).
     *
     * @param precio el importe del pedido, en euros
     * @return true si el precio es mayor o igual a 50, false en caso contrario
     */
    public static boolean envioGratis(double precio) {
        return precio >= 50;
    }

    /**
     * Muestra por pantalla una línea del ticket de compra.
     *
     * @param producto el nombre del producto
     * @param precio el precio sin IVA, en euros
     */
    public static void mostrarTicket(String producto, double precio) {
        System.out.println(producto + ": " + precioConIva(precio) + " euros");
    }

    /**
     * Calcula cuántas unidades se pueden comprar con un presupuesto.
     *
     * @param precio el precio de una unidad, en euros
     * @param presupuesto el dinero disponible, en euros
     * @return el número de unidades que se pueden comprar
     */
    public static int calcularUnidades(double precio, double presupuesto) {
        return (int) (presupuesto / precio);
    }	


/**
* Prueba los métodos de la clase mostrando sus resultados.
*
* @param args argumentos de la línea de órdenes (no se usan)
*/
public static void main(String[] args) {
System.out.println("Con IVA: " + precioConIva(221));
System.out.println("Con descuento: " + aplicarDescuento(50, 25));
System.out.println("¿Envío gratis? " + envioGratis(70));
mostrarTicket("Ratón", 20);
System.out.println("Unidades: " + calcularUnidades(7.5, 80));
}

}