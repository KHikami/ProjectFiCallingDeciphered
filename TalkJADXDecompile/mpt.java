import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

public final class mpt extends mpz {
    static final MessageFormat a;
    private static final mpt[] d;

    static {
        a = new MessageFormat("{0}", Locale.ROOT);
        d = new mpt[10];
        for (int i = 0; i < 10; i++) {
            d[i] = new mpt(i);
        }
    }

    public static mpt a(int i) {
        if (i < 10) {
            return d[i];
        }
        return new mpt(i);
    }

    public String a() {
        return "%s";
    }

    private mpt(int i) {
        super(mog.a, i);
    }

    public Object a(Object obj, mon mon) {
        if ((obj instanceof Number) || (obj instanceof Date)) {
            return new mpu(obj);
        }
        return obj.getClass().isArray() ? new mpv(obj, mon) : obj;
    }
}
