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
    protected int attendiing;

    public Events() {
    }

    public Events(String name, String date, String location, int attendiing) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.attendiing = attendiing;
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

    public void setAttendiing(int attendiing) {
        this.attendiing = attendiing;
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

    public int getAttendiing() {
        return attendiing;
    }

    @Override
    public String toString() {
        return "Events{" + "name=" + name + ", date=" + date + ", location=" + location + ", attendiing=" + attendiing + '}';
    }
    
    
}
