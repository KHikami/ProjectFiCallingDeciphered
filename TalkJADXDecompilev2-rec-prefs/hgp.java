package p000;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class hgp {
    private static final heb<?, ?>[] f16925c = new heb[0];
    final Set<heb<?, ?>> f16926a;
    gur f16927b;
    private final hgs f16928d;
    private final Map<gue<?>, gug> f16929e;

    public hgp(gue<?> gue_, gug gug) {
        this.f16926a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.f16928d = new hgq(this);
        this.f16929e = new ky();
        this.f16929e.put(gue_, gug);
    }

    public hgp(Map<gue<?>, gug> map) {
        this.f16926a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.f16928d = new hgq(this);
        this.f16929e = map;
    }

    public void m19753a() {
        for (heb heb : (heb[]) this.f16926a.toArray(f16925c)) {
            heb.m18989a(null);
            if (heb.mo2420b() != null) {
                heb.mo2422c();
                IBinder f = ((gug) this.f16929e.get(heb.f16402e)).m18619f();
                gur gur = this.f16927b;
                if (heb.m18981e()) {
                    heb.m18989a(new hgr(heb, gur, f));
                } else if (f == null || !f.isBinderAlive()) {
                    heb.m18989a(null);
                    heb.m18982f();
                    heb.mo2420b().intValue();
                    gur.m18650a();
                } else {
                    hgs hgr = new hgr(heb, gur, f);
                    heb.m18989a(hgr);
                    try {
                        f.linkToDeath(hgr, 0);
                    } catch (RemoteException e) {
                        heb.m18982f();
                        heb.mo2420b().intValue();
                        gur.m18650a();
                    }
                }
                this.f16926a.remove(heb);
            } else if (heb.m18983g()) {
                this.f16926a.remove(heb);
            }
        }
    }

    <A extends gud> void m19754a(heb<? extends gup, A> heb__extends_gup__A) {
        this.f16926a.add(heb__extends_gup__A);
        heb__extends_gup__A.m18989a(this.f16928d);
    }

    public void m19755a(PrintWriter printWriter) {
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f16926a.size());
    }

    public void m19756b() {
        for (heb d : (heb[]) this.f16926a.toArray(f16925c)) {
            d.m18980d(new Status(8, "The connection to Google Play services was lost"));
        }
    }

    public boolean m19757c() {
        for (heb e : (heb[]) this.f16926a.toArray(f16925c)) {
            if (!e.m18981e()) {
                return true;
            }
        }
        return false;
    }
}
