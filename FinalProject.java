

package finalproject;
import java.util.ArrayList;
public class FinalProject {
    static ArrayList<Ball> balls = new ArrayList();
    public static void draw() {
        for(Ball n: balls) {
            
        }
    }
    public double calcDist(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static boolean ballMoving() {
        for(Ball b: balls) {
            if(b.isMoving()) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        while (ballMoving()) {
            draw();
        }
    }
    
}
