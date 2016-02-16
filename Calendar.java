import java.util.HashMap;
import java.util.List;
/**
 * A class that keeps track of all appointments.
 */
public class Calendar {
    /**
     * The constructor for Calendar.
     */
    public Caledar(){
        cal = new HashMap<date, List>();
    }
    /**
     * Creates a new appointment and adds it to the HashMap of Appointments.
     * @param startTim A DateTime object that is the starting time of the appointment.
     * @param endTim A DateTime object that is the ending time of the appointment.
     * @param desc A string that is the description of the appointment.
     */
    public void addApt(dateTime startTim, dateTime endTim, String desc)
    {
        Appointment apt = new Appointment(startTim, endTim, desc);
        if(cal.containsKey(startTim.getDate())){
            cal.getClass(startTim.getDate()).add(apt);
            
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
    public void deleteApt(dateTime startTim, dateTime endTim, String desc)
    {
        Appointment apt = new Appointment(startTim, endTim, desc);
        List z = cal.get(startTim.getDate());
        boolean flag = true;
        int i = 0;
        while(flag){
           if(z.get(i).getDescription()==desc && z.get(i).getStartTime() == startTim ){
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
            List x = cal.get(date);
            System.out.println("Your appointments for " + date + "are: \n");
            for(int i = 0; i<x.size(); i++){
                System.out.println(x.get(i).getStartTime() + x.get(i).getEndTime() + x.get(i).getDescription());
            }
        }else{
            System.out.println("No appointments");
        }
        
    }
    
    private HashMap cal;
    
}
