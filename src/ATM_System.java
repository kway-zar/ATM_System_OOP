
/**TODO:
 * 
    *Balance: Jonitan*
    *Withdraw: Jeriana*
    *Deposit: Francis*
    *Transfer: Guil*
    
 **CREATE A CLASS THAT DOES THOSE FUNCTIONS(some methods can have parameters)**
 
 
 */



class ATM_System {

    public double getAccountBalance() {
        return accountBalance;
    }


    public String getCARD_NO() {
        return CARD_NO;
    }

    public String getPIN_CODE() {
        return PIN_CODE;
    }

    public void setUserInfo(String enteredCardNo, String enteredPIN){
        JSON_UserInfo userInfo = new JSON_UserInfo();
        userInfo info = new userInfo();
        try{
            
            userInfo.setEnteredCardNo(enteredCardNo);
            userInfo.setEnteredPIN(enteredPIN);
            userInfo.setIsGettingBalance(true, 100);//set sthe new balance
                                                       
            
            info = userInfo.getUserInfo();
            this.CARD_NO = info.CARD_NO;
            this.PIN_CODE = info.PIN_CODE;
            this.name = info.name;
            this.accountBalance = info.accountBalance;
            
            System.out.println(info.accountBalance);
                    
//            for(int i = 0; i < userInfo.arrSize();i++){
//                System.out.println(info.transactions[i].date);
//                System.out.println(info.transactions[i].time);
//                System.out.println(info.transactions[i].money);
//            }
//             
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    private String CARD_NO;
    private String PIN_CODE;
    private String name;
    private double accountBalance;
    
    public static void main(String[] args){
        //demonstration to check the account
        ATM_System atm = new ATM_System();
        atm.setUserInfo("2", "3");
        
   }
    
}

