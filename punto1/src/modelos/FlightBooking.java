package modelos;

public class FlightBooking {
    private String asientoSeleccionado;
    private int cantidadEquipaje;
    private String tipoComida;
    private String serviciosPremium;

    // Getters para mostrar los atributos de la reserva de vuelo
    public String getAsientoSeleccionado() { return asientoSeleccionado; }
    public int getCantidadEquipaje() { return cantidadEquipaje; }
    public String getTipoComida() { return tipoComida; }
    public String getServiciosPremium() { return serviciosPremium; }

    // Métodos para establecer los atributos (solo accesibles por el Builder)
    void setAsientoSeleccionado(String asientoSeleccionado) { this.asientoSeleccionado = asientoSeleccionado; }
    void setCantidadEquipaje(int cantidadEquipaje) { this.cantidadEquipaje = cantidadEquipaje; }
    void setTipoComida(String tipoComida) { this.tipoComida = tipoComida; }
    void setServiciosPremium(String serviciosPremium) { this.serviciosPremium = serviciosPremium; }

    // Método para mostrar la reserva configurada
    public void mostrarReserva() {
        System.out.println("Asiento seleccionado: " + asientoSeleccionado);
        System.out.println("Cantidad de equipaje adicional: " + cantidadEquipaje);
        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Servicios premium: " + serviciosPremium);
    }
}