import android.text.TextUtils;
import android.text.format.Time;

/* compiled from: PG */
public final class ams {
    private static final Time b;
    final amt a;

    static {
        b = new Time();
    }

    public ams(amt amt) {
        this.a = amt;
    }

    static boolean a(String str, String str2, String str3, String str4) {
        return TextUtils.equals(str, str2) && TextUtils.equals(str3, str4);
    }

    static boolean a(String str, String str2) {
        if (str != null && str2 != null) {
            String substring;
            int indexOf = str.indexOf(64);
            String substring2;
            if (indexOf != -1) {
                substring = str.substring(0, indexOf);
                substring2 = str.substring(indexOf);
                str = substring;
            } else {
                substring2 = "";
            }
            int indexOf2 = str2.indexOf(64);
            if (indexOf2 != -1) {
                String substring3 = str2.substring(0, indexOf2);
                substring = str2.substring(indexOf2);
                str2 = substring3;
            } else {
                substring = "";
            }
            if (str.equals(str2) && r0.equalsIgnoreCase(r1)) {
                return true;
            }
            return false;
        } else if (str == str2) {
            return true;
        } else {
            return false;
        }
    }

    static int a(long j, long j2) {
        int a = aip.a(b, j, j2);
        if (a == 0) {
            return 0;
        }
        if (a != 1) {
            return 2;
        }
        return 1;
    }

    static boolean a(int i, int i2) {
        return (i == 4 || i2 == 4) ? false : true;
    }

    static boolean b(int i, int i2) {
        return (i == 6 || i2 == 6) ? false : true;
    }

    static boolean c(int i, int i2) {
        return i == 6 && i2 == 6;
    }
}
