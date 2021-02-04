import java.util.Scanner;

public class AddressBookMain {
    public String first_Name, last_Name, address, city, state, email_Id;
    public String zip_Code, phone_Number;
    public AddressBookMain(String first_Name,String last_Name,String address,String city,String state, String zip_Code, String phone_Number, String email_Id) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip_Code = zip_Code;
        this.phone_Number = phone_Number;
        this.email_Id = email_Id;

    }

    public void displayContacts() {

        System.out.println("First Name: " + first_Name);
        System.out.println("Last Name: " + last_Name);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zip_Code);
        System.out.println("Phone Number: " + phone_Number);
        System.out.println("Email Id: " + email_Id);
    }



    public static void main(String[] args) throws NullPointerException {
        int i = 0,choice,max_Num_Contacts,value;

        String first_Name, last_Name, address, city, state, email_Id;
        String zip_Code, phone_Number;

        Scanner scanner = new Scanner(System.in);
        AddressBookSubClass addressBookSubClass = new AddressBookSubClass();

        System.out.println("ENTER THE MAXIMUM NUMBER OF CONTACTS");
        max_Num_Contacts = scanner.nextInt();

        AddressBookMain[] addressBookMainArray = new AddressBookMain[max_Num_Contacts];
        do {
            System.out.println("Enter the contact details");
            System.out.println("                         ");
            System.out.println("enter the first name");
            first_Name = scanner.next();

            System.out.println("enter the last name");
            last_Name = scanner.next();

            System.out.println("enter the address");
            address = scanner.next();

            System.out.println("enter the city");
            city = scanner.next();

            System.out.println("enter the state");
            state = scanner.next();

            System.out.println("enter the zip code");
            zip_Code = scanner.next();

            System.out.println("enter the phone number");
            phone_Number = scanner.next();

            System.out.println("enter the email id");
            email_Id = scanner.next();
            addressBookMainArray[i] = new AddressBookMain(first_Name, last_Name, address, city, state, zip_Code, phone_Number, email_Id);
            System.out.println("ENTER 0 FOR ADDING CONTACT AND 1 TO EXIT");
            choice = scanner.nextInt();
            i++;
            if (i >= max_Num_Contacts) {
                System.out.println("NO SPACE TO ENTER ANOTHER CONTACT");
                choice = 1;
            }
        } while (choice != 1);
        if (i > max_Num_Contacts) {
            System.out.println("NO SPACE TO ENTER ANOTHER CONTACT");
        }
        System.out.println("ENTER THE CHOICE \n 1: TO DISPLAY CONTACT DETAILS\n 2: TO EDIT CONTACT DETAILS\n 3:TO DELETE A CONTACT\n4:TO EXIT");
        value = scanner.nextInt();

        switch (value) {
            case 1:
                for (int j = 0; j < i; j++) {
                    System.out.println("                                 ");
                    System.out.println("CONTACT " + (j + 1) + " DETAILS ARE:");
                    addressBookMainArray[j].displayContacts();
                }
                break;
            case 2:
                if(i>0) {

                    System.out.println("ENTER THE NAME OF CONTACT TO EDIT");
                    String first_name = scanner.next();
                    addressBookSubClass.editContactDetails(first_name,addressBookMainArray);
                    break;
                } else {
                    System.out.println("NO CONTACTS AVAILABLE TO EDIT");
                    break;
                }
            case 3:
                if(i>0) {

                    System.out.println("ENTER THE NAME OF CONTACT TO DELETE");
                    String first_name = scanner.next();
                    addressBookSubClass.deleteContactDetails(first_name,addressBookMainArray);
                    break;
                } else {
                    System.out.println("NO CONTACTS AVAILABLE TO DELETE");
                    break;
                }
            case 4:
                break;
        }
    }
}
