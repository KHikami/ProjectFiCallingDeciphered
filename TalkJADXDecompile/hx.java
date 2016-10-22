import android.os.Build.VERSION;

public final class hx {
    static final hy a;

    static {
        if (VERSION.SDK_INT >= 16) {
            a = new hz();
        } else {
            a = new hy();
        }
    }
}
