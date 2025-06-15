package Interfaces.V1;

public class YesBankAPI implements BankAPI{

    private int balance = 100;
    public int checkBalance(){
        System.out.println("GETTING BALANCE FROM YES BANK");
        return this.balance;
    }

    public int setBalance(int amount){
        this.balance = this.balance + amount;
        return this.balance;
    }
}
