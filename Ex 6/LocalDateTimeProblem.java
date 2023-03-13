
import java.time.*;
import java.util.Scanner;
/**
 * 
 */
public class LocalDateTimeProblem {	
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the average speed in Km/hr at which the driver will drive the truck");
		int startingDay = 0, startingMonth = 0, startingYear = 0;
		int speed = Integer.parseInt(scan.nextLine());
		boolean exitloop=false;
		while (!exitloop) {
			
				try {
					System.out.println("Enter the date on which the journey starts in dd:mm:yy format");
					String StartingDate = scan.nextLine();
					startingDay = Integer.parseInt(StartingDate.split(":")[0].toString());
					startingMonth = Integer.parseInt(StartingDate.split(":")[1].toString());
					startingYear = Integer.parseInt(StartingDate.split(":")[2].toString());	
					System.out.println("Enter the time at which the journey starts in hh:mm format");
					String StartingTime = scan.nextLine();
					int startingHour = 0, startingMinute = 0;
					startingHour = Integer.parseInt(StartingTime.split(":")[0].toString());
					startingMinute = Integer.parseInt(StartingTime.split(":")[1].toString());
					LocalDate date = LocalDate.of(startingYear, startingMonth, startingDay);
					LocalTime time = LocalTime.of(startingHour, startingMinute);
					System.out.println("Enter the distance to be travelled in kms:");
					int distance = Integer.parseInt(scan.nextLine());
					LocalDateTime timeOfArrival = ArrivalDateCalculator.calculateArrivalTime(speed, distance, date, time,
					startingHour, startingMinute);		
					System.out.println("Expected time of arrival: " + timeOfArrival);
					exitloop=true;
				
					
				
				
			} catch (Exception e) {
				System.out.println("Invalid input format. Please enter the correct format.");
			}
			
		}
		scan.close();
		//the loop will continue until the correct date format is given..so scanner will be closed for sure at the end of the program.
		
		
		
	}
}
