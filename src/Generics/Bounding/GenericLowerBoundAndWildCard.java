package Generics.Bounding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericLowerBoundAndWildCard {
    public static void main(String[] args) {
        List<Object> ol=new ArrayList<>();
        addElements(ol);
        List<Number> nl=new ArrayList<>();
        addElements(nl);

       // List<Double> db=new ArrayList<>();
        //addElements(db);//CTE ,Generic öncesi yapilarda RunTe olurdu
      //*******************printElements*************************
        //List<String>st=new ArrayList<>();
        //printelements(st);
        printelements(new ArrayList<String>());
        //*******************printObj*************************
        List<String> strList=new ArrayList<>();
        //printObj(strList);//CTE

       List<Object> objectList=new ArrayList<>();
       printObj(objectList);



    }

    //super Integer --> bana Integer'in parent'larini getir
    public static void addElements(List<? super Integer> list){
        //? : wildcard
        for (int i=1;i>=10;i++){
            list.add(i);

        }


    }//wildcard dezavantajlari
    public static void printelements(List<?>listofUnKnown){

        //listofUnKnown.add("Java");-->? dan dolayi Datatürü netlesmeden
                // add methodu gibi islemleri yaptirmaz
        listofUnKnown.add(null);// illa eklenecekse null eklenebilir
        for (Object object:listofUnKnown
             ) {
            System.out.println(object);

        }

    }
    //?-->object
    public static void printObj(List<Object> listOfObject){
        listOfObject.add("Java");
        for (Object object:listOfObject ) {
            System.out.println(object);

        }
    }


}
