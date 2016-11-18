package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class guj {
    private Account a;
    private final Set<Scope> b = new HashSet();
    private final Set<Scope> c = new HashSet();
    private int d;
    private View e;
    private String f;
    private String g;
    private final Map<gtz<?>, gwb> h = new ky();
    private final Context i;
    private final Map<gtz<?>, gua> j = new ky();
    private hfz k;
    private int l = -1;
    private gul m;
    private Looper n;
    private gtp o = gtp.a;
    private guc<? extends hca, hcb> p = hbx.c;
    private final ArrayList<guk> q = new ArrayList();
    private final ArrayList<gul> r = new ArrayList();

    public guj(Context context) {
        this.i = context;
        this.n = context.getMainLooper();
        this.f = context.getPackageName();
        this.g = context.getClass().getName();
    }

    public guj a(gtz<? extends gub> gtz__extends_gub) {
        gwb.f((Object) gtz__extends_gub, (Object) "Api must not be null");
        this.j.put(gtz__extends_gub, null);
        Collection a = gtz__extends_gub.a().a();
        this.c.addAll(a);
        this.b.addAll(a);
        return this;
    }

    public <O extends gub> guj a(gtz<O> gtz_O, O o) {
        gwb.f((Object) gtz_O, (Object) "Api must not be null");
        gwb.f((Object) o, (Object) "Null options are not permitted for this Api");
        this.j.put(gtz_O, o);
        Collection a = gtz_O.a().a();
        this.c.addAll(a);
        this.b.addAll(a);
        return this;
    }

    public guj a(guk guk) {
        gwb.f((Object) guk, (Object) "Listener must not be null");
        this.q.add(guk);
        return this;
    }

    public guj a(gul gul) {
        gwb.f((Object) gul, (Object) "Listener must not be null");
        this.r.add(gul);
        return this;
    }

    public guj a(String str) {
        this.a = str == null ? null : new Account(str, "com.google");
        return this;
    }

    public gwa a() {
        hcb hcb = hcb.a;
        if (this.j.containsKey(hbx.g)) {
            hcb = (hcb) this.j.get(hbx.g);
        }
        return new gwa(this.a, this.b, this.h, this.d, this.e, this.f, this.g, hcb);
    }

    public gui b() {
        gwb.b(!this.j.isEmpty(), (Object) "must call addApi() to add at least one API");
        gwa a = a();
        Map e = a.e();
        Map kyVar = new ky();
        Map kyVar2 = new ky();
        ArrayList arrayList = new ArrayList();
        for (gtz gtz : this.j.keySet()) {
            Object obj = this.j.get(gtz);
            int i = 0;
            if (e.get(gtz) != null) {
                i = ((gwb) e.get(gtz)).l ? 1 : 2;
            }
            kyVar.put(gtz, Integer.valueOf(i));
            guk hek = new hek(gtz, i);
            arrayList.add(hek);
            kyVar2.put(gtz.c(), gtz.b().a(this.i, this.n, a, obj, hek, hek));
        }
        gui hfe = new hfe(this.i, new ReentrantLock(), this.n, a, this.o, this.p, kyVar, this.q, this.r, kyVar2, this.l, hfe.a(kyVar2.values(), true), arrayList);
        synchronized (gui.a) {
            gui.a.add(hfe);
        }
        if (this.l >= 0) {
            hgb a2;
            hfz hfz = this.k;
            if (hfz.a()) {
                a2 = hgk.a(hfz.c());
            } else {
                Object a3 = hgc.a(hfz.b());
            }
            hdy hdy = (hdy) a2.a("AutoManageHelper", hdy.class);
            if (hdy == null) {
                hdy = new hdy(a2);
            }
            hdy.a(this.l, hfe, this.m);
        }
        return hfe;
    }
}
