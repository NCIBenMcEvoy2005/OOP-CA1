/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package events;

import javax.swing.JOptionPane;

/**
 *
 * @author Ben
 */
public class EventsTestApp {
    public static void main(String[] args) {
        // Linking classes to this App
        Events e = new Events();
        Fundraisers fr = new Fundraisers();
        VolunteeringEvent ve = new VolunteeringEvent();
        //EventsGUI EGUI = new EventsGUI();
        
        // Variables
        //Events Variables
        String name;
        String date;
        String location;
        int attending;
        int eventType;
        // Fundraiser Variables
        boolean online;
        double donated;
        String catagory;
        //Volunteering Variables 
        boolean reoccuring;
        int eventLength;
        // catagory is also used here too
        
        // Get the Info
        name = JOptionPane.showInputDialog("Enter the Name of the Event");
        date = JOptionPane.showInputDialog("Enter the date of the Event");
        location = JOptionPane.showInputDialog("Enter the location of the Event");
        attending = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of Attendees"));
        eventType = Integer.parseInt(JOptionPane.showInputDialog("Event Type?\n1. Fundraiser\n2. Volunteering"));
        
        // Sending info into the Event Class
        e.setName(name);
        e.setDate(date);
        e.setLocation(location);
        e.setAttending(attending);
        
        // User Choice determines which class the next bits of info are sent
        if(eventType == 1){ // Fundraiser
            online = Boolean.parseBoolean(JOptionPane.showInputDialog("Is the event online?\nTrue/1\nFlase/2"));
            donated = Double.parseDouble(JOptionPane.showInputDialog("Enter how much money that has been donated"));
            catagory = JOptionPane.showInputDialog("Enter what kind of Fundraiser it is");
            
            fr.setOnline(online);
            fr.setDonated(donated);
            fr.setCatagory(catagory);
            
            fr.toString();
          
        }else if(eventType == 2){ // Volunteering
            reoccuring = Boolean.parseBoolean(JOptionPane.showInputDialog("Is the event online?\nTrue/1\nFlase/2"));
            eventLength = Integer.parseInt(JOptionPane.showInputDialog("How long is the event going on for?"));
            catagory = JOptionPane.showInputDialog("Enter what kind of volunteering event it is");
            
            ve.setReoccuring(reoccuring);
            ve.setEventLength(eventLength);
            ve.setCatagory(catagory);
            
            ve.toString();
            
        }else{ // Error
            JOptionPane.showMessageDialog(null, "ERROR!\nUser entered wrong information!\nCrashing now!");
        }
    }
    
}
