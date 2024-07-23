import java.util.*;

public class conditional {
    public static void main(String args[]) {
        
        if else----------------
        int age = 16;
        if (age >= 18) {
            System.out.println("vote");
        }
        else if (age > 13 && age <18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("not eligible for vote");
        }

        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        if (time <= 30) {
            System.out.println("Move straight");
        }

        else if (time > 30 && time <= 60) {
            System.out.println("move left");
        }
        else if (time > 60 && time <= 90){
            System.out.println("move right");
        }

        else {
            System.out.println("STOP");
        }
