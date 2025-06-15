package Interfaces.V0;

public class Client {
    public static void main(String[] args) {
        YesBankAPI yesBankAPI = new YesBankAPI();
        System.out.println("BALANCE ------ "+ yesBankAPI.getBalance());
//        yesBankAPI.setBalance(249);
        System.out.println("ADD TO BALANCE ----- "+ yesBankAPI.setBalance(249));
        PhonePay phonePay = new PhonePay();
        phonePay.rechargeFastTag(yesBankAPI.getBalance());
    }
}
