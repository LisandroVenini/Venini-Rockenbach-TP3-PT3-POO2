/**
 * Fábrica concreta para crear una instancia de PagoConPayPal.
 */
public class PayPalPaymentFactory extends PaymentFactory {
        /**
     * Crea una instancia de PagoConPayPal.
     * 
     * @return una instancia de PagoConPayPal
     */
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}

