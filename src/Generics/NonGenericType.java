package Generics;

public class NonGenericType {
    //getter setter
    private Object o;

    public Object getO() {
        return o;
    }


    public void setO(Object o) {
        this.o = o;
    }

//main method
    public static void main(String[] args) {
        NonGenericType obj1=new NonGenericType();
        NonGenericType obj2=new NonGenericType();


        obj1.setO("Mirac");// string ile set edildi
        obj2.setO(65);//integer ile set edildi
        String str1=(String) obj1.getO();//Cast problemi
        System.out.println(str1);

        String str2=(String) obj2.getO();//RunTE ,,CTE
        //String.valueof(obj.get());
        //Integer.parseInt(String);
        System.out.println(str2);



    }


}
