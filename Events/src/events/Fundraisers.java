/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

/**
 *
 * @author Ben
 */
public class Fundraisers extends Events{
    protected boolean online;
    protected double donated;
    protected String catagory;
    
    public Fundraisers() {
    }

    public Fundraisers(boolean online, double donated, String catagory, String name, String date, String location, int attendiing) {
        super(name, date, location, attendiing);
        this.online = online;
        this.donated = donated;
        this.catagory = catagory;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public void setDonated(double donated) {
        this.donated = donated;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public boolean isOnline() {
        return online;
    }

    public double getDonated() {
        return donated;
    }

    public String getCatagory() {
        return catagory;
    }    
}
