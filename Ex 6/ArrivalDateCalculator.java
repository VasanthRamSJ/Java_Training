import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
/**@author */
class ArrivalDateCalculator {
	
    /** 
     * @param speed
     * @param distance
     * @param date
     * @param time
     * @param startingHour
     * @param startingMinute
     * @return LocalDateTime
     */
    //Calculates the time of arrival 
    static LocalDateTime calculateArrivalTime(int speed,int distance,LocalDate date,LocalTime time,int startingHour,int startingMinute) {
        int drivingHoursPerDay=8;
        int drivingHoursLeft=drivingHoursPerDay;

        boolean isHoliday=HolidayChecker.isHoliday(date);

        while(distance>0){
            // If it's a holiday or if the driving hours lest is zero increment day
            while(isHoliday||drivingHoursLeft==0){
                date=date.plusDays(1);
                time=LocalTime.of(startingHour,startingMinute);
                isHoliday=HolidayChecker.isHoliday(date);
                drivingHoursLeft=drivingHoursPerDay;
            }
            //Calculate the distance that can be covered in the remaining driving hours
            int distancePerDay=drivingHoursLeft*speed;
            //If the remaining distance is less than or equal to the max distance then destination has been reached
            
            if(distance<=distancePerDay){
                int hours=distance/speed;
                int minutes=(distance%speed)*60/speed;
                time=time.plusHours(hours).plusMinutes(minutes);
                distance=0;
            } 
            else
             {
                time=time.plusHours(drivingHoursLeft);
                distance=distance-distancePerDay;
                drivingHoursLeft=0;
             }
        }
        return LocalDateTime.of(date, time);
    }
}