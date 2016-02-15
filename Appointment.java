/**
 * A class that holds data related to an individual appointment
 * 
 * @author Ben Schwabe & Tom Salvi
 */
public class Appointment {
    /**
     * Constructs a new appointment
     * @param _startDateTime A DateTime object with the date and time the appointment starts
     * @param _endDateTime A DateTime object with the date and time the appointment ends
     * @param _description A String object holding a brief description about the appointment
     */
    public Appointment(DateTime _startDateTime, DateTime _endDateTime, String _description){
        startTime = _startDateTime;
        endTime = _endDateTime;
        description = _description;
    }
    /**
     * Sets the starting date and time for the appointment
     * @param _startDateTime A DateTime object with the date and time the appointment starts
     */
    public void setStartTime(DateTime _startDateTime){
        startTime = _startDateTime;
    }
    /**
     * Sets the ending date and time for the appointment
     * @param _endDateTime A DateTime object with the date and time the appointment ends
     */
    public void setEndTime(DateTime _endDateTime){
        endTime = _endDateTime;
    }
    /**
     * Sets the description for the appointment
     * @param _description A String object holding a brief description about the appointment
     */
    public void setDescription(String _description){
        description = _description;
    }
    /**
     * Gets the starting date and time of the appointment
     * @return the starting date and time of the appointment
     */
    public DateTime getStartTime(){
        return startTime;
    }
    /**
     * Gets the ending date and time of the appointment
     * @return the ending date and time of the appointment
     */
    public DateTime getEndTime(){
        return endTime;
    }
    /**
     * Gets the description of the appointment
     * @return the description of the appointment
     */
    public DateTime getDescription(){
        return description;
    }
    
    private DateTime startTime;
    private DateTime endTime;
    private String description;
}
