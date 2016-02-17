import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * A class that keeps track of all appointments.
 */
public class Calendar {
    /**
     * The constructor for Calendar.
     */
    public Calendar(){
        cal = new HashMap<Integer, ArrayList<Appointment>>();
    }
    /**
     * Creates a new appointment and adds it to the HashMap of Appointments.
     * @param startTim A DateTime object that is the starting time of the appointment.
     * @param endTim A DateTime object that is the ending time of the appointment.
     * @param desc A string that is the description of the appointment.
     */
    public void addApt(DateTime startTim, DateTime endTim, String desc)
    {
        int year = startTim.getDate().getYear();
        int month = startTim.getDate().getMonth();
        int day = startTim.getDate().getDay();
        int fullDate = (year * 10000) + (month * 100) + (day);
        Appointment apt = new Appointment(startTim, endTim, desc);
        if(cal.containsKey(fullDate)){
            ArrayList z = (ArrayList) cal.get(fullDate);
            z.add(apt);
            
        }else{
            ArrayList y = new ArrayList<Appointment>() {};
            y.add(apt);
            cal.put(fullDate, y);
        }
    }
    /**
     * Deletes a selected appointment from the book.
     * @param startTim A DateTime object that is the starting time of the appointment.
     * @param desc A string that is the description of the appointment.
     */
    public void deleteApt(DateTime startTim, String desc)
    {
        int year = startTim.getDate().getYear();
        int month = startTim.getDate().getMonth();
        int day = startTim.getDate().getDay();
        int fullDate = (year * 10000) + (month * 100) + (day);
        ArrayList z = (ArrayList) cal.get(fullDate);
        boolean flag = true;
        int i = 0;
        while(flag){
           Appointment a = (Appointment) z.get(i);
           if(a.getDescription().equals(desc)){
               z.remove(i);
               flag = false;
           }
           i++;
        }
        System.out.println("Your appointment is deleted.\n");
        
    }
    /**
     * Prints out all of the appointments for a given day.
     * @param date A Date that is the desired day that the user wants the appointments for.
     */
    public void printApt(date date)
    {
        int year = date.getYear();
        int month = date.getMonth();
        int day = date.getDay();
        int fullDate = (year * 10000) + (month * 100) + (day);
        //Date date = Date(dat);
        if(cal.containsKey(fullDate)){
            ArrayList x = (ArrayList) cal.get(fullDate);
            if (!x.isEmpty()){
	      String textDate = Integer.toString(year) + "/" + Integer.toString(month) + "/" + Integer.toString(day);
	      System.out.println("Your appointments for " + textDate + " are: \n");
	      for(int i = 0; i < x.size(); i++) {
		  Appointment a = (Appointment) x.get(i);
		  
		  System.out.print(Integer.toString(a.getStartTime().getTime().getHour()) + ":");
		  System.out.print(Integer.toString(a.getStartTime().getTime().getMinute()) + " - ");
		  System.out.print(Integer.toString(a.getEndTime().getTime().getHour()) + ":");
		  System.out.print(Integer.toString(a.getEndTime().getTime().getMinute()) + " desc: ");
		  System.out.print(a.getDescription() + "\n");
	      }
            }else{
		System.out.println("No appointments");
	    }
            
        }else{
            System.out.println("No appointments");
        }
        
    }
    
    private HashMap cal;
    
}
