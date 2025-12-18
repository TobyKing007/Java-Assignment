import java.util.Scanner;
public class TempChecker    {

    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a measurement unit (C for Celcius and F for Fahrenheit) ");
    String measurementUnit = input.nextLine();

    System.out.println("Enter a temperature unit ");
    float tempValue = input.nextFloat();

    System.out.println("Enter a threshold temperature ");
    float threshold = input.nextFloat();

    float convertedUnit = 0;

    if (measurementUnit.equalsIgnoreCase("C"))   {
        convertedUnit = ((tempValue * 9/5) + 32);   
        System.out.println("Temperature in Fahrenheit is " + convertedUnit);
    }
    else if (measurementUnit.equalsIgnoreCase("F"))  {
        convertedUnit = ((tempValue - 32) * 5/9);      
        System.out.println("Temperature in Celcius is " + convertedUnit);
    }
    else    {
        System.out.println("Invalid input. Use 'C' or 'F'");
    }
    
    if (convertedUnit < threshold)    {
        System.out.println("Cold advisory");
    }

    else if (convertedUnit >= threshold)  {
        System.out.println("Heat alert");
    }
    
    
        }
    }
