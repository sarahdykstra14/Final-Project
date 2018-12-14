
package finalproject;
import java.awt.Color;
public class Ball {
    Color ballColour;
    boolean striped;
    boolean onTable;
    double xSpeed;
    double ySpeed;
    int xDir;
    int yDir;
    double xPos;
    double yPos;
    public Ball() {
        ballColour = Color.black;
        striped = false;
        onTable = true;
        xSpeed = 0;
        ySpeed = 0;
        xDir = 1;
        yDir = 1;
        xPos = 0;
        yPos = 0;
    }
    public Ball(Color c, boolean s, boolean o) {
        this();
        ballColour = c;
        striped = s;
        onTable = o;
    } 
    public Ball(Color c, boolean s, boolean o, double xS, double yS, int xD, int yD, double xP, double yP) {
        this(c, s, o);
        xSpeed = xS;
        ySpeed = yS;
        xDir = xD;
        yDir = yD;
        xPos = xP;
        yPos = yP;
    }
    public Color getColour() {
        return ballColour;
    }
    public void setColour(Color c) {
        ballColour = c;
    }
    public boolean isStriped() {
        return striped;
    }
    public void setStriped(boolean s) {
        striped = s;
    } 
    public boolean onTable() {
        return onTable;
    }
    public void setOnTable(boolean o) {
        onTable = o;
    }
    public double getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(double x) {
        xSpeed = x;
    }
    public void slowX(double subtract) {
        xSpeed -= subtract;
    }
    public double getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(double y) {
        ySpeed = y;
    }
    public void slowY(double subtract) {
        ySpeed -= subtract;
    }
    public int getXDir() {
        return xDir;
    }
    public void setXDir(int x) {
        xDir = x;
    }
    public void switchXDir() {
        xDir *= -1;
    }
    public int getYDir() {
        return yDir;
    }
    public void setYDir(int y) {
        yDir = y;
    }
    public void switchYDir() {
        yDir *= -1;
    }
    public double getXPos() {
        return xPos;
    }
    public void setXPos(double x) {
        xPos = x;
    }
    public double getYPos() {
        return yPos;
    }
    public void setYPos(double y) {
        yPos = y;
    }
    public String toString() {
        return "Colour: " + ballColour + "\nStriped? " + striped + "\nOn table? " + onTable + "\nX velocity: " + (xDir * xSpeed) + "\nY Velocity: " + (yDir * ySpeed) + "\nPosition: (" + xPos + "," + yPos + ")";
    }
}
