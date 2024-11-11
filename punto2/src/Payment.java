 /**
 * Interfaz que define el método para procesar un pago.
 */
 public interface Payment {
     /**
     * Procesa el pago con el monto especificado.
     * 
     * @param monto el monto del pago a procesar
     */
    void processPayment(double monto);
}

