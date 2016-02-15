/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Johnny
 */

import java.util.Arrays;

public class DateTime {
    
    private time t;
    private date d;
    
    DateTime(String dt) {
        String y = dt.substring(1, 4);
        int year = Integer.parseInt(y);
        String m = dt.substring(6, 7);
        int month = Integer.parseInt(m);
        String dy = dt.substring(9,10);
        int day = Integer.parseInt(dy);
        String h = dt.substring(12, 14);
        int hour = Integer.parseInt(h);
        String min = dt.substring(16, 17);
        int minute = Integer.parseInt(min);
        int[] daysinmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Error emonth = new Error("Month out of bounds.");
        Error eday = new Error("Day out of bounds.");
        Error ehour = new Error("Hour out of bounds.");
        Error emin = new Error("Minute out of bounds.");
        if (month > 12 || month < 1){
            throw emonth;
        }
        if (day < 1 || day > daysinmonth[month]){
            throw eday;
        }
        if (hour < 0 || hour > 23){
            throw ehour;
        }
        if (minute < 0 || month > 59){
            throw emin;
        }
        time newtime = new time(hour, minute);
        t = newtime;
        date newdate = new date(year, month, day);
        d = newdate;    
    }
    public time getTime(){
        return t;
    }
    public date getDate() {
        return d;
    }
}
