package com.blz.collections.addressbook;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class AddressBook
{
	static Scanner sc = new Scanner(System.in);
	static List<Person> l = new LinkedList<Person>();

	public static void addContact()
	{
		System.out.println("Enter your firstName : ");
			String firstName = sc.nextLine();
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i).getFirstName().equalsIgnoreCase(firstName))
			{
				System.out.println("Name already exists. Try another name");
				addPerson();
				break;
			}
		}
		System.out.println("Enter your lastName : ");
			String lastName = sc.nextLine();
		System.out.println("Enter your address : ");
			String address = sc.nextLine();
		System.out.println("Enter your city : ");
			String city = sc.nextLine();
		System.out.println("Enter your state : ");
			String state = sc.nextLine();
		System.out.println("Enter your zipCode : ");
			String zip = sc.nextLine();
		System.out.println("Enter your phoneNo : ");
			String phoneNo = sc.nextLine();
		System.out.println("Enter your emailId : ");
			String email = sc.nextLine();
		Person obj = new Person(firstName, lastName, address, city, state, zip, phoneNo, email);
		l.add(obj);
	}
	
	public static void editContact()
	{
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i).getFirstName().equalsIgnoreCase(firstName))
			{
				l.remove(i);
				addContact();
			} 
			else {
				System.out.println("No data found in Address Book");
			}
		}
	}
	
	public static void deleteContact()
	{
		System.out.println("Enter first name : ");
		String firstName = sc.nextLine();
		for (int i = 0; i < l.size(); i++)
		{
			if (l.get(i).getFirstName().equalsIgnoreCase(firstName))
			{
				l.remove(i);
			}
			else {
				System.out.println("No data found");
			}
		}
	}
	
	public static void addPerson()
	{
		System.out.println("Enter number of persons to add to Address Book: ");
		int noOfPersons = sc.nextInt();
		int count = 1;
		while(count <= noOfPersons)
		{
			addContact();
			count++;
		}
	}
	
	public void searchByCity()
	{
		System.out.println("Enter city name");
		String city = sc.nextLine();
		for (Person list : l)
		{
			if ( list.getCity().equals(city))
				System.out.println(list);
		}
	}
	
	public void viewByCity()
	{
		System.out.println("Enter city name");
		String city = sc.nextLine();
		for (Person list : l)
		{
			if (list.getCity().equals(city))
				System.out.println(list);
		}
	}
	
	public void countBasedOnCity()
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name : ");
		String city = sc.nextLine();
		sc.close();
		for (Person list : l)
		{
			if (list.getCity().equals(city)) {
				count++;
				System.out.println(list);

			}
		}
		System.out.println("TotalNo : " + count);
	}

	public static void main(String[] args)
	{
		AddressBook a = new AddressBook();
		System.out.println("Welcome to Address Book Program");
		addPerson();
		a.countBasedOnCity();
	}

}
