package RunnerPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

public class ServiceClass {
	
	
	@Test
	private void tc4() {

	
	
	LocalDate date = LocalDate.now();

    LocalDate day = date.plusDays(1);

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    String formattedDate = day.format(dateTimeFormatter);
    
    
    System.out.println(formattedDate);

	}

}
