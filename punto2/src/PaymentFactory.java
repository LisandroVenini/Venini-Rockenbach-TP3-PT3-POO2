/**
 * Clase abstracta que representa una fábrica de métodos de pago.
 */
public abstract class PaymentFactory {
        /**
     * Crea una instancia del tipo de pago especificado.
     * 
     * @return una instancia de un método de pago específico
     */
    public abstract Payment createPayment();
}

