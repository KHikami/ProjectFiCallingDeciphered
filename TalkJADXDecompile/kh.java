import android.os.Build.VERSION;

public final class kh {
    static final ki a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            a = new kl();
        } else if (i >= 14) {
            a = new kk();
        } else {
            a = new kj();
        }
    }
}
