/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImportantFunctions;

/**
 *
 * @author JA Landoy
 */
public class balance {            
        public void displayBalance(userInfo info){
            System.out.println("User Name: " + info.getName()); 
            System.out.println("User Name: " + info.getCARD_NO()); 
            System.out.println("User Name: " + info.getPIN_CODE()); 
            System.out.println("User Name: " + info.getAccountBalance()); 
            
            for (userTransactions transaction : info.getTransactions()) {
                System.out.println("Transaction Date: " + transaction.date);
                System.out.println("Transaction Time: " + transaction.time);
                System.out.println("Transaction Amount: " + transaction.money);
                System.out.println("-----------------------------");
            }
        }
}