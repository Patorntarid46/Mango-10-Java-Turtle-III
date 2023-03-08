public class Main {
    public static void main(String[] a){
        Thread thread1 = new Thread(new PetalsBobWorker());
        Thread thread2 = new Thread(new StemSarahWorker());
        Thread thread3 = new Thread(new LeavesBobWorker());
        Thread thread4 = new Thread(new BranchesSarahWorker());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
