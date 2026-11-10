/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charity;

/**
 *
 * @author annam
 */
public class FoodSupport extends Programme{
    //data members
    private int areaSupported;
    private int weeklyMeals;
    private String location;
    
    //constructors 

    public FoodSupport() {
    }

    public FoodSupport(int areaSupported, int weeklyMeals, String location, int programmeID, String charityName, String description, int founded, String email, String phone) {
        super(programmeID, charityName, description, founded, email, phone);
        this.areaSupported = areaSupported;
        this.weeklyMeals = weeklyMeals;
        this.location = location;
    }
    
    //set methods
    
    //get methods
    
    //my other methods
    public String getDetails(){
        return "Locations supported: " +areaSupported+ "\n Meals distributed weekly: " +weeklyMeals+ "\nOur centres: " +location;
    }
    
    
}

