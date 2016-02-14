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
        cal = new HashMap<Date, List>();
    }
    /**
     * Creates a new appointment and adds it to the Hashmap of Appointments.
     * @param startTim A DateTime object that is the starting time of the appointment.
     * @param endTim A DateTime object that is the ending time of the appointment.
     * @param desc A string that is the description of the appointment.
     * @param date A Date that is the date the appointment takes place.
     */
    @SuppressWarnings("empty-statement")
    public void addApt(DateTime startTim, DateTime endTim, String desc, Date date)
    {
        Appointment apt = new Appointment(startTim, endTim, desc);
        if(cal.containsKey(date)){
            cal.getClass(date).add(apt);
            
        }else{
            List y;
            y.add(apt);
            cal.put(date, y);
        }
    }
    /**
     * Deletes a selected appointment from the book.
     * @param apt The appointment that is desired to be deleted.
     * @param dat A Date that is the date of the appointment that is to be removed.
     */
    public void deleteApt(Appointment apt, Date dat)
    {
        List z = cal.get(dat);
        boolean flag = true;
        int i = 0;
        while(flag){
           if(z.get(i)==apt){
               z.remove(apt);
               flag = false;
           }
           i++;
        }
        
    }
    /**
     * Prints out all of the appointments for a given day.
     * @param date A Date that is the desired day that the user wants the appointments for.
     */
    public void printApt(Date date)
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
