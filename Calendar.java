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
        cal = new HashMap<date, List<Appointment>>();
    }
    /**
     * Creates a new appointment and adds it to the HashMap of Appointments.
     * @param startTim A DateTime object that is the starting time of the appointment.
     * @param endTim A DateTime object that is the ending time of the appointment.
     * @param desc A string that is the description of the appointment.
     */
    public void addApt(DateTime startTim, DateTime endTim, String desc)
    {
        Appointment apt = new Appointment(startTim, endTim, desc);
        if(cal.containsKey(startTim.getDate())){
            List z = (List) cal.get(startTim.getDate());
            z.add(apt);
            
        }else{
            List y;
            y.add(apt);
            cal.put(startTim.getDate(), y);
        }
    }
    /**
     * Deletes a selected appointment from the book.
     * @param startTim A DateTime object that is the starting time of the appointment.
     * @param endTim A DateTime object that is the ending time of the appointment.
     * @param desc A string that is the description of the appointment.
     */
    public void deleteApt(DateTime startTim, DateTime endTim, String desc)
    {
        List z = (List) cal.get(startTim.getDate());
        boolean flag = true;
        int i = 0;
        while(flag){
            Appointment a = (Appointment) z.get(i);
           if(a.getDescription() == desc && a.getStartTime() == startTim && a.getEndTime() == endTim){
               z.remove(i);
               flag = false;
           }
           i++;
        }
        
    }
    /**
     * Prints out all of the appointments for a given day.
     * @param date A Date that is the desired day that the user wants the appointments for.
     */
    public void printApt(date date)
    {
        //Date date = Date(dat);
        if(cal.containsKey(date)){
            List x = (List) cal.get(date);
            System.out.println("Your appointments for " + date + "are: \n");
            for(int i = 0; i<x.size(); i++){
                Appointment a = (Appointment) x.get(i);
                System.out.println(a.getStartTime());
                System.out.println(a.getEndTime());
                System.out.println(a.getDescription());
            }
        }else{
            System.out.println("No appointments");
        }
        
    }
    
    private HashMap cal;
    
}
