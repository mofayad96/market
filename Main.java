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


        //sabrina
        String []itemname = {"apple","orange","berries"};
        double []prices= {12,10,16};
        int []quantity= {10,12,50};
        double totalamount =0;
        System.out.println("Available items:");
        for(int i=0;i<prices.length;i++){
            System.out.println(itemname[i] +", prices: "+ prices[i] +", available quantities: "+ quantity[i] );
        }
       while(true){
        System.out.println("enter 1 to purchase item 1 , 2 to purchase item 2 , 3 to purchase item 3 & 0 to quit");
        int productnumber= input.nextInt();
        if(productnumber==0){
            System.out.println("thank you , come back later");
            break ;
        }
        if ( productnumber<1 || productnumber>prices.length ){
            System.out.println("invalid base try again");
            continue ;
        }
        String ordredproduct =itemname[productnumber-1];
        int productquantity =quantity[productnumber-1];
        System.out.println("please enter your requested quantity:");
        int ordredquantity = input.nextInt();
        if( ordredquantity < 1 || ordredquantity > productquantity ){
            System.out.println(" invalid quantity , try again");
            continue ;
        }
        quantity[productnumber-1] =quantity[productnumber-1]-ordredquantity;
        totalamount = totalamount +(prices[productnumber-1]*ordredquantity);
       }
          System.out.println(totalamount);
          input.close();
    }
}
    
