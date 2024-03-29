package AdvJavaPractice.multithreads.creation;

public class ThreadCreation2 {
    public static void main(String[] args) {
        //Task2:Runnable interfaceni implement eden Counter isminde sınıf oluşturup
        // bu sınıftan harfleri a dan z ye kadar yazdıran iki tane thread oluşturunuz.

        //Task3: Threadler başlamadan önce Yarış başlasın ve bitince Yarış bitti
        //yazdırın.
        System.out.println("yaris baslasin...");
Counter c1=new Counter("RoadRunner");
Counter c2=new Counter("speedyGonzales");
Thread thread1=new Thread(c1);
Thread thread2=new Thread(c2);
thread1.start();
thread2.start();
/*
//thread1 ve thread2 bitene kadar main threadi uyutmak istedik kesin cözüm degil
        try{Thread.sleep(10);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        */
        //thread1 ve thread2 bitene kadar main threadi beklet
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Yaris bitti...");
    }
}
