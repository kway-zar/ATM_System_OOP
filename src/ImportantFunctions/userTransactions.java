/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImportantFunctions;

/**
 *
 * @author quasar
 */
public class userTransactions{

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(String money) {
        this.money = money;
    }
    private String date;
    private String time;
    private String money;

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @return the money
     */
    public String getMoney() {
        return money;
    }
        
}

