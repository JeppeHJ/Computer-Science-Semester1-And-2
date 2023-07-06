package Opgaver.Opgave3.storage;

import Opgaver.Opgave3.application.model.Company;
import Opgaver.Opgave3.application.model.Employee;

import java.util.ArrayList;

public class Storage {
	// En statisk variabel til at gemme den eneste instans af Storage-klassen
	static Storage uniqueInstance;

	// Den private constructor sikrer, at Storage-klassen ikke kan instantieres direkte
	private Storage() {

	}

	/**
	 * Returnerer den eneste instans af Storage-klassen (Singleton mønster).
	 * Hvis uniqueInstance er null, oprettes en ny instans.
	 * Hvis uniqueInstance ikke er null, returneres den eksisterende instans.
	 */
	public static Storage getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Storage();
		}
		return uniqueInstance;
	}

	// En liste til at gemme virksomheder
	private ArrayList<Company> companies = new ArrayList<>();

	// En liste til at gemme medarbejdere
	private ArrayList<Employee> employees = new ArrayList<>();

	// -------------------------------------------------------------------------

	/**
	 * Returnerer en kopi af listen over virksomheder.
	 */
	public ArrayList<Company> getCompanies() {
		return new ArrayList<Company>(companies);
	}

	/**
	 * Tilføjer en virksomhed til listen af virksomheder.
	 */
	public void addCompany(Company company) {
		companies.add(company);
	}

	/**
	 * Fjerner en virksomhed fra listen af virksomheder.
	 */
	public void removeCompany(Company company) {
		companies.remove(company);
	}

	// -------------------------------------------------------------------------

	/**
	 * Returnerer en kopi af listen over medarbejdere.
	 */
	public ArrayList<Employee> getEmployees() {
		return new ArrayList<Employee>(employees);
	}

	/**
	 * Tilføjer en medarbejder til listen af medarbejdere.
	 */
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	/**
	 * Fjerner en medarbejder fra listen af medarbejdere.
	 */
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	// -------------------------------------------------------------------------
}
