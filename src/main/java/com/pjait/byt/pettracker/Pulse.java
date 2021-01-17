package com.pjait.byt.pettracker;

public class Pulse {
    private double bpm;
    private double volume;
    private double force;

    public Pulse(double bpm, double volume, double force){
        this.bpm = bpm;
        this.volume = volume;
        this.force = force;
    }

    public double getBpm() {
        return bpm;
    }

    public void setBpm(double bpm) {
        this.bpm = bpm;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }
}
