import java.util.ArrayList;

public class Contacts {
    private ArrayList<Contact> contactList;

    /**
     * Constructor Of new AddressBook
     */
    public Contacts() {
        this.contactList = new ArrayList<>();
    }

    /**
     * add New Contact Method
     * @param firstName
     * @param lastName
     * @param address
     * @param city
     * @param state
     * @param pinCode
     * @param email
     * @param mobNumber
     */
    public void addContact(String firstName,String lastName,String address,String city,String state,long pinCode,String email,long mobNumber){
        contactList.add(new Contact(firstName,lastName,address,city,state,pinCode,email,mobNumber));
        //System.out.println("Contact of "+firstName+" added");
    }

    /**
     * Getter
     * @return
     */
    public ArrayList<Contact> getContactList() {
        return contactList;
    }


}
