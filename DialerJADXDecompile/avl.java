import android.os.Looper;

/* compiled from: PG */
public final class avl {
    private static boolean a;

    static {
        a = true;
    }

    public static void a(boolean z) {
        if (!z) {
            if (a) {
                throw new AssertionError("Expected condition to be true");
            }
            buf.b("Assert.isTrue, expected condition to be true", new Object[0]);
        }
    }

    public static void a(Object obj) {
        a(obj != null);
    }

    public static void a() {
        a(Looper.getMainLooper().equals(Looper.myLooper()));
    }

    public static void b() {
        a(!Looper.getMainLooper().equals(Looper.myLooper()));
    }

    public static void c() {
        throw new AssertionError("Fail");
    }
}
