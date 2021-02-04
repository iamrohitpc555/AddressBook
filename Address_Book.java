import java.util.Scanner;

public class Add_Contact {
    public String first_Name, last_Name, address, city, state, email_Id;
    public String zip_Code, phone_Number;


    public Add_Contact(String first_Name, String last_Name, String address, String city, String state, String zip_Code, String phone_Number, String email_Id) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip_Code = zip_Code;
        this.phone_Number = phone_Number;
        this.email_Id = email_Id;

    }
    public void displayContacts() 
    {

        System.out.println("First Name: " + first_Name);
        System.out.println("Last Name: " + last_Name);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zip_Code);
        System.out.println("Phone Number: " + phone_Number);
        System.out.println("Email Id: " + email_Id);
    }
    
        public static void main(String[] args) 
        {
	        int i = 0,choice,max_Num_Contacts;
	
	        String first_Name, last_Name, address, city, state, email_Id;
	        String zip_Code, phone_Number;
	
	        Scanner scanner = new Scanner(System.in);
	
	        System.out.println("ENTER THE MAXIMUM NUMBER OF CONTACTS");
	        max_Num_Contacts = scanner.nextInt();
	        Add_Contact[] addressBookMainArray = new Add_Contact[max_Num_Contacts];

	        do 
	        {
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
	
	            addressBookMainArray[i] = new Add_Contact(first_Name, last_Name, address, city, state, zip_Code, phone_Number, email_Id);
	            System.out.println("ENTER 0 FOR ADDING CONTACT AND 1 TO EXIT");
	            choice = scanner.nextInt();
	            i++;
        } 
	        
	    while( choice != 1 && i < max_Num_Contacts);

        for (int j = 0; j < i; j++) 
        {
            System.out.println("                                 ");
            System.out.println("CONTACT " + (j+1) + " DETAILS ARE:");
            addressBookMainArray[j].displayContacts();
        }

    }
}
