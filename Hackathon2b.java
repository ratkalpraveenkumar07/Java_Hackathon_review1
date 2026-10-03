import java.util.Scanner;
public class Hackathon2b 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE GENERATED ENERGY:");
        double energy = sc.nextDouble();

        System.out.println("ENERGY GENERATED: " + energy + " kWh");

        if(energy>10.0)
        {
            System.out.println("GOOD ENERGY GENERATION");
        }
        else
        {
            System.out.println("LOW ENERGY GENERATION");
        }
    }

    
}
