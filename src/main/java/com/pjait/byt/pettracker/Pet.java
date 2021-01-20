package com.pjait.byt.pettracker;
import java.sql.Time;
import java.util.List;
import java.util.regex.Pattern;

public class Pet {
    private String species;
    private String breed;
    private Time feedingTime;
    private Pulse upperLimit;
    private Pulse lowerLimit;
    private Collar collar;
    private Location[] predefinedZone;

    public Pet(String species, String breed){
        setSpecies(species);
        setBreed(breed);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if(species.equals("cat") || species.equals("dog")){
            this.species = species;
        } else
            this.species = "undefined";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(Pattern.matches("[a-z]+", breed)){
            this.breed = breed;
        } else
            this.breed = "undefined";
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
        if(loc.length==2)
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
}