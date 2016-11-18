package p000;

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
    private Account f16160a;
    private final Set<Scope> f16161b = new HashSet();
    private final Set<Scope> f16162c = new HashSet();
    private int f16163d;
    private View f16164e;
    private String f16165f;
    private String f16166g;
    private final Map<gtz<?>, gwb> f16167h = new ky();
    private final Context f16168i;
    private final Map<gtz<?>, gua> f16169j = new ky();
    private hfz f16170k;
    private int f16171l = -1;
    private gul f16172m;
    private Looper f16173n;
    private gtp f16174o = gtp.f16131a;
    private guc<? extends hca, hcb> f16175p = hbx.f16557c;
    private final ArrayList<guk> f16176q = new ArrayList();
    private final ArrayList<gul> f16177r = new ArrayList();

    public guj(Context context) {
        this.f16168i = context;
        this.f16173n = context.getMainLooper();
        this.f16165f = context.getPackageName();
        this.f16166g = context.getClass().getName();
    }

    public guj m18639a(gtz<? extends gub> gtz__extends_gub) {
        gwb.m2195f((Object) gtz__extends_gub, (Object) "Api must not be null");
        this.f16169j.put(gtz__extends_gub, null);
        Collection a = gtz__extends_gub.m18604a().m18529a();
        this.f16162c.addAll(a);
        this.f16161b.addAll(a);
        return this;
    }

    public <O extends gub> guj m18640a(gtz<O> gtz_O, O o) {
        gwb.m2195f((Object) gtz_O, (Object) "Api must not be null");
        gwb.m2195f((Object) o, (Object) "Null options are not permitted for this Api");
        this.f16169j.put(gtz_O, o);
        Collection a = gtz_O.m18604a().m18529a();
        this.f16162c.addAll(a);
        this.f16161b.addAll(a);
        return this;
    }

    public guj m18641a(guk guk) {
        gwb.m2195f((Object) guk, (Object) "Listener must not be null");
        this.f16176q.add(guk);
        return this;
    }

    public guj m18642a(gul gul) {
        gwb.m2195f((Object) gul, (Object) "Listener must not be null");
        this.f16177r.add(gul);
        return this;
    }

    public guj m18643a(String str) {
        this.f16160a = str == null ? null : new Account(str, "com.google");
        return this;
    }

    public gwa m18644a() {
        hcb hcb = hcb.f16565a;
        if (this.f16169j.containsKey(hbx.f16561g)) {
            hcb = (hcb) this.f16169j.get(hbx.f16561g);
        }
        return new gwa(this.f16160a, this.f16161b, this.f16167h, this.f16163d, this.f16164e, this.f16165f, this.f16166g, hcb);
    }

    public gui m18645b() {
        gwb.m2048b(!this.f16169j.isEmpty(), (Object) "must call addApi() to add at least one API");
        gwa a = m18644a();
        Map e = a.m18759e();
        Map kyVar = new ky();
        Map kyVar2 = new ky();
        ArrayList arrayList = new ArrayList();
        for (gtz gtz : this.f16169j.keySet()) {
            Object obj = this.f16169j.get(gtz);
            int i = 0;
            if (e.get(gtz) != null) {
                i = ((gwb) e.get(gtz)).f898l ? 1 : 2;
            }
            kyVar.put(gtz, Integer.valueOf(i));
            guk hek = new hek(gtz, i);
            arrayList.add(hek);
            kyVar2.put(gtz.m18606c(), gtz.m18605b().mo2333a(this.f16168i, this.f16173n, a, obj, hek, hek));
        }
        gui hfe = new hfe(this.f16168i, new ReentrantLock(), this.f16173n, a, this.f16174o, this.f16175p, kyVar, this.f16176q, this.f16177r, kyVar2, this.f16171l, hfe.m19595a(kyVar2.values(), true), arrayList);
        synchronized (gui.f16159a) {
            gui.f16159a.add(hfe);
        }
        if (this.f16171l >= 0) {
            hgb a2;
            hfz hfz = this.f16170k;
            if (hfz.m19698a()) {
                a2 = hgk.m19740a(hfz.m19701c());
            } else {
                Object a3 = hgc.m19723a(hfz.m19699b());
            }
            hdy hdy = (hdy) a2.mo2534a("AutoManageHelper", hdy.class);
            if (hdy == null) {
                hdy = new hdy(a2);
            }
            hdy.m19465a(this.f16171l, hfe, this.f16172m);
        }
        return hfe;
    }
}
