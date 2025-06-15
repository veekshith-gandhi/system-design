package Interfaces.V1;

public class ICICIBankAPI implements BankAPI{

    private int balance = 0;

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int setBalance(int amount) {
        return this.balance += amount;
    }
}
