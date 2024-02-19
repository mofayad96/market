import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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
    }
}
    
