import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class FHByteArrayOutputStream {
    public static void main(String[] args) throws IOException {

        String data = "Relax it's iPhone";
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        byte[] array = data.getBytes();

        // Writes data to the output stream
        f.write(array);

        // Retrieves data from the output stream in string format
        String streamData = f.toString();
        System.out.println("Output stream: " + streamData);

        f.close();

    }
}

