package Override_Overloading;

class OverLoadingTest {
    void Catch() { System.out.println("기본"); }
    void Catch(int input_int) { System.out.println("숫자"); }
    void Catch(String input_str) { System.out.println("문자"); }

}

public class over_loading {
    public static void main(String[] args) {
        OverLoadingTest OLT = new OverLoadingTest();
        
        OLT.Catch();
        OLT.Catch(1);
        OLT.Catch("A");
    
    }
}
