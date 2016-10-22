import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
public final class bci extends OrientationEventListener {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;

    static {
        a = 0;
        b = 90;
        f = 180;
        c = 270;
        g = 360;
        d = 10;
        e = 5;
        h = -1;
        i = 10;
        j = 0;
    }

    public bci(Context context) {
        super(context);
    }

    private static boolean a(int i, int i2, int i3) {
        return i >= i2 && i < i3;
    }

    private static boolean b(int i, int i2, int i3) {
        return a(i, i2 - i3, i2 + i3);
    }

    public final void onOrientationChanged(int i) {
        int i2 = 0;
        if (i != -1) {
            int i3 = g;
            if (!(a(i, i3 - i, i3) || a(i, 0, i + 0))) {
                i2 = b(i, b, i) ? c : b(i, f, i) ? f : b(i, c, i) ? b : h;
            }
            if (i2 != h && j != i2) {
                j = i2;
                bcj.b().a(j);
            }
        }
    }

    public final void a(boolean z) {
        super.enable();
        if (z) {
            bcj.b().a(j);
        }
    }

    public final void enable() {
        a(false);
    }
}
