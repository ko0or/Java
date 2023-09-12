package FIRST;

class method_split_1 {
    public static void main(String[] args) {
        String TEXT = "https://blog.naver.com/taehwa10404";
        
        int TEXT_LENGTH = TEXT.split("/").length;
        String[] TEXT_ARRAY = TEXT.split("/");
        
        System.out.println( "TEXT의 인덱스 갯수 > " +  TEXT_LENGTH );
        for (String execute : TEXT_ARRAY) {
            System.out.println("> " + execute);
        }
        
        System.out.println("블로그 아이디만 출력 ---------------> ");
        System.out.println(TEXT_ARRAY[TEXT_LENGTH-1]);

    }
}