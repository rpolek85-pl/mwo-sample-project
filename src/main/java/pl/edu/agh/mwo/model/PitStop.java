package pl.edu.agh.mwo.model;

import java.time.LocalDateTime;

public class PitStop {
    int session_key;
    int meeting_key;
    LocalDateTime start_time;
    int driverNumber;
    Double pitDuration;
    int lapNumber;

    public PitStop(int session_key, int meeting_key, LocalDateTime start_time, int driverNumber, Double pitDuration, int lapNumber) {
        this.session_key = session_key;
        this.meeting_key = meeting_key;
        this.start_time = start_time;
        this.driverNumber = driverNumber;
        this.pitDuration = pitDuration;
        this.lapNumber = lapNumber;
    }

    public  int getSession_key() {
        return session_key;
    }
    public void setSession_key(int session_key) {
        this.session_key = session_key;
    }

    public int getMeeting_key() {
        return meeting_key;
    }

    public void setMeeting_key(int meeting_key) {
        this.meeting_key = meeting_key;
    }

    public LocalDateTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalDateTime start_time) {
        this.start_time = start_time;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public Double getPitDuration() {
        return pitDuration;
    }

    public void setPitDuration(Double pitDuration) {
        this.pitDuration = pitDuration;
    }

    public int getLapNumber() {
        return lapNumber;
    }

    public void setLapNumber(int lapNumber) {
        this.lapNumber = lapNumber;
    }

}


