package Constructor;

public class CheckConstructor {
    int a;
    int b;
    String c;

    CheckConstructor(int a, int b){
        this.a = a;
        this.b= b;
        System.out.println("Name: " + a + ", Age: " + b);
    }
    CheckConstructor(int a, String c){
        this.a = a;
        this.c = c;
        System.out.println("Name: " + a + ", Age: " + c);
    }
}
