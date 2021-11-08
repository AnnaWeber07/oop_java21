package annachiriciuc;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;
import java.util.*;

public class Organization {

    public class Person {
        private String title;
        protected String givenName;
        protected String middleName;
        protected String familyName;

        class FullName {
            String name = givenName + " " + middleName + " " + familyName;
        }

        private FullName name;

        private Date birthDate;

        enum Gender {
            Male,
            Female
        }

        private Gender gender;

        class Address {
            String address;
        }

        private Address homeAddress;

        class Phone {
            String phone;
        }

        private Phone phone;

        ArrayList<Hospital> hospitals;
    }

    public class Patient extends Person {
        ArrayList<OperationsStaff> operationsStaffs;

        private String id;

        class History {
            String history;
        }

        private int age;
        private Date accepted;
        private History sickness;

        private String[] prescriptions;
        private String[] allergies;
        private String[] specialReqs;
    }

    public class Hospital {
        private String id;
        private Person.Address address;
        private Person.Phone phone;

        ArrayList<Department> departments;
        ArrayList<Person> people;
    }

    public class Department {
        ArrayList<Staff> staff;
    }

    public class Staff {
        private Date joined;
        private String[] education;
        private String[] languages;
    }

    public class OperationsStaff extends Staff {
        ArrayList<Patient> patients;

    }

    public class Doctor extends OperationsStaff {
        private String[] specialty;
        private String[] locations;
    }

    public class Nurse extends OperationsStaff {

    }

    public class Surgeon extends Doctor {
    }

    public class AdministrativeStaff extends Staff {
    }

    public class FrontDeskStaff extends AdministrativeStaff {

    }

    public class Receptionist extends FrontDeskStaff {
    }

    public class TechnicalStaff extends Staff {

    }

    public class Technician extends TechnicalStaff {

    }

    public class Technologist extends TechnicalStaff {

    }

    public class SurgicalTechnologist extends Technologist {

    }
}
