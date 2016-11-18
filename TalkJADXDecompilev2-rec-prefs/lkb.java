package p000;

import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class lkb {
    static final kae f25134a = new kae("tiktok_systrace", (byte) 0);
    static final AtomicLong f25135b = new AtomicLong(1);
    public static final ThreadLocal<ljo> f25136c = new ThreadLocal();
    static ljo f25137d;
    static final List<ljo> f25138e = new ArrayList();
    static final Runnable f25139f = new lkc();
    public static ljo f25140g;
    public static int f25141h;
    public static int f25142i = 0;
    private static final Runnable f25143j = new lkd();

    public static lji m29202a(String str) {
        return lkb.m29203a(str, lhc.I_AM_THE_FRAMEWORK);
    }

    public static void m29210b(String str) {
        boolean z;
        ljo a = lkb.m29204a();
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        bm.m6152b(z, "Tried to end [%s], but no trace was active. This is caused by mismatched or missing calls to beginSpan.", (Object) str);
        bm.m6153b(str.equals(a.mo3715c()), "Wrong trace, expected %s but got %s", str, a.mo3715c());
        lkb.m29211b(a.mo3713a());
    }

    public static void m29205a(lji lji) {
        String b = lji.m29176b();
        try {
            lji.m29175a();
        } finally {
            lkb.m29210b(b);
        }
    }

    static void m29207a(boolean z) {
        Throwable illegalStateException;
        ljo a = lkb.m29204a();
        if (a == null) {
            illegalStateException = new IllegalStateException("Was supposed to have a trace - did you neglect to propagate or create one? See http://go/tiktok-tracing for more details.");
        } else if (a instanceof liy) {
            illegalStateException = new IllegalStateException("Was supposed to have a trace - did you neglect to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((liy) a).mo3717d());
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

    static ljo m29204a() {
        return (ljo) f25136c.get();
    }

    static ljo m29209b() {
        ljo ljo = (ljo) f25136c.get();
        if (ljo == null) {
            return new lje();
        }
        return ljo;
    }

    static void m29206a(ljo ljo) {
        f25137d = ljo;
    }

    static void m29211b(ljo ljo) {
        int i = VERSION.SDK_INT;
        f25136c.set(ljo);
        if (gwb.aI()) {
            f25138e.add(ljo);
            gwb.m1863a(f25139f);
        }
    }

    public static boolean m29208a(lhc lhc) {
        bm.m6122a((Object) lhc);
        return lkb.m29204a() != null;
    }

    static String m29212c(ljo ljo) {
        if (ljo.mo3713a() == null) {
            return ljo.mo3715c();
        }
        String valueOf = String.valueOf(lkb.m29212c(ljo.mo3713a()));
        String valueOf2 = String.valueOf(ljo.mo3715c());
        return new StringBuilder((String.valueOf(valueOf).length() + 4) + String.valueOf(valueOf2).length()).append(valueOf).append(" -> ").append(valueOf2).toString();
    }

    static void m29213d(ljo ljo) {
        String str;
        if (ljo instanceof liy) {
            String c = lkb.m29212c(ljo);
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
            throw new IllegalStateException(new StringBuilder((String.valueOf(c).length() + 346) + String.valueOf(valueOf).length()).append("Already Associated with a trace").append(c).append(". The place you're trying to create a root trace does not have a trace active, but it would have had all traces been properly created and propagated leading to this method being called. Look at the cause of this exception to see where, if a trace was created, it would have been propagated from. For more help, see ").append(valueOf).toString(), ((liy) ljo).mo3717d());
        }
        str = String.valueOf(lkb.m29212c(ljo));
        valueOf = String.valueOf("go/tiktok-tracing#fixing-duplicate-trace-issues");
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 39) + String.valueOf(valueOf).length()).append("Already associated with a trace: ").append(str).append(", see ").append(valueOf).toString());
    }

    public static lji m29203a(String str, lhc lhc) {
        ljo ljf;
        ljm ljm = ljm.f25099a;
        bm.m6122a((Object) lhc);
        ljo a = lkb.m29204a();
        if (a == null) {
            lkb.m29207a(true);
            ljf = new ljf(str);
        } else {
            ljf = a.mo3716a(str, ljm);
        }
        lkb.m29211b(ljf);
        return new lji(ljf);
    }
}
