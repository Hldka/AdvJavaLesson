package AdvJavaPractice.generics.methods;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {

        String[] stdList={"Rafael","Donatello","Leonardo","Michelangelo"};
        Double[] pointList={95.5,70.0,65.6,58.0};
        Character[] gradeList={'A','B','C','B'};

        //1-tüm listeleri yazdır

printArray(stdList);
        System.out.println("***********");
printArray(pointList);
        System.out.println("***********");
printArray(gradeList);
        System.out.println("***********");

        //2-öğrencileri isimlerine göre sıralayınız

        System.out.println(Arrays.toString(ordrArr(stdList)));
        System.out.println("**************");
        //3-öğrenci notlarını sıralayınız
        System.out.println(Arrays.toString(ordrArr(pointList)));
        System.out.println("***************");

        //4-öğrenci harf notlarını sıralayınız
        System.out.println(Arrays.toString(ordrArr(gradeList)));
        System.out.println("******************");
    }
    //-diziyi yazdıran bir method yazınız.

public static <T> void printArray(T[]array){
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    System.out.println();
}

    //-diziyi artan sıralayan bir method yazınız.
    public static <T extends Comparable> T[] ordrArr(T[] array){
        for (int i=0;i<array.length;i++){
            for (int j=0; j< array.length;j++){
                if (array[i].compareTo(array[j])>0){
                    T temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.print(" ");
        }
        return array;
    }

}
