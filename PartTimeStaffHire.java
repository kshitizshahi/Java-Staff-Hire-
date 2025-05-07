/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author Kshitiz Bikram Shahi
 * @version 2020/01/05
 */
// Creating another child class PartTimeStaffHire of parent class StaffHire.
// declaring instance variable of class PartTimeStaffHire.
public class PartTimeStaffHire extends StaffHire{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;

    // Creating constructor of the class PartTimeStaffHire that assigns value.
    // Parent class StaffHire gets called by super keyword that invoke its constructor.
    PartTimeStaffHire(int vacancyNumber,String designation,String jobType,int workingHour,int wagesPerHour,String shifts){
        super(vacancyNumber,designation,jobType);
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
        terminated=false;

    }

    // creating getter methods that retrieves and return value of instance variable.
    public int getWorkingHour(){
        return this.workingHour;
    }

    public int getWagesPerHour(){
        return this.wagesPerHour;
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

    public String getShifts(){
        return this.shifts;
    }

    public boolean getJoined(){
        return this.joined;
    }

    public boolean getTerminated(){
        return this.terminated;
    }

    // creating a setter method that updates the value of shifts.
    public void setShifts(String shifts){
        if (joined){
            System.out.println("Sorry your request to change the shift cannot be fulfilled");
        }else{
            this.shifts=shifts;
        }
    }

    // Creating a method which checks whether the part-time staff is appointed or not.
    public void hirePartTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
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
            terminated=false;
        }
    }

    // Creating a method which checks whether the part-time staff is terminated or not.
    public void terminate(){
        if (terminated){
            System.out.println("-----------------------------------------------------------");
            System.out.println(staffName+" has already been terminated from the job");
            System.out.println("-----------------------------------------------------------");
        }else{
            staffName="";
            joiningDate="";
            qualification="";
            appointedBy="";
            joined=false;
            terminated=true;
        }
    }

    // creating a method named display for printing out values.
    public void display(){
        super.display();
        if (joined){
            int incomePerDay=wagesPerHour * workingHour;
            System.out.println("\t\tPartTime Staff's Details\n");
            System.out.println("---------------------------------------------------");
            System.out.println("Staff's Full Name: "+staffName);
            System.out.println("Wages Per Hour:Rs "+wagesPerHour);
            System.out.println("Working Hour(per day): "+workingHour+"hrs");
            System.out.println("Joined on: "+joiningDate);
            System.out.println("Shift: "+shifts);
            System.out.println("Qualification: "+qualification);
            System.out.println("Appointed by: "+appointedBy); 
            System.out.println("Income Per Day:Rs "+incomePerDay);
            System.out.println("---------------------------------------------------");
        }else{
            System.out.println("-------------------------------------------------------");
            System.out.println("For this vacancy no any staff has been appointed yet");
            System.out.println("-------------------------------------------------------");
        }
    }
}

