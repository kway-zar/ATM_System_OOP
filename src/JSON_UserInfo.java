
import java.io.FileReader;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

class JSON_UserInfo {

    
    private String enteredCardNo ="";
    private String enteredPIN = "";
    
    public void setEnteredCardNo(String enteredCardNo) {
        this.enteredCardNo = enteredCardNo;
    }

    public void setEnteredPIN(String enteredPIN) {
        this.enteredPIN = enteredPIN;
    }
    
    private userInfo returnInfo() throws Exception{
        userInfo info = new userInfo();
        
        Object obj = new JSONParser().parse(new FileReader("src/user_data/Accounts_Information.json"));
        JSONObject jo = (JSONObject) obj;
        
        JSONArray ja = (JSONArray) jo.get("users");

        
        for(int i = 0; i < ja.size(); i++){
            
            
            JSONObject details = (JSONObject) ja.get(i);
            
            String cardNo = (String) details.get("CARD_NO");
            String pinCode = (String) details.get("PIN_CODE");

            if (enteredCardNo.equals(cardNo) && enteredPIN.equals(pinCode)) {
                info.CARD_NO = cardNo;
                info.PIN_CODE = pinCode;
                info.accountBalance = (double) details.get("balance");
                info.name = (String) details.get("name");
                break;
            }
        }
        



        return info;
        
    }
    
//    public static void main(String[] args){
//    
//        JSON_UserInfo json = new JSON_UserInfo();
//        
//        try{
//            
//            json.setEnteredCardNo("2");
//            json.setEnteredPIN("3");
//            userInfo parsedInfo = json.returnInfo();
//            
//            System.out.println(parsedInfo.accountBalance);
//            
//            
//            
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//    }
    
    
}


class userInfo{
    String name, CARD_NO, PIN_CODE;
    double accountBalance;
    
}
