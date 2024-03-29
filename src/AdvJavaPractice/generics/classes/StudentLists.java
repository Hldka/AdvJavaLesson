package AdvJavaPractice.generics.classes;/*
/*
==Generic Types==
-Java 5 ile geldi
-Farklı data tipleri ile aynı yapıyı kullanabilme
-Tip güvenliği sağlar, castinge gerek olmaz
-CTE verir.
-Generics primitive data tipi ile çalışmaz.

Task: 1) Java dersi için, öğrencileri isim, vize notu ve final notunu  ile birlikte listeleyen bir program yazınız.
      2) Kütüphane için, öğrencileri isim, okul no ve mail adresi ile birlikte listeleyen bir program yazınız.
*/

public class StudentLists {public static void main(String[] args) {

    System.out.println("** Java dersi vize ve final notları **");
    ListGrade();
    System.out.println(" == Kütüphane Üye Listesi == ");
listmemberLibrary();

}


    //öğrencilerin notlarını listeleyen bir method yazınız.
    public static void ListGrade(){
    Student<String,Double,Double> std1=new Student<>("Wilma",76.80,80.0);
    Student<String,Double,Double> std2=new Student<>("Fred",89.90,90.9);
    Student<String,Double,Double> std3=new Student<>("Barnie",56.80,70.0);
        System.out.printf("%-10s || %4s || %4s  %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s || %4s || %4s  %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s || %4s || %4s  %n",std3.getS(),std3.getU(),std3.getV());
    }


    //kütüphane üye öğrenci listesini yazdıran bir method yazınız.
    public static void listmemberLibrary(){
    Student<String,Integer,String> std1=new Student<>("Cakil",567,"cakil@gmail.com");
    Student<String,Integer,String> std2=new Student<>("Bambam",568,"bmbm@gmail.com");
    Student<String,Integer,String> std3=new Student<>("Cakil",569,"betty@gmail.com");
        System.out.printf("%-10s || %4d || %4s  %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s || %4d || %4s  %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s || %4d || %4s  %n",std3.getS(),std3.getU(),std3.getV());
    }
}
