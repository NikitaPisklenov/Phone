import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Phone {

    String phoneBrand;
    String phoneModel;
    String SerialNumber;
    String passCode;
    ArrayList<Contact> allContacts;

    Scanner scan = new Scanner(System.in);


    public Phone(String phoneBrand, String phoneModel, String serialNumber, String passCode) {
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
        this.SerialNumber = serialNumber;
        this.passCode = passCode;
        this.allContacts = new ArrayList<>();
    }

    public void addNewContact() {

        System.out.println("Provide all info");
        System.out.println("Type in FirstName");
        String firstname = scan.nextLine();
        System.out.println("Type in LastName");
        String lastName = scan.nextLine();
        System.out.println("Type in Compay");
        String Company = scan.nextLine();
        System.out.println("Type in phoneNum");
        String phoneNumber = scan.nextLine();
        System.out.println("Type in email");
        String email = scan.nextLine();
        System.out.println("Type in city");
        String city = scan.nextLine();

        allContacts.add(Contact.createContact(firstname, lastName, Company, phoneNumber, email, city));

        System.out.println("New Contact created");

    }

    public void printAllContactsFirstLastPhoneNum() {

        for (Contact cnt : this.allContacts) {

            System.out.println(cnt.getFirstname() + " " + cnt.getLastName() + " " + cnt.getPhoneNumber());
        }

    }

    public void updatePhoneNumberByOldPhoneNumber(String oldPhone, String newPhone) {

        for (Contact cnt : allContacts) {

            if (cnt.getPhoneNumber().equalsIgnoreCase(oldPhone)) {

                cnt.setPhoneNumber(newPhone);

            }

        }

    }


    public void searchInfoByPhone(String phoneNumber) {

        for (Contact cnt : allContacts) {

            if (cnt.getPhoneNumber().equalsIgnoreCase(phoneNumber)) {

                System.out.println(cnt.getFirstname());
                System.out.println(cnt.getLastName());
                System.out.println(cnt.getCompany());
                System.out.println(cnt.getEmail());
                System.out.println(cnt.getCity());

            }

        }

    }

    public void searchWithNameForPhoneNum(String Name) {

        for (Contact cnt : allContacts) {

            if (cnt.getFirstname().equalsIgnoreCase(Name) || cnt.getLastName().equalsIgnoreCase(Name)) {

                System.out.println(cnt.getPhoneNumber());
            }

        }

    }

    public void updateCitybyPhoneEmail(String phoneNum, String email) {

        System.out.println("!!");

        boolean isFound = false;

        for (Contact cnt : allContacts) {

            if (cnt.getPhoneNumber().equalsIgnoreCase(phoneNum) && cnt.getEmail().equalsIgnoreCase(email)) {

                isFound = true;
                System.out.println("Please yupe in new city ");
                cnt.setCity(scan.next());

            }
        } if (isFound==false) {
            System.out.println("Contact not found");
        }


    }


    public void updateEmailByOldEmail(String oldEmail, String newEmail) {

        for (Contact cnt: allContacts) {

            if (cnt.getEmail().equalsIgnoreCase(oldEmail)) {

                cnt.setEmail(newEmail);

            }

        }

    }

    ///Method to fillup allcomntactd for test

    public void fillUpAllContacts() {

        for (int i = 0; i < 10; i++) {

            allContacts.add(Contact.createContact("nameTest"+i,"lastnameTest"+i,"testCompany"+i,"testPhone"+i,"tesstEmail"+i,"testCity"+i));

        }

    }


    /*
      done 1- Create instance variables
      done phoneBrand, phoneModel, SerialNumber, passCode and ArrayList<Contact> allContact
      done 2- Create constructor to initialize this variables
       1 Passed Test 3- Create the method to add new contact this method take one ??parameter as Contact
       2 Passed  Test 4- Create the method to print all Contacts' first and last name with phone number
     3 Passed test 5- Create the method to update person's phone number. This method takes two parameter old phone number and new phone number
      Passed test 6- Create the method to search with phone number and print all other information for person
      Passed test 7- create the method to search with name of person and print phone number of person
      Passed test 8- Create the method to update city of person with new city, you need two parameter one is phone number of person another is new email address.
      Passed test 9- Create the method to update email address for person with new email address, you need two parameter oldEmail and newEmail

       ?? In this contact list only two things are unique Phone number and email address. You can not store same phone number and email address two times
       because of that before adding the new contact you need to make sure this phone number is not exist in your Contact arraylist.
     */
}
