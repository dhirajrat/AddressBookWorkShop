import java.util.Objects;
import java.util.regex.Pattern;

public class Contact {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String pNum;
    private String email;

    /**
     *
     * @param firstName
     * @param lastName
     * @param city
     * @param state
     * @param pNum
     * @param email
     */

    public Contact(String firstName, String lastName, String city, String state, String pNum, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.pNum = pNum;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getpNum() {
        return pNum;
    }

    public void setpNum(String pNum) {
        this.pNum = pNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * To String
     * @return
     */
    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pNum='" + pNum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * Equals Method
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return firstName.equals(contact.firstName) && lastName.equals(contact.lastName) && city.equals(contact.city) && state.equals(contact.state) && pNum.equals(contact.pNum) && email.equals(contact.email);
    }

    /**
     * Hashcode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, city, state, pNum, email);
    }
}
