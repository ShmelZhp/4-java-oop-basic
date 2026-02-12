package com.example.task02;

public class TimeSpan {

    private int hours;
    private int minutes;
    private int seconds;

    public int getHours(){ return hours; }
    public void setHours(int hours){ this.hours = hours; }

    public int getMinutes(){ return minutes; }
    public void setMinutes(int minutes){ this.minutes = minutes; }

    public int getSeconds(){ return seconds; }
    public void setSeconds(int seconds){ this.seconds = seconds; }

    public TimeSpan(int hours,int minutes, int seconds){
        setTime(hours, minutes, seconds);
    }

    public void setTime(int hours, int minutes, int seconds){

        if (hours < 0 || minutes < 0 || seconds < 0)
            throw new IllegalArgumentException("Отрицательное время");

        int total = hours * 3600 + minutes * 60 + seconds;

        this.hours = total / 3600;
        this.minutes = (total % 3600) / 60;
        this.seconds = total % 60;
    }

    public void add(TimeSpan time){
        setTime(hours+this.hours, minutes+this.minutes, seconds+this.seconds);

    }

    void subtract(TimeSpan time){
        if ((time.hours * 3600 + time.minutes * 60 + time.seconds) > (hours * 3600 + minutes * 60 + seconds)){
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
        else {
            setTime(hours-this.hours, minutes-this.minutes, seconds-this.seconds);
        }
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}
