import java.util.Scanner;
public class BmiCalc {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a weight: ");
        double weight = input.nextDouble();
        System.out.print("Enter a height for use meter: ");
        double height = input.nextDouble();
        
        double BMI = weight / (height * height);
        System.out.println("BMI is: " + BMI);
        if (BMI < 18.5){
         System.out.println("Underweight");
        }
        else if (BMI >= 18.5 && BMI < 25) {
         System.out.println("Normal");
        }
        else if (BMI >= 25 && BMI < 30) {
         System.out.println("Overweight");
        }
        else {
         System.out.println("Obese");
        }
        
    }
    
}
