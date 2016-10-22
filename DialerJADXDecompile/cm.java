import android.os.Build.VERSION;

/* compiled from: PG */
public final class cm {
    public static final co a;

    static {
        if (VERSION.SDK_INT >= 23) {
            a = new cn();
        } else {
            a = new co();
        }
    }
}
