import android.os.Build.VERSION;

/* compiled from: PG */
public final class pc {
    public static final pf a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            a = new pe((byte) 0);
        } else if (i >= 18) {
            a = new pe();
        } else if (i >= 17) {
            a = new pd();
        } else if (i >= 16) {
            a = new pf((byte) 0);
        } else {
            a = new pf();
        }
    }
}
