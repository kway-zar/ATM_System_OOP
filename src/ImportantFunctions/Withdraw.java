package ImportantFunctions;

import PagePanels.Reciept;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rowaine
 */
public class Withdraw extends balanceTransactions {
       @Override
       public void withdraw(double amount, userInfo info) {
          double newBalance = info.getAccountBalance() - amount;
          System.out.println(newBalance + "CARD_NO: " + info.getCARD_NO() +" PIN CODE:" +info.getPIN_CODE());
          ATM_System atm = new ATM_System();
          atm.setUserInfo(info.getCARD_NO(), info.getPIN_CODE(), true, newBalance);
          
          
       }
       
}
