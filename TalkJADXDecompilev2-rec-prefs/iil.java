package p000;

import android.os.Looper;
import android.util.Log;

public final class iil {
    public static volatile boolean f17732a = true;
    public static volatile boolean f17733b = true;

    public static void m21874a(String str, boolean z) {
        if (f17732a && !z) {
            throw new AssertionError(str);
        }
    }

    public static void m21879b(String str, boolean z) {
        if (f17732a && z) {
            throw new AssertionError(str);
        }
    }

    public static void m21869a(Object obj, Object obj2) {
        String format;
        try {
            format = String.format("Expected %s and %s to be equal.", new Object[]{obj, obj2});
        } catch (Throwable th) {
            format = "Expected objects to be equal.";
        }
        iil.m21873a(format, obj, obj2);
    }

    public static void m21873a(String str, Object obj, Object obj2) {
        if (f17732a) {
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

    public static void m21877b(Object obj, Object obj2) {
        String format;
        try {
            format = String.format("Expected different objects in %s and %s.", new Object[]{obj, obj2});
        } catch (Throwable th) {
            format = "Expected objects to be not equal.";
        }
        iil.m21878b(format, obj, obj2);
    }

    public static void m21878b(String str, Object obj, Object obj2) {
        if (f17732a && obj == obj2) {
            Log.e("vclib", str);
            throw new AssertionError("Expected objects to be not equal.");
        }
    }

    public static void m21872a(String str, Object obj) {
        if (f17732a && obj != null) {
            throw new AssertionError(str);
        }
    }

    public static <T> T m21875b(String str, T t) {
        if (!f17732a || t != null) {
            return t;
        }
        throw new AssertionError(str);
    }

    public static void m21870a(String str) {
        if (f17732a) {
            throw new AssertionError(str);
        }
    }

    public static void m21868a(int i, int i2, int i3) {
        iil.m21871a("", i, i2, i3);
    }

    public static void m21871a(String str, int i, int i2, int i3) {
        if (!f17732a) {
            return;
        }
        if (i < i2 || i > i3) {
            Log.e("vclib", String.format("Expected value in range [%d, %d], but was %d. %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i), str}));
            throw new AssertionError(String.format("Value is out of range [%d, %d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    public static void m21867a() {
        if (f17733b && Looper.myLooper() != Looper.getMainLooper() && !Thread.currentThread().getName().contains("test")) {
            String valueOf = String.valueOf(Looper.myLooper());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 32).append("Expected main thread instead of ").append(valueOf).toString());
        }
    }

    public static void m21876b() {
        if (f17733b && Looper.myLooper() == Looper.getMainLooper()) {
            throw new AssertionError("Main thread unexpected");
        }
    }

    public static void m21880c() {
        if (f17733b && !Thread.currentThread().getName().startsWith("GLThread") && !Thread.currentThread().getName().contains("test")) {
            String valueOf = String.valueOf(Thread.currentThread());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 40).append("Expected GL rendering thread instead of ").append(valueOf).toString());
        }
    }

    public static void m21881d() {
        if (f17733b && !Thread.currentThread().getName().equals("CameraOpenThread") && !Thread.currentThread().getName().contains("test")) {
            String valueOf = String.valueOf(Thread.currentThread());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 49).append("Expected CameraOpen background thread instead of ").append(valueOf).toString());
        }
    }

    public static void m21882e() {
        if (f17733b && !Thread.currentThread().getName().equals("DecoderHandlerThread") && !Thread.currentThread().getName().contains("test")) {
            String valueOf = String.valueOf(Thread.currentThread());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 35).append("Expected Decoder thread instead of ").append(valueOf).toString());
        }
    }

    public static void m21883f() {
        if (f17733b && !Thread.currentThread().getName().equals("EncoderHandlerThread") && !Thread.currentThread().getName().contains("test")) {
            String valueOf = String.valueOf(Thread.currentThread());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 35).append("Expected Encoder thread instead of ").append(valueOf).toString());
        }
    }
}
