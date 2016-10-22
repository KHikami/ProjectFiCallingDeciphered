import android.graphics.Rect;
import android.os.Build.VERSION;

/* compiled from: PG */
public final class iy {
    private static iz a;

    static {
        if (VERSION.SDK_INT >= 17) {
            a = new jb();
        } else {
            a = new ja();
        }
    }

    public static void a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        a.a(i, i2, i3, rect, rect2, i4);
    }

    public static int a(int i, int i2) {
        return a.a(i, i2);
    }
}
