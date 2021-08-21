import java.util.Objects;
import java.util.regex.Pattern;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private long pinCode;
    private String email;
    private long mobNumber;

    /**
     * Construct A Contact
     * @param firstName
     * @param lastName
     * @param address
     * @param city
     * @param state
     * @param pinCode
     * @param email
     * @param mobNumber
     */
    public Contact(String firstName, String lastName, String address, String city, String state, long pinCode, String email, long mobNumber) {
        RegexValidator firstnameValidate = (fname) -> { return Pattern.matches("^[A-Z][a-z]{2,}",fname);};
        boolean firstnamevalidation = firstnameValidate.validator(firstName);
        if(firstnamevalidation){ this.firstName = firstName;

            RegexValidator lastNameValidate = (fname) -> { return Pattern.matches("^[A-Z][a-z]{2,}",fname);};
            boolean lastnamevalidation = lastNameValidate.validator(lastName);
            if(lastnamevalidation){ this.lastName = lastName;

                this.address = address;
                this.city = city;
                this.state = state;
                this.pinCode = pinCode;

                RegexValidator emailValidate = (fname) -> { return Pattern.matches("^[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]{2}+)*$",fname);};
                boolean emailvalidation = emailValidate.validator(email);
                if(emailvalidation){ this.email = email;

                    this.mobNumber = mobNumber;

                }

                else { System.out.println("Invalid Input"); }
            }

            else { System.out.println("Invalid Input"); }
        }

        else { System.out.println("Invalid Input"); }

    }

    /**
     * Get First Name
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set First Name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        RegexValidator firstnameValidate = (fname) -> { return Pattern.matches("^[A-Z][a-z]{2,}",fname);};
        boolean validation = firstnameValidate.validator(firstName);
        if(validation){ this.firstName = firstName; }
        else { System.out.println("Invalid Input"); }
    }

    /**
     * Get Last Name
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name set
     * @param lastName
     */
    public void setLastName(String lastName) {
        RegexValidator lastNameValidate = (fname) -> { return Pattern.matches("^[A-Z][a-z]{2,}",fname);};
        boolean validation = lastNameValidate.validator(lastName);
        if(validation){ this.lastName = lastName; }
        else { System.out.println("Invalid Input"); }
    }

    /**
     * get Address
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * set Address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get City
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * Set City
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * get State
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * set State
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * get Pin code
     * @return
     */
    public long getPinCode() {
        return pinCode;
    }

    /**
     * set Pin Code
     * @param pinCode
     */
    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    /**
     * get Mail
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set String
     * @param email
     */
    public void setEmail(String email) {
        RegexValidator emailValidate = (fname) -> { return Pattern.matches("^[A-Z][a-z]{2,}",fname);};
        boolean emailvalidation = emailValidate.validator(email);
        if(emailvalidation){ this.email = email; }
        else {
            try {
                throw new AddressBookException("Invalid Input");
            } catch (AddressBookException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * get Mob Number
     * @return
     */
    public long getMobNumber() {
        return mobNumber;
    }

    /**
     * set Mobile Number
     * @param mobNumber
     */
    public void setMobNumber(long mobNumber) {
        this.mobNumber=mobNumber;
    }

    /**
     * To string
     * @return
     */
    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", email='" + email + '\'' +
                ", mobNumber=" + mobNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return pinCode == contact.pinCode && mobNumber == contact.mobNumber && firstName.equals(contact.firstName) && lastName.equals(contact.lastName) && address.equals(contact.address) && city.equals(contact.city) && state.equals(contact.state) && email.equals(contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address, city, state, pinCode, email, mobNumber);
    }
}
