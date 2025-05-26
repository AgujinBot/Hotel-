import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotelIsaac = new Hotel();
        hotelIsaac.crearHotel();
        Scanner s = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("¿Desea reservar? ingrese (1)\n¿Desea verificar disponibilidad? ingrese (2)\n¿Desea finalizar? ingrese (3)");
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el ID de la habitación que quiere reservar:");
                    int idReserva = s.nextInt();
                    hotelIsaac.reservarHabitacion(idReserva);
                    break;
                case 2:
                    System.out.println("Ingrese el ID de la habitación que quiere verificar:");
                    int idVerificar = s.nextInt();
                    hotelIsaac.verificarDisponibilidad(idVerificar);
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 3);

        s.close();
    }
}
