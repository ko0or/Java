public class FILE01 {   
    public static void main(String[] args) {
        /* --- Base.java 파일을 활용한 예제 --- */
       
        
        // chain_01, 메소드체이닝 사용(세터 2개)
        Base chain_01 = new Base();
        chain_01
            .setName("홍길동")
            .setAge(20);
        

        // chain_02, 생성자 사용
        Base chain_02 = new Base("아무개", 22);


        // chain_01, chain_02 각각 출력
        System.out.println( chain_01.toString() );
        System.out.println( chain_02.toString() );


        // 그냥 출력
        System.out.println( new Base().toString() );
    }
}


