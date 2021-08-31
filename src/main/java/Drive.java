import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Drive {
    public HashMap<String,Addressbook> drive;

    public Drive() {
        this.drive = new HashMap<>();
    }

    /**
     * add New AddressBook Method
     * or Multiple addressBook
     */
    public void addAddressbookToDrive(){
        Addressbook addressbook = new Addressbook();
        String nameOfAddressbook;
        Scanner nameSc = new Scanner(System.in);
        System.out.println("Enter a AddressBook You want to add:");
        nameOfAddressbook = nameSc.nextLine();
        this.drive.put(nameOfAddressbook,addressbook);
        System.out.println("Addressbook "+nameOfAddressbook+" Added");
    }

    /**
     * search person in a particular city
     * and View
     * and count
     */
    public void searchCityPeopleInDrive(){
        System.out.println("Enter City Or state Name to search");
        Scanner sc3 = new Scanner(System.in);
        String city = sc3.nextLine();
        Set<String> abKeySetToSearch = this.drive.keySet();
        System.out.println("");
        for (String conName : abKeySetToSearch) {
            System.out.println("AddressBook {" + conName + "} With City/State : {" + city + "} :");
            this.drive.get(conName).searchContactByCityOrState(city);
            System.out.println("");
        }
    }

    public void performOperationOnAddressbook(){
        System.out.println("Enter Address Book name to Perform Operation On");
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String addressBookName2 = sc2.nextLine();
        int maintainOp = 0;
        while (maintainOp == 0) {
            System.out.println("\n****** Enter the Operation you want perform on AddressBook ******");
            System.out.println("\n|| 1.Add Contact   \n|| 2.Edit Contact  \n|| 3.Delete Contact  \n|| 4.Print The Contacts  \n|| 5.Sort AddressBook By Name  \n|| 6.Sort AddressBook By City  \n|| 7.Exit from This AddressBook");
            int oChoice = sc.nextInt();
            switch (oChoice) {
                case 1:
                    drive.get(addressBookName2).addAContactToAddressbook();
                    break;

                case 2:
                    drive.get(addressBookName2).editContactList();
                    break;

                case 3:
                    drive.get(addressBookName2).deleteContactFromAddressbook();
                    break;

                case 4:
                    System.out.println("******** This is the List **********");
                    drive.get(addressBookName2).showPeopleList();
                    break;

                case 5:
                    drive.get(addressBookName2).sortByName();
                    break;

                case 6:
                    drive.get(addressBookName2).sortByCity();
                    break;

                case 7:
                    System.out.println("AddressBook Operation --> EXIT <--");
                    maintainOp = 1;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

    public void showAllAddressbookInDrive(){
        Set<String> abKeySet = drive.keySet();
        System.out.println("\n#####  ALL ADDRESSBOOKS-LISTS  #####");
        for(String conName : abKeySet){
            System.out.println("AddressBook :::::: "+conName);
            drive.get(conName).showPeopleList();
        }
    }


    /**
     * Getters And Setters
     * @return
     */
    public HashMap<String, Addressbook> getDrive() {
        return drive;
    }

    public void setDrive(HashMap<String, Addressbook> drive) {
        this.drive = drive;
    }

}
