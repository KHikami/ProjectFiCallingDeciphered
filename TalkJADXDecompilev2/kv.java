package defpackage;

import android.os.Build.VERSION;
import java.util.Locale;

public final class kv {
    static final kw a;
    public static final Locale b = new Locale("", "");
    static String c = "Arab";
    static String d = "Hebr";

    static {
        if (VERSION.SDK_INT >= 17) {
            a = new kx();
        } else {
            a = new kw();
        }
    }
}
