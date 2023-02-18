import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

 
public class FILE01 {
    public static void main(String[] args) {
        
        
        /* 

            패턴 사용방법 < 엑셀이랑 비슷한 느낌 >

            연도-> yyyy 
            몇월 -> MM
            며칠 -> dd     
            몇시 -> HH
            몇분 -> mm
            요일 -> E

        */

        // 내가 원하는대로 출력하는 현재시간 -->
        String TEST_01 = DateTimeFormatter
            .ofPattern("yyyy/MM/dd(E) HH:mm")
            .format(LocalDateTime.now());
 
        System.out.println( "TEST_01 TYPE > " + TEST_01.getClass().getName() );
        System.out.println( TEST_01 );


        // 정해진대로 출력하는 현재시간 -->
        LocalDateTime TEST_02 = LocalDateTime.now();

        System.out.println( "\n" + "TEST_02 TYPE > " + TEST_02.getClass().getName() );
        System.out.println( TEST_02 ); 
    }
}
