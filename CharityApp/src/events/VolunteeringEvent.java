/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

/**
 *
 * @author Ben
 */
public class VolunteeringEvent extends Events{
    protected boolean reoccuring;
    protected int eventLength;
    protected String catagory;
    
    public VolunteeringEvent(){
    }

    public VolunteeringEvent(boolean reoccuring, int eventLength, String catagory, String name, String date, String location, int attendiing) {
        super(name, date, location, attendiing);
        this.reoccuring = reoccuring;
        this.eventLength = eventLength;
        this.catagory = catagory;
    }

    public void setReoccuring(boolean reoccuring) {
        this.reoccuring = reoccuring;
    }

    public void setEventLength(int eventLength) {
        this.eventLength = eventLength;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public boolean isReoccuring() {
        return reoccuring;
    }

    public int getEventLength() {
        return eventLength;
    }

    public String getCatagory() {
        return catagory;
    }

    @Override
    public String toString() {
        return super.toString()+"\nVolunteeringEvent{" + "reoccuring=" + reoccuring + ", eventLength=" + eventLength + ", catagory=" + catagory + '}';
    }
    
    
}
