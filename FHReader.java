import java.io.FileReader;
import java.io.IOException;

public class FHReader {
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\FileReader.txt");
//        int i;
//        while((i=f.read())!=-1){
//            System.out.print((char)i);
//        }

        char arr[]=new char[100];
        f.read(arr);
        System.out.println(arr);
        f.close();
    }
}

//classes for reading data

//BufferedReader
//ScannerClass
//FileInputStream
