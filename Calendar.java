import java.util.Hashmap;
import java.util.List;
/**
 * A class that keeps track of all appointments.
 */
public class Calendar {
    /**
     * Creates a new appointment and adds it to the Hashmap of Appointments.
     * @param startTim A DateTime object that is the starting time of the appointment.
     * @param endTim A DateTime object that is the ending time of the appointment.
     * @param desc A string that is the description of the appointment.
     * @param date A Date that is the date the appointment takes place.
     */
    public void addAppointment(DateTime startTim, DateTime endTim, String desc, Date date)
    {
        Appointment app = Appointment(startTim, endTim, desc);
        if(cal.containsKey(date)){
            cal.getClass(date).append(app);
            
        }else{
            List y;
            y.append(app);
            cal.put(date, y);
        }
    }
    /**
     * Deletes a selected appointment from the book.
     * @param app The appointment that is desired to be deleted.
     * @param dat A Date that is the date of the appointment that is to be removed.
     */
    public void deleteApp(Appointment app, Date dat)
    {
        List z = cal.get(dat);
        boolean flag = true;
        int i = 0;
        while(flag){
           if(z.get(i)==app){
               z.remove(app);
               flag = false;
           }
           i++;
        }
        
    }
    /**
     * Prints out all of the appointments for a given day.
     * @param dat A Date that is the desired day that the user wants the appointments for.
     */
    public void printApp(Date dat)
    {
        if(cal.containsKey(dat)){
            List x = [];
            x = cal.get(dat);
            System.out.println("Your appointments for " + dat + "are: \n");
            for(int i = 0; i<x.size(); i++){
                System.out.println(x.get(i).getStartTime() + x.get(i).getEndTime() + x.get(i).getDescription());
            }
        }else{
            System.out.println("No appointments");
        }
        
    }
    
    private Hashmap cal;
    
}

