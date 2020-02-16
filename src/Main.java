import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        if(majority(26, 5, 1997)){
            System.out.println("Pełnoletni.");
        } else {
            System.out.println("Niepełnoletni.");
        }
    }

    public static boolean majority(int day, int month, int year){
        LocalDate birthDate = LocalDate.of(day, month, year);
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthDate, now);
        if (period.getYears() < 18) return false;
        return true;
    }
}
