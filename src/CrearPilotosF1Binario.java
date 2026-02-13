import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CrearPilotosF1Binario {
    public static void main(String[] args) {
        List<Piloto> pilotos = new ArrayList<>();
//lee el fichero
        try (BufferedReader lector = new BufferedReader(new FileReader("pilotos_f1.txt"))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                //va leyendo el fichero y lo separa por los ";"
                String[] partes = linea.split(",");

                //dice que nombre va a ser la 1º parte y nota la 2ª
                String nombre = partes[0].trim();
                String escuderia = partes[1].trim();
                Integer puntos = Integer.parseInt(partes[2].trim());


                //inserta las notas y nombres
                pilotos.add(new  Piloto(nombre, escuderia, puntos));


            }
        }catch (Exception e){
            System.out.println("Error en el archivo" + e.getMessage());
        }

        try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("pilotos_f1.dat"))) {

            for (Piloto piloto : pilotos) {
                escritor.writeObject(piloto);
            }
            System.out.println("Archivo convertido");

        } catch (Exception e) {
            System.out.println("Error en el archivo pilotos_f1" + e.getMessage());
        }
        mostrarPilotos(leerArchvo());
    }

    public static List<Piloto> leerArchvo() {
        List<Piloto> pilotos = new ArrayList<>();
        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream("pilotos_f1.dat"))) {
            do {
                pilotos.add((Piloto) lector.readObject());
            } while (true);
        }catch (EOFException e) {
            System.out.println();
            System.out.println("Pilotos cargados");
            System.out.println();

        }catch (Exception e){
            System.out.println("Error en el archivo " + e.getMessage());
        }
        return pilotos;
    }

    public static void mostrarPilotos(List<Piloto> pilotos) {
        System.out.println("Lista de pilotos: ");
        for (Piloto nombre : pilotos) {
            System.out.println(nombre);
        }
        System.out.println();
    }
}
