package p000;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

public final class mpt extends mpz {
    static final MessageFormat f28060a = new MessageFormat("{0}", Locale.ROOT);
    private static final mpt[] f28061d = new mpt[10];

    static {
        for (int i = 0; i < 10; i++) {
            f28061d[i] = new mpt(i);
        }
    }

    public static mpt m32673a(int i) {
        if (i < 10) {
            return f28061d[i];
        }
        return new mpt(i);
    }

    public String mo3911a() {
        return "%s";
    }

    private mpt(int i) {
        super(mog.f28005a, i);
    }

    public Object mo3910a(Object obj, mon mon) {
        if ((obj instanceof Number) || (obj instanceof Date)) {
            return new mpu(obj);
        }
        return obj.getClass().isArray() ? new mpv(obj, mon) : obj;
    }
}
