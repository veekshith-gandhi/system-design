package Interfaces.V0;

public class YesBankAPI {

    private int balance = 100;
    public int getBalance(){
        System.out.println("GETTING BALANCE FROM YES BANK");
        return this.balance;
    }

    public int setBalance(int amount){
        this.balance = this.balance + amount;
        return this.balance;
    }
}
