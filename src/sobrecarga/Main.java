package sobrecarga;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        Sobrecarga sobrecarga1 = new Sobrecarga();
        
        System.out.println(sobrecarga1.somar("Allef", LocalDate.of(2000, Month.FEBRUARY, 25), "doc"));
        System.out.println(sobrecarga1.somar("Allef", "fellA"));
        
        
    }
}
