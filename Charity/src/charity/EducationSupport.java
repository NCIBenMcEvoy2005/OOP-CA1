/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charity;

/**
 *
 * @author annam
 */
public class EducationSupport extends Programme{
    //data members
    private int schoolSupported;
    private String schoolRegistered;
    private int studentsSupported;
    private String studentName;
    private String subjects;
    
    //constructors

    public EducationSupport() {
    }
    
    //will probably get rid of student parts. realised its a little unnecessary
    public EducationSupport(int schoolSupported, String schoolRegistered, int studentsSupported, String studentName, String subjects) {
        this.schoolSupported = schoolSupported;
        this.schoolRegistered = schoolRegistered;
        this.studentsSupported = studentsSupported;
        this.studentName = studentName;
        this.subjects = subjects;
    }

    public EducationSupport(int schoolSupported, String schoolRegistered, int studentsSupported, String studentName, String subjects, int programmeID, String charityName, String description, int founded, String email, String phone) {
        super(programmeID, charityName, description, founded, email, phone);
        this.schoolSupported = schoolSupported;
        this.schoolRegistered = schoolRegistered;
        this.studentsSupported = studentsSupported;
        this.studentName = studentName;
        this.subjects = subjects;
    }
    
    //set methds
    
    //get methods
    
    //my other methods
    public String getDetails(){
        return "Schools Supported: " +schoolSupported+ "\nRegistered schools: " +schoolRegistered+ "\nSubjects we cover: " +subjects;
    }
    
    
}
