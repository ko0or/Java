package read_write;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
public class write {
    public static void main(String[] args) {
        try {
 
            // 1. Path 객체 생성
            Path path = Paths.get("./read_write/writeFile.txt");
 
            // 2. 파일에 쓰기
            Files.write(path, "안녕하세요".getBytes());
            

            
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}