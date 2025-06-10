package ImportantFunctions;


/**TODO:
 * 
    *Balance: Jonitan*
    *Withdraw: Jeriana*
    *Deposit: Francis*
    *Transfer: Guil*
    
 **CREATE A CLASS THAT DOES THOSE FUNCTIONS(some methods can have parameters)**
 
 
 */



public class ATM_System {


    public boolean isCardFound() {
        return cardFound;
    }


    public double getAccountBalance() {
        return accountBalance;
    }


    public String getCARD_NO() {
        return CARD_NO;
    }

    public String getPIN_CODE() {
        return PIN_CODE;
    }
    
    
    public userInfo setUserInfo(String enteredCardNo, String enteredPIN, boolean updateBalance, double newAmount){
        
        JSON_UserInfo userInfo = new JSON_UserInfo();
        this.info = new userInfo();
        try{
            
            userInfo.setEnteredCardNo(enteredCardNo);
            userInfo.setEnteredPIN(enteredPIN);

            if(updateBalance == true){
                userInfo.setIsGettingBalance(true, newAmount);//set the new balance
                
            }                                      
            
            info = userInfo.getUserInfo();
            if(userInfo.getCardFound()){              
                this.cardFound = userInfo.getCardFound();
  
            }

            return info;
    
            
        } catch(Exception e){
            e.printStackTrace();
        }
        return getInfo();
    }
    
    
    private userInfo info;
    private String CARD_NO;
    private String PIN_CODE;
    private String name;
    private double accountBalance;
    private boolean cardFound;

    public userInfo getInfo() {
        return info;
    }
    
//    public static void main(String[] args){
//        //demonstration to check the account
////        ATM_System atm = new ATM_System();
////        atm.setUserInfo("2", null);
//        
//   }
    
}

