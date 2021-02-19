package org.launchcode.techjobs_oo;

import java.util.Objects;


public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // added constructors

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {

        this();

        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // custom equals and hashcode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId() && Objects.equals(getName(), job.getName()) && Objects.equals(getEmployer(), job.getEmployer()) && Objects.equals(getLocation(), job.getLocation()) && Objects.equals(getPositionType(), job.getPositionType()) && Objects.equals(getCoreCompetency(), job.getCoreCompetency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    // toString Method
    public String toString() {

        String str;

        if(getName().equals("")
        && getEmployer().getValue().equals("")
        && getLocation().getValue().equals("")
        && getPositionType().getValue().equals("")
        && getCoreCompetency().getValue().equals("")) {
            return "OOPS! This job does not seem to exist.";
        }

        if(getName().equals("")){
            this.name = "Data not available";
            System.out.println(name);
        }
        if(getEmployer().equals("")){
            this.employer = new Employer("Data not available");
        }
        if(getLocation().equals("")){
            this.location = new Location("Data not available");
        }
        if(getPositionType().equals("")){
            this.positionType = new PositionType("Data not available");
        }
        if(getCoreCompetency().equals("")){
            this.coreCompetency = new CoreCompetency("Data not available");
        }

        str = "\nID: " + getId() +
                "\nName: " + getName() +
                "\nEmployer: " + getEmployer() +
                "\nLocation: " + getLocation() +
                "\nPosition Type: " + getPositionType() +
                "\nCore Competency: " + getCoreCompetency() + "\n";

        return str;
    }


    //getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
