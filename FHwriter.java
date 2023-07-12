import java.io.FileWriter;
import java.io.IOException;

public class FHwriter {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\FileWriter.txt");
        f.write("Relax it's iPhone");
        f.close();
    }
}

//classes for writing into file

//BufferedWriter;
//FileOutputStream;
//PrintWriter;
