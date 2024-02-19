import java.util.*;

public class Main {
    //arraylists to track the order
    static ArrayList<String> Bought_ItemNames = new ArrayList<>();
    static ArrayList<Double> Bought_ItemPrices = new ArrayList<>();
    static ArrayList<Integer> Bought_ItemQuantity = new ArrayList<>();
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

        //sabrina & Lamice & youssef
        String[] itemname = {"apple", "orange", "berries"};
        double[] prices = {12, 10, 16};
        int[] quantity = {10, 12, 50};
        double totalamount = 0;
        System.out.println("Available items:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(itemname[i] + ", prices: " + prices[i] + ", available quantities: " + quantity[i]);
        }
        //also to make room for error
        while (true) {
            System.out.println("enter 1 to purchase item 1 , 2 to purchase item 2 , 3 to purchase item 3 & 0 to quit");
            int productnumber = input.nextInt();
            if (productnumber == 0) {
                Receipt();
                System.out.println("Your total is: " + totalamount);
                System.out.println("thank you , come back later");
                break;
            }
            //if the user entered an invalid number
            if (productnumber < 1 || productnumber > prices.length) {
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
            //updating stock
            quantity[productnumber - 1] = quantity[productnumber - 1] - orderedquantity;
            //updating the shopping cart and total amount
            Bought_ItemNames.add(itemname[productnumber - 1]);
            Bought_ItemPrices.add(prices[productnumber - 1]);
            Bought_ItemQuantity.add(orderedquantity);
            totalamount += (prices[productnumber - 1] * orderedquantity);
        }
        //scanner close for good practice 
        input.close();
    }

    static void Receipt() {

        System.out.println("Product\t\tQuantity\t\tPrice\t\tValue");
        for (int i = 0; i < Bought_ItemNames.size(); i++) {
            //the ultimate receipt ,fathalla receipt
            System.out.println(Bought_ItemNames.get(i));
            System.out.println("\t\t\t" + Bought_ItemQuantity.get(i) + "\t\t\t\t" + Bought_ItemPrices.get(i) + "\t\t" + Bought_ItemPrices.get(i) * Bought_ItemQuantity.get(i));
        }

    }
}
