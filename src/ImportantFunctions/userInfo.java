/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImportantFunctions;

/**
 *
 * @author quasar
 */
public class userInfo{

    /**
     * @param CARD_NO the CARD_NO to set
     */
    public void setCARD_NO(String CARD_NO) {
        this.CARD_NO = CARD_NO;
    }

    /**
     * @param PIN_CODE the PIN_CODE to set
     */
    public void setPIN_CODE(String PIN_CODE) {
        this.PIN_CODE = PIN_CODE;
    }

    /**
     * @param cardFound the cardFound to set
     */
    public void setCardFound(boolean cardFound) {
        this.cardFound = cardFound;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(userTransactions[] transactions) {
        this.transactions = transactions;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the CARD_NO
     */
    public String getCARD_NO() {
        return CARD_NO;
    }

    /**
     * @return the PIN_CODE
     */
    public String getPIN_CODE() {
        return PIN_CODE;
    }

    /**
     * @return the cardFound
     */
    public boolean isCardFound() {
        return cardFound;
    }

    /**
     * @return the accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @return the transactions
     */
    public userTransactions[] getTransactions() {
        return transactions;
    }
    private String name;
    private String CARD_NO;
    private String PIN_CODE;
    private boolean cardFound;
    private double accountBalance;
    private userTransactions[] transactions;
}
