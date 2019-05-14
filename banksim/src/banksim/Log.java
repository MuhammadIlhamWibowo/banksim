package banksim;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Log {

    public static String addLog(String type, double jumlah, double saldo) {
        return "\n" + getTime() + "\t" + type + "\t" + jumlah + "\t" + saldo;
    }

    public static String getTime() {

        return "" + GregorianCalendar.getInstance().get(Calendar.DAY_OF_MONTH) + "/"
                + (GregorianCalendar.getInstance().get(Calendar.MONTH + 1)) + "/"
                + (GregorianCalendar.getInstance().get(Calendar.YEAR));
    }

}
