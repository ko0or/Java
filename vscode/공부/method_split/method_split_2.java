/*
    #############################################################
    
    파일구성
        _ FIRST 패키지의 method_split_2.java 파일
    
    파일내용
        _ split 함수를 활용한 문자열 나누기
        _ 블로그 주소를 예시로, 블로그 ID 반환해보기
    
    클래스와 메소드
        _ blogURL 클래스
            __ blogURL.setURL() > boolean 자료형 메소드
            [1] contains 함수를 활용해서 블로그 주소형식이 맞는지 확인
            [2] 이후, true 혹은 false 값을 반환
            [3-1] true 일경우 URL, URL_ARRAY, URL_LENGTH 변수를 할당
            [3-2] GetLength(), GetArray(), GetID() 메소드에서 활용
        
            __ blogURL.GetLength() > int 자료형 메소드
            [1] blogURL.setURL() 메소드로 할당된 URL_LENGTH 반환

            __ blogURL.GetArray() > String[] 문자열 배열형식의 메소드
            [1] blogURL.setURL() 메소드로 할당된 URL_ARRAY 반환

            __ blogURL.GetID() > String 자료형 메소드
            [1] blogURL.setURL() 메소드로 할당된 URL_LENGTH, URL_ARRAY
            [2] 2개의 변수로 가장 마지막 인덱스 요소를 반환

    #############################################################
 */

package FIRST;
import java.util.Scanner;

class method_split_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        blogURL blog = new blogURL();

        while (true) {
            
            System.out.println("블로그 주소를 입력해주세요 :)");
            System.out.print("> ");
            String inputURL = sc.nextLine();


            // 입력된 값이, 블로그 주소가 맞을경우에만 실행되는 조건문
            if ( blog.SetURL(inputURL) ) {
                System.out.println("블로그 아이디 > " + blog.getID());
                System.out.println( "인덱스의 갯수 > " + blog.GetLength() );
                System.out.println( "인덱스 요소들 ---------->");
                
                for (String TEXT : blog.GetArray()) {
                    System.out.println("> " + TEXT);
                }
            } // end.. if
       
        } // end.. while



    }
}

class blogURL {
    private String URL;
    private String[] URL_ARRAY;
    private int URL_LENGTH;

    boolean SetURL(String inputTEXT) {
        while (true) {
            URL = inputTEXT;
            
            if (URL.contains("https://blog.naver.com/")) {
                URL_ARRAY = URL.split("/");
                URL_LENGTH = URL_ARRAY.length;
                return true;
            }
            System.out.println("> 입력내용이 블로그 주소형식과 다릅니다.\n");
            return false;
        }
    }

    int GetLength() {
        return URL_LENGTH;
    }

    String[] GetArray() {
        return URL_ARRAY;
    }

    String getID() {
        if (URL_LENGTH >4) return URL_ARRAY[URL_LENGTH-2];
        return URL_ARRAY[URL_LENGTH-1];
        
    }

}