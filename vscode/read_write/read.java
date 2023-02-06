package read_write;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
public class read {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./read_write/writeFile.txt");

        // 파일내용 전체 읽어오기
        String str = Files.readString(path, StandardCharsets.UTF_8);
        System.out.println(str);
        System.out.println("------------------>");
        

        // 0번째 글자 확인하기
        System.out.println( str.charAt(0) );

        // 불러온 텍스트에 백두산이 있는지 확인 (boolean)
        System.out.println( str.contains("백두산") );

        // 불러온 텍스트중에서 ` 물 ` 이라는 글자가 몇번쨰 위치하는지
        System.out.println( str.indexOf("물") );
 
    }
}