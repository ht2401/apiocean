package com.example.springjpa.model.request;

import lombok.Data;

import java.sql.Time;
import java.time.LocalDate;

@Data
public class PersonnelRequest {
    private String username;
    private String position;
    private Time time_in;
    private Time time_out;

    public PersonnelRequest() {
    }

    public PersonnelRequest(String username, String position, Time time_in, Time time_out) {
        this.username = username;
        this.position = position;
        this.time_in = time_in;
        this.time_out = time_out;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Time getTime_in() {
        return time_in;
    }

    public void setTime_in(Time time_in) {
        this.time_in = time_in;
    }

    public Time getTime_out() {
        return time_out;
    }

    public void setTime_out(Time time_out) {
        this.time_out = time_out;
    }
}

