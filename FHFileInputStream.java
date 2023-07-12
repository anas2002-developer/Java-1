import java.io.FileInputStream;
import java.io.IOException;

public class FHFileInputStream {
    public static void main(String args[]) throws IOException {
            FileInputStream f = new FileInputStream("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\FileReader.txt");

            // Reads the first byte
            int i = f.read();

            while(i != -1) {
                System.out.print((char)i);

                // Reads next byte from the file
                i = f.read();
            }
            f.close();
        }
    }
