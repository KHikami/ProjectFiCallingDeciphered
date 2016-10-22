import android.os.Build.VERSION;

public final class mn {
    public static final mp a;

    static {
        if (VERSION.SDK_INT >= 11) {
            a = new mo();
        } else {
            a = new mp();
        }
    }
}
