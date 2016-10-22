import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.util.Log;

public abstract class cme {
    public static final Object a;
    public static cmk b;
    public static int c;
    public final String d;
    public final Object e;
    private Object f;

    static {
        a = new Object();
        b = null;
        c = 0;
    }

    protected cme(String str, Object obj) {
        this.f = null;
        this.d = str;
        this.e = obj;
    }

    public static cme a(String str, Float f) {
        return new cmi(str, f);
    }

    public static cme a(String str, Integer num) {
        return new cmh(str, num);
    }

    public static cme a(String str, Long l) {
        return new cmg(str, l);
    }

    public static cme a(String str, String str2) {
        return new cmj(str, str2);
    }

    public static cme a(String str, boolean z) {
        return new cmf(str, Boolean.valueOf(z));
    }

    public static void a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new cmk(context.getContentResolver());
            }
            if (c == 0) {
                try {
                    c = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid;
                } catch (NameNotFoundException e) {
                    Log.e("GservicesValue", e.toString());
                }
            }
        }
    }

    public static boolean a() {
        return b != null;
    }

    protected abstract Object a(String str);

    public final Object b() {
        return a(this.d);
    }

    public final Object c() {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Object b = b();
            return b;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
