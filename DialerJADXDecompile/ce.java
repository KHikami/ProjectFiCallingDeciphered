import android.os.Build.VERSION;

/* compiled from: PG */
public final class ce {
    public static final cf a;

    static {
        if (VERSION.SDK_INT >= 12) {
            a = new ch();
        } else {
            a = new cg();
        }
    }
}
