/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package information;

/**
 *
 * @author annam
 */
public class Programme extends Organisation{
    //data members
    protected int programmeID;
    
    //constructors

    public Programme() {
    }

    public Programme(int programmeID) {
        this.programmeID = programmeID;
    }

    public Programme(int programmeID, String charityName, String description, int founded, String email, String phone) {
        super(charityName, description, founded, email, phone);
        this.programmeID = programmeID;
    }
    
    //set emthods
    
    //get methods
    
    //my other methods
    public String getProgrammeDetails(){
        return "Programme ID: " +programmeID+ "\nCharity: " +charityName+ "\nOur Mission: " +description+ "\n Year Founded: " +founded+ "\nEmail: " +email+ "\nPhone No: " +phone;
    }
    
}
