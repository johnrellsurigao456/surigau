
package Banking;


public class Bankingclass {
    int accountNo = 10001;
    String name;
    float initialBalance = 0;
    int pin = 1234;
    
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
}
