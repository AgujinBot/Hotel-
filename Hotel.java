import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones = new ArrayList<>();

    public void crearHotel() {
        for (int i = 1; i <= 5; i++) {
            habitaciones.add(new Habitacion(i, false));
        }
    }

    public Habitacion buscarHabitacionPorId(int id) {
        for (Habitacion h : habitaciones) {
            if (h.getId() == id) {
                return h;
            }
        }
        return null;
    }

    public void reservarHabitacion(int id) {
        Habitacion hab = buscarHabitacionPorId(id);
        if (hab != null) {
            if (!hab.isReservada()) {
                hab.setReservada(true);
                System.out.println("Habitación " + id + " reservada con éxito.");
            } else {
                System.out.println("La habitación ya está reservada.");
            }
        } else {
            System.out.println("Habitación no encontrada.");
        }
    }

    public void verificarDisponibilidad(int id) {
        Habitacion hab = buscarHabitacionPorId(id);
        if (hab != null) {
            if (hab.isReservada()) {
                System.out.println("La habitación está ocupada.");
            } else {
                System.out.println("La habitación está disponible.");
            }
        } else {
            System.out.println("Habitación no encontrada.");
        }
    }


}
