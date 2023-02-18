public class FILE02 {
    public static void main(String[] args) {
        
        new ExOverLoading().TestMethod();
        new ExOverLoading().TestMethod("가나다라");
        new ExOverLoading().TestMethod(1234);

        
    }
}

class ExOverLoading {  
    void TestMethod() 
    { System.out.println( "매개변수가 없을때 실행" ); } 
    
    void TestMethod(String arg)
    { System.out.println("매개변수 문자열을 받았을때 실행"); }

    void TestMethod(int arg)
    { System.out.println("매개변수 숫자를 받았을때 실행"); }
}