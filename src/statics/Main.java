package statics;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Allef", LocalDate.of(2000, Month.FEBRUARY, 25), 3700);
        
        System.out.println(p1.getNome());
        System.out.println(p1.getdataNascimento());
        System.out.println(p1.getSalario());
        
    }     
}
