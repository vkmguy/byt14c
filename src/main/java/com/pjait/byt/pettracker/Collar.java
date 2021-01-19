package com.pjait.byt.pettracker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Collar {
    private final int size;
    private final String collarColour;
    private List<TimeLoc> locationLog = new ArrayList<>();
    private List<TimePulse> pulseLog = new ArrayList<>();

    public List<TimeLoc> getLocationLog() {
        return locationLog;
    }

    public List<TimePulse> getPulseLog() {
        return pulseLog;
    }

    public Collar(int size, String collarColour) {
        if((size == 1 || size == 2 || size == 3 || size == 4) && (collarColour == "Red" || collarColour == "Green" ||collarColour == "Blue")){
            this.size = size;
            this.collarColour = collarColour;
        }else{
            this.size = -1;
            this.collarColour = "Error";
        }
    }

    public int getSize() {
        return size;
    }

    public String getCollarColour() {
        return collarColour;
    }

    public void registerCurrentLocation(){
        locationLog.add(new TimeLoc(new Location(51.0,22.0), new Date(121,1,17, 20,13)));
    }

    public void registerCurrentPulse(){
        pulseLog.add(new TimePulse(new Pulse(23,1,1), new Date(121,1,17, 20,13)));
    }

    public Location getLocation(Date date){
        for (TimeLoc timeLoc: locationLog) {
            if(timeLoc.getDate().equals(date)){
                return timeLoc.getLocation();
            }
        }
        return new Location(0.0,0.0);
    }

    public Pulse getPulse(Date date){
        for (TimePulse timePulse: pulseLog) {
            if(timePulse.getDate().equals(date)){
                return timePulse.getPulse();
            }
        }
        return new Pulse(-1,0,0);
    }
}

class TimeLoc{
    private Location location;
    private Date date;

    public Location getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public TimeLoc(Location location, Date date) {
        this.location = location;
        this.date = date;
    }
}

class TimePulse{
    private Pulse pulse;
    private Date date;

    public TimePulse(Pulse pulse, Date date) {
        this.pulse = pulse;
        this.date = date;
    }

    public Pulse getPulse() {
        return pulse;
    }

    public Date getDate() {
        return date;
    }
}

