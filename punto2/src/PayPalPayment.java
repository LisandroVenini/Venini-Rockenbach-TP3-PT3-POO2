/**
 * Clase que implementa el pago con PayPal.
 */
public class PayPalPayment implements Payment {
     /**
     * Procesa el pago utilizando PayPal.
     * 
     * @param monto el monto del pago a procesar
     */
    @Override
    public void processPayment(double monto) {
        System.out.println("Procesando pago con PayPal de $" + monto);
    }
}

