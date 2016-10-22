import com.google.api.client.http.ExponentialBackOffPolicy;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Pattern;

public final class kfr implements Serializable {
    static final TimeZone a;
    static final Pattern b;
    private static final long serialVersionUID = 1;
    private final long c;
    private final boolean d;
    private final int e;

    static {
        a = TimeZone.getTimeZone("GMT");
        b = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    }

    public kfr(long j) {
        this(false, 0, null);
    }

    public kfr(boolean z, long j, Integer num) {
        this.d = z;
        this.c = j;
        int offset = z ? 0 : num == null ? TimeZone.getDefault().getOffset(j) / ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS : num.intValue();
        this.e = offset;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        Calendar gregorianCalendar = new GregorianCalendar(a);
        gregorianCalendar.setTimeInMillis(this.c + (((long) this.e) * 60000));
        a(stringBuilder, gregorianCalendar.get(1), 4);
        stringBuilder.append('-');
        a(stringBuilder, gregorianCalendar.get(2) + 1, 2);
        stringBuilder.append('-');
        a(stringBuilder, gregorianCalendar.get(5), 2);
        if (!this.d) {
            stringBuilder.append('T');
            a(stringBuilder, gregorianCalendar.get(11), 2);
            stringBuilder.append(':');
            a(stringBuilder, gregorianCalendar.get(12), 2);
            stringBuilder.append(':');
            a(stringBuilder, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                stringBuilder.append('.');
                a(stringBuilder, gregorianCalendar.get(14), 3);
            }
            if (this.e == 0) {
                stringBuilder.append('Z');
            } else {
                int i = this.e;
                if (this.e > 0) {
                    stringBuilder.append('+');
                } else {
                    stringBuilder.append('-');
                    i = -i;
                }
                int i2 = i / 60;
                i %= 60;
                a(stringBuilder, i2, 2);
                stringBuilder.append(':');
                a(stringBuilder, i, 2);
            }
        }
        return stringBuilder.toString();
    }

    public String toString() {
        return a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kfr)) {
            return false;
        }
        kfr kfr = (kfr) obj;
        if (this.d == kfr.d && this.c == kfr.c && this.e == kfr.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.c;
        jArr[1] = this.d ? serialVersionUID : 0;
        jArr[2] = (long) this.e;
        return Arrays.hashCode(jArr);
    }

    private static void a(StringBuilder stringBuilder, int i, int i2) {
        if (i < 0) {
            stringBuilder.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (i3 = 0; i3 < i2; i3++) {
            stringBuilder.append('0');
        }
        if (i != 0) {
            stringBuilder.append(i);
        }
    }
}
