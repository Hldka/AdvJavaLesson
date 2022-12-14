package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType <T>{
   // Generic: Data türünden bağımsız yapılar oluşturmamızı sağlar
    private T type;//field,variable

    public T getType(int i) {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static void main(String[] args) {
        //generic yapi kullanilarak ayni classdan 2 farkli data türünde obje olusturalim
        GenericType<String> obj1=new GenericType<>();
        //Trick : Diamond icine non-primitive type kullanabiliriz
        obj1.setType("Generic Types");
      //  GenericType<String> obj2=new GenericType<>();// string girmem gerekirken int girdim compiletime eror verir
       // obj2.setType(65);
GenericType<Integer> obj3=new GenericType<>();
obj3.setType(65);
int a=obj3.getType(65);//!!CAST probleminden kurtulduk
        //Not:ClassCastException probleminden nasil kurtulurum?
        List<String>list=new ArrayList<>();
        list.add("Alper");
        list.add("Halide");
       // list.add(22);// !!! ClassCastException dan kurtulduk
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Generic");//  map.put("gen",1); CTE error verir.


    }

    /*
    * E--> Element,collection gibi yapilarda kullanilir
    * K -->Key
    * V-->Value
    * N-->Number
    * T--> Type
    * S,U,V vb--> 2.,3. ve 4. tipler icin
    *
    * */


}
