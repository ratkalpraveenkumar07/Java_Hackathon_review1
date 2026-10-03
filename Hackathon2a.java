//Rooftop Solar Energy Monitor
import java.util.*;
public class Hackathon2a 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER PANEL ID:");
        int panel = sc.nextInt();
        System.out.println("ENTER ENERGY GENERATED IN kWh:");
        double energy = sc.nextDouble();
        System.out.println("ENTER NUMBER OF PANELS:");
        int numPanels = sc.nextInt();
        System.out.println("ENTER SYSTEM STATUS:");
        char status = sc.next().charAt(0);

        System.out.println("ROOFTOP SOLAR ENERGY MONITOR");
        System.out.println("PANEL ID: " + panel);
        System.out.println("ENERGY GENERATED: " + energy + " kWh"); 
        System.out.println("NUMBER OF PANELS: " + numPanels);
        System.out.println("SYSTEM STATUS: " + status);

        
    }
    
}
