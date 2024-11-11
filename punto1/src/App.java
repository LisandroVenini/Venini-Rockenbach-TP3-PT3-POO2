import modelos.*;

public class App {
    public static void main(String[] args) throws Exception {
        FlightBookingBuilder builder = new ConcreteFlightBookingBuilder();
        FlightBookingDirector director = new FlightBookingDirector();

        // Construir una reserva personalizada usando el Director
        FlightBooking reservaCompleta = director.crearReservaCompleta(builder);
        reservaCompleta.mostrarReserva();

        // Crear una reserva personalizada sin el Director
        FlightBooking reservaPersonalizada = builder
                .setAsientoSeleccionado("Pasillo")
                .setCantidadEquipaje(1)
                .setTipoComida("Normal")
                .setServiciosPremium("WiFi a bordo")
                .build();
        reservaPersonalizada.mostrarReserva();
    }
}
