import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public static void main(String[] args){
        System.out.println(ANSI_GREEN + " *-*-*-*-*     WELCOME!     *-*-*-*-*" + ANSI_RESET);
        System.out.println(ANSI_GREEN + " _____________________________________" + ANSI_RESET);

        Scanner sc = new Scanner(System.in);
        Drive drive = new Drive();
        int loopStop = 0;
        while(loopStop == 0)
        {
            System.out.println("\nEnter a choice");
            System.out.println("|| 1.Add a new AddressBook   \n|| 2.Perform Operation on AddressBook \n|| 3.Display all AddressBooks \n|| 4.Search people in Particular City/State  \n|| 5.Create Files of all address books  \n|| 6.EXIT");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    drive.addAddressbookToDrive();
                    break;

                case 2:
                    drive.performOperationOnAddressbook();
                    break;

                case 3:
                    drive.showAllAddressbookInDrive();
                    break;

                case 4:
                    drive.searchCityPeopleInDrive();
                    break;

                case 5:
                    FileIOOperations.createFileOfAddressBook(drive);
                    break;

                case 6:
                    System.out.println("------>   EXIT   <------");
                    System.out.println(ANSI_RED + "___________________________________________" + ANSI_RESET);
                    System.out.println(ANSI_RED + "*-*-*-*-*       Good Bye!        *-*-*-*-*-*" + ANSI_RESET);
                    loopStop = 1;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;

            }
        }


    }
}
