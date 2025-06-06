public class DepositLogic {

    private JSON_UserInfo userInfoHandler;
    private String cardNo;
    private String pinCode;
    private double currentBalance;

    public DepositLogic(JSON_UserInfo userInfoHandler, String cardNo, String pinCode, double currentBalance) {
        this.userInfoHandler = userInfoHandler;
        this.cardNo = cardNo;
        this.pinCode = pinCode;
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        currentBalance += amount;

        userInfoHandler.setEnteredCardNo(cardNo);
        userInfoHandler.setEnteredPIN(pinCode);
        userInfoHandler.setIsGettingBalance(true, currentBalance);
        userInfoHandler.getUserInfo();

        return true;
    }
}
