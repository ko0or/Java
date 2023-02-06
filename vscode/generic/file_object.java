package generic;

class ObjectGeneric<제네릭은> {
    public 제네릭은 info;
    
    // 생성자 constructor
    ObjectGeneric(제네릭은 info) { this.info = info; }
}


public class file_object {
    public static void main(String[] args) {
        ObjectGeneric<Object> my_instance = new ObjectGeneric<>('a');
        
        System.out.println( my_instance.info.getClass().getName() );
        System.out.println( my_instance.info );
        
        
    }
}
