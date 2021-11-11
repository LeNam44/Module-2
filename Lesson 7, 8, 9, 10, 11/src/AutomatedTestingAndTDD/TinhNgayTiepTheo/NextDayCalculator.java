package AutomatedTestingAndTDD.TinhNgayTiepTheo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    public static String calculateNextDay(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day + 1);
        Date date = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return dateFormat.format(date);
    }
}
