import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FHcopyfile {
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\FileReader.txt");
        FileWriter r=new FileWriter("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\copy.txt");
        int i;
        while((i=f.read())!=-1){
            r.write((char)i);
        }
        f.close();
        r.close();
    }
}

//classes for reading data

//BufferedReader
//ScannerClass
//FileInputStream
