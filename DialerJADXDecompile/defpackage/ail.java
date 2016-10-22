package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: ail */
public final class ail {
    public static final SimpleDateFormat a;
    public static final SimpleDateFormat b;
    public static final SimpleDateFormat c;
    public static final SimpleDateFormat d;

    static {
        a = new SimpleDateFormat("--MM-dd", Locale.US);
        b = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        d = new SimpleDateFormat("--MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
