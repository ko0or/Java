package generic;

public class etc {
    public static void main(String[] args) {
        Object obj_1 = "망고";
        Object obj_2 = 2;
        Integer obj_3 = 8;

        System.out.println( obj_1 );
        System.out.println( obj_2 );
        System.out.println( obj_3 );


        System.out.println( obj_1.getClass().getName() );
        System.out.println( obj_2.getClass().getName() );
        System.out.println( obj_3.getClass().getName() );
        

        // [오브젝트끼리는 더할 수 없구나]
        // 에러 // System.out.println( obj_1 + obj_2 );
        // 에러 // System.out.println( obj_2 + 8 );


        // 오브젝트 자료형을 바꾸거나, integer(혹 String) 자료형등을 사용할 순 있구나
        System.out.println( obj_3 + 12);
        System.out.println( obj_2.toString() + 12 );
        

    }   
}
