import android.text.format.Time;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PG */
public final class aip {
    private static TimeZone a;
    private static final SimpleDateFormat[] b;

    static {
        int i = 0;
        a = TimeZone.getTimeZone("UTC");
        SimpleDateFormat[] simpleDateFormatArr = new SimpleDateFormat[]{ail.b, ail.c, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'", Locale.US), new SimpleDateFormat("yyyyMMdd", Locale.US), new SimpleDateFormat("yyyyMMdd'T'HHmmssSSS'Z'", Locale.US), new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.US), new SimpleDateFormat("yyyyMMdd'T'HHmm'Z'", Locale.US)};
        b = simpleDateFormatArr;
        int length = simpleDateFormatArr.length;
        while (i < length) {
            SimpleDateFormat simpleDateFormat = simpleDateFormatArr[i];
            simpleDateFormat.setLenient(true);
            simpleDateFormat.setTimeZone(a);
            i++;
        }
        ail.a.setTimeZone(a);
    }

    public static int a(Time time, long j, long j2) {
        time.set(j);
        int julianDay = Time.getJulianDay(j, time.gmtoff);
        time.set(j2);
        return Math.abs(Time.getJulianDay(j2, time.gmtoff) - julianDay);
    }
}
