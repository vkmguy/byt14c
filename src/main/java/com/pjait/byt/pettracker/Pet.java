package com.pjait.byt.pettracker;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
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

    public void showPetStatistics(){
        //need collar imp
    }

    public void updateInfo(){
        //collar.registerCurrentPulse();
        //collar.registerCurrentLocation();
    }

    public boolean isPetPulseInNormalRange(){
        /*
        collar.registerCurrentPulse();
        Pulse currPulse = collar.getPulse();
        return lowerLimit.getBpm() < currPulse.getBpm() && upperLimit.getBpm() > currPulse.getBpm() &&
            lowerLimit.getForce() < currPulse.getForce() && upperLimit.getForce() > currPulse.getForce() &&
            lowerLimit.getVolume() < currPulse.getVolume() && upperLimit.getVolume() > currPulse.getVolume();
        */
        return  false;
    }

    public boolean isPetOutsidePredefinedZone(){
        /*
        collar.registerCurrentLocation();
        Location currLoc = new Location();
        if(currLoc.lat > predefinedZone[0].lat && currLoc.lat < predefinedZone[1].lat &&
                currLoc.lon > predefinedZone[0].lon && currLoc.lon < predefinedZone[1].lon)
            return false;
        return true;
        */
        return  false;
    }

    public List<Collar> getCollarHistory(Timestamp ta, Timestamp tb){
        // calling the CollarHistoryRepository to get list of Collar between two timestamps
        return  new ArrayList<>();

    }


}