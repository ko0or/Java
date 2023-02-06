package read_write;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
 
public class write {
    public static void main(String[] args) throws IOException {

            String path = "./writeFile.txt";
            Files.write(Paths.get(path), "안녕하세요\n동해물과\n백두산이\nabc".getBytes());
            
            
           
 

    }
}
