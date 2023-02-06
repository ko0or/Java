package generic;


class MultiGeneric<ONE, TWO> {
    ONE one;
    TWO two;
    
    // 생성자 Constructor
    MultiGeneric(ONE one, TWO two) {
        this.one = one;
        this.two = two;
    }

    void GetType() {
        System.out.println("----------->");
        System.out.println( "one > " + this.one.getClass().getName() );
        System.out.println( "two > " + this.two.getClass().getName() );
    }
}

public class file_multi {
    public static void main(String[] args) {
        MultiGeneric<String, Integer> mul = new MultiGeneric<>("일이삼", 123);
        MultiGeneric<Object, Object> ti = new MultiGeneric<>(123, "하나둘셋");
        
        // mul --->
        System.out.println( "mul.one > " + mul.one );
        System.out.println( "mul.two > " + mul.two );
        
        System.out.println(" mul.GetType() __");
        mul.GetType();


        // ti --->
        System.out.println("\n\n");
        System.out.println( "ti.one > " + ti.one );
        System.out.println( "ti.two > " + ti.two );
        
        System.out.println(" ti.GetType() __");
        ti.GetType();

    }
}
