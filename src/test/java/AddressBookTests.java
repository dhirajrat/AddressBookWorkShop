import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
public class AddressBookTests {


    @Test
    public void givenContactArrayListShouldMatchAddressBookCreated(){
        ArrayList<Contact> contactArrayList = new ArrayList<>();
        Contacts contactList = new Contacts();

        contactArrayList.add(new Contact("Dhiraj","Rathod","Savedi","Anagar","Maha",414003,"dhiru@mail.com",9604508795L));

        contactList.addContact("Dhiraj","Rathod","Savedi","Anagar","Maha",414003,"dhiru@mail.com",9604508795L);

        Assertions.assertTrue((contactArrayList).equals(contactList.getContactList()));
    }

    @Test
    public void givenContactArrayListShouldMatchAddressBookSize(){
        Contacts contactList = new Contacts();

        contactList.addContact("Dhiraj","Rathod","Savedi","Anagar","Maha",414003,"dhiru@mail.com",9604508795L);
        contactList.addContact("Suraj","Rathod","Savedi","Anagar","Maha",414003,"dhiru@mail.com",9604508795L);


        Assertions.assertEquals(2,contactList.getContactList().size());
    }
}
