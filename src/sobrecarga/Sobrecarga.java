package sobrecarga;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Sobrecarga {
    public String somar (String a, String b){
    return a+"."+b;
    }
    
    public String somar (String a, LocalDate hoje, String c){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return a+"-"+hoje.format(formatar)+"."+c;
    }
}
