package p000;

import com.google.api.client.http.ExponentialBackOffPolicy;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Pattern;

public final class kfr implements Serializable {
    static final TimeZone f21596a = TimeZone.getTimeZone("GMT");
    static final Pattern f21597b = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private static final long serialVersionUID = 1;
    private final long f21598c;
    private final boolean f21599d;
    private final int f21600e;

    public kfr(long j) {
        this(false, 0, null);
    }

    public kfr(boolean z, long j, Integer num) {
        this.f21599d = z;
        this.f21598c = j;
        int offset = z ? 0 : num == null ? TimeZone.getDefault().getOffset(j) / ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS : num.intValue();
        this.f21600e = offset;
    }

    public String m25735a() {
        StringBuilder stringBuilder = new StringBuilder();
        Calendar gregorianCalendar = new GregorianCalendar(f21596a);
        gregorianCalendar.setTimeInMillis(this.f21598c + (((long) this.f21600e) * 60000));
        kfr.m25734a(stringBuilder, gregorianCalendar.get(1), 4);
        stringBuilder.append('-');
        kfr.m25734a(stringBuilder, gregorianCalendar.get(2) + 1, 2);
        stringBuilder.append('-');
        kfr.m25734a(stringBuilder, gregorianCalendar.get(5), 2);
        if (!this.f21599d) {
            stringBuilder.append('T');
            kfr.m25734a(stringBuilder, gregorianCalendar.get(11), 2);
            stringBuilder.append(':');
            kfr.m25734a(stringBuilder, gregorianCalendar.get(12), 2);
            stringBuilder.append(':');
            kfr.m25734a(stringBuilder, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                stringBuilder.append('.');
                kfr.m25734a(stringBuilder, gregorianCalendar.get(14), 3);
            }
            if (this.f21600e == 0) {
                stringBuilder.append('Z');
            } else {
                int i = this.f21600e;
                if (this.f21600e > 0) {
                    stringBuilder.append('+');
                } else {
                    stringBuilder.append('-');
                    i = -i;
                }
                int i2 = i / 60;
                i %= 60;
                kfr.m25734a(stringBuilder, i2, 2);
                stringBuilder.append(':');
                kfr.m25734a(stringBuilder, i, 2);
            }
        }
        return stringBuilder.toString();
    }

    public String toString() {
        return m25735a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kfr)) {
            return false;
        }
        kfr kfr = (kfr) obj;
        if (this.f21599d == kfr.f21599d && this.f21598c == kfr.f21598c && this.f21600e == kfr.f21600e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.f21598c;
        jArr[1] = this.f21599d ? serialVersionUID : 0;
        jArr[2] = (long) this.f21600e;
        return Arrays.hashCode(jArr);
    }

    private static void m25734a(StringBuilder stringBuilder, int i, int i2) {
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
