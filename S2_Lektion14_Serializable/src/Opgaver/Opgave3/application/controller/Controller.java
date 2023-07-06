package Opgaver.Opgave3.application.controller;

import Materiale.eksempelpersist.Person;
import Opgaver.Opgave3.application.model.Company;
import Opgaver.Opgave3.application.model.Employee;
import Opgaver.Opgave3.storage.Storage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    static Controller uniqueInstance;
    static Storage storage;

    private Controller() {
        // Initialisering af Storage-objektet ved hjælp af Singleton
        storage = Storage.getInstance();
    }

    public static Controller getInstance() {
        if (uniqueInstance == null) {
            // Opretter en enkelt forekomst af Controller-objektet, hvis den ikke allerede findes
            uniqueInstance = new Controller();
        }
        return uniqueInstance;
    }

    /**
     * Opretter en ny virksomhed.
     * Kræver: hours >= 0.
     */
    public Company createCompany(String name, int hours) {
        // Oprettelse af en ny Company-forekomst
        Company company = new Company(name, hours);
        // Tilføjelse af virksomheden til opbevaringen
        storage.addCompany(company);
        return company;
    }

    /**
     * Sletter virksomheden.
     * Kræver: Virksomheden har ingen medarbejdere.
     */
    public void deleteCompany(Company company) {
        // Fjernelse af virksomheden fra opbevaringen
        storage.removeCompany(company);
    }

    /**
     * Opdaterer virksomheden.
     * Kræver: hours >= 0.
     */
    public void updateCompany(Company company, String name, int hours) {
        // Opdatering af virksomhedens navn og timer
        company.setName(name);
        company.setHours(hours);
    }

    /**
     * Hent alle virksomhederne.
     */
    public ArrayList<Company> getCompanies() {
        // Returnerer en kopi af virksomhedslisten fra opbevaringen
        return storage.getCompanies();
    }

    // -------------------------------------------------------------------------

    /**
     * Opretter en ny medarbejder.
     * Kræver: wage >= 0.
     */
    public Employee createEmployee(String name, int wage) {
        // Oprettelse af en ny Employee-forekomst
        Employee employee = new Employee(name, wage);
        // Tilføjelse af medarbejderen til opbevaringen
        storage.addEmployee(employee);
        return employee;
    }

    /**
     * Opretter en ny medarbejder.
     * Kræver: wage >= 0, company!=null.
     */
    public Employee createEmployee(String name, int wage, Company company) {
        // Oprettelse af en ny Employee-forekomst ved hjælp af den tidligere metode
        Employee employee = createEmployee(name, wage);
        // Tilføjelse af medarbejderen til virksomheden
        company.addEmployee(employee);
        return employee;
    }

    /**
     * Sletter medarbejderen.
     */
    public void deleteEmployee(Employee employee) {
        // Hentning af den virksomhed, som medarbejderen tilhører
        Company company = employee.getCompany();
        if (company != null) {
            // Fjernelse af medarbejderen fra virksomheden
            company.removeEmployee(employee);
        }
        // Fjernelse af medarbejderen fra opbevaringen
        storage.removeEmployee(employee);
    }

    /**
     * Opdaterer medarbejderen.
     * Kræver: wage >= 0.
     */
    public void updateEmployee(Employee employee, String name, int wage) {
        // Opdatering af medarbejderens navn og løn
        employee.setName(name);
        employee.setWage(wage);
    }

    /**
     * Tilføjer medarbejderen til virksomheden. Fjerner medarbejderen fra den gamle virksomhed, hvis den er til stede.
     */
    public void addEmployeeToCompany(Employee employee, Company company) {
        // Tilføjelse af medarbejderen til virksomheden
        company.addEmployee(employee);
    }

    /**
     * Fjerner medarbejderen fra den gamle virksomhed, hvis den ikke er null.
     * @param company Den gamle virksomhed. Kan være null.
     * @param employee Medarbejderen der skal fjernes.
     */
    public void removeEmployeeFromCompany(Employee employee, Company company) {
        if (company != null) {
            // Fjernelse af medarbejderen fra den gamle virksomhed
            company.removeEmployee(employee);
        }
    }

    /**
     * Hent alle medarbejderne.
     */
    public ArrayList<Employee> getEmployees() {
        // Returnerer en kopi af medarbejderlisten fra opbevaringen
        return storage.getEmployees();
    }

    // -------------------------------------------------------------------------

    /**
     * Initialiserer opbevaringen med nogle objekter.
     * Denne metode indlæser tidligere serialiserede objekter fra en fil og tilføjer dem til opbevaringen.
     * Den serialiserer også de nuværende objekter i opbevaringen og gemmer dem i filen.
     */
    public void initStorage() {
        List<Company> companies = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();

        // Indlæsning af objekter fra filen
        try (FileInputStream f_in = new FileInputStream("applikation.ser")) {
            try (ObjectInputStream obj_in = new ObjectInputStream(f_in)) {
                Object obj;
                while ((obj = obj_in.readObject()) != null) {
                    if (obj instanceof Company) {
                        // Tilføjelse af indlæste virksomheder til listen
                        companies.add((Company) obj);
                    }
                    if (obj instanceof Employee) {
                        // Tilføjelse af indlæste medarbejdere til listen
                        employees.add((Employee) obj);
                    }
                }
            } catch (EOFException e) {
                // Nåede slutningen af filen, fortsæt eksekvering
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Tilføjelse af indlæste virksomheder og medarbejdere til opbevaringen
        for (Company company : companies) {
            storage.addCompany(company);
        }
        for (Employee employee : employees) {
            storage.addEmployee(employee);
        }

        // Serialisering og gemning af objekterne i opbevaringen til filen
        try (FileOutputStream f_out = new FileOutputStream("applikation.ser")) {
            try (ObjectOutputStream obj_out = new ObjectOutputStream(f_out)) {
                for (Company company : storage.getCompanies()) {
                    obj_out.writeObject(company);
                }
                for (Employee employee : storage.getEmployees()) {
                    obj_out.writeObject(employee);
                }
            }

            System.out.println("Objekter gemt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void init() {
        // Initialisering af opbevaringen
        uniqueInstance.initStorage();
    }
}
