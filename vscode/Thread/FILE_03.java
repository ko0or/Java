/*
    thr1이 끝날때까지 기다린후 thr2, thr3이 같이동작
    thr3이 끝나야 ` main end. ` 내용이 출력된다

    jon() 함수
*/

public class FILE_03 {
    public static void main(String[] args) throws InterruptedException {
        
        ThreadEx thr1 = new ThreadEx();
        ThreadEx thr2 = new ThreadEx();
        ThreadEx thr3 = new ThreadEx();

        thr1.start();
        // thr1.join();
        
        thr2.start();
        // thr2.join();

        thr3.start();
        thr3.join();

        System.out.println("main end.");
    }
}


class ThreadEx extends Thread {
    
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " > Start");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " > END..");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}