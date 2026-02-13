import java.util.List;
public class Comprobar {
    public static boolean comprobarNombre(String nombre, List<Piloto> pilotos) {
        //true = si esta el nombre
        //false = nombre nuevo
        for (Piloto p : pilotos) {
            String comparar = (p.getNombre().trim());
            if (comparar.equals(nombre.trim())) {
                return true;
            }
        }
        return false;
    }
}
