import java.util.Scanner;

public class AddressBookMain {
    public String first_Name, last_Name, address, city, state, email_Id;
    public String zip_Code, phone_Number;

    public AddressBookMain(String first_Name, String last_Name, String address, String city, String state, String zip_Code, String phone_Number, String email_Id) {
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
        System.out.println("CONTACT DETAILS ARE:");
        System.out.println("First Name: " + first_Name);
        System.out.println("Last Name: " + last_Name);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zip_Code);
        System.out.println("Phone Number: " + phone_Number);
        System.out.println("Email Id: " + email_Id);
    }
    public static void main(String[] args) {
        String first_Name, last_Name, address, city, state, email_Id;
        String zip_Code, phone_Number;

        Scanner scanner = new Scanner(System.in);
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

        AddressBookMain addressBookMain = new AddressBookMain(first_Name, last_Name, address, city, state, zip_Code, phone_Number, email_Id);
        addressBookMain.displayContacts();

    }
}
