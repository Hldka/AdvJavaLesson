package AdvJavaPractice.multithreads.creation;

public class ThreadCreation3 {
    public static void main(String[] args) {
        //Task4: anonymous class kullanarak thread oluşturunuz.
//       lambda expression kullanarak thread oluşturunuz.

Thread thread1=new Thread(new Runnable() {

    @Override
    public void run() {
        Thread.currentThread().setName("Tweeety");
        String name=Thread.currentThread().getName();
        for (int i=1;i<=100;i++){
            System.out.println();
            System.out.println(name+"  : kaciyorum");
        }
    }
});
Thread thread2=new Thread(()->{
    Thread.currentThread().setName("Slyvester");
    String name=Thread.currentThread().getName();
    for (int i=1;i<=100;i++){
        System.out.println(name+"  - yakalayacagim");
    }

        });


thread1.start();
thread2.start();

    }
}
