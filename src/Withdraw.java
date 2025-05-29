/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rowaine
 */
class Withdraw extends balanceTransactions {
       @Override
       void withdraw(double amount, userInfo info, JSON_UserInfo userInfo) {
          double newBalance = info.accountBalance - amount;
          
          userInfo.setIsGettingBalance(true, newBalance);//set the new balance 
       }
}
