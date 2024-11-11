package modelos;

public class FlightBookingDirector {
    public FlightBooking crearReservaCompleta(FlightBookingBuilder builder) {
        return builder
                .setAsientoSeleccionado("Ventana")
                .setCantidadEquipaje(2)
                .setTipoComida("Vegetariana")
                .setServiciosPremium("Acceso a lounge, embarque prioritario")
                .build();
    }
}
