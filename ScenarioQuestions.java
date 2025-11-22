import java.util.Scanner;

public class ScenarioQuestions
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("RickShaw Fare calculator");
        System.out.print("Enter the Distance travelled in KM:");
        float fairperKM = 200;
        float distance=scanner.nextFloat();
        
        System.out.print("Enter the Time (in minutes)");
        float Time=scanner.nextFloat();
        scanner.nextLine();

        double timeFareRate = 5.0;
        
        
        double initialfair = 200+(fairperKM * distance) + (timeFareRate * Time);
        System.out.println("Is the Passenger local");
        String Local = scanner.nextLine();
        boolean ISLocal = Local.equals("Y") || Local.equals("y");
        double LocalDiscount = 0.10;
        
        double DiscountAmount = initialfair * (ISLocal ? LocalDiscount : 0.0);
        
        double FareAfterDisount = initialfair - DiscountAmount; 
        System.out.println("Travelling in night");
        String Night = scanner.nextLine();
        boolean ISNight = Night.equals("Y") || Night.equals("y");
        double Nightmarkup = 0.25;
        double Upcharge = FareAfterDisount * (ISNight ? Nightmarkup : 0.0);
        double totalfare = Upcharge + FareAfterDisount;
        System.out.println("\n-----Results------");
        System.out.println("Is Local? " + ISLocal);
        System.out.println("Is Night? " + ISNight);
        System.out.println("Initial Fare:Rs. \n" +initialfair);
        System.out.println("Discount Applied:    \n" +DiscountAmount);
        System.out.println("Surcharge Applied \n: " +Upcharge);
        System.out.println("Total Fare: Rs. \n" +totalfare);
        
        
        
}
}