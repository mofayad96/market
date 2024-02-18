import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        Object [][]goods={
                {"Apple", 20 ,12.30},
                {"Mango", 10 ,10},
                {"mint", 19,2}


        };
        System.out.println("please enter item name");
        String itemname=input.nextLine();

        //checck if product found
        for(Object[]item:goods)
        {
            if(item[0].equals(itemname))
            {
                System.out.println("good");
                break;
            }else {
                System.out.println("not avaliable");
                return;
            }


        }
        System.out.println("enter quantity");
        int quantity=input.nextInt();
        for(Object item[]:goods) {
            if (item[0].equals(itemname)) {
                if((int)item[1]<quantity)
                {
                System.out.println("quantity not avaliable");
                return;
                }else {
                    System.out.println("Done");
                    item[1] = (int) item[1] - quantity;


                }

            }
        }

        for(Object[]item:goods)
            System.out.println(item[0] +" "+ item[1]);


    }
    }

