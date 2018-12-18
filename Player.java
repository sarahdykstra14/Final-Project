package finalproject;

import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Ball> balls;
    boolean striped;
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public ArrayList<Ball> getBalls(){
        return balls;
    }
    
    public void setBalls(ArrayList<Ball> b){
        balls = b;
    }
    
    public boolean isStriped(){
        return striped;
    }
    
    public void setStriped(boolean s){
        striped = s;
    }
    
    public int getNumBalls(){
        return balls.size();
    }
    
    
    
}
