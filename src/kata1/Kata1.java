package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(1997, 11, 9);
        
        Person person = new Person("Adrián", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
        
    }
    
}
