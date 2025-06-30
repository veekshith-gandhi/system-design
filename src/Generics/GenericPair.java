package Generics;

public class GenericPair <T, V> {
    T first;
    V second;
    GenericPair(T first, V second){
        this.first = first;
        this.second = second;
    }

    public <E> E doSomething(E value){
        return value;
    }

    public void setSecond(V value){
       this.second = value;
    }

    /**
     *   Bounded types in generic
     *   Since .intValue() discards decimals, this method may lose precision if you pass Double or Float.
     *   <E extends Number>? : o restrict the input to only numeric types.
     * But you are saying: “Only those E types that extend Number are allowed.”
     * So E can be: Integer Double Float Long
     * Any class that extends java.lang.Number
     */


    public <E extends Number> Integer add(E x, E y){
        return (x.intValue() + y.intValue());
    }
}


