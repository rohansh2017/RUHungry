package restaurant;
/**
 * Use this class to test your Menu method. 
 * This class takes in two arguments:
 * - args[0] is the menu input file
 * - args[1] is the output file
 * 
 * This class:
 * - Reads the input and output file names from args
 * - Instantiates a new RUHungry object
 * - Calls the menu() method 
 * - Sets standard output to the output and prints the restaurant
 *   to that file
 * 
 * To run: java -cp bin restaurant.Menu menu.in menu.out
 * 
 */
public class Menu {
    public static void main(String[] args) {

	// 1. Read input files
	// Option to hardcode these values if you don't want to use the command line arguments
	   
        String inputFile = args[0];
        String outputFile = args[1];
	String inputStock = args[2];
        String orderin = args[3];
        // String restockin = args[4];
        // String transactionin = args[3];
        
        //String restockin = args[5];
        // 2. Instantiate an RUHungry object
        RUHungry rh = new RUHungry();

	// 3. Call the menu() method to read the menu
        rh.menu(inputFile);
        rh.createStockHashTable(inputStock);
        rh.updatePriceAndProfit();
        

        // StdIn.setFile(transactionin);
        // int transactionCount = StdIn.readInt();

        // for (int i = 0; i < transactionCount; i++){
        //         String type = StdIn.readString();
        //         StdIn.readChar();
        //         int amount = StdIn.readInt();
        //         StdIn.readChar();
        //         String item = StdIn.readLine();

        //         if (type.equalsIgnoreCase("order"))
        //                 rh.order(item, amount);
        //         if (type.equalsIgnoreCase("donation"))
        //                 rh.donation(item, amount);
        //         if (type.equalsIgnoreCase("restock"))
        //                 rh.restock(item, amount);
        // }
        
        StdIn.setFile(orderin);
        int orderCount = StdIn.readInt();

        for (int i = 0; i < orderCount; i++){
                int amount = StdIn.readInt();
                StdIn.readChar();
                String item = StdIn.readLine();
                rh.order(item, amount);
        }
        
        // StdIn.setFile(donationin);
        // int donationCount = StdIn.readInt();

        // for (int i = 0; i < donationCount; i++){
        //         int amount = StdIn.readInt();
        //         StdIn.readChar();
        //         String item = StdIn.readLine();
        //         rh.donation(item, amount);
        // }

        // StdIn.setFile(restockin);
        // int restockCount = StdIn.readInt();

        // for (int i = 0; i < restockCount; i++){
        //         int amount = StdIn.readInt();
        //         StdIn.readChar();
        //         String item = StdIn.readLine();
        //         rh.restock(item, amount);
        // }
	// 4. Set output file
	// Option to remove this line if you want to print directly to the screen
        StdOut.setFile(outputFile);

	// 5. Print restaurant
        rh.printRestaurant();
    }
}
