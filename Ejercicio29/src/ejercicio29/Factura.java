package ejercicio29;

/**
 *
 * @author Arturo
 */
public class Factura{

    public void total(Barco barco, int dias){
        int total=barco.alquiler(dias);
        barco.alquiler(dias);
        System.out.println("Factura"
                +barco.toString()+"\nTotal a pagar :"+total
        );
    }
}
