import android.os.Build.VERSION;
import android.view.ViewConfiguration;

/* compiled from: PG */
public final class kz {
    public static final ld a;

    static {
        if (VERSION.SDK_INT >= 14) {
            a = new lc();
        } else if (VERSION.SDK_INT >= 11) {
            a = new lb();
        } else if (VERSION.SDK_INT >= 8) {
            a = new la();
        } else {
            a = new ld();
        }
    }

    public static boolean a(ViewConfiguration viewConfiguration) {
        return a.b(viewConfiguration);
    }
}
