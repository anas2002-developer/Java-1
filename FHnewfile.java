import java.io.File;
import java.io.IOException;

public class FHnewfile {
    public static void main(String[] args)  {
        File f=new File("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\newfile.txt");
        try{
        if (f.createNewFile())
            System.out.println("created");
        else
            System.out.println("already created");
        }
        catch(IOException e){
            System.out.println("IOException handled");
        }
    }
}


//public class FHnewfile {
//    public static void main(String[] args)  throws IOException{
//        File f=new File("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\newfile.txt");
//
//            if (f.createNewFile())
//                System.out.println("created");
//            else
//                System.out.println("already created");
//
//    }
//}
