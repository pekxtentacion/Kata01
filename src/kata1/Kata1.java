package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Adrián", new Date(97,10,9));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
        
    }
    
}
