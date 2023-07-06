package Opgaver.Opgave2.application.controller;

import Opgaver.Opgave2.application.model.Company;
import Opgaver.Opgave2.application.model.Customer;
import Opgaver.Opgave2.application.model.Employee;
import Opgaver.Opgave2.storage.Storage;

import java.util.ArrayList;

public class Controller {
    /**
     * Creates a new Company.<br />
     * Requires: hours >= 0.
     */
    public static Company createCompany(String name, int hours) {
        Company company = new Company(name, hours);
        Storage.addCompany(company);
        return company;
    }

    /**
     * Deletes the company.<br />
     * Requires: The company has no employees.
     */
    public static void deleteCompany(Company company) {
        Storage.removeCompany(company);
    }

    /**
     * Updates the company.<br />
     * Requires: hours >= 0.
     */
    public static void updateCompany(Company company, String name, int hours) {
        company.setName(name);
        company.setHours(hours);
    }

    /**
     * Get all the companies
     */
    public static ArrayList<Company> getCompanies() {
        return Storage.getCompanies();
    }

    // -------------------------------------------------------------------------

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0.
     */
    public static Employee createEmployee(String name, int wage, int employmentYear) {
        Employee employee = new Employee(name, wage, employmentYear);
        Storage.addEmployee(employee);
        return employee;
    }

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0, company!=null.
     */
    public static Employee createEmployee(String name, int wage, int employmentYear, Company company) {
        Employee employee = createEmployee(name, wage, employmentYear);
        company.addEmployee(employee);
        return employee;
    }

    /**
     * Deletes the employee.
     */
    public static void deleteEmployee(Employee employee) {
        Company company = employee.getCompany();
        if (company != null) {
            company.removeEmployee(employee);
        }
        Storage.removeEmployee(employee);
    }

    /**
     * Updates the employee.<br />
     * Requires: wage >= 0.
     */
    public static void updateEmployee(Employee employee, String name, int wage) {
        employee.setName(name);
        employee.setWage(wage);
    }
    
    /**
     * Adds the employee to the company. Removes the employee from the old company if present.
     */
    public static void addEmployeeToCompany(Employee employee, Company company) {
        company.addEmployee(employee);
    }
    
    /**
     * Removes the employee from the old company if not null.
     * @param company The old company. Can be null.
     * @param employee The employee to remove.
     */
    public static void removeEmployeeFromCompany(Employee employee, Company company) {
        if (company != null) {
            company.removeEmployee(employee);            
        }
    }

    /**
     * Get all the employees.
     */
    public static ArrayList<Employee> getEmployees() {
        return Storage.getEmployees();
    }

    // -------------------------------------------------------------------------

    public static Customer createCustomer(String name) {
        Customer customer = new Customer(name);
        return customer;
    }

    public static void addCustomerToCompany(Customer customer, Company company) {
        if (!company.getCustomers().contains(customer)) {
            company.addCustomer(customer);
        }
    }

    public static void removeCustomerFromCompany(Customer customer, Company company) {
        if (company.getCustomers().contains(customer)) {
            company.removeCustomer(customer);
        }
    }

    /**
     * Initializes the storage with some objects.
     */
    public static void initStorage() {
        Company c1 = Controller.createCompany("IBM", 37);
        Company c2 = Controller.createCompany("AMD", 40);
        Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);

        Customer cu1 = Controller.createCustomer("Jens");
        Customer cu2 = Controller.createCustomer("LArs");
        Customer cu3 = Controller.createCustomer("Jens2");
        Customer cu4 = Controller.createCustomer("Jens3");
        Customer cu5 = Controller.createCustomer("Jens4");

        c1.addCustomer(cu1);
        c1.addCustomer(cu2);
        c1.addCustomer(cu3);
        c2.addCustomer(cu2);
        c2.addCustomer(cu3);


        Controller.createEmployee("Bob Dole", 210, 1990, c2);
        Controller.createEmployee("Alice Schmidt", 250, 1991, c1);
        Controller.createEmployee("George Down", 150, 1994, c2);

        Controller.createEmployee("Rita Uphill", 300, 1992);
    }

    public static void init() {

        initStorage();

    }

}
