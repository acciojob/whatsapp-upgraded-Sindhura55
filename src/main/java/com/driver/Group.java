package com.driver;

public class Group {
    private String name;
    private int numberOfParticipants;
    public Group(){

    }
    public Group(String name,int numberOfParticipants){
        this.numberOfParticipants=numberOfParticipants;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }
}
