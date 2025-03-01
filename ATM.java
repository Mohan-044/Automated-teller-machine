import java.util.Scanner;

class mini_ATM{
    public static void main(String[] args) {
//inputs
    int Pin =2032;
    int Password=0;
    double Balance=10000;
    int Deposit_Amount=0;
    int withdraw_Amount=0;
    String Name;
    int Option=0;
    Scanner input =new Scanner(System.in);
    System.out.println("Enter your pin number");
    Password= input.nextInt();
//function
    if(Password==Pin){
        System.out.println("Please Enter your Name");
        Name =input.nextLine();
        System.out.println("Welcome"+Name);
        while(true)
        {
            System.out.println("Press 1 to check your Balance");
            System.out.println("Press 2 to Deposit Amount");
            System.out.println("Press 3 to withdraw");
            System.out.println("Press 4 to get a transaction bill");
            System.out.println("Press 5 to Exit" );
            Option=input.nextInt();
            switch (Option) {
                case 1:
                System.out.println("Your current balance is"+Balance);    
                    break;

                    case 2:
                    System.out.println("Enter the amount");
                    Deposit_Amount=input.nextInt();
                    Balance += Deposit_Amount;
                    System.out.println("Successfully  Credited");
                    break;

                    case 3:
                    System.out.println("Enter the amount");
                    withdraw_Amount=input.nextInt();
                    if(Balance<withdraw_Amount){
                        System.out.println("Your balance is insufficient to withdraw a amount");
                    }
                    else{
                    
                    Balance -=withdraw_Amount;
                    } 
                    System.out.println("");
                    break;

                    case 4:
                    System.out.println("Transaction bill");
                    System.out.println("Balance:"+Balance);
                    System.out.println("Deposited amount"+Deposit_Amount);
                    System.out.println("Withdraw amount"+withdraw_Amount);
                    System.out.println("\t Thanks for using as");
                    break;
                default:
                System.out.println("invalid Number");
                System.out.println("Plese try again");
                    break;
            }
        }
    }
    else
    {
        System.out.println("Password incorrect");
        System.out.println("\tPlese try again ");
    }
    input.close();
    }
}
