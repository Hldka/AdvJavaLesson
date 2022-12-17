package AdvJavaPractice.multithreads.creation;

public class Counter implements Runnable{
    public Counter(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public void run() {
        System.out.println(this.name+" basladi ");
        for (char i='a';i<'z';i++){
            System.out.println(this.name+" - "+i);

        } System.out.println(this.name+" bitti ");
    }
}
