import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PhoneAppRunner {
    static Scanner scanner = new Scanner(System.in);

  static Phone phone = new Phone("Nokia","5300","QWEERTY","0");

    public static void main(String[] args) {
        phone.fillUpAllContacts();



        welcome();
        printOptions();

        String option;
        /*
        Implement the logic for passcode.
        You need to first ask the user passcode of the phone
        if the user input is not same with phone.passCode then the user
        should not be able to open the phone and see the below options
         */

        do {
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));
        System.out.println("Thank you for working with us");
    }
    private static void makeAChoice(String choice) {
        Scanner input = new Scanner(System.in);
        switch (choice) {

            case "1":

                phone.addNewContact();
                System.out.println("Request successfully completed");
                break;
            case "2":

                phone.printAllContactsFirstLastPhoneNum();
                System.out.println("Request successfully completed");
                break;
            case "3":

                System.out.println("Please enter phoneNumber");
                scanner.nextLine();
                String oldPhone = scanner.nextLine();

                System.out.println("Please enter newPhoneNumber");
                String newPhone = scanner.nextLine();

                phone.updatePhoneNumberByOldPhoneNumber(oldPhone,newPhone);
                System.out.println("Request successfully completed");
                break;
            case "4":
                System.out.println("Please enter phoneNumber");
                scanner.nextLine();
                phone.searchInfoByPhone(scanner.nextLine());
                System.out.println("Request successfully completed");

                break;
            case "5":
                System.out.println("Please enter Name");scanner.nextLine();
                phone.searchWithNameForPhoneNum(scanner.nextLine());
                System.out.println("Request successfully completed");
                break;
            case "6":
                System.out.println("Please enter phoneNumber");scanner.nextLine();
                String phoneUs = scanner.nextLine();
                System.out.println("Please enter email");
                String emailUs = scanner.nextLine();
                phone.updateCitybyPhoneEmail(phoneUs,emailUs );
                System.out.println("Request successfully completed");
                break;
            case "7":
                System.out.println("Please enter Email");scanner.nextLine();
                String oldEmail = scanner.nextLine();
                System.out.println("Please enter new Email");
                String NewEmail = scanner.nextLine();
                phone.updateEmailByOldEmail(oldEmail,NewEmail);
                System.out.println("Request successfully completed");
                break;

            case "9":

                printOptions();
                break;
        }


    }

    public static void welcome() {

        System.out.println("Welcome to the Phone Application");
    }

    public static void printOptions() {

        System.out.println("Hello. Please choose on of the following options"); // passed
        System.out.println("1 - For new Contact"); // passed
        System.out.println("2 - To print all Contacts' Full Name  and Phone Number");//passed
        System.out.println("3 - Update Contact Phone number");
        System.out.println("4 - Find Person information with Phone Number");
        System.out.println("5 - Find Phone number with Contact Name");
        System.out.println("6 - Update City information for Contact");
        System.out.println("7 - Update Email address information for Contact");
        System.out.println("9 - Go back to main menu");
        System.out.println("0 - To exit");
    }

    public static void exitOrMenu(int opt) {



    }
}
