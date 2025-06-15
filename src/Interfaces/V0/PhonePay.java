package Interfaces.V0;

public class PhonePay {
    private YesBankAPI yesBankAPI;
    private FastRecharge fastagRecharge;
    private AvailLoan availLoan;

    PhonePay(){
        yesBankAPI = new YesBankAPI();
        fastagRecharge = new FastRecharge();
        availLoan = new AvailLoan();
    }

    void rechargeFastTag(int amount){
        fastagRecharge.recharge(yesBankAPI,amount);
    }

    boolean availLoan(int amount){
        return availLoan.checkEligibility(yesBankAPI,amount);
    }
}
