import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //muhammed essam
        Scanner input=new Scanner(System.in);
        String[][] users = {
                {"Mohamed22", "10111"},
                {"hossam22", "11011"},
                {"saeed22", "11101"},
        };
        while (true) {
            System.out.print("Please enter username: ");
            String Username = input.nextLine();
            System.out.print("Please enter the password: ");
            String Password = input.nextLine();
            boolean auth = false;
            // Check if entered username and password match
            for (String[] user : users) {
                if (user[0].equals(Username) && user[1].equals(Password)) {
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
            } }
        //muhammed essam end



        //sabrina,jana
        String [] itemname = {"apple","orange","berries"};
        double [] prices= {12,10,16};
        int [] quantity= {10,12,50};
        double totalamount =0;

        System.out.println("items  prices  quantity");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(itemname[i] + "  " + prices[i] + "   " + quantity[i]);
        }

        // youssef , lamis
        String[] purchasedItemNames = new String[itemname.length];
        int[] purchasedQuantities = new int[itemname.length];
        double[] purchasedTotals = new double[itemname.length];
        int purchasedItemCount = 0;
        //end youssef , lamis


        // sabrina , jana
        while(true){
            System.out.println("enter 1 to purchase item 1 , 2 to purchase item 2 , 3 to purchase item 3 & 0 to quit");
            int productnumber= input.nextInt();

            if(productnumber==0){

                break ;
            }
            if ( productnumber<1 || productnumber>itemname.length ){
                System.out.println("invalid base try again");
                continue ;
            }
            int productquantity =quantity[productnumber-1];
            System.out.println("please enter your requested quantity:");
            int ordredquantity = input.nextInt();

            if( ordredquantity < 1 || ordredquantity > productquantity ){
                System.out.println(" invalid quantity , try again");
                continue ;
            }
            //end of sabina , jana

            // lamis , youssef
            quantity[productnumber-1] =quantity[productnumber-1]-ordredquantity;
            double itemTotal = prices[productnumber - 1] * ordredquantity;
            totalamount += itemTotal;


            purchasedItemNames[purchasedItemCount] = itemname[productnumber - 1];
            purchasedQuantities[purchasedItemCount] = ordredquantity;
            purchasedTotals[purchasedItemCount] = itemTotal;
            purchasedItemCount++;



        }
        System.out.println("Purchased Items:");
        for (int i = 0; i < purchasedItemCount; i++) {
            System.out.println(purchasedItemNames[i] + " - Quantity: " + purchasedQuantities[i] + " - Total: $" + purchasedTotals[i]);
        }

        System.out.println("Total Amount: $" + totalamount);
        System.out.println("thank you , come back later");
        System.out.println("                            ");
        System.out.println("FOR ADMIN!!!!!!!!!");
        System.out.println("Updated items quantity:");
        System.out.println("items  prices  quantity");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(itemname[i] + "  " + prices[i] + "   " + quantity[i]);
        }

        input.close();
    }
}
