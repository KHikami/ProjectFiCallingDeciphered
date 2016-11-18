package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class cvh {
    final cus f9160a;
    final List<cvm> f9161b = new CopyOnWriteArrayList();
    final Map<String, List<cvn>> f9162c = new HashMap();
    private final ite f9163d;
    private final ijf f9164e;
    private final ijd f9165f;
    private final lym f9166g;
    private boolean f9167h;
    private final itg f9168i = new cvi(this);
    private final ijj<lym> f9169j = new cvj(this);
    private final ijj<mab> f9170k = new cvk(this);
    private final cuz f9171l = new cvl(this);

    public cvh(Context context, ite ite, cus cus, int i) {
        this.f9163d = ite;
        this.f9164e = (ijf) ite.mo3229t().m21926a(ijf.class);
        this.f9160a = cus;
        this.f9160a.m11052a(this.f9171l);
        this.f9165f = (ijd) ite.mo3229t().m21926a(ijd.class);
        this.f9165f.mo3363a(this.f9169j);
        this.f9163d.mo3217a(this.f9168i);
        this.f9164e.mo3363a(this.f9170k);
        this.f9167h = true;
        this.f9166g = new lym();
        jch a = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i);
        this.f9166g.f26907b = "localParticipant";
        this.f9166g.f26909d = a.mo3440b("display_name");
        this.f9166g.f26916k = a.mo3440b("given_name");
        this.f9166g.f26910e = a.mo3440b("profile_photo_url");
    }

    public void m11091a() {
        if (this.f9167h) {
            this.f9167h = false;
            this.f9163d.mo3219b(this.f9168i);
            this.f9164e.mo3366b(this.f9170k);
            this.f9160a.m11055b(this.f9171l);
            this.f9165f.mo3366b(this.f9169j);
        }
    }

    protected void finalize() {
        if (this.f9167h) {
            glk.m17981d("Babel_PMngr", "ParticipantManager should not be valid in finalizer.", new Object[0]);
            m11091a();
        }
        super.finalize();
    }

    public boolean m11095a(String str) {
        if (TextUtils.equals(str, "localParticipant")) {
            return this.f9160a.m11064i();
        }
        for (mab mab : this.f9164e.mo3365b().values()) {
            if (gwb.m1507a(mab.f27085d) == 1 && str.equals(mab.f27083b)) {
                return mab.f27086e != null && gwb.m2061b(mab.f27086e.f27091a);
            }
        }
        return false;
    }

    String m11096b(String str) {
        if (str.equals(m11102d())) {
            return "localParticipant";
        }
        return str;
    }

    void m11094a(lym lym) {
        if (!lym.f26907b.equals(m11102d())) {
            for (cvm b : this.f9161b) {
                b.mo1388b(lym);
            }
        }
    }

    void m11097b() {
        for (cvm a : this.f9161b) {
            a.mo1393a();
        }
    }

    public void m11093a(String str, cvn cvn) {
        List list = (List) this.f9162c.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            this.f9162c.put(str, list);
        }
        if (!list.contains(cvn)) {
            list.add(cvn);
        }
    }

    public void m11099b(String str, cvn cvn) {
        List list = (List) this.f9162c.get(str);
        if (list != null) {
            list.remove(cvn);
            if (list.isEmpty()) {
                this.f9162c.remove(str);
            }
        }
    }

    public void m11092a(cvm cvm) {
        if (!this.f9161b.contains(cvm)) {
            this.f9161b.add(cvm);
        }
    }

    public void m11098b(cvm cvm) {
        this.f9161b.remove(cvm);
    }

    public Collection<lym> m11100c() {
        Collection<lym> arrayList = new ArrayList();
        CharSequence d = m11102d();
        for (lym lym : this.f9165f.mo3365b().values()) {
            if (gwb.m2061b(lym.f26922q) && !TextUtils.equals(d, lym.f26907b)) {
                arrayList.add(lym);
            }
        }
        return arrayList;
    }

    public lym m11101c(String str) {
        if (TextUtils.equals(str, "localParticipant")) {
            return this.f9166g;
        }
        return (lym) this.f9165f.mo3365b().get(str);
    }

    String m11102d() {
        lym a = this.f9165f.mo3376a();
        return a == null ? null : a.f26907b;
    }

    public static String m11090a(Context context, lym lym) {
        String str = lym.f26916k;
        if (str == null) {
            str = lym.f26909d;
        }
        if (str == null) {
            return context.getString(ba.jM);
        }
        return str;
    }
}
