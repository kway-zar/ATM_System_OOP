
import java.io.FileReader;
import java.io.ObjectStreamConstants;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

class JSON_UserInfo {

    
    private String enteredCardNo ="";
    private String enteredPIN = "";
    private double newBalance = 0;
    int tArraySize = 0;
    
    private boolean isGettingBalance = false;
    
    public void setEnteredCardNo(String enteredCardNo) {
        this.enteredCardNo = enteredCardNo;
    }

    public void setEnteredPIN(String enteredPIN) {
        this.enteredPIN = enteredPIN;
    }
    public void updateBalance(JSONObject element){
        
        element.remove("balance");
        element.put("balance", newBalance);
        
        setIsGettingBalance(false, 0); 
    }
    
    public void setIsGettingBalance(boolean isGettingBalance, double newBalance) {
        this.isGettingBalance = isGettingBalance;
        this.newBalance = newBalance;
    }
    public userInfo getUserInfo(){
        userInfo info = new userInfo();
        try{
            info = returnInfo();
            
        } catch(Exception e){
            e.printStackTrace();
        }
        return info;
    }
    
    private userInfo returnInfo() throws Exception{
        userInfo info = new userInfo();
        
        Object obj = new JSONParser().parse(new FileReader("src/user_data/Accounts_Information.json"));
        JSONObject jo = (JSONObject) obj;
        
        JSONArray ja = (JSONArray) jo.get("users");

        info = binarySearch(ja, "CARD_NO", enteredCardNo, enteredPIN);
 
   

        return info;
    }
    

    public userInfo binarySearch(JSONArray arr, String target, String key, String enteredPIN){
        userInfo info = new userInfo();
        int low = 0;
        int high = arr.size() - 1;
        
        try {
            while(low <= high){
                int mid = low + (high - low)/ 2;

                JSONObject element = (JSONObject)arr.get(mid);
                String value = (String) element.get(target);

                int compareResult = value.compareTo(key);

                if(compareResult == 0){


                    String pin = (String)element.get("PIN_CODE");
                    boolean pinMatch = pin.equals(enteredPIN);

                    if(pin.equals(enteredPIN)){
                        
                        if(isGettingBalance){
                            
                            updateBalance(element);
                            break;
                        }
                        
                        
                        else{
                            JSONArray t = (JSONArray) element.get("Transaction");
                            tArraySize = t.size();
                            userTransactions[] transactions = new userTransactions[tArraySize];
                            int i = 0;
                            for(Object tObject: t){
                                JSONArray tr = (JSONArray)tObject;
                                transactions[i] = new userTransactions();
                                transactions[i].date = (String)tr.get(0);
                                transactions[i].time = (String)tr.get(1);
                                transactions[i].money = ((Long) tr.get(2)).doubleValue();
                                i++;

                            }

                            info.CARD_NO = (String) element.get(target);
                            info.PIN_CODE =(String) element.get("PIN_CODE");
                            info.accountBalance = (double) element.get("balance");
                            info.name = (String) element.get("name");
                            info.transactions = transactions;
                        
                        return info;
                        }
                    } else {
                        throw new customException("PIN doesn't match");
                    }
                    


                } else if(compareResult > 0){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
            throw new customException("Invalid Credentials");
        }catch (customException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return info;
    }
    public int arrSize(){
        return tArraySize;
     
    }

}


class userInfo{
    String name, CARD_NO, PIN_CODE;
    double accountBalance;
    userTransactions[] transactions;
}
class userTransactions{
    String date, time;
    double money;
}
