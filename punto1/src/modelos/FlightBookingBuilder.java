package modelos;

public interface FlightBookingBuilder {
    FlightBookingBuilder setAsientoSeleccionado(String asiento);
    FlightBookingBuilder setCantidadEquipaje(int cantidad);
    FlightBookingBuilder setTipoComida(String comida);
    FlightBookingBuilder setServiciosPremium(String servicios);
    FlightBooking build();
}

