package ImportantFunctions;


import ImportantFunctions.*;
import javax.swing.JOptionPane;

public class DepositLogic {



    public void deposit(double amount, userInfo info) {
        
        
        double newBalance = info.getAccountBalance() + amount;
        System.out.println(newBalance + "CARD_NO: " + info.getCARD_NO() + " PIN CODE:" + info.getPIN_CODE());
        ATM_System atm = new ATM_System();
        atm.setUserInfo(info.getCARD_NO(), info.getPIN_CODE(), true, newBalance);
        
        
    }
}
