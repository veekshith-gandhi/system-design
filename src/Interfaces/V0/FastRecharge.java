package Interfaces.V0;

public class FastRecharge {

    void recharge(YesBankAPI yesBankAPI, int amount){
        if(amount <= yesBankAPI.getBalance()){
            System.out.println("RECHARGE SUCCESSFUL");
        }else{
            System.out.println("RECHARGE FAILED");
        }
    }
}
