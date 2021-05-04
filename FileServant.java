import java.io.*;

public class FileServant extends _FileInterfaceImplBase {

   public String cuentaLineas(String fileName){
    int NumLineas = 0;
    String lineas = "";
    File file = new File(fileName);
    FileReader fr = null;
    BufferedReader br = null;

    file = new File(fileName);
    try {
      fr = new FileReader(file);
      br = new BufferedReader(fr);
      try {
        while ((lineas = br.readLine()) != null) {
          NumLineas++;
        }
      } catch (IOException e) {
        System.out.println("Error al leer la linea del archivo.");
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error al abrir el archivo.");
    } finally {
      try {
        fr.close();
      } catch (IOException e) {
        System.out.println("Error al cerrar el archivo.");
      }
    }

    return NumLineas+"";
   }

}