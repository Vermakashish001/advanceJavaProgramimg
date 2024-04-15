import java.time.LocalDate;
import java.time.*;
import java.util.*;
public class LocalDateTime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        LocalDate y = LocalDate.of(year,month,day);
        int dayOfYear = y.getDayOfYear();
        System.out.println(dayOfYear);
    }
}