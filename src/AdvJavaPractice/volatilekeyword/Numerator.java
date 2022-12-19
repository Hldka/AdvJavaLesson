package AdvJavaPractice.volatilekeyword;

public class Numerator {
    private static int counter=0;
    /*
    * volatile keywordu degiskenin main memoryde saklanmasini garanti eder ancak
    * tüm threadlerin degiskenne ayni anda ulasmasindan kaynakli calismayi cözme garantisi yoktur
    * bunun icin synchronized keyword'ü de kullanilmalidir*/
    public void getOrder(){
        String name=Thread.currentThread().getName();
        try {
            Thread.sleep(2000);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
      synchronized (this){ counter++;
        System.out.println("Sayın "+name+" sıranız: "+counter);}
    }

}
