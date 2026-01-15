import java.util.Scanner;
public class Trigonometry {

    // TODO: Create 'public static double sine(double angle)'
    

    // TODO: Create 'public static double cosine(double angle)'
    

    
        // TODO: Read angle
        // TODO: Call sine() and cosine()
        // TODO: Print results in the required format
    public static double sine(double angle)
    {
        double rad = Math.toRadians(angle);
        double sine = Math.sin(rad);
        return sine;

    }
    public static double cosine(double angle)
    {
        double rad = Math.toRadians(angle);
        double cos = Math.cos(rad);
        return cos;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        System.out.println("Sine: "+sine(angle));
        System.out.println("Cosine: "+cosine(angle));
        
    }
}
