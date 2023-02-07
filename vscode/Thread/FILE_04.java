public class FILE_04 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start --!");
        
        ThreadEx2 thr1 = new ThreadEx2();
        ThreadEx2 thr2 = new ThreadEx2();
        ThreadEx2 thr3 = new ThreadEx2();

        thr1.start();
        thr2.start();
        thr3.start();
        
        thr1.join();
        thr2.join();
        thr3.join();

        System.out.println("main end --!");

    }    
}



// ------------------------------------------------>
class ThreadEx2 extends Thread {
        private int money = 1000;

        @Override
        public void run() {
            while(true) {
                if (this.money>0) {
                    SpendMoney();
                } else {
                    RunOutOfMoney();
                    break;
                }
            }
        }

        void RunOutOfMoney() {
            System.out.println(
                Thread.currentThread().getName() + " > 돈을 다써버렸어요 .. !"
            );
        }

        void SpendMoney() {
            this.money -= 100;
            System.out.println(Thread.currentThread().getName() + " > 100원 출금 [잔액: " + money + "원]");
        }
}
