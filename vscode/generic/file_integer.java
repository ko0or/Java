package generic;

class IntegerGeneric<숫자> {
    숫자 number;
    IntegerGeneric(숫자 number) {
        this.number = number;
    }
}

public class file_integer {
    public static void main(String[] args) {
        IntegerGeneric<Integer> typeINT = new IntegerGeneric<>(50);
        System.out.println( typeINT.number );
        
        System.out.println( typeINT.number.getClass().getName() );
        System.out.println( typeINT.number + 50 );


    }
}
