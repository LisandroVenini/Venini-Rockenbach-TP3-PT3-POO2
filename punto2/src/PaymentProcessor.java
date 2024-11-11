/**
 * Clase cliente que utiliza las fábricas de métodos de pago para procesar pagos.
 */
public class PaymentProcessor {
      /**
     * Punto de entrada del programa. Crea diferentes métodos de pago y los procesa.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        double monto = 100.0;

        // Crear y procesar pago con tarjeta de crédito
        PaymentFactory paymentFactory = new CreditCardPaymentFactory();
        Payment payment = paymentFactory.createPayment();
        payment.processPayment(monto);

        // Crear y procesar pago con PayPal
        paymentFactory = new PayPalPaymentFactory();
        payment = paymentFactory.createPayment();
        payment.processPayment(monto);

        // Crear y procesar pago con transferencia bancaria
        paymentFactory = new BankTransferPaymentFactory();
        payment = paymentFactory.createPayment();
        payment.processPayment(monto);
    }
}

