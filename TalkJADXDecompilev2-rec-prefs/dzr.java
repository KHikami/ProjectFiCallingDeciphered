package p000;

import android.content.Context;
import org.apache.http.client.HttpClient;

public final class dzr {
    public static alr f10941a = null;
    private static final boolean f10942b = false;
    private static final gma f10943c = gma.m18073a("VolleyUtils");

    static {
        kae kae = glk.f15562i;
    }

    public static synchronized alr m13194a() {
        Context H;
        alr alr;
        synchronized (dzr.class) {
            if (f10941a == null) {
                String b = f10943c.m18078b("RQ initialization");
                try {
                    H = gwb.m1400H();
                    hwu.m21152a(H);
                } catch (Throwable e) {
                    glk.m17980d("Babel", "Temporarily unable to update security library", e);
                    gtt.m18583a(e.m18567a(), H);
                } catch (Throwable e2) {
                    glk.m17980d("Babel", "Permanently unable to update security library", e2);
                } catch (Throwable th) {
                    f10943c.m18079c(b);
                }
                HttpClient hay = new hay(H, gwb.m2399z(), false);
                if (f10942b) {
                    hay.m19120a("Babel", 2);
                }
                alr = new alr(new dzp(H.getCacheDir(), gwb.m1492a(gwb.m1400H(), "babel_volley_cache_size", 52428800)), new amb(new ame(hay)), gwb.m1492a(gwb.m1400H(), "babel_thread_pool_size", 2));
                f10941a = alr;
                alr.m2867a();
                f10943c.m18079c(b);
            }
            alr = f10941a;
        }
        return alr;
    }

    public static void m13195a(String str) {
        dzr.m13194a();
        alf b = f10941a.m2868b();
        if (b != null) {
            b.mo1789b(str);
        }
    }
}
