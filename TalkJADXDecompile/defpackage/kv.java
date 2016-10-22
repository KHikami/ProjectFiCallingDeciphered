package defpackage;

import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: kv */
public final class kv {
    static final kw a;
    public static final Locale b;
    static String c;
    static String d;

    static {
        if (VERSION.SDK_INT >= 17) {
            a = new kx();
        } else {
            a = new kw();
        }
        b = new Locale("", "");
        c = "Arab";
        d = "Hebr";
    }
}
