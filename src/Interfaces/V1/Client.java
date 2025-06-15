package Interfaces.V1;

public class Client {
    public static void main(String[] args) {
        YesBankAPI yesBankAPI = new YesBankAPI();
        System.out.println("BALANCE ------ "+ yesBankAPI.checkBalance());
//        yesBankAPI.setBalance(249);
        System.out.println("ADD TO BALANCE ----- "+ yesBankAPI.setBalance(249));
        PhonePay phonePay = new PhonePay();
        phonePay.rechargeFastTag(yesBankAPI.setBalance(223));
    }
}
