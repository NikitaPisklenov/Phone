public class Test {

    public static void main(String[] args) {

        Phone phone1 = new Phone("1","1","1","1");
        System.out.println(phone1.allContacts);
      // phone1.allContacts.add(Contact.createContact());

        phone1.fillUpAllContacts();
        phone1.printAllContactsFirstLastPhoneNum();

        phone1.updatePhoneNumberByOldPhoneNumber("testPhone1","YESSSuckIT");

        phone1.printAllContactsFirstLastPhoneNum();


        phone1.searchInfoByPhone("testPhone4");

        phone1.updateCitybyPhoneEmail("testPhone4","tesstEmail4");




        phone1.updateEmailByOldEmail("tesstEmail4","ASSEEEWR");
        phone1.searchInfoByPhone("testPhone4");








    }

}
