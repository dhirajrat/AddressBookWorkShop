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
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.email = email;
        this.mobNumber = mobNumber;
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
        this.firstName = firstName;
    }

    /**
     * Get Last Name
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(long mobNumber) {
        this.mobNumber = mobNumber;
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
}
