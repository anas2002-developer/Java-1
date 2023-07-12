import java.io.FileOutputStream;
import java.io.IOException;

public class FHFileOutputStream {

    public static void main(String[] args) throws IOException{
            FileOutputStream f = new FileOutputStream("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\FileWriter.txt");
            String i = "Relax it's iPhone";
            byte[] array = i.getBytes();

            // Writes byte to the file
            f.write(array);

            f.close();
        }

    }