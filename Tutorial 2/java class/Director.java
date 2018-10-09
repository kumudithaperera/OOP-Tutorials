package tut2;

import java.util.*;

public class Director {

    private String name;
    private String surName;
    private int numberOfMoviesDirected;
    private Date dateOfBirth;


    public Director(String name, String surName) {
        this.name=name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getNumberOfMoviesDirected() {
        return numberOfMoviesDirected;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setNumberOfMoviesDirected(int numberOfMoviesDirected) {
        this.numberOfMoviesDirected = numberOfMoviesDirected;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth=dateOfBirth;
    }


    @Override
    public String toString()
    {
        return "Director[ Name ="+this.name+" , Surname = "+this.surName+", DoB = "+this.dateOfBirth.getDate()+
                ", Movies directed = "+this.numberOfMoviesDirected+"]";
    }




}
