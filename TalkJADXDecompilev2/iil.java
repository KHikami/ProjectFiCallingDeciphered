package defpackage;

import android.os.Looper;
import android.util.Log;

public final class iil {
    public static volatile boolean a = true;
    public static volatile boolean b = true;

    public static void a(String str, boolean z) {
        if (a && !z) {
            throw new AssertionError(str);
        }
    }

    public static void b(String str, boolean z) {
        if (a && z) {
            throw new AssertionError(str);
        }
    }

    public static void a(Object obj, Object obj2) {
        String format;
        try {
            format = String.format("Expected %s and %s to be equal.", new Object[]{obj, obj2});
        } catch (Throwable th) {
            format = "Expected objects to be equal.";
        }
        iil.a(format, obj, obj2);
    }

    public static void a(String str, Object obj, Object obj2) {
        if (a) {
            if (obj == null) {
                if (obj2 == null) {
                    return;
                }
            } else if (obj.equals(obj2)) {
                return;
            }
            Log.e("vclib", str);
            throw new AssertionError("Expected objects to be equal.");
        }
    }

    public static void b(Object obj, Object obj2) {
        String format;
        try {
            format = String.format("Expected different objects in %s and %s.", new Object[]{obj, obj2});
        } catch (Throwable th) {
            format = "Expected objects to be not equal.";
        }
        iil.b(format, obj, obj2);
    }

    public static void b(String str, Object obj, Object obj2) {
        if (a && obj == obj2) {
            Log.e("vclib", str);
            throw new AssertionError("Expected objects to be not equal.");
        }
    }

    public static void a(String str, Object obj) {
        if (a && obj != null) {
            throw new AssertionError(str);
        }
    }

    public static <T> T b(String str, T t) {
        if (!a || t != null) {
            return t;
        }
        throw new AssertionError(str);
    }

    public static void a(String str) {
        if (a) {
            throw new AssertionError(str);
        }
    }

    public static void a(int i, int i2, int i3) {
        iil.a("", i, i2, i3);
    }

    public static void a(String str, int i, int i2, int i3) {
        if (!a) {
            return;
        }
        if (i < i2 || i > i3) {
            Log.e("vclib", String.format("Expected value in range [%d, %d], but was %d. %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i), str}));
            throw new AssertionError(String.format("Value is out of range [%d, %d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    public static void a() {
        if (b && Looper.myLooper() != Looper.getMainLooper() && !Thread.currentThread().getName().contains("test")) {
            String valueOf = String.valueOf(Looper.myLooper());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 32).append("Expected main thread instead of ").append(valueOf).toString());
        }
    }

    public static void b() {
        if (b && Looper.myLooper() == Looper.getMainLooper()) {
            throw new AssertionError("Main thread unexpected");
        }
    }

    public static void c() {
        if (b && !Thread.currentThread().getName().startsWith("GLThread") && !Thread.currentThread().getName().contains("test")) {
            String valueOf = String.valueOf(Thread.currentThread());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 40).append("Expected GL rendering thread instead of ").append(valueOf).toString());
        }
    }

    public static void d() {
        if (b && !Thread.currentThread().getName().equals("CameraOpenThread") && !Thread.currentThread().getName().contains("test")) {
            String valueOf = String.valueOf(Thread.currentThread());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 49).append("Expected CameraOpen background thread instead of ").append(valueOf).toString());
        }
    }

    public static void e() {
        if (b && !Thread.currentThread().getName().equals("DecoderHandlerThread") && !Thread.currentThread().getName().contains("test")) {
            String valueOf = String.valueOf(Thread.currentThread());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 35).append("Expected Decoder thread instead of ").append(valueOf).toString());
        }
    }

    public static void f() {
        if (b && !Thread.currentThread().getName().equals("EncoderHandlerThread") && !Thread.currentThread().getName().contains("test")) {
            String valueOf = String.valueOf(Thread.currentThread());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 35).append("Expected Encoder thread instead of ").append(valueOf).toString());
        }
    }
}
