/**
 * Write a description of class INGNepal here.
 *
 * @author Kshitiz Bikram Shahi
 * @version 2020/04/04
 */

//Importing required components from different packages necessary for setting up GUI.
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.awt.Font;

//Initializing components that are to be used making GUI for Staff Appointment.
public class INGNepal implements ActionListener{
    private JFrame frame;
    private JFrame frameF;
    private JFrame frameP;

    private JLabel lblHeader,lblSubHeader,lblVacancyNumber, lblDesignation, lblJobType, lblSalary, lblWorkingHour;
    private JLabel lblVacancyNumberApnt,lblStaffName,lblJoiningDate,lblQualification,lblAppointedBy;

    private JLabel lblHeaderPT,lblSubHeaderPT,lblVacancyNumberPT, lblDesignationPT, lblJobTypePT, lblWorkingHourPT,lblWagesPerHour,lblWorkingShifts;
    private JLabel lblVacancyNumberApntPT,lblStaffNamePT,lblJoiningDatePT,lblQualificationPT,lblAppointedByPT;

    private JTextField tfVacancyNumber,tfDesignation,tfJobType,tfSalary, tfWorkingHour;
    private JTextField tfVacancyNumberApnt,tfStaffName,tfQualification,tfAppointedBy;

    private JTextField tfVacancyNumberPT,tfDesignationPT, tfJobTypePT,tfWorkingHourPT,tfWagesPerHour;
    private JTextField tfVacancyNumberApntPT,tfStaffNamePT,tfQualificationPT,tfAppointedByPT;

    private JComboBox<String> jcYearFT;
    private JComboBox<String> jcMonthFT;
    private JComboBox<String> jcDayFT;

    private JComboBox<String> jcWorkingShifts;
    private JComboBox<String> jcYearPT;
    private JComboBox<String> jcMonthPT;
    private JComboBox<String> jcDayPT;

    private JButton btnFullTimeStaff;
    private JButton btnAddFT;
    private JButton btnAppointFT;
    private JButton btnDisplayFT;
    private JButton btnClearFT;

    private JButton btnPartTimeStaff;
    private JButton btnAddPT;
    private JButton btnAppointPT;
    private JButton btnDisplayPT;
    private JButton btnClearPT;
    private JButton btnTerminate;

    private JButton btnMainDisplay;

    private Font headerFont;
    private Font subHeaderFont;
    private Font labelFont;
    private Font textFieldFont;
    private Font comboBoxFont;
    private Font btnFont;

    //Creating an arraylist of class StaffHire to add objects of its subclasses FullTimeStaffHire and PartTimeStaffHire.
    private ArrayList <StaffHire> employeeList = new ArrayList<StaffHire>();

    //Creating main method
    public static void main(String args[]){
        INGNepal ing = new INGNepal();
        ing.mainGUI();
    }

