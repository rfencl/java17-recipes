
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class PeriodOfDayExample { 
	public static void main(String[] args) {
		final String currentDayPeriodStr     = DateTimeFormatter.ofPattern("B").format(LocalTime.now());
		System.out.println("Pattern B: " + currentDayPeriodStr );
	}
}
