package modelos;

public class ConcreteFlightBookingBuilder implements FlightBookingBuilder{
        private final FlightBooking reserva = new FlightBooking();
    
        /**
         * Establece el asiento seleccionado por el usuario para la reserva de vuelo
         * @param asiento Asiento seleccionado (Ventana, Pasillo, Medio)
         * @return this
         */
        @Override
        public FlightBookingBuilder setAsientoSeleccionado(String asiento) {
            reserva.setAsientoSeleccionado(asiento);
            return this;
        }
    
        /**
         * Establece la cantidad de equipaje adicional que el usuario desea
         * incluir en su reserva de vuelo.
         * @param cantidad Cantidad de equipaje adicional (en kgs)
         * @return this
         */
        @Override
        public FlightBookingBuilder setCantidadEquipaje(int cantidad) {
            reserva.setCantidadEquipaje(cantidad);
            return this;
        }
    
        /**
         * Establece el tipo de comida que el usuario desea para su reserva de vuelo
         * @param comida Tipo de comida (Vegetariana, No Vegetariana, Sin especificar)
         * @return this
         */
        @Override
        public FlightBookingBuilder setTipoComida(String comida) {
            reserva.setTipoComida(comida);
            return this;
        }
    
        /**
         * Establece los servicios premium que el usuario desea para su reserva de vuelo
         * @param servicios Servicios premium (Prioridad en Check-in, Prioridad en embarque, Asiento preferencial)
         * @return this
         */
        @Override
        public FlightBookingBuilder setServiciosPremium(String servicios) {
            reserva.setServiciosPremium(servicios);
            return this;
        }
    
        /**
         * Crea una instancia de FlightBooking con los atributos establecidos
         * mediante los metodos setAsientoSeleccionado, setCantidadEquipaje,
         * setTipoComida y setServiciosPremium de esta clase.
         * @return Instancia de FlightBooking con los atributos establecidos
         */
        @Override
        public FlightBooking build() {
            return reserva;
        }
}
