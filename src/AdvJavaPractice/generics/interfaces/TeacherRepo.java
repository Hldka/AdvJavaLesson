package AdvJavaPractice.generics.interfaces;

public class TeacherRepo implements Repository<Teacher>{
    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher.getName()+"basariyla kaydedildi.");
    }

    @Override
    public void get(Teacher teacher) {
        System.out.println(teacher.getName()+"basariyla bulundu.");
    }

    @Override
    public void update(Teacher teacher) {
        System.out.println(teacher.getName()+"basariyla güncellendi:"+teacher.getName()+"Update");
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println(teacher.getName()+"basariyla silindi.");
    }
}
