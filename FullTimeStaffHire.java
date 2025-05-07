/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author Kshitiz Bikram Shahi
 * @version 2020/01/05
 */
// Creating a child class FullTimeStaffHire that extends parent class StaffHire.
// declaring instance variable of class FulltimeStaffHire.
public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    /* 
     * Creating constructor of the class FullTimeStaffHire that assigns value.
     * Parent class StaffHire gets called by super keyword that invoke its constructor.
     * Constructor's local variable assigns value to instance variable of class FullTimeStaffHire.
     * this keyword is used to represent instance variable.
     */ 
    FullTimeStaffHire(int vacancyNumber,String designation,String jobType,int salary,int workingHour){
        super(vacancyNumber,designation,jobType);
        this.salary=salary;
        this.workingHour=workingHour;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;

    }

    // creating getter methods that retrieves and returns value of instance variable.
    public int getSalary(){
        return this.salary;
    }

    public int getWorkingHour(){
        return this.workingHour;
    }

    public String getStaffName(){
        return this.staffName;
    }

    public String getJoiningDate(){
        return this.joiningDate;
    }

    public String getQualification(){
        return this.qualification;
    }

    public String getAppointedBy(){
        return this.appointedBy;
    }

    public boolean getJoined(){
        return this.joined;
    }

    // creating a setter method that updates the value of salary.
    public void setSalary(int salary){
        if (joined){
            System.out.println("Sorry your request to change the salary is not possible");
        }else{
            this.salary=salary;
        }
    }

    // creating a setter method that sets the value for workingHour.
    public void setWorkingHour(int workingHour){
        this.workingHour=workingHour;
    }

    // Creating a method which checks whether the full-time staff is appointed or not.
    public void hireFullTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
        if (joined){
            System.out.println("The staff has already been appointed for the job\n");
            System.out.println("---------------------------------------");
            System.out.println("Staff's Full Name: "+this.staffName);
            System.out.println("Joined on: "+this.joiningDate);
            System.out.println("---------------------------------------");
        }else{
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
        }
    }

    // creating a method named display for printing out values.
    public void display(){
        super.display();
        if (joined){
            System.out.println("\t\tFull time Staff's Details\n");
            System.out.println("---------------------------------------------------");
            System.out.println("Staff's Full Name: "+staffName);
            System.out.println("Salary:Rs "+salary);
            System.out.println("Working Hour(per day): "+workingHour+"hrs");
            System.out.println("Joined on: "+joiningDate);
            System.out.println("Qualification: "+qualification);
            System.out.println("Appointed by: "+appointedBy);   
            System.out.println("---------------------------------------------------");
        }else{
            System.out.println("------------------------------------------------------");
            System.out.println("For this vacancy no any staff has been appointed yet");
            System.out.println("------------------------------------------------------");
        }
    }
}