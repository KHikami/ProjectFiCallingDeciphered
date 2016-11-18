package p000;

import android.os.Build.VERSION;
import java.util.Locale;

public final class kv {
    static final kw f23533a;
    public static final Locale f23534b = new Locale("", "");
    static String f23535c = "Arab";
    static String f23536d = "Hebr";

    static {
        if (VERSION.SDK_INT >= 17) {
            f23533a = new kx();
        } else {
            f23533a = new kw();
        }
    }
}
