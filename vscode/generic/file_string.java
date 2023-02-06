package generic;

class StringGeneric<Input> {
    Input input;
    StringGeneric(Input input) { 
        this.input = input;
    }
}

public class file_string {
    public static void main(String[] args) {
        StringGeneric<String> new_instance = new StringGeneric<String>("생성자");

        System.out.println( new_instance.input );
        System.out.println( new_instance.input.getClass().getName() );


    }
}
