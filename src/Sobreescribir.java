import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Sobreescribir {
    public static void sobreescribirPiloto(List<Piloto> pilotos) {
        try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("pilotos_f1.dat"))) {

            for (Piloto piloto : pilotos) {
                escritor.writeObject(piloto);
            }
            System.out.println("Archivo sobreescrito");

        } catch (Exception e) {
            System.out.println("Error en el archivo pilotos_f1" + e.getMessage());
        }
    }
}
