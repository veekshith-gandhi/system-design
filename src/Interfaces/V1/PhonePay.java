package Interfaces.V1;

public class PhonePay {
    private BankAPI bankAPI;
    private FastRecharge fastagRecharge;
    private AvailLoan availLoan;

    PhonePay(){
        bankAPI = new ICICIBankAPI();
        fastagRecharge = new FastRecharge();
        availLoan = new AvailLoan();
    }

    void rechargeFastTag(int amount){
        fastagRecharge.recharge(bankAPI,amount);
    }

    boolean availLoan(int amount){
        return availLoan.checkEligibility(bankAPI,amount);
    }
}
