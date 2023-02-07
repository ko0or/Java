public class FILE_01 {
    public static void main(String[] args) {

        Worker boy = new Worker("철수");
        Worker2 girl = new Worker2("영희");
        
        boy.start();
        girl.start();

        System.out.println("main end.");
    }
}


class Worker extends Thread {
    String name;
    Worker (String name) { this.name = name; }
    
    @Override
    public void run() {
        
        try {
            for (int n=1; n<=5; n++) {
                Thread.sleep(1000);
                System.out.println(
                    "술래 [" + name +"]" + "가 현재 [" + n + "초] 세었습니다."
                    );
            }
            System.out.println("술래가 도둑을 찾으러갑니다 .. !");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}

class Worker2 extends Thread {
    String name;
    Worker2 (String name) { this.name = name; }
    
    @Override
    public void run() {
        
        try {
            for (int n=1; n<=3; n++) {
                Thread.sleep(1000);
                System.out.println(
                    "도둑 [" + name +"]" + "이 현재 [" + n + "초] 동안 도망가는중입니다."
                    );
            }
            System.out.println("도둑이 숨었습니다 ..!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}