import java.io.File;

public class FHbasic {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\anas4\\OneDrive\\Desktop\\FHJava\\newfile.txt");
        System.out.println("EXISTENCE  : "+ f.exists());
        System.out.println("NAME       : "+ f.getName());
        System.out.println("PATH       : "+ f.getAbsolutePath());
        System.out.println("READABLE   : "+ f.canRead());
        System.out.println("WRITABLE   : "+ f.canWrite());
        System.out.println("SIZE       : "+ f.length());
        System.out.println("DELETE     : "+ f.delete());
    }
}
