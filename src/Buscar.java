import java.util.List;
import java.util.Scanner;
public class Buscar {
    public static void buscarPiloto(List<Piloto> pilotos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del piloto: ");
        String nombre = sc.nextLine();
        if (Comprobar.comprobarNombre(nombre, pilotos)) {
            for (Piloto p : pilotos) {
                if (p.getNombre().equals(nombre)) {
                    System.out.println(p);
                }
            }
        }else{
            System.out.println("No existe el piloto");
        }
    }
}
