/**
 * Clase que implementa el pago por transferencia bancaria.
 */
public class BankTransferPayment implements Payment {
        /**
     * Procesa el pago utilizando transferencia bancaria.
     * 
     * @param monto el monto del pago a procesar
     */
    @Override
    public void processPayment(double monto) {
        System.out.println("Procesando pago por transferencia bancaria de $" + monto);
    }   
}
