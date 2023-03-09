
import java.time.*;
import java.util.Scanner;

public class LocalDateTimeProblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (true) {
			try  {
				System.out.println("Enter the average speed in Km/hr at which the driver will drive the truck");

				int startingDay = 0, startingMonth = 0, startingYear = 0;
				int speed = Integer.parseInt(scan.nextLine());
				System.out.println("Enter the date on which the journey starts in dd:mm:yy format");
				String StartingDate = scan.nextLine();
				startingDay = Integer.parseInt(StartingDate.split(":")[0].toString());
				startingMonth = Integer.parseInt(StartingDate.split(":")[1].toString());
				startingYear = Integer.parseInt(StartingDate.split(":")[2].toString());
				i=1;
				System.out.println("Enter the time at which the journey starts in hh:mm format");
				String StartingTime = scan.nextLine();
				
				int startingHour = 0, startingMinute = 0;
				startingHour = Integer.parseInt(StartingTime.split(":")[0].toString());
				startingMinute = Integer.parseInt(StartingTime.split(":")[1].toString());
				i=2;
				LocalDate date = LocalDate.of(startingYear, startingMonth, startingDay);

				LocalTime time = LocalTime.of(startingHour, startingMinute);
				System.out.println("Enter the distance to be travelled in kms:");
				int distance = Integer.parseInt(scan.nextLine());

				// Calculate time of arrival
				LocalDateTime timeOfArrival = ArrivalDateCalculator.calculateArrivalTime(speed, distance, date, time,
						startingHour, startingMinute);
				
				if(i==2){
					break;
				}
				// Print time of arrival
				System.out.println("Expected time of arrival: " + timeOfArrival);
			} catch (Exception e) {
				if (i == 0) {
					System.out.println("Date format is not matching..please enter it in the correct format from the first");
					
				}
				if (i == 1) {
					System.out.println("Time format is not matching..please enter it in the correct format from the first..");
				}

			}

		}
		scan.close();
	}
}
