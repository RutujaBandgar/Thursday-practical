import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2000, 03, 13);

		Period period = Period.between(birthday, today);
		
		System.out.println("Age : "+period.getYears());
	}

}
