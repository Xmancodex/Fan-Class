import java.awt.Color;
import java.util.Scanner;
class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private Color color;
    // Getters and Setters
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int s) {
        speed = s;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on1) {
        on = on1;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color c) {
        color = c;
    }
    // Convert c to readable string
    private String colorToString(Color c) {
        if (c == null) return "No Color";
        if (c.equals(Color.BLUE)) return "Blue";
        if (c.equals(Color.RED)) return "Red";
        if (c.equals(Color.GREEN)) return "Green";
        if (c.equals(Color.BLACK)) return "Black";
        if (c.equals(Color.YELLOW)) return "Yellow";
        return "Custom Color";
    }
    // Default Constructor
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = Color.BLUE;
    }
    // Constructor with speed and radius
    public Fan(int s, double r) {
        speed = s;
        radius = r;
        color = Color.BLUE;
        on = false;
    }
    // Constructor with speed, radius, and color
    public Fan(int s, double r, Color c) {
        speed = s;
        radius = r;
        color = c;
        on = false;
    }
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON | Speed: " + speed + " | Color: " + colorToString(color) + " | Radius: " + radius;
        } else {
            return "Fan is OFF | Color: " + colorToString(color) + " | Radius: " + radius;
        }
    }
}
//IP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FanDriver {
    public static void main(String[] args) {
        Fan f1 = new Fan(0,0);
        Fan f2 = new Fan(0,0);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed for Fan 1: ");
        f1.setSpeed(input.nextInt());
        int blank = f1.getSpeed();
        if (blank > 1) {
            f1.setOn(true);
        }
        else {
            f1.setOn(false);
        }
        System.out.print("Enter color for Fan 1: ");
        String colorName1 = input.next().toLowerCase();
        f1.setColor(Color.getColor(colorName1));
        System.out.print("Enter Radius for Fan 1: ");
        f2.setRadius(input.nextDouble());
        if (colorName1.equals("red")) {
            f1.setColor(Color.RED);
        }
        else if (colorName1.equals("blue")) {
            f1.setColor(Color.BLUE);
        }
        else if (colorName1.equals("green")) {
            f1.setColor(Color.GREEN);
        }
        else if (colorName1.equals("black")) {
            f1.setColor(Color.BLACK);
        }
        else if (colorName1.equals("yellow")) {
            f1.setColor(Color.YELLOW);
        }
        System.out.print(f1.toString());
    }
}