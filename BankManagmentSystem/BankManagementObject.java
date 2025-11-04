import java.util.Scanner;
public class BankManagementObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Account;
        SavingAccount sa = new SavingAccount("Sukman nag",2508,1000000.00d);
        CurrentAccount ca = new CurrentAccount("Ramprashad ", 2134, 300000.00d);
        System.out.println("===========Welcome to Java bank==============");
        int choice;
        do{
            System.out.println("\n1.Deposit in savings");
            System.out.println("2.Withdraw from savings");
            System.out.println("3.Add Interest (Savings)");
            System.out.println("4.Deposit in Current");
            System.out.println("5.Withdraw from Current");
            System.out.println("6.Show Account details");
            System.out.println("0.Exit");
            System.out.println("enter your choice:");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                 System.out.println("Enter amount to deposit:");
                 sa.deposit(sc.nextDouble());
                 break;
                 case 2:
                 System.out.println("Enter amount to withdraw:");
                 sa.withdraw(sc.nextDouble());
                 break;
                 case 3:
                 sa.addInterest();
                 break;
                 case 4:
                 System.out.println("Enter amount to deposit:");
                 ca.deposit(sc.nextDouble());
                 break;
                 case 5:
                 System.out.println("Enter amount to withdraw:");
                 ca.withdraw(sc.nextDouble());
                 break;
                 case 6:
                 System.out.println("\n============Savings Account==============");
                 sa.showDetails();
                 System.out.println("\n============Current Account==============");
                 ca.showDetails();
                 break;
                 case 0:
                 System.out.println("Thank you for using Java Bank!");
                 break;
                 default:
                 System.out.println("Invalid Choice");
                
                }
               }while(choice!=0);
               sc.close();
    }
    
}
