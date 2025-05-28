

public class Deposit {

    private JSON_UserInfo userInfoHandler;
    private String cardNo;
    private String pinCode;
    private double currentBalance;

    public Deposit(JSON_UserInfo userInfoHandler, String cardNo, String pinCode, double currentBalance) {
        this.userInfoHandler = userInfoHandler;
        this.cardNo = cardNo;
        this.pinCode = pinCode;
        this.currentBalance = currentBalance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.print("Invalid Ammount");
            return currentBalance;
        }

        currentBalance += amount;

        userInfoHandler.setEnteredCardNo(cardNo);
        userInfoHandler.setEnteredPIN(pinCode);
        userInfoHandler.setIsGettingBalance(true, currentBalance);
        userInfoHandler.getUserInfo();

        System.out.println("Deposit successful. New balance: " + currentBalance);
        return currentBalance;
    }
}
