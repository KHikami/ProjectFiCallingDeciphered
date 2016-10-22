import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class hgp {
    private static final heb<?, ?>[] c;
    final Set<heb<?, ?>> a;
    gur b;
    private final hgs d;
    private final Map<gue<?>, gug> e;

    static {
        c = new heb[0];
    }

    public hgp(gue<?> gue_, gug gug) {
        this.a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.d = new hgq(this);
        this.e = new ky();
        this.e.put(gue_, gug);
    }

    public hgp(Map<gue<?>, gug> map) {
        this.a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.d = new hgq(this);
        this.e = map;
    }

    public void a() {
        for (heb heb : (heb[]) this.a.toArray(c)) {
            heb.a(null);
            if (heb.b() != null) {
                heb.c();
                IBinder f = ((gug) this.e.get(heb.e)).f();
                gur gur = this.b;
                if (heb.e()) {
                    heb.a(new hgr(heb, gur, f));
                } else if (f == null || !f.isBinderAlive()) {
                    heb.a(null);
                    heb.f();
                    heb.b().intValue();
                    gur.a();
                } else {
                    hgs hgr = new hgr(heb, gur, f);
                    heb.a(hgr);
                    try {
                        f.linkToDeath(hgr, 0);
                    } catch (RemoteException e) {
                        heb.f();
                        heb.b().intValue();
                        gur.a();
                    }
                }
                this.a.remove(heb);
            } else if (heb.g()) {
                this.a.remove(heb);
            }
        }
    }

    <A extends gud> void a(heb<? extends gup, A> heb__extends_gup__A) {
        this.a.add(heb__extends_gup__A);
        heb__extends_gup__A.a(this.d);
    }

    public void a(PrintWriter printWriter) {
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.a.size());
    }

    public void b() {
        for (heb d : (heb[]) this.a.toArray(c)) {
            d.d(new Status(8, "The connection to Google Play services was lost"));
        }
    }

    public boolean c() {
        for (heb e : (heb[]) this.a.toArray(c)) {
            if (!e.e()) {
                return true;
            }
        }
        return false;
    }
}
