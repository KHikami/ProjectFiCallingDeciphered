import android.content.Context;
import org.apache.http.client.HttpClient;

public final class dzr {
    public static alr a;
    private static final boolean b;
    private static final gma c;

    static {
        kae kae = glk.i;
        b = false;
        c = gma.a("VolleyUtils");
        a = null;
    }

    public static synchronized alr a() {
        Context H;
        alr alr;
        synchronized (dzr.class) {
            if (a == null) {
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
        a();
        alf b = a.b();
        if (b != null) {
            b.b(str);
        }
    }
}
