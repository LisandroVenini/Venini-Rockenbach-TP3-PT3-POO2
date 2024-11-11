/**
 * Fábrica concreta para crear una instancia de PagoPorTransferencia.
 */
public class BankTransferPaymentFactory extends PaymentFactory {
        /**
     * Crea una instancia de PagoPorTransferencia.
     * 
     * @return una instancia de PagoPorTransferencia
     */
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}

