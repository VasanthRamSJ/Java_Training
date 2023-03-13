import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class HolidayChecker {
	   
       /** 
        * @param date
        * @return boolean
        */
       // Determines whether a given date is a holiday
    static boolean isHoliday(LocalDate date){
        MonthDay monthDay=MonthDay.of(date.getMonthValue(), date.getDayOfMonth());
        if(monthDay.equals(MonthDay.of(1, 1))||monthDay.equals(MonthDay.of(8, 15))||monthDay.equals(MonthDay.of(1, 26))){
            return true;
        } 
        else if(date.getDayOfWeek()==DayOfWeek.SUNDAY){
            return true;
        } 
        else if(date.getDayOfWeek()==DayOfWeek.SATURDAY && (date.get(ChronoField.ALIGNED_WEEK_OF_MONTH)==2 || date.get(ChronoField.ALIGNED_WEEK_OF_MONTH)==4)){
              return true;
        }
	    else {
	          return false;
        }
    }
}