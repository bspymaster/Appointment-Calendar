/**
 * An interface to use with the Calendar class
 * 
 * @author Ben Schwabe
 */

import java.util.Scanner;
public class main {
    
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        Calendar cal = new Calendar();
        boolean run = true;
        while(run){
            System.out.print("Welcome to the Calendar! Please choose and option!\n1) Add an appointment\n2) Delete an appointment\n3) Show all the appointments for a day.\n4) Quit\n> ");
            String input = in.next();
            if(input.equals("1")){
                System.out.print("\nPlease enter a description of the appointment:\n> ");
                String desc = in.next(); //catches first word (waits for it)
                desc += in.nextLine(); //catches rest of the line (does not wait)
                
                System.out.print("Please enter a starting date in the format yyyy/mm/dd\n> ");
                String startDay = in.next();
                System.out.print("Please enter a starting time in the format hh:mm, where hh is between 00 and 23, and minute is between 00 and 59\n> ");
                String startTime = in.next();
                DateTime startDate = new DateTime(startDay + " " + startTime);
                
                System.out.print("Please enter an ending date in the format yyyy/mm/dd\n> ");
                String endDay = in.next();
                System.out.print("Please enter an ending time in the format hh:mm, where hh is between 00 and 23, and minute is between 00 and 59\n> ");
                String endTime = in.next();
                DateTime endDate = new DateTime(endDay + " " + endTime);
                
                cal.addApt(startDate,endDate,desc);
            }else if(input.equals("2")){
                System.out.print("\nPlease enter a description matching the appointment to delete:\n> ");
                String desc = in.next(); //catches first word (waits for it)
                desc += in.nextLine(); //catches rest of the line (does not wait)
                
                System.out.print("Please enter the starting date in the format yyyy/mm/dd\n> ");
                String startDay = in.next();
                System.out.print("Please enter the starting time in the format hh:mm, where hh is between 00 and 23, and minute is between 00 and 59\n> ");
                String startTime = in.next();
                DateTime startDate = new DateTime(startDay + " " + startTime);
                
                cal.deleteApt(startDate, desc);
            }else if(input.equals("3")){
                System.out.print("Please enter a year you would like to see the appointments for.\n> ");
                int year = Integer.parseInt(in.next());
                System.out.print("Please enter a month you would like to see the appointments for.\n> ");
                int month = Integer.parseInt(in.next());
                System.out.print("Please enter a day you would like to see the appointments for.\n> ");
                int day = Integer.parseInt(in.next());
                date dateObj = new date(year,month,day);
                cal.printApt(dateObj);
            }else if(input.equals("4")){
                run = false;
            }else{
                System.out.println("ERROR: Invalid input. Please try again.\n");
            }
        }
    }
}
