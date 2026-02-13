import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
public class cargarPilotos {
    public static List<Piloto> cargarPilotos(){
        List<Piloto> pilotos = new ArrayList<>();
        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream("pilotos_f1.dat"))) {
            while (true) {
                Piloto p = (Piloto) lector.readObject();
                pilotos.add(p);
            }
        }catch (ClassNotFoundException e){
            System.out.println("No se encontro el objeto Piloto" + e.getMessage());
        }catch (EOFException e){
            System.out.println("Pilotos creados");
        }catch (Exception e){
            System.out.println("Error al cargar pilotos: " + e.getMessage());
        }
        return pilotos;
    }
}
