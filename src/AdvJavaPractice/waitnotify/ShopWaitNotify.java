package AdvJavaPractice.waitnotify;
/*
TASK: Bir marketteki stok miktarını takip eden bir uygulama tasarlayınız.
      Markette yeterli ürün yoksa yeni ürün gelmesi beklensin.
      Yeni ürün eklenince ürün satışı gerçekleşsin.
*/
public class ShopWaitNotify {
    public static int stock=0;

    public static void main(String[] args) {
        ShopWaitNotify shop=new ShopWaitNotify();
        Thread consumerThread =new Thread(new Runnable() {
            @Override
            public void run() {
                shop.consumeProduct(3);
            }
        });
        consumerThread.setName("Tüketici ");
        Thread producerThread=new Thread(new Runnable() {
            @Override
            public void run() {
                shop.produceProduct(5);
            }
        });producerThread.setName("Üretici");
        consumerThread.start();
        producerThread.start();


    }

    public synchronized void consumeProduct(int amount){
        if (amount>stock){
            System.out.println(Thread.currentThread().getName()+" ürün satin almak istiyor");
            System.out.println("Yeterli ürün  ,Güncel ürün stogu : "+stock);
            System.out.println("Tüketici ürün girisi yapilmasini bekliyor");
            try{ wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }if (amount<=stock){
            System.out.println(Thread.currentThread().getName()+" ürün satin almak istiyor");
            System.out.println("ürün satin alindi ,stoktan düsülüyor.");
            stock=stock-amount;
            System.out.println("Güncel stock: "+stock);
        }else {
            System.out.println(Thread.currentThread().getName()+"ürün satin almak istiyor");
            System.out.println("yeterli ürün yok,güncel stock : "+stock);
            System.out.println("Bugün git yarin gel");
        }
    }public synchronized void produceProduct(int amount){
        System.out.println();
        System.out.println(Thread.currentThread().getName()+"ürün eklemek istiyor");
        System.out.println("Yeni ürün/ler eklendi ,stok güncelleniyor");
        stock=stock+amount;
        System.out.println("Güncel stock: "+stock);
        notify();
        System.out.println();

    }
}
