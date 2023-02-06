package read_write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;




public class read {
    public static void main(String[] args) throws IOException {
       
        String Path = "./writeFile.txt";
        byte[] bytes = Files.readAllBytes(Paths.get(Path)); 

        String str = new String(bytes);
        //String[] str = new String(bytes).split("\n");

        System.out.println( str );
        //System.out.println( str[0] );
        

    }
}
