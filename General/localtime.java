import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localtime extends Thread{
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;//

        String myDate = dt.format(df);
        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate);

    }
}