package New;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Date {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.now();
		
		LocalDate d03 = LocalDate.parse("2023-02-07");
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(d03.format(f1));
		System.out.println(d04);
	}

}
