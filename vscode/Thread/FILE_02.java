/*
    쓰레드의 또 다른 사용방법 Runnable
        class 클래스이름 implements Runnable 
        
        쓰레드와 차이점: 
            ㄴ 상속이 가능하다
            ㄴ Runnable에 대한 인스턴스를 만들고,
            만들어진 인스턴스 값은 Thread 인스턴스의 첫번째 인수값에 넣는다
            이후에는 Thread 인스턴스.start() 메소드를 사용

 */

public class FILE_02 {
    public static void main(String[] args) throws InterruptedException {
        RunnableEx R = new RunnableEx();
        Thread r1 = new Thread(R, "First");
        Thread r2 = new Thread(R, "Second");
        Thread r3 = new Thread(R, "Third");
        
        r1.start();       
        r2.start();
        
        r3.start();
        r3.join();

        System.out.println("main end.");
    }
}


class RunnableEx implements Runnable {
    
    @Override
    public void run() {
        for (int n=1; n<=3; n++) {
            try {
                System.out.println(Thread.currentThread().getName() + " > " + n + "초");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}