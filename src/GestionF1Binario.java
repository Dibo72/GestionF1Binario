import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionF1Binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Piloto> pilotos = new ArrayList<>((cargarPilotos.cargarPilotos()));
        boolean seguir = true;

        while (seguir) {
            System.out.println("Elija la opcion: (0=mostrar pilotos, 1=Agregar piloto, 2=buscar piloto, 3=sobreescribir y borrar");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println();
                    Mostrar.mostrarPilotos(pilotos);
                    break;
                case 1:
                    System.out.println();
                    Agregar.agregarPiloto(pilotos);
                    break;
                case 2:
                    System.out.println();
                    Buscar.buscarPiloto(pilotos);
                    break;
                case 3:
                    seguir = false;
                    System.out.println();
                    Sobreescribir.sobreescribirPiloto(pilotos);
                    break;
            }
        }

    }
}