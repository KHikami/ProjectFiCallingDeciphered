import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class lkb {
    static final kae a;
    static final AtomicLong b;
    public static final ThreadLocal<ljo> c;
    static ljo d;
    static final List<ljo> e;
    static final Runnable f;
    public static ljo g;
    public static int h;
    public static int i;
    private static final Runnable j;

    static {
        a = new kae("tiktok_systrace", (byte) 0);
        b = new AtomicLong(1);
        c = new ThreadLocal();
        e = new ArrayList();
        f = new lkc();
        i = 0;
        j = new lkd();
    }

    public static lji a(String str) {
        return a(str, lhc.I_AM_THE_FRAMEWORK);
    }

    public static void b(String str) {
        boolean z;
        ljo a = a();
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        bm.b(z, "Tried to end [%s], but no trace was active. This is caused by mismatched or missing calls to beginSpan.", (Object) str);
        bm.b(str.equals(a.c()), "Wrong trace, expected %s but got %s", str, a.c());
        b(a.a());
    }

    public static void a(lji lji) {
        String b = lji.b();
        try {
            lji.a();
        } finally {
            b(b);
        }
    }

    static void a(boolean z) {
        Throwable illegalStateException;
        ljo a = a();
        if (a == null) {
            illegalStateException = new IllegalStateException("Was supposed to have a trace - did you neglect to propagate or create one? See http://go/tiktok-tracing for more details.");
        } else if (a instanceof liy) {
            illegalStateException = new IllegalStateException("Was supposed to have a trace - did you neglect to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((liy) a).d());
        } else {
            illegalStateException = null;
        }
        if (illegalStateException == null) {
            return;
        }
        if (z) {
            Log.e("Tracer", "Missing trace", illegalStateException);
            return;
        }
        throw illegalStateException;
    }

    static ljo a() {
        return (ljo) c.get();
    }

    static ljo b() {
        ljo ljo = (ljo) c.get();
        if (ljo == null) {
            return new lje();
        }
        return ljo;
    }

    static void a(ljo ljo) {
        d = ljo;
    }

    static void b(ljo ljo) {
        int i = VERSION.SDK_INT;
        c.set(ljo);
        if (gwb.aI()) {
            e.add(ljo);
            gwb.a(f);
        }
    }

    public static boolean a(lhc lhc) {
        bm.a((Object) lhc);
        return a() != null;
    }

    static String c(ljo ljo) {
        if (ljo.a() == null) {
            return ljo.c();
        }
        String valueOf = String.valueOf(c(ljo.a()));
        String valueOf2 = String.valueOf(ljo.c());
        return new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()).append(valueOf).append(" -> ").append(valueOf2).toString();
    }

    static void d(ljo ljo) {
        String str;
        if (ljo instanceof liy) {
            String c = c(ljo);
            if (!"".equals(c)) {
                str = ": ";
                c = String.valueOf(c);
                if (c.length() != 0) {
                    c = str.concat(c);
                } else {
                    c = new String(str);
                }
            }
            String valueOf = String.valueOf("go/tiktok-tracing#fixing-duplicate-trace-issues");
            throw new IllegalStateException(new StringBuilder((String.valueOf(c).length() + 346) + String.valueOf(valueOf).length()).append("Already Associated with a trace").append(c).append(". The place you're trying to create a root trace does not have a trace active, but it would have had all traces been properly created and propagated leading to this method being called. Look at the cause of this exception to see where, if a trace was created, it would have been propagated from. For more help, see ").append(valueOf).toString(), ((liy) ljo).d());
        }
        str = String.valueOf(c(ljo));
        valueOf = String.valueOf("go/tiktok-tracing#fixing-duplicate-trace-issues");
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 39) + String.valueOf(valueOf).length()).append("Already associated with a trace: ").append(str).append(", see ").append(valueOf).toString());
    }

    public static lji a(String str, lhc lhc) {
        ljo ljf;
        ljm ljm = ljm.a;
        bm.a((Object) lhc);
        ljo a = a();
        if (a == null) {
            a(true);
            ljf = new ljf(str);
        } else {
            ljf = a.a(str, ljm);
        }
        b(ljf);
        return new lji(ljf);
    }
}
