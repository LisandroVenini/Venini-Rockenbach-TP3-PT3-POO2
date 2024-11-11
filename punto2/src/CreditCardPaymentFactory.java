/**
 * Fábrica concreta para crear una instancia de PagoConTarjeta.
 */
public class CreditCardPaymentFactory extends PaymentFactory {
        /**
     * Crea una instancia de PagoConTarjeta.
     * 
     * @return una instancia de PagoConTarjeta
     */
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}