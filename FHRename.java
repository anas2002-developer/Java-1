import java.io.File;

public class FHRename {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\junk.txt");
        File r=new File("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\renameIt.txt");
        if (f.exists()){
            System.out.println(f.renameTo(r));
        }
        else {
            System.out.println("File doesnt exist");
        }
    }
}
