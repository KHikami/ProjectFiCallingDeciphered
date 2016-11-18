package defpackage;

import android.content.Context;
import org.apache.http.client.HttpClient;

public final class dzr {
    public static alr a = null;
    private static final boolean b = false;
    private static final gma c = gma.a("VolleyUtils");

    static {
        kae kae = glk.i;
    }

    public static synchronized alr a() {
        alr alr;
        synchronized (dzr.class) {
            if (a == null) {
                Context H;
                String b = c.b("RQ initialization");
                try {
                    H = gwb.H();
                    hwu.a(H);
                } catch (Throwable e) {
                    glk.d("Babel", "Temporarily unable to update security library", e);
                    gtt.a(e.a(), H);
                } catch (Throwable e2) {
                    glk.d("Babel", "Permanently unable to update security library", e2);
                } catch (Throwable th) {
                    c.c(b);
                }
                HttpClient hay = new hay(H, gwb.z(), false);
                if (b) {
                    hay.a("Babel", 2);
                }
                alr = new alr(new dzp(H.getCacheDir(), gwb.a(gwb.H(), "babel_volley_cache_size", 52428800)), new amb(new ame(hay)), gwb.a(gwb.H(), "babel_thread_pool_size", 2));
                a = alr;
                alr.a();
                c.c(b);
            }
            alr = a;
        }
        return alr;
    }

    public static void a(String str) {
        dzr.a();
        alf b = a.b();
        if (b != null) {
            b.b(str);
        }
    }
}
