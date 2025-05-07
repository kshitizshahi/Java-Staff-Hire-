/**
 * Write a description of class StaffHire here.
 *
 * @author Kshitiz Bikram Shahi
 * @version 2020/01/05
 */

// Creating a parent class StaffHire that has three attributes and declaring them.
// accessModifier(private) set that allows only class StaffHire to access its attributes.
public class StaffHire{                   
    private int vacancyNumber;            
    private String designation; 
    private String jobType;

    // creating constructor which assigns value for three attribute (vacancyNumber,designation,jobType).
    public StaffHire(int vacancyNumber,String designation,String jobType){           
        this.vacancyNumber=vacancyNumber;                                           
        this.designation=designation;                                 
        this.jobType=jobType;                                                         

    }

    // creating getter methods for attributes of StaffHire that retrieves and returns the value of instance variable. 
    // And setter methods that updates value of instance variable.
    public int getVacancyNumber(){                                                                                                 
        return vacancyNumber;
    }

    public void setVacancyNumber(int vacancyNumber){                                 
        this.vacancyNumber=vacancyNumber;
    }

    public String getDesignation(){
        return designation;
    }

    public void setDesignation(String designation){
        this.designation=designation;
    }

    public String getJobType(){
        return jobType;
    }

    public void setJobType(String jobType){
        this.jobType=jobType;
    }

    // creating a method named display for printing out values.
    public void display(){
        System.out.println("\t\tStaff's Details\n");
        System.out.println("---------------------------------------------------");
        System.out.println("Vacancy Number: "+getVacancyNumber());
        System.out.println("Designation: " + getDesignation());
        System.out.println("Job Type: " +getJobType());
        System.out.println("---------------------------------------------------");

    }

}