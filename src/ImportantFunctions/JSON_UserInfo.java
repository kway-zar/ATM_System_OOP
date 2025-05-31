package ImportantFunctions;


import java.io.FileReader;
import javax.swing.JOptionPane;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

class JSON_UserInfo {

    
    private String enteredCardNo ="";
    private String enteredPIN = "";
    private double newBalance = 0;
    private boolean cardFound;
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
                    this.cardFound = true;
                    if(enteredPIN == null){
                        info.setCardFound(true);
                        return info;
                    }
                    String pin = (String)element.get("PIN_CODE");
                    boolean pinMatch = pin.equals(enteredPIN);

                    if(pinMatch){
                        
                        if(isGettingBalance){
                            
                            updateBalance(element);
                            
                        }

                        JSONArray t = (JSONArray) element.get("Transaction");
                        tArraySize = t.size();
                        userTransactions[] transactions = new userTransactions[tArraySize];
                        int i = 0;
                        for (Object tObject : t) {
                            JSONArray tr = (JSONArray) tObject;
                            transactions[i] = new userTransactions();
                            transactions[i].setDate((String) tr.get(0));
                            transactions[i].setTime((String) tr.get(1));
                            transactions[i].setMoney((String) tr.get(2));
                            i++;

                        }

                        info.setCARD_NO((String) element.get(target));
                        info.setPIN_CODE((String) element.get("PIN_CODE"));
                        info.setAccountBalance((double) element.get("balance"));
                        info.setName((String) element.get("name"));
                        info.setTransactions(transactions);
                        info.setCardFound(true);
                        JOptionPane.showMessageDialog(null, "Loggin in", "Credentials Matched",JOptionPane.INFORMATION_MESSAGE);
                        return info;
                        
                    }
                    
                    else {
                        throw new customException("PIN doesn't match");
                    }
                    


                } else if(compareResult > 0){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
            JOptionPane.showMessageDialog(null, "INVALID CREDENTIALS", "CARD DOESN'T EXIST",JOptionPane.INFORMATION_MESSAGE);
            throw new customException("Invalid Credentials");
        }catch (customException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return info;
    }
    public int arrSize(){
        return tArraySize;
     
    }
    public boolean getCardFound(){
        return cardFound;
    }

}



