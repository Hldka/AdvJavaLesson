package serialization;

import java.io.*;

public class Serialization_Deserialization {
    public static void main(String[] args) {
//writeObject();
        readObjects();

    }
    //writeObject()
    //Serialization
    private static void writeObject(){
        System.out.println("User class objects are created");
        User user1= new User(1L, "Yunus", "456789456");
        User user2= new User(1L, "Yusuf", "456789454");
        User user3= new User(1L, "Bety", "456789455");
        try (FileOutputStream fos= new FileOutputStream("user.dat")){ //to type file bu dosya yazmak icin
            try (ObjectOutputStream oos= new ObjectOutputStream(fos)){ //to type object bu objeleri yazmak icin

                oos.writeObject(user1);
                oos.writeObject(user2);
                oos.writeObject(user3);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
    //readObjest
    //Deserialization
    private static void readObjects(){
        //Java da file islemlerinde okuma islemi yaparken FileInputStream class kullanirlar
        try (FileInputStream fis=new FileInputStream("user.dat")){//okunacak dosyayi belirledik
            try (ObjectInputStream ois=new ObjectInputStream(fis)){//Obje olarak okunacak
                User user1=(User) ois.readObject();
                User user2=(User) ois.readObject();
                User user3=(User) ois.readObject();
                System.out.println(user1);
                System.out.println(user2);
                System.out.println(user3);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//User clasini transfer edilebilsin diye isaretledik
class User implements Serializable{
    private Long id;

    private String name;
    private  String tcKimlikNo;
    //toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                '}';
    }


    //const.
    public User(Long id, String name, String tcKimlikNo) {
        this.id = id;
        this.name = name;
        this.tcKimlikNo = tcKimlikNo;
    }
// getter setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }



}