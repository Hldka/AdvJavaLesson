package Generics.InterfaceType;
//Eger bir "generic interface" implement ederseniz ,Class da generic olmali
public class GenericClassImp<T> implements GenericInterface<T>{
    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
