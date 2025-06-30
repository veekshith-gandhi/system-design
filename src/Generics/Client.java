package Generics;

public class Client {
    public static void main(String[] args) {
        GenericPair<Integer , String> genericPair = new GenericPair<>(123,"veekshtih");
        String str = genericPair.doSomething("Hello");
        genericPair.setSecond("Meow");

        //Type erasure : Runt time everything will become object to support backward compatibility
        //at run time generic types are not there

    }

}
