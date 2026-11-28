/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events.individualversion;

/**
 *
 * @author Ben
 */
public class Fundraisers extends Events{
    protected boolean online;
    protected String catagory;
    
    public Fundraisers() {
    }

    public Fundraisers(boolean online, String catagory, String name, String date, String location, int attendiing) {
        super(name, date, location, attendiing);
        this.online = online;
        this.catagory = catagory;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public boolean isOnline() {
        return online;
    }

    public String getCatagory() {
        return catagory;
    }

    @Override
    public String toString() {
        return super.toString()+"Online Event: "+online+"\nEvent Catagory: "+catagory+"/n";
    }
    
    
    
}
