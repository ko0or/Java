package Override_Overloading;

class MyParameter {
    void SetArgs(String...Parameters) {
        System.out.println( 
            "매개변수 갯수 > " + Parameters.length );

        for (String arg : Parameters) {
            System.out.println( arg );
        }
        
    }
}

public class etc {
    public static void main(String[] args) {
        MyParameter myParm = new MyParameter();
        myParm.SetArgs(
            "인수값을",
            "여러개 넣어도", 
            "한줄단위로 출력되는 ", 
            "가변매개변수 !");
        
    }
}