    //Creating method for mainGUI of Staff Appointment that opens GUI for full time and part time staff appointment.
    public void mainGUI(){
        //setting up frame and fonts for its component. 
        frame = new JFrame("Staff Appointment");
        headerFont = new Font("Calibri",Font.PLAIN,22);
        btnFont = new Font("Ariel",Font.BOLD,14);

        //header for staff appointment GUI
        lblHeader = new JLabel("Staff Appointment");
        frame.add(lblHeader);
        lblHeader.setBounds (280,0,360,65);
        lblHeader.setFont(headerFont);

        //Button for Full-Time Staff GUI
        btnFullTimeStaff= new JButton("Full Time Staff");
        btnFullTimeStaff.setBounds (55,150,150,30);
        frame.add(btnFullTimeStaff);
        btnFullTimeStaff.addActionListener(this);
        btnFullTimeStaff.setFont(btnFont);

        //Button for Part-Time Staff GUI
        btnPartTimeStaff= new JButton("Part Time Staff");
        btnPartTimeStaff.setBounds (285,150,150,30);
        frame.add(btnPartTimeStaff);
        btnPartTimeStaff.addActionListener(this);
        btnPartTimeStaff.setFont(btnFont);

        //Button for Displaying all information regarding Full-time and Part-time staff.
        btnMainDisplay= new JButton("Display");
        btnMainDisplay.setBounds (515,150,150,30);
        frame.add(btnMainDisplay);
        btnMainDisplay.addActionListener(this);
        btnMainDisplay.setFont(btnFont);

        //Setting Frame boundaries and its properties.
        frame.setLayout(null);
        frame.setSize(720,250);
        frame.setVisible(true);
        frame.requestFocus();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    //Creating method for displaying GUI of full time staff appointment.
    public void guiFT(){
        //setting up frame and fonts for its component.
        frameF = new JFrame("Full Time Staff Appointment");
        headerFont = new Font("Calibri",Font.PLAIN,22);
        subHeaderFont = new Font("Calibri",Font.PLAIN,19);
        labelFont = new Font("Calibri",Font.PLAIN,16);
        textFieldFont = new Font("Calibri",Font.PLAIN,15);
        comboBoxFont = new Font("Calibri",Font.PLAIN,13);
        btnFont = new Font("Ariel",Font.BOLD,14);

        //header for full time staff appointment
        lblHeader = new JLabel("Staff Appointment");
        frameF.add(lblHeader);
        lblHeader.setBounds (295,0,355,60);
        lblHeader.setFont(headerFont);

        //subheader for full time staff appointment
        lblSubHeader = new JLabel("Full Time Staff:");
        frameF.add(lblSubHeader);
        lblSubHeader.setBounds (12,45,200,19);
        lblSubHeader.setFont(subHeaderFont);

        //Initializing vacancy number for full time staff 
        lblVacancyNumber= new JLabel("Vacancy Number:");
        frameF.add(lblVacancyNumber);
        lblVacancyNumber.setBounds (12,74,120,45);
        lblVacancyNumber.setFont(labelFont);

        tfVacancyNumber = new JTextField();
        frameF.add(tfVacancyNumber);
        tfVacancyNumber.setBounds (150,82,180,26);
        tfVacancyNumber.setFont(textFieldFont);

        //Initializing designation for full time staff 
        lblDesignation= new JLabel("Designation:");
        frameF.add(lblDesignation);
        lblDesignation.setBounds (410,74,120,45);
        lblDesignation.setFont(labelFont);

        tfDesignation = new JTextField();
        frameF.add(tfDesignation);
        tfDesignation.setBounds (520,82,180,26);
        tfDesignation.setFont(textFieldFont);

        //Initializing job Type for full time staff 
        lblJobType= new JLabel("Job Type:");
        frameF.add(lblJobType);
        lblJobType.setBounds (12,124,120,45);
        lblJobType.setFont(labelFont);

        tfJobType = new JTextField();
        frameF.add(tfJobType);
        tfJobType.setBounds (150,132,180,26);
        tfJobType.setFont(textFieldFont);

        //Initializing salary for full time staff 
        lblSalary= new JLabel("Salary:");
        frameF.add(lblSalary);
        lblSalary.setBounds (410,124,140,45);
        lblSalary.setFont(labelFont);

        tfSalary = new JTextField();
        frameF.add(tfSalary);
        tfSalary.setBounds (520,132,180,26);
        tfSalary.setFont(textFieldFont);

        //Initializing working hour for full time staff 
        lblWorkingHour= new JLabel("Working Hour:");
        frameF.add(lblWorkingHour);
        lblWorkingHour.setBounds (12,174,120,45);
        lblWorkingHour.setFont(labelFont);

        tfWorkingHour= new JTextField();
        frameF.add(tfWorkingHour);
        tfWorkingHour.setBounds (150,182,180,26);
        tfWorkingHour.setFont(textFieldFont);

        //Add Vacancy Button for adding full time staff vacancy
        btnAddFT = new JButton("Add");
        btnAddFT.setBounds (520,182,180,38);
        frameF.add(btnAddFT);
        btnAddFT.addActionListener(this);
        btnAddFT.setFont(btnFont);

        //Vacancy Number for appointing Full-Time Staff
        lblVacancyNumberApnt= new JLabel("Vacancy Number:");
        frameF.add(lblVacancyNumberApnt);
        lblVacancyNumberApnt.setBounds (12,270,120,45);
        lblVacancyNumberApnt.setFont(labelFont);

        tfVacancyNumberApnt= new JTextField();
        frameF.add(tfVacancyNumberApnt);
        tfVacancyNumberApnt.setBounds (150,278,180,26);
        tfVacancyNumberApnt.setFont(textFieldFont);

        //Initializing Staff Name for full time staff 
        lblStaffName= new JLabel("Staff Name:");
        frameF.add(lblStaffName);
        lblStaffName.setBounds (410,270,120,45);
        lblStaffName.setFont(labelFont);

        tfStaffName= new JTextField();
        frameF.add(tfStaffName);
        tfStaffName.setBounds (520,278,180,26);
        tfStaffName.setFont(textFieldFont);

        //Initializing Joining Date for full time staff 
        lblJoiningDate= new JLabel("Joining Date:");
        frameF.add(lblJoiningDate);
        lblJoiningDate.setBounds (12,320,120,45);
        lblJoiningDate.setFont(labelFont);

        jcYearFT = new JComboBox<>(new String[] {"Year","2000-","2001-","2002-","2003-","2004-","2005-","2006-","2007-","2008-","2009-","2010-","2011-","2012-","2013-","2014-","2015-","2016-","2017-","2018-","2019-","2020-","2021-"});
        frameF.add(jcYearFT);
        jcYearFT.setBounds (150,328,55,26);
        jcYearFT.setFont(comboBoxFont);

        jcMonthFT = new JComboBox<>(new String[] {"Month","01-","02-","03-","04-","05-","06-","07-","08-","09-","10-","11-","12-"});
        frameF.add(jcMonthFT);
        jcMonthFT.setBounds (211,328,64,26);
        jcMonthFT.setFont(comboBoxFont);

        jcDayFT = new JComboBox<>(new String[] {"Day","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"});
        frameF.add(jcDayFT);
        jcDayFT.setBounds (280,328,49,26);
        jcDayFT.setFont(comboBoxFont);

        //Initializing Qualification for full time staff 
        lblQualification= new JLabel("Qualification:");
        frameF.add(lblQualification);
        lblQualification.setBounds (410,320,120,45);
        lblQualification.setFont(labelFont);

        tfQualification= new JTextField();
        frameF.add(tfQualification);
        tfQualification.setBounds (520,328,180,26);
        tfQualification.setFont(textFieldFont);

        //Initializing Appointed By for full time staff 
        lblAppointedBy= new JLabel("Appointed By:");
        frameF.add(lblAppointedBy);
        lblAppointedBy.setBounds (12,370,120,45);
        lblAppointedBy.setFont(labelFont);

        tfAppointedBy= new JTextField();
        frameF.add(tfAppointedBy);
        tfAppointedBy.setBounds (150,378,180,26);
        tfAppointedBy.setFont(textFieldFont);

        //JButton for Appointing Full-Time Staff 
        btnAppointFT = new JButton("Appoint");
        btnAppointFT.setBounds (520,382,180,38);
        frameF.add(btnAppointFT);
        btnAppointFT.addActionListener(this);
        btnAppointFT.setFont(btnFont);

        //JButton for Displaying Full-Time Staff Details
        btnDisplayFT = new JButton("Display");
        btnDisplayFT.setBounds (12,473,180,38);
        frameF.add(btnDisplayFT);
        btnDisplayFT.addActionListener(this);
        btnDisplayFT.setFont(btnFont);

        //JButton for Clearing Full-Time Staff Details from text fields and combo boxes.
        btnClearFT = new JButton("Clear");
        btnClearFT.setBounds (520,473,180,38);
        frameF.add(btnClearFT);
        btnClearFT.addActionListener(this);
        btnClearFT.setFont(btnFont);

        //Setting Frame boundaries and its properties.
        frameF.setLayout(null);
        frameF.setSize(755,590);
        frameF.setVisible(true);
        frameF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    //Creating method for displaying GUI of Part time staff appointment.
    public void guiPT(){
        //setting up frame and fonts for its component.
        frameP = new JFrame("Part Time Staff Appointment");
        headerFont = new Font("Calibri",Font.PLAIN,22);
        subHeaderFont = new Font("Calibri",Font.PLAIN,19);
        labelFont = new Font("Calibri",Font.PLAIN,16);
        textFieldFont = new Font("Calibri",Font.PLAIN,15);
        comboBoxFont = new Font("Calibri",Font.PLAIN,13);
        btnFont = new Font("Ariel",Font.BOLD,14);

        //Initialzing header for Part Time Staff GUI
        lblHeader = new JLabel("Staff Appointment");
        frameP.add(lblHeader);
        lblHeader.setBounds (295,0,355,60);
        lblHeader.setFont(headerFont);

        //Initialzing subheader for Part Time Staff GUI
        lblSubHeader = new JLabel("Part Time Staff:");
        frameP.add(lblSubHeader);
        lblSubHeader.setBounds (12,45,200,19);
        lblSubHeader.setFont(subHeaderFont);

        //Initializing Vacancy Number for part time staff appointment
        lblVacancyNumberPT= new JLabel("Vacancy Number:");
        frameP.add(lblVacancyNumberPT);
        lblVacancyNumberPT.setBounds (12,74,120,45);
        lblVacancyNumberPT.setFont(labelFont);

        tfVacancyNumberPT = new JTextField();
        frameP.add(tfVacancyNumberPT);
        tfVacancyNumberPT.setBounds (150,82,180,26);
        tfVacancyNumberPT.setFont(textFieldFont);

        //Initializing Designation for part time staff
        lblDesignationPT= new JLabel("Designation:");
        frameP.add(lblDesignationPT);
        lblDesignationPT.setBounds (410,74,120,45);
        lblDesignationPT.setFont(labelFont);

        tfDesignationPT = new JTextField();
        frameP.add(tfDesignationPT);
        tfDesignationPT.setBounds (520,82,180,26);
        tfDesignationPT.setFont(textFieldFont);

        //Initializing Job Type for part time staff
        lblJobTypePT= new JLabel("Job Type:");
        frameP.add(lblJobTypePT);
        lblJobTypePT.setBounds (12,124,120,45);
        lblJobTypePT.setFont(labelFont);

        tfJobTypePT= new JTextField();
        frameP.add(tfJobTypePT);
        tfJobTypePT.setBounds (150,132,180,26);
        tfJobTypePT.setFont(textFieldFont);

        //Initializing Working Hour for part time staff
        lblWorkingHourPT= new JLabel("Working Hour:");
        frameP.add(lblWorkingHourPT);
        lblWorkingHourPT.setBounds (410,124,120,45);
        lblWorkingHourPT.setFont(labelFont);

        tfWorkingHourPT = new JTextField();
        frameP.add(tfWorkingHourPT);
        tfWorkingHourPT.setBounds (520,132,180,26);
        tfWorkingHourPT.setFont(textFieldFont);

        //Initializing Wages Per Hour for part time staff
        lblWagesPerHour= new JLabel("Wages Per Hour:");
        frameP.add(lblWagesPerHour);
        lblWagesPerHour.setBounds (12,174,120,45);
        lblWagesPerHour.setFont(labelFont);

        tfWagesPerHour= new JTextField();
        frameP.add(tfWagesPerHour);
        tfWagesPerHour.setBounds (150,182,180,26);
        tfWagesPerHour.setFont(textFieldFont);

        //Initializing Working Shifts for part time staff
        lblWorkingShifts= new JLabel("Working Shifts:");
        frameP.add(lblWorkingShifts);
        lblWorkingShifts.setBounds (410,174,120,45);
        lblWorkingShifts.setFont(labelFont);

        jcWorkingShifts = new JComboBox<>(new String[] {"SELECT","Morning","Day","Night"});
        frameP.add(jcWorkingShifts);
        jcWorkingShifts.setBounds (520,182,180,26);
        jcWorkingShifts.setFont(textFieldFont);

        //Add Vacancy Button for adding part time staff vacancy
        btnAddPT = new JButton("Add");
        btnAddPT.setBounds (520,235,180,32);
        frameP.add(btnAddPT);
        btnAddPT.addActionListener(this);
        btnAddPT.setFont(btnFont);

        //Vacancy Number for appointing Part-Time Staff
        lblVacancyNumberApntPT= new JLabel("Vacancy Number:");
        frameP.add(lblVacancyNumberApntPT);
        lblVacancyNumberApntPT.setBounds (12,297,120,45);
        lblVacancyNumberApntPT.setFont(labelFont);

        tfVacancyNumberApntPT= new JTextField();
        frameP.add(tfVacancyNumberApntPT);
        tfVacancyNumberApntPT.setBounds (150,305,180,26);
        tfVacancyNumberApntPT.setFont(textFieldFont);

        //Initializing Staff Name for part time staff
        lblStaffNamePT= new JLabel("Staff Name:");
        frameP.add(lblStaffNamePT);
        lblStaffNamePT.setBounds (410,297,120,45);
        lblStaffNamePT.setFont(labelFont);

        tfStaffNamePT= new JTextField();
        frameP.add(tfStaffNamePT);
        tfStaffNamePT.setBounds (520,305,180,26);
        tfStaffNamePT.setFont(textFieldFont);

        //Initializing Joining Date for part time staff
        lblJoiningDatePT= new JLabel("Joining Date:");
        frameP.add(lblJoiningDatePT);
        lblJoiningDatePT.setBounds (12,347,120,45);
        lblJoiningDatePT.setFont(labelFont);

        jcYearPT = new JComboBox<>(new String[] {"Year","2000-","2001-","2002-","2003-","2004-","2005-","2006-","2007-","2008-","2009-","2010-","2011-","2012-","2013-","2014-","2015-","2016-","2017-","2018-","2019-","2020-","2021-"});
        frameP.add(jcYearPT);
        jcYearPT.setBounds (150,355,55,26);
        jcYearPT.setFont(comboBoxFont);

        jcMonthPT = new JComboBox<>(new String[] {"Month","01-","02-","03-","04-","05-","06-","07-","08-","09-","10-","11-","12-"});
        frameP.add(jcMonthPT);
        jcMonthPT.setBounds (211,355,64,26);
        jcMonthPT.setFont(comboBoxFont);

        jcDayPT = new JComboBox<>(new String[] {"Day","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"});
        frameP.add(jcDayPT);
        jcDayPT.setBounds (280,355,49,26);
        jcDayPT.setFont(comboBoxFont);

        //Initializing Qualification for part time staff
        lblQualificationPT= new JLabel("Qualification:");
        frameP.add(lblQualificationPT);
        lblQualificationPT.setBounds (410,347,120,45);
        lblQualificationPT.setFont(labelFont);

        tfQualificationPT= new JTextField();
        frameP.add(tfQualificationPT);
        tfQualificationPT.setBounds (520,355,180,26);
        tfQualificationPT.setFont(textFieldFont);

        //Initializing Appointed By for part time staff
        lblAppointedByPT= new JLabel("Appointed By:");
        frameP.add(lblAppointedByPT);
        lblAppointedByPT.setBounds (12,397,120,45);
        lblAppointedByPT.setFont(labelFont);

        tfAppointedByPT= new JTextField();
        frameP.add(tfAppointedByPT);
        tfAppointedByPT.setBounds (150,405,180,26);
        tfAppointedByPT.setFont(textFieldFont);

        //JButton Appoint for appointing Part-Time Staff 
        btnAppointPT = new JButton("Appoint");
        btnAppointPT.setBounds (520,407,180,32);
        frameP.add(btnAppointPT);
        btnAppointPT.addActionListener(this);
        btnAppointPT.setFont(btnFont);

        //JButton Terminate for terminating Part-Time Staff 
        btnTerminate = new JButton("Terminate");
        btnTerminate.setBounds (55,500,180,30);
        frameP.add(btnTerminate);
        btnTerminate.addActionListener(this);
        btnTerminate.setFont(btnFont);

        //JButton Display for displaying Part-Time Staff Details
        btnDisplayPT = new JButton("Display");
        btnDisplayPT.setBounds (290,500,180,30);
        frameP.add(btnDisplayPT);
        btnDisplayPT.addActionListener(this);
        btnDisplayPT.setFont(btnFont);

        //JButton Clear for clearing Part-Time Staff Details from text fields and combo boxes.
        btnClearPT = new JButton("Clear");
        btnClearPT.setBounds (520,500,180,30);
        frameP.add(btnClearPT);
        btnClearPT.addActionListener(this);
        btnClearPT.setFont(btnFont);

        //Setting Frame boundaries and its properties.
        frameP.setLayout(null);
        frameP.setSize(755,610);
        frameP.setVisible(true);
        frameP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    //Method that executes automatically when an action occurs.
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnFullTimeStaff ){
            guiFT();
        }else if(e.getSource() == btnPartTimeStaff){
            guiPT();
        }else if(e.getSource() == btnMainDisplay){
            mainDisplay();
        }else if(e.getSource() == btnAddFT){
            addFullTimeVacancy();
        }else if(e.getSource() == btnAppointFT){
            appointFullTimeStaff();
        }else if(e.getSource() == btnDisplayFT){
            fullTimeStaffDisplay();
        }else if(e.getSource() == btnClearFT){
            clearFT();
        }else if(e.getSource() == btnAddPT){
            addPartTimeVacancy();
        }else if(e.getSource() == btnAppointPT){
            appointPartTimeStaff();
        }else if(e.getSource() == btnTerminate){
            terminatePartTimeStaff();
        }else if(e.getSource() == btnDisplayPT){
            partTimeStaffDisplay();
        }else if(e.getSource() == btnClearPT){
            clearPT();
        }

    }

    //Creating method to add full time staff vacancy
    public void addFullTimeVacancy(){
        int vacancyNo=0, salary=0, workingHour=0;
        String designation="",jobType="";

        /*Try-catch block is used. Try block gets executed only when all inputs from user are correct with no exceptions.
         * In this method typecasting error may occur, due to which the blocks are used. Exception is handled by catch block
         * and only part of catch block works in case of exception.Try catch is used to avoid program crashing due to certain exception.
         */

        try{
            //taking input from text fields and storing in a variable
            vacancyNo=Integer.parseInt(tfVacancyNumber.getText()); 
            designation=tfDesignation.getText();
            jobType=tfJobType.getText();
            salary=Integer.parseInt(tfSalary.getText());
            workingHour=Integer.parseInt(tfWorkingHour.getText());

            boolean isVnoDuplicate=false;
            boolean invalidDesignation=false;
            boolean invalidJobType=false;
            boolean wrongInput=false;
            //Iterating through arraylist to see if vacancy number is duplicate or not
            for(StaffHire var:employeeList){
                if(var.getVacancyNumber()==vacancyNo){
                    isVnoDuplicate=true;
                    break;
                }
            }

            if(!tfDesignation.getText().matches("[a-zA-Z-' ]+")){
                JOptionPane.showMessageDialog(frameF,"Invalid input for designation. Please enter alphabets.","Message",JOptionPane.ERROR_MESSAGE);
                invalidDesignation=true;
            } 

            if(!tfJobType.getText().matches("Full Time")){
                JOptionPane.showMessageDialog(frameF,"Input is invalid for Job Type. Please enter job type as Full Time.","Message",JOptionPane.ERROR_MESSAGE);
                invalidJobType=true;
            }

            if((vacancyNo<101) || (salary<30000) || (workingHour<7)){
                JOptionPane.showMessageDialog(frameF,"Vacancy No >= 101\n Salary >= 30000.\n Working Hour  >=7","Message",JOptionPane.INFORMATION_MESSAGE);
                wrongInput=true;
            }

            //Class FullTimeStaffHire constructor is called for adding vacancy only if all inputs are correct as required.
            if(isVnoDuplicate==false && invalidDesignation==false && invalidJobType==false && wrongInput==false){
                FullTimeStaffHire obj=new FullTimeStaffHire(vacancyNo,designation,jobType,salary,workingHour);
                employeeList.add(obj);
                JOptionPane.showMessageDialog(frameF,"Vacancy added successfully. "+employeeList.size(), "Message", JOptionPane.INFORMATION_MESSAGE);
            }else if(isVnoDuplicate==true){
                JOptionPane.showMessageDialog(frameF,"Vacancy no entered is already in the list. ", "Message", JOptionPane.ERROR_MESSAGE);
            }

            //Catch block catches NumberFormatException that might occur while type-casting input from text field to variable of certain datatype.
        }catch(NumberFormatException e){

            if(!tfVacancyNumber.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(frameF,"Invalid input for vacancy number. Please enter in numbers.","Message",JOptionPane.ERROR_MESSAGE);
            }

            if(!tfSalary.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(frameF,"Invalid input for salary. Please enter in numbers.","Message",JOptionPane.ERROR_MESSAGE);
            }

            if(!tfWorkingHour.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(frameF,"Invalid input for working hour. Please enter in numbers.","Message",JOptionPane.ERROR_MESSAGE);
            } 

            if( tfVacancyNumber.getText().matches("") || tfSalary.getText().matches("") || tfWorkingHour.getText().matches("")
            || tfDesignation.getText().matches("") || tfJobType.getText().matches("")){
                JOptionPane.showMessageDialog(frameF,"Please Enter Each And Every Field.","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        }

    }

    //Creating method to appoint full time staff
    public void appointFullTimeStaff(){
        try{
            //taking input from text fields and combo box and storing in a variable
            int vacancyNo=Integer.parseInt(tfVacancyNumberApnt.getText()); 
            String staffName=tfStaffName.getText();
            String year=(jcYearFT.getSelectedItem()).toString();
            String month=(jcMonthFT.getSelectedItem()).toString();
            String day=(jcDayFT.getSelectedItem()).toString();
            String joiningDate=year+month+day;
            String qualification=tfQualification.getText();
            String appointedBy=tfAppointedBy.getText();
            boolean vNoFound=false;
            boolean emptyField=false;
            boolean invalidStaffName=false;
            boolean invalidAppointedBy=false;
            boolean invalidJoiningDate=false;
            boolean invalidQualification=false;

            if(tfStaffName.getText().matches("")|| tfQualification.getText().matches("") || tfAppointedBy.getText().matches("")){
                JOptionPane.showMessageDialog(frameF,"Please Enter Each And Every Field.","Message",JOptionPane.INFORMATION_MESSAGE);
                emptyField=true;
            }

            if(jcYearFT.getSelectedIndex()==0 || jcMonthFT.getSelectedIndex()==0 || jcDayFT.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(frameF,"Please select Joining Date.","Message",JOptionPane.ERROR_MESSAGE);
                invalidJoiningDate=true;
            }

            if(!tfStaffName.getText().matches("[a-zA-Z- ]+")){
                JOptionPane.showMessageDialog(frameF,"Invalid input for Staff Name. Please enter alphabets.","Message",JOptionPane.ERROR_MESSAGE);
                invalidStaffName=true;
            } 

            if(!tfAppointedBy.getText().matches("[a-zA-Z- ]+")){
                JOptionPane.showMessageDialog(frameF,"Input is invalid for Appointed By. Please enter alphabets.","Message",JOptionPane.ERROR_MESSAGE);
                invalidAppointedBy=true;
            }

            if(!tfQualification.getText().matches("[a-zA-Z-'. ]+")){
                JOptionPane.showMessageDialog(frameF,"Invalid input for Qualification. Please enter alphabets.","Message",JOptionPane.ERROR_MESSAGE);
                invalidQualification=true;
            } 

            /*Iterating through arraylist to see if vacancy number is found or not. If the object is of class FullTimeStaffHire
             * its method hireFullTimeStaff gets called only if all the inputs are correct and getJoined method is false. 
             * Suitable message is displayed if obj is not instance of class FullTimeStaffHire and vacancy number is not found.
             */
            
            for(StaffHire obj:employeeList){
                if(obj.getVacancyNumber()==vacancyNo){
                    vNoFound=true;
                    if(obj instanceof FullTimeStaffHire){
                        FullTimeStaffHire a=(FullTimeStaffHire)obj;
                        if(a.getJoined()==true){
                            JOptionPane.showMessageDialog(frameF,"The staff has already been appointed for the job!","Message",JOptionPane.INFORMATION_MESSAGE);
                        }else if(emptyField==false && invalidJoiningDate==false && invalidStaffName==false && invalidAppointedBy==false&& invalidQualification==false){
                            a.hireFullTimeStaff(staffName,joiningDate,qualification,appointedBy);
                            JOptionPane.showMessageDialog(frameF,"The staff has been successfully hired!","Message",JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(frameF,"Vacancy not for Full time Staff Hire","Message",JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
            }

            if(vNoFound==false){
                JOptionPane.showMessageDialog(frameF,"Invalid Vacancy.","Message",JOptionPane.ERROR_MESSAGE);
            }

            //Catch block catches NumberFormatException that might occur while type-casting and stops the program from crashing.
        }catch(NumberFormatException e){
            if(!tfVacancyNumberApnt.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(frameF,"Invalid input for vacancy number. Please enter in numbers.","Message",JOptionPane.ERROR_MESSAGE);
            }

            if( tfVacancyNumberApnt.getText().matches("") || tfStaffName.getText().matches("") || tfQualification.getText().matches("") 
            || (jcYearFT.getSelectedIndex()==0) || (jcMonthFT.getSelectedIndex()==0 )|| (jcDayFT.getSelectedIndex()==0)|| tfAppointedBy.getText().matches("")){
                JOptionPane.showMessageDialog(frameF,"Please Enter Each And Every Field.","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }

    //This method is used to display all the details regarding full time and part time staff.
    public void mainDisplay(){
        for(StaffHire obj:employeeList){
            obj.display();
        }

    }

    /*This method is used to display the details regarding full time staff by checking whether the obj stored in arraylist
     * is of class FullTimeStaffHire or not. If the object is instance of the class then FullTimeStaffHire display method gets called.
     */

    public void fullTimeStaffDisplay(){
        for(StaffHire obj:employeeList){
            if(obj instanceof FullTimeStaffHire){
                FullTimeStaffHire d=(FullTimeStaffHire)obj;
                d.display();
            }
        }
    }

    //Creating method to add part time staff vacancy
    public void addPartTimeVacancy(){
        int vacancyNo=0, wagesPerHour=0, workingHour=0;
        String designation="",jobType="",shifts="";
        try{
            //taking input from text fields and combo box and storing in a variable
            vacancyNo=Integer.parseInt(tfVacancyNumberPT.getText()); 
            designation=tfDesignationPT.getText();
            jobType=tfJobTypePT.getText();
            wagesPerHour=Integer.parseInt(tfWagesPerHour.getText());
            workingHour=Integer.parseInt(tfWorkingHourPT.getText());
            shifts=(jcWorkingShifts.getSelectedItem()).toString();

            boolean isVnoDuplicate=false;
            boolean invalidDesignation=false;
            boolean invalidJobType=false;
            boolean invalidShifts=false;
            boolean wrongInput=false;

            //Iterating through arraylist to see if vacancy number is duplicate or not
            for(StaffHire var:employeeList){
                if(var.getVacancyNumber()==vacancyNo){
                    isVnoDuplicate=true;
                    break;
                }
            }

            if(!tfDesignationPT.getText().matches("[a-zA-Z-' ]+")){
                JOptionPane.showMessageDialog(frameP,"Invalid input for designation. Please enter alphabets.","Message",JOptionPane.ERROR_MESSAGE);
                invalidDesignation=true;
            } 

            if(!tfJobTypePT.getText().matches("Part Time")){
                JOptionPane.showMessageDialog(frameP,"Input is invalid for Job Type. Please enter job type as Part Time.","Message",JOptionPane.ERROR_MESSAGE);
                invalidJobType=true;
            }

            if((vacancyNo<101) ||(workingHour<4)){
                JOptionPane.showMessageDialog(frameP,"Vacancy No >= 101\n Working Hour >=4","Message",JOptionPane.INFORMATION_MESSAGE);
                wrongInput=true;
            }

            if(jcWorkingShifts.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(frameP,"Please select Working Shift.","Message",JOptionPane.ERROR_MESSAGE);
                invalidShifts=true;
            }

            //Class PartTimeStaffHire constructor is called for adding vacancy only if all inputs are correct as required.
            if(isVnoDuplicate==false && invalidDesignation==false && invalidJobType==false && wrongInput==false && invalidShifts==false){
                PartTimeStaffHire obj=new PartTimeStaffHire(vacancyNo,designation,jobType,workingHour,wagesPerHour,shifts);
                employeeList.add(obj);
                JOptionPane.showMessageDialog(frameP,"Vacancy added successfully. "+employeeList.size(), "Message", JOptionPane.INFORMATION_MESSAGE);
            }else if(isVnoDuplicate==true){
                JOptionPane.showMessageDialog(frameP,"Vacancy no entered is already in the list. ", "Message", JOptionPane.ERROR_MESSAGE);
            }

            //Catch block catches NumberFormatException that might occur while type-casting and stops the program from crashing.
        }catch(NumberFormatException e){
            if(!tfVacancyNumberPT.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(frameP,"Invalid input for vacancy number. Please enter in numbers.","Message",JOptionPane.ERROR_MESSAGE);
            }

            if(!tfWagesPerHour.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(frameP,"Invalid input for wages per hour. Please enter in numbers.","Message",JOptionPane.ERROR_MESSAGE);
            }

            if(!tfWorkingHourPT.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(frameP,"Invalid input for working hour. Please enter in numbers.","Message",JOptionPane.ERROR_MESSAGE);
            } 

            if( tfVacancyNumberPT.getText().matches("") || tfWagesPerHour.getText().matches("") || tfWorkingHourPT.getText().matches("")
            || tfDesignationPT.getText().matches("") || tfJobTypePT.getText().matches("") || jcWorkingShifts.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(frameP,"Please Enter Each And Every Field.","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        }

    }

    //Creating method to appoint part time staff
    public void appointPartTimeStaff(){
        try{
            //taking input from text fields and combo box and storing in a variable
            int vacancyNo=Integer.parseInt(tfVacancyNumberApntPT.getText()); 
            String staffName=tfStaffNamePT.getText();
            String year=(jcYearPT.getSelectedItem()).toString();
            String month=(jcMonthPT.getSelectedItem()).toString();
            String day=(jcDayPT.getSelectedItem()).toString();
            String joiningDate=year+month+day;
            String qualification=tfQualificationPT.getText();
            String appointedBy=tfAppointedByPT.getText();
            boolean vNoFound=false;
            boolean emptyField=false;
            boolean invalidStaffName=false;
            boolean invalidAppointedBy=false;
            boolean invalidJoiningDate=false;
            boolean invalidQualification=false;

            if(tfStaffNamePT.getText().matches("") || tfQualificationPT.getText().matches("") || tfAppointedByPT.getText().matches("")){
                JOptionPane.showMessageDialog(frameP,"Please Enter Each And Every Field.","Message",JOptionPane.INFORMATION_MESSAGE);
                emptyField=true;
            }

            if(jcYearPT.getSelectedIndex()==0 || jcMonthPT.getSelectedIndex()==0 || jcDayPT.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(frameP,"Please select Joining Date.","Message",JOptionPane.ERROR_MESSAGE);
                invalidJoiningDate=true;
            }

            if(!tfStaffNamePT.getText().matches("[a-zA-Z- ]+")){
                JOptionPane.showMessageDialog(frameP,"Invalid input for Staff Name. Please enter alphabets.","Message",JOptionPane.ERROR_MESSAGE);
                invalidStaffName=true;
            } 

            if(!tfAppointedByPT.getText().matches("[a-zA-Z- ]+")){
                JOptionPane.showMessageDialog(frameP,"Input is invalid for Appointed By. Please enter alphabets.","Message",JOptionPane.ERROR_MESSAGE);
                invalidAppointedBy=true;
            } 

            if(!tfQualificationPT.getText().matches("[a-zA-Z-'. ]+")){
                JOptionPane.showMessageDialog(frameP,"Invalid input for Qualification. Please enter alphabets.","Message",JOptionPane.ERROR_MESSAGE);
                invalidQualification=true;
            } 

            /*Iterating through arraylist to see if vacancy number is found or not. If the object is of class PartTimeStaffHire
             * its method hirePartTimeStaff gets called only if all the inputs are correct and getJoined method is false. 
             * Suitable message is displayed if obj is not instance of class PartTimeStaffHire and vacancy number is not found.
             */

            for(StaffHire obj:employeeList){
                if(obj.getVacancyNumber()==vacancyNo){
                    vNoFound=true;
                    if(obj instanceof PartTimeStaffHire){
                        PartTimeStaffHire a=(PartTimeStaffHire)obj;
                        if(a.getJoined()==true){
                            JOptionPane.showMessageDialog(frameP,"The staff has already been appointed for the job!","Message",JOptionPane.INFORMATION_MESSAGE);
                        }else if(emptyField==false && invalidStaffName==false && invalidJoiningDate==false && invalidAppointedBy==false && invalidQualification==false){
                            a.hirePartTimeStaff(staffName,joiningDate,qualification,appointedBy);
                            JOptionPane.showMessageDialog(frameP,"The staff has been successfully hired!","Message",JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(frameP,"Vacancy not for Part time Staff Hire","Message",JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
            }

            if(vNoFound==false){
                JOptionPane.showMessageDialog(frameP,"Invalid Vacancy.","Message",JOptionPane.ERROR_MESSAGE);
            }

            //Catch block catches NumberFormatException that might occur while type-casting and stops the program from crashing.
        }catch(NumberFormatException e){
            if(!tfVacancyNumberApntPT.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(frameP,"Invalid input for vacancy number. Please enter in numbers.","Message",JOptionPane.ERROR_MESSAGE);
            }

            if( tfVacancyNumberApntPT.getText().matches("") || tfStaffNamePT.getText().matches("") || tfQualificationPT.getText().matches("") 
            || (jcYearPT.getSelectedIndex()==0) || (jcMonthPT.getSelectedIndex()==0 )|| (jcDayPT.getSelectedIndex()==0)|| tfAppointedByPT.getText().matches("")){
                JOptionPane.showMessageDialog(frameP,"Please Enter Each And Every Field.","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }

    /*Iterating through arraylist to see if vacancy number is found or not. If the object is of class PartTimeStaffHire
     * its method terminated gets called only if the input of tfVacancyNumberApntPT is correct and getTerminated method is false. 
     * Suitable message is displayed if obj is not instance of class PartTimeStaffHire and vacancy number is not found and input is invalid.
     */
    public void terminatePartTimeStaff(){
        try{
            int vacancyNo=Integer.parseInt(tfVacancyNumberApntPT.getText());
            boolean vNoFound=false;

            for(StaffHire obj:employeeList){
                if(obj.getVacancyNumber()==vacancyNo){
                    vNoFound=true;
                    if(obj instanceof PartTimeStaffHire){
                        PartTimeStaffHire a=(PartTimeStaffHire)obj;
                        if(a.getTerminated()==true){
                            JOptionPane.showMessageDialog(frameP,"Staff is already terminated.","Message",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            a.terminate();
                            JOptionPane.showMessageDialog(frameP,"Staff is successfully terminated.","Message",JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }else{
                        JOptionPane.showMessageDialog(frameP,"Full time vacancy not for termination","Message",JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
            }
            if(vNoFound==false){
                JOptionPane.showMessageDialog(frameP,"Invalid Vacancy.","Message",JOptionPane.ERROR_MESSAGE);
            }

        }catch(NumberFormatException e){
            if(!tfVacancyNumberApntPT.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(frameP,"Invalid input. Please enter vacancy number in numbers for termination.","Message",JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    /*This method is used to display the details regarding part time staff by checking whether the obj stored in arraylist
     * is of class PartTimeStaffHire or not. If the object is instance of the class then PartTimeStaffHire display method gets called.
     */
    public void partTimeStaffDisplay(){
        for(StaffHire obj:employeeList){
            if(obj instanceof PartTimeStaffHire){
                PartTimeStaffHire b=(PartTimeStaffHire)obj;
                b.display();
            }
        }
    }

    //This method is used to set all the text field values to null and combo box index to zero of Full Time Staff Appointment GUI.
    public void clearFT(){
        tfVacancyNumber.setText(null);
        tfDesignation.setText(null);
        tfJobType.setText(null);
        tfSalary .setText(null);
        tfWorkingHour.setText(null);
        tfVacancyNumberApnt.setText(null);
        tfStaffName.setText(null);
        jcYearFT.setSelectedIndex(0);
        jcMonthFT.setSelectedIndex(0);
        jcDayFT.setSelectedIndex(0);
        tfQualification.setText(null);
        tfAppointedBy.setText(null);

    }

    //This method is used to set all the text field values to null and combo box index to zero of Part Time Staff Appointment GUI.
    public void clearPT(){
        tfVacancyNumberPT.setText(null);
        tfDesignationPT.setText(null);
        tfJobTypePT.setText(null);
        tfWorkingHourPT.setText(null);
        tfWagesPerHour.setText(null);
        jcWorkingShifts.setSelectedIndex(0);
        tfVacancyNumberApntPT.setText(null);
        tfStaffNamePT.setText(null);
        jcYearPT.setSelectedIndex(0);
        jcMonthPT.setSelectedIndex(0);
        jcDayPT.setSelectedIndex(0);
        tfQualificationPT.setText(null);
        tfAppointedByPT.setText(null);

    }
}

