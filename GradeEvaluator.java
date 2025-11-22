import java.util.Scanner;


public class GradeEvaluator
{
    public static void main(String[] argus)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the numeric grade:");
        int grade = scanner.nextInt();
        String result =(grade>=40)? "pass":"fail";
        System.out.println(""+result);
        
        
        
    }
}