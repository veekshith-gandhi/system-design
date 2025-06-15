package Interfaces.V1;

public class AvailLoan {

    boolean checkEligibility(BankAPI bankAPI, int amount){
        return bankAPI.checkBalance() >= .2 * amount;
    }
}
