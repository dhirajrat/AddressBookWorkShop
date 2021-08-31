import org.junit.Assert;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
public class AddressBookTests {


    @Test
    public void givenContactArrayListShouldMatchAddressBookCreated(){
        ArrayList<Contact> contactArrayList = new ArrayList<>();
        Addressbook contactList = new Addressbook();

        contactArrayList.add(new Contact("Dhiraj","Rathod","Nagar","Maha","9604508795","dhiru@mail.com"));

        contactList.addAContactToAddressbook("Dhiraj","Rathod","Nagar","Maha","9604508795","dhiru@mail.com");

        Assert.assertTrue((contactArrayList).equals(contactList.getAddressbook()));
    }

    @Test
    public void givenContactArrayListShouldMatchAddressBookSize(){
        Addressbook contactList = new Addressbook();

        contactList.addAContactToAddressbook("Dhiraj","Rathod","Nagar","Maha","9604508795","dhiru@mail.com");
        contactList.addAContactToAddressbook("Suraj","Rathod","Nagar","Maha","9604508795","dhiru@mail.com");


        Assert.assertEquals(2,contactList.getAddressbook().size());
    }
}
