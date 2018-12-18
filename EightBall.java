
package finalproject;

public class EightBall extends Ball{
    boolean noBalls;
    
    public boolean getNoBalls(){
        return noBalls;
    }
    
    public void setNoBalls(boolean nb){
        noBalls = nb;
    }
    
    public String winLoseMethod(){
        if (!noBalls){
            return "You lost!";
        }else{
            return "You won!";
        }
        
    }
    
}
