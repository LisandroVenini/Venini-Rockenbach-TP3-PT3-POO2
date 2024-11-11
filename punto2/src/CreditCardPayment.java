/**
 * Clase que implementa el pago con tarjeta de crédito.
 */
public class CreditCardPayment implements Payment {
        /**
     * Procesa el pago utilizando tarjeta de crédito.
     * 
     * @param monto el monto del pago a procesar
     */ 
    @Override
    public void processPayment(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito de $" + monto);
    }
}

