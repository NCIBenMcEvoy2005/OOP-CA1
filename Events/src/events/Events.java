/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package events;

/**
 *
 * @author Ben
 */
public class Events {
    protected String name;
    protected String date;
    protected String location;
    protected int attending;

    public Events() {
    }

    public Events(String name, String date, String location, int attendiing) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.attending = attendiing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAttending(int attending) {
        this.attending = attending;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public int getAttending() {
        return attending;
    }

    @Override
    public String toString() {
        return "Events{" + "name=" + name + ", date=" + date + ", location=" + location + ", attendiing=" + attending + '}';
    }
    
    
}
