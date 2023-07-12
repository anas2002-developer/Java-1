import java.io.ByteArrayInputStream;
import java.io.IOException;

public class FHByteArrayInputStream {
    public static void main(String[] args) throws IOException {

        // Creates an array of byte
        byte[] array = {1, 2, 3, 4};
            ByteArrayInputStream f = new ByteArrayInputStream(array);
            int i;
            while((i=f.read())!=-1){
                System.out.print(i + ", ");
            }
            f.close();

    }
}