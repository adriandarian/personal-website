import java.util.Scanner;
public class Age_On_Planets_And_Asteroids {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = 0;
        try {
            age = scn.nextInt();
        } catch (Exception e) {
            errorHandler();
        }
        System.out.println("<=Your age on different planets=>\n-----------------------------------\n  Planets Age"); 
        System.out.println("  Earth     :" + String.format("%.2f", (double)age) + " Years");
        System.out.println("  Moon     :" + String.format("%.2f", (365.26 * age) / 27.32) + " Years");
        System.out.println("  Mercury     :" + String.format("%.2f", (365.26 * age) / 87.19) + " Years");
        System.out.println("  Venus     :" + String.format("%.2f", (365.26 * age) / 224.70) + " Years");
        System.out.println("  Mars     :" + String.format("%.2f", (365.26 * age) / 686.68) + " Years");
        System.out.println("  Jupiter     :" + String.format("%.2f", (365.26 * age) / 4328.98) + " Years");
        System.out.println("  Saturn     :" + String.format("%.2f", (365.26 * age) / 10760.55) + " Years");
        System.out.println("  Uranus     :" + String.format("%.2f", (365.26 * age) / 30685.49) + " Years");
        System.out.println("  Neptune     :" + String.format("%.2f", (365.26 * age) / 60191.19) + " Years");
        System.out.println("  Pluto     :" + String.format("%.2f", (365.26 * age) / 90799.98) + " Years\n-----------------------------------\n\n<=Your age on some Asteroids=>\n-----------------------------------\n");
        System.out.println("  Vesta     :" + String.format("%.2f", (365.26 * age) / 1325) + " Years");
        System.out.println("  Ceres     :" + String.format("%.2f", (365.26 * age) / 1644) + " Years");
        System.out.println("  Pallas     :" + String.format("%.2f", (365.26 * age) / 1686) + " Years\n-----------------------------------\n\n<=Your age on some Trans-Neptunian Planets=>\n-----------------------------------\n");
        System.out.println("  Quaoar     :" + String.format("%.2f", (365.26 * age) / 104099.1) + " Years");
        System.out.println("  Eris     :" + String.format("%.2f", (365.26 * age) / 113227.5) + " Years");
        System.out.println("  MakeMake     :" + String.format("%.2f", (365.26 * age) / 112898.21) + " Years");
        System.out.println("  Haumea     :" + String.format("%.2f", (365.26 * age) / 136108) + " Years");
        System.out.println("  Sedna     :" + String.format("%.2f", (365.26 * age) / 204545.6) + " Years");
    }
    
    static void errorHandler() {
        System.out.println("So, you wanna crashme huh!\nI'm Smarter that you :)\nYou lazy Bone input your age, And try again...");
        System.exit(0);
    }
}