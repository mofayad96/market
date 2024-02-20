import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in); //made scanner static

    public static void main(String[] args) {
        //muhammed essam
        String[][] users = {
                {"Mohamed22", "10111"},
                {"hossam22", "11011"},
                {"saeed22", "11101"},
        };
        //infinite while loop to make room for error
        while (true) {
            System.out.print("Please enter username: ");
            String Username = input.nextLine();
            System.out.print("Please enter the password: ");
            String Password = input.nextLine();
            boolean auth = false;

            // Check if entered username and password match
            for (String[] user : users) {
                if (user[0].equalsIgnoreCase(Username) && user[1].equals(Password)) {
                    auth = true;
                    break; // Exit the loop if a match is found
                }
            }

            // Check the auth.....
            if (auth) {
                System.out.println("Authentication successful!");
                break;
            } else {
                System.out.println("Authentication failed. Invalid username or password.");
            }
        }
        //muhammed essam end

        //jana
        String[] itemname = {"apple", "orange", "berries"};
        double[] prices = {12, 10, 16};
        int[] quantity = {10, 12, 50};
        double totalamount = 0;
        System.out.println("Available items:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(itemname[i] + ", prices: " + prices[i] + ", available quantities: " + quantity[i]);
        }
         int[] Bought_ItemQuantity = new int[itemname.length];
        //also to make room for error
        while (true) {
            System.out.println("enter 1 to purchase item 1 , 2 to purchase item 2 , 3 to purchase item 3 & 0 to quit");
            int productnumber = input.nextInt();
            // jana end


            // YOUSSEF, lamis
            if (productnumber == 0) {
                System.out.println("Product\t\tQuantity\t\tPrice\t\tValue");
                for (int i = 0; i < Bought_ItemQuantity.length; i++) {
                    //the ultimate receipt ,fathallah receipt
                    if(Bought_ItemQuantity[i] == 0)
                        continue;
                    System.out.println(itemname[i]);
                    System.out.println("\t\t\t" + Bought_ItemQuantity[i] + "\t\t\t\t" + prices[i] + "\t\t" + prices[i] * Bought_ItemQuantity[i]);
                }
                System.out.println("Your total is: " + totalamount);
                System.out.println("thank you , come back later");
                break;
            }//END YOUSSEF,lamis


            // sabrina
            //if the user entered an invalid number
            if (productnumber < 1 || productnumber > itemname.length) {
                System.out.println("invalid base try again");
                continue;
            }
            //removed the product quantity because it was redundant
            System.out.println("please enter your requested quantity:");
            int orderedquantity = input.nextInt(); //it's ordered and not ordred ya sabrina
            //also for invalid numbers
            if (orderedquantity < 1 || orderedquantity > quantity[productnumber - 1]) {
                System.out.println(" invalid quantity , try again");
                continue;
            }



            //sabrina
            quantity[productnumber - 1] = quantity[productnumber - 1] - orderedquantity;
            Bought_ItemQuantity[productnumber-1] += orderedquantity;//updating the shopping cart and total amount
            totalamount =totalamount + (prices[productnumber - 1] * orderedquantity);
        }


        System.out.println("                    ");
        System.out.println("FOR ADMIN!!!!!!!!!");
        System.out.println("Updated items quantity:");
        System.out.println("items  prices  quantity");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(itemname[i] + "  " + prices[i] + "   " + quantity[i]);
        }
        input.close();
        // end sabrina , jana
    }
}
