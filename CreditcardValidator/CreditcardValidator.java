public class CreditcardValidator {

    public static void main(String[] args) {

        String creditCardNumber = "4388576018402626";

        int position = 1;  // start counting from right
        int total = 0;     // initialize total **before the loop**

        for (int counter = creditCardNumber.length() - 1; counter >= 0; counter--) {

            int digit = creditCardNumber.charAt(counter) - '0';

            // double every second digit
            if (position % 2 == 0) {
                digit *= 2;

                // if doubled digit > 9, subtract 9 (Luhn rule)
                if (digit > 9) {
                    digit -= 9;
                }
            }

            total += digit;  

            position++;  
        }

        System.out.println("Total sum: " + total);

        
        if (total % 10 == 0) {
            System.out.println("Credit card is VALID");
        } else {
            System.out.println("Credit card is INVALID");
        }
    }
}

