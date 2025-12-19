public class TwelveDaysOfChristmas {

    public static void main(String[] args) {

        for (int christmasDay = 1; christmasDay <= 12; christmasDay++) {

            String dayName = "";

            switch (christmasDay) {
                case 1 ->  dayName = "first"; 
                case 2 ->  dayName = "second"; 
                case 3 ->  dayName = "third";  
                case 4 ->  dayName = "fourth"; 
                case 5 ->  dayName = "fifth"; 
                case 6 ->  dayName = "sixth"; 
                case 7 ->  dayName = "seventh"; 
                case 8 ->  dayName = "eighth"; 
                case 9 ->  dayName = "ninth"; 
                case 10->  dayName = "tenth"; 
                case 11->  dayName = "eleventh"; 
                case 12->  dayName = "twelfth"; 
            }

            System.out.println(
                "On the " + dayName +
                " day of Christmas my true love sent to me:"
            );

            switch (christmasDay) {
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("Eleven pipers piping,");
                case 10:
                    System.out.println("Ten lords a-leaping,");
                case 9:
                    System.out.println("Nine ladies dancing,");
                case 8:
                    System.out.println("Eight maids a-milking,");
                case 7:
                    System.out.println("Seven swans a-swimming,");
                case 6:
                    System.out.println("Six geese a-laying,");
                case 5:
                    System.out.println("Five gold rings,");
                case 4:
                    System.out.println("Four calling birds,");
                case 3:
                    System.out.println("Three French hens,");
                case 2:
                    System.out.println("Two turtle doves,");
                    System.out.println("And a partridge in a pear tree.\n");
                    break;
                case 1:
                    System.out.println("A partridge in a pear tree.\n");
                    break;
            }
        }
    }
}

