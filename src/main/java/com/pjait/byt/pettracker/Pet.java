package com.pjait.byt.pettracker;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pet {
    private String species;
    private String breed;
    private Time feedingTime;
    private Pulse upperLimit;
    private Pulse lowerLimit;
    private Collar collar;
    private Location[] predefinedZone;

    public Pet(String species, String breed){
        this.species = species;
        this.breed = breed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Time getFeedingTime() {
        return feedingTime;
    }

    public void setFeedingTime(int hour, int minute, int second) {
        feedingTime = new Time(hour, minute, second);
    }

    public void setFeedingTime(Time feedingTime) {
        this.feedingTime = feedingTime;
    }

    public Pulse getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Pulse upperLimit) {
        this.upperLimit = upperLimit;
    }

    public Pulse getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Pulse lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public Collar getCollar() {
        return collar;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
    }

    public Location[] getPredefinedZone() {
        return predefinedZone;
    }

    public void setPredefinedZone(Location[] loc) {
        predefinedZone = loc;
    }

    public String showPetStatistics(){
        updateInfo();
        List<TimeLoc> locationLog = collar.getLocationLog();
        List<TimePulse> pulseLog = collar.getPulseLog();

        return species + ", " + breed + ", loc: " +
                locationLog.get(locationLog.size()-1).getLocation().getLat() + ", " +
                locationLog.get(locationLog.size()-1).getLocation().getLon() +
                ", bpm: " + pulseLog.get(locationLog.size()-1).getPulse().getBpm();
    }

    public void updateInfo(){
        collar.registerCurrentPulse();
        collar.registerCurrentLocation();
    }

    public boolean isPetPulseInNormalRange(){
        collar.registerCurrentPulse();
        List<TimePulse> pulseLog = collar.getPulseLog();
        Pulse currPulse = pulseLog.get(pulseLog.size()-1).getPulse();

        return lowerLimit.getBpm() < currPulse.getBpm() && upperLimit.getBpm() > currPulse.getBpm() &&
            lowerLimit.getForce() < currPulse.getForce() && upperLimit.getForce() > currPulse.getForce() &&
            lowerLimit.getVolume() < currPulse.getVolume() && upperLimit.getVolume() > currPulse.getVolume();
    }

    public boolean isPetOutsidePredefinedZone(){
        collar.registerCurrentLocation();
        Location currLoc = collar.getLocation(java.util.Calendar.getInstance().getTime());
        if(currLoc.getLat() > predefinedZone[0].getLat() && currLoc.getLat() < predefinedZone[1].getLat() &&
                currLoc.getLon() > predefinedZone[0].getLon() && currLoc.getLon() < predefinedZone[1].getLon())
            return false;
        return true;
    }

    public List<Collar> getCollarLog(){
        return new ArrayList<>();
    }
    /*
    class TimeColar{
        private Collar collar;
        private Date date;

        public TimeColar(Collar collar, Date date) {
            this.collar = collar;
            this.date = date;
        }

        public Collar getCollar() {
            return collar;
        }

        public Date getDate() {
            return date;
        }
    }
    */
}