package info.inheritance;

public class Person {

	private String firstName;
	private String lastName;
	private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}

	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName);
		System.out.println("ID: " + idNumber);
	}

}
