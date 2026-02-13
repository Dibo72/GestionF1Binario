import java.util.List;
import java.util.Scanner;

public class Agregar {
    public static void agregarPiloto(List<Piloto> pilotos) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String escuderia;
        int puntos;

        System.out.println("Introduce el nombre del piloto:");
        nombre = sc.nextLine();
        boolean name = Comprobar.comprobarNombre(nombre, pilotos);
        if (!name) {
            System.out.println("Introduce la escuderia del piloto: ");
            escuderia = sc.nextLine();

            System.out.println("Introduce los puntos del piloto: ");
            puntos = sc.nextInt();

            pilotos.add(new Piloto(nombre, escuderia, puntos));
        }else{
            System.out.println("El nombre ya ha sido agregado");
        }
    }
}
