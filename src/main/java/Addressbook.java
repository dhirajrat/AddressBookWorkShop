import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Addressbook {
    private ArrayList<Contact> addressbook;

    /**
     * Constructor Of new AddressBook
     */
    public Addressbook() {
        this.addressbook = new ArrayList<>();
    }

    /**
     * Add Contact To AddressBook
     * @param firstName
     * @param lastName
     * @param city
     * @param state
     * @param pNum
     * @param email
     */
    public void addAContactToAddressbook(String firstName, String lastName, String city, String state, String pNum, String email){
        addressbook.add(new Contact(firstName,lastName,city,state,pNum,email));
        System.out.println("Contact of "+firstName+" added");
    }

    /**
     * add multiple persons Contact To addressBook
     * Ensures No Duplicate Entry to be added
     */
    public void addAContactToAddressbook()
    {
        boolean contactPresent = false;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter firstname :");
        String firstName = sc.nextLine();
        System.out.println("Enter lastname :");
        String lastName = sc.nextLine();
        System.out.println("Enter city :");
        String city = sc.nextLine();
        System.out.println("Enter state :");
        String state = sc.nextLine();
        System.out.println("Enter phone number :");
        String pNum = sc.nextLine();
        System.out.println("Enter emailID :");
        String email = sc.nextLine();

        ArrayList<Contact> contacts = this.addressbook;
        // Checking If Contact Present Or Not If Not present then Add new Contact
        for (Contact contact : contacts){
            if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName) ){
                contactPresent = true;
                System.out.println("Contact already Present add another Contact");
            }
        }
        if(contactPresent == false){
            this.addressbook.add(new Contact(firstName, lastName, city, state, pNum, email));
        }
    }

    /**
     * Show people inn addressBook
     */
    public void showPeopleList()
    {
        ArrayList<Contact> contacts = this.addressbook;
        System.out.println("----------------------------------------------------------");
        for (Contact contact : contacts) {
            String s = "-- >>" + contact.toString();
            System.out.println(s);
        }
        System.out.println("----------------------------------------------------------");
    }

    /**
     * Edit Existing Contact
     */
    public void  editContactList() {
        String fname;
        Scanner firstNameScanner = new Scanner(System.in);
        System.out.println("Enter a first name of Contact which you Want to edit");
        fname = firstNameScanner.nextLine();
        ArrayList<Contact> contacts = this.addressbook;

        int m = 0;
        for (Contact contact : contacts) {
            int i = contacts.indexOf(contact);
            if(contacts.get(i).getFirstName().equals(fname)){
                boolean contactPresent = false;
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter firstname :");
                String firstName = sc.nextLine();
                System.out.println("Enter lastname :");
                String lastName = sc.nextLine();
                System.out.println("Enter city :");
                String city = sc.nextLine();
                System.out.println("Enter state :");
                String state = sc.nextLine();
                System.out.println("Enter phone number :");
                String pNum = sc.nextLine();
                System.out.println("Enter emailID :");
                String email = sc.nextLine();

                // Checking If Contact Present Or Not If Not present then Add new Contact
                contacts.add(i,new Contact(firstName, lastName, city, state, pNum, email));
                int deleteExtra = i + 1;
                contacts.remove(deleteExtra);
                m = 1;
                break;
            }
        }
        if(m == 0){
            System.out.println("Contact not found with this name");
        }

        this.addressbook = contacts;
    }

    /**
     * Ability To delete Contact
     */
    public void deleteContactFromAddressbook(){

        String fname;
        Scanner firstNameScanner = new Scanner(System.in);
        System.out.println("Enter a first name of Contact which you Want to delete");
        fname = firstNameScanner.nextLine();
        ArrayList<Contact> contacts = this.addressbook;

        int m = 0;
        for (Contact contact : contacts) {
            int i = contacts.indexOf(contact);
            if(contacts.get(i).getFirstName().equals(fname)){
                contacts.remove(contact);
                System.out.println("contact of "+fname+" has been deleted");
                m = 1;
                break;
            }
        }
        if(m == 0){
            System.out.println("Contact not found with this name");
        }

        this.addressbook = contacts;
    }

    /**
     * Search Peson in a city
     * @param city
     */
    public void searchContactByCityOrState(String city){

        ArrayList<Contact> contacts = this.addressbook;

        int m = 0;
        int count = 0;
        for (Contact contact : contacts) {
            int i = contacts.indexOf(contact);
            if(contacts.get(i).getCity().equals(city) || contacts.get(i).getState().equals(city)){
                System.out.println("Contact with : "+city+" : "+contacts.get(i).toString());
                m = 1;
                count++;
            }
        }
        System.out.println(count+" Number Of people Found with City/State : "+city+" in this AddressBook");
        if(m == 0){
            System.out.println("Contact not found with this City Or State");
        }
    }

    public void sortByName() {
        ArrayList<Contact> contactList = this.addressbook;
        ArrayList<Contact> sortedContactList = (ArrayList<Contact>) contactList.stream()
                .sorted(Comparator.comparing(Contact::getFirstName))
                .collect(Collectors.toList());

        System.out.println("*** AddressBook Sorted Out By Name ***");
        this.addressbook = sortedContactList;
    }

    public void sortByCity() {

        ArrayList<Contact> contactList = this.addressbook;
        ArrayList<Contact> sortedContactList = (ArrayList<Contact>) contactList.stream()
                .sorted(Comparator.comparing(Contact::getCity))
                .collect(Collectors.toList());


        System.out.println("*** AddressBook Sorted Out By City ***");
        this.addressbook = sortedContactList;
    }


    /**
     * Setter
     * @param addressbook
     */
    public void setAddressbook(ArrayList<Contact> addressbook) {
        this.addressbook = addressbook;
    }

    /**
     * Getter
     * @return
     */

    public ArrayList<Contact> getAddressbook() {
        return addressbook;
    }
}
