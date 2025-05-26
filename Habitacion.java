import java.util.ArrayList;
import java.util.List;

public class Habitacion   {

    private int id;
    private boolean reservada;

    public Habitacion(int id, boolean reservada) {
        this.id = id;
        this.reservada = reservada;
    }

    public int getId() {
        return id;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

}
