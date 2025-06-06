package ImportantFunctions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
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
    public void updateBalance(JSONObject element, double newBalance){
        
        element.remove("balance");
        element.put("balance", newBalance);
        System.out.println("Updating Balance\n New Balance:" + (double)element.get("balance"));
        
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
        File accountsFile = getAccountsFile();
        System.out.println("Loading accounts from: " + accountsFile.getAbsolutePath());
        
        Object obj = new JSONParser().parse(new FileReader(accountsFile));
        JSONObject jo = (JSONObject) obj;
        JSONArray ja = (JSONArray) jo.get("users");
        info = binarySearch(jo, ja, "CARD_NO", enteredCardNo, enteredPIN);


        return info;
    }
    
    public void updateJSON(JSONArray arr, JSONObject jo){
        try {
            File accountsFile = getAccountsFile();
            File backup = new File(accountsFile.getParent(), "Accounts_Information.bak");
            if (accountsFile.exists()) {
                Files.copy(accountsFile.toPath(), backup.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            FileWriter writer = new FileWriter(accountsFile);
            jo.remove("users");
            jo.put("users", arr);
            writer.write(jo.toJSONString());
            writer.flush();
            writer.close();
            System.out.println("JSON file updated at: " + accountsFile.getAbsolutePath());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Error saving account information:\n" + e.getMessage(), 
                "File Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    public File getAccountsFile() throws IOException {
        String appData = System.getenv("APPDATA");
        File appDir = new File(appData, "YourAppName");
        File externalFile = new File(appDir, "Accounts_Information.json");
        

        if (externalFile.exists()) {
            return externalFile;
        }

        File devFile1 = new File("user_data\\Accounts_Information.json"); // Project root
        File devFile2 = new File("src\\user_data\\Accounts_Information.json"); // Source folder
        
        if (devFile1.exists()) return devFile1;
        if (devFile2.exists()) return devFile2;
        
        appDir.mkdirs();
        try (InputStream in = getClass().getResourceAsStream("/user_data/Accounts_Information.json");
            OutputStream out = new FileOutputStream(externalFile)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }
        return externalFile;
    }
    

    public userInfo binarySearch(JSONObject jo, JSONArray arr, String target, String key, String enteredPIN){
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
                    if(isGettingBalance == true){
                        updateBalance(element, newBalance);
                        updateJSON(arr, jo);
                            
                    }
                    String pin = (String)element.get("PIN_CODE");
                    boolean pinMatch = pin.equals(enteredPIN);

                    if(pinMatch){
                        
                        

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




