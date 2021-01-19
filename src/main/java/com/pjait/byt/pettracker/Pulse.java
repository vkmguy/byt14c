package com.pjait.byt.pettracker;

public class Pulse {
    private double bpm;
    private double volume;
    private double force;

    public Pulse(double bpm, double volume, double force){
        setBpm(bpm);
        setVolume(volume);
        setForce(force);
    }

    public double getBpm() {
        return bpm;
    }

    public void setBpm(double bpm) {
        if(bpm>0)
            this.bpm = bpm;
        else
            this.bpm = 0;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume>0)
            this.volume = volume;
        else
            this.volume = 0;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        if (volume>0)
            this.force = force;
        else
            this.force = 0;
    }
}
