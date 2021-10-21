public class Contact{

    private String firstname;
    private String lastName;
    private String Company;
    private String phoneNumber;
    private String email;
    private String city;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private Contact(){}

    private Contact(String firstname, String lastName, String company, String phoneNumber, String email, String city) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.Company = company;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
    }

    public static Contact createContact(String firstname, String lastName, String company, String phoneNumber, String email, String city) {

        Contact contact = new Contact();
        contact.setFirstname(firstname);
        contact.setLastName(lastName);
        contact.setCompany(company);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
        contact.setCity(city);


        return contact;
    }

    /*
  done  1-  Create the Private instance variables
    firstName, lastName, Company, phoneNumber, emails, city
   done 2- Create getters and setter for this variables
   done 3- Create the constructor to initialize your instance variables and constructor must be private
    4- Create one method to instantiate object of contact,
    otherwise since constructor is private you can not instantiate
     */



}
