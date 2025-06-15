package Interfaces.V1;

public class FastRecharge {

    void recharge(BankAPI bankAPI, int amount){
        if(amount <= bankAPI.checkBalance()){
            System.out.println("RECHARGE SUCCESSFUL");
        }else{
            System.out.println("RECHARGE FAILED");
        }
    }
}
