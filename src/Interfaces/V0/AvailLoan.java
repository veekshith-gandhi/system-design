package Interfaces.V0;

public class AvailLoan {

    boolean checkEligibility(YesBankAPI yesBankAPI, int amount){
        return yesBankAPI.getBalance() >= .2 * amount;
    }
}
