import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import java.time.Instant;
import java.time.LocalDate;

public class DateExample {
  private static Date date;
  private static SimpleDateFormat day;
  private static long ms;

  public static void main(String[] args) {
      date = new Date();
      day = new SimpleDateFormat("EEE", Locale.UK); 
      LocalDate a = LocalDate.of(2017, 2, 23);
      // ms = System.currentTimeMillis();
      ms =Instant.now().toEpochMilli();
      
      System.out.println("Today is " + day.format(date));
      System.out.println(ms + " ms has passed since 1st of January 1970");
      System.out.println(a.getDayOfWeek().name() + " is approaching!");
   }
}