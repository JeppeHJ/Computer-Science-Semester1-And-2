package Opgaver.Opgave1;

public class Kunde implements Comparable<Kunde> {
	private String lastName;
	private String firstName;
	private int age;
	
	public Kunde(String lastName, String firstName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	@Override
    public int compareTo(Kunde customer) {
		int comp = lastName.compareTo(customer.getLastName());
		if (comp == 0) {
			comp = firstName.compareTo(customer.getFirstName());
			if (comp==0) {
				comp = age-customer.getAge();
			}
		}
		return comp;
	}

	public int getAge() {
		return age;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	@Override
    public String toString(){
		return lastName + " " + firstName + " " + age;
	}
}
