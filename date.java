/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Johnny
 */
public class date {
   
    private int year;
    private int month;
    private int day;
    
    date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }
    
    public void setYear(int y) {
        year = y;
    }
    
    public void setMonth(int m) {
        month = m;
    }
    
    public void setDay(int d) {
        day = d;
    }
    
    public int getYear(){
        return year;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
}
