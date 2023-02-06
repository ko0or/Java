package Override_Overloading;

import java.util.ArrayList;

class Parent {}
class Car extends Parent {
    
    ArrayList<String> playList = new ArrayList<String>();
    
    Car() {
        // 생성자 Constructor
        SetPlayList();
    }

    void SetPlayList() {
        playList.add(0, "홍진영-사랑의배터리");
        playList.add(1, "박상철-무조건");
        playList.add(2, "장윤정-초혼");
    }

    void MusicPlay() {
        System.out.println("노래가 재생됩니다..");
        System.out.println("[재생목록] ------->");
        playList.forEach(System.out::println);

    }
}


class Child extends Car {
    
    @Override
    void SetPlayList() {
        playList.add(0, "PSY-That That");
        playList.add(1, "멜로망스-선물");
        playList.add(2, "적재-별 보러 가자");
    }
}

public class over_ride {
    public static void main(String[] args) {
        Child child = new Child();
        child.MusicPlay();


    }
}
