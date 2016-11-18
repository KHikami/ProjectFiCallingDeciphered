package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.Toast;
import com.google.android.apps.hangouts.permissions.impl.RationaleActivity;
import java.util.ArrayList;
import java.util.List;

public final class eih implements eia, jza, kbi, kcd, kcn, kcq {
    Context f11597a;
    final SparseArray<eib> f11598b;
    public final SparseArray<eie> f11599c;
    private Activity f11600d;
    private jek f11601e;
    private ehz f11602f;
    private jsw f11603g;
    private jca f11604h;
    private jej f11605i;

    eih(Activity activity, kbu kbu) {
        this(kbu);
        this.f11600d = activity;
    }

    eih(kbu kbu) {
        this.f11598b = new SparseArray();
        this.f11599c = new SparseArray();
        this.f11605i = new eii(this);
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f11597a = context;
        this.f11602f = (ehz) jyn.m25443a(ehz.class);
        this.f11603g = (jsw) jyn.m25443a(jsw.class);
        for (int i = 0; i < this.f11598b.size(); i++) {
            m13966a(this.f11598b.keyAt(i));
        }
        this.f11601e = (jek) jyn.m25443a(jek.class);
        this.f11601e.m24033a(gwb.tp, this.f11605i);
        this.f11604h = (jca) jyn.m25443a(jca.class);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("permission_manager_pending_requests");
            if (parcelableArrayList != null) {
                parcelableArrayList = parcelableArrayList;
                int size = parcelableArrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = parcelableArrayList.get(i);
                    i++;
                    eie eie = (eie) obj;
                    this.f11599c.put(eie.f11595c, eie);
                }
            }
        }
    }

    public void mo645b(Bundle bundle) {
        if (this.f11599c.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f11599c.size(); i++) {
                arrayList.add((eie) this.f11599c.get(this.f11599c.keyAt(i)));
            }
            bundle.putParcelableArrayList("permission_manager_pending_requests", arrayList);
        }
    }

    public void mo1885a(Activity activity) {
        this.f11600d = activity;
    }

    public void mo1884a(int i, eib eib) {
        bm.m6151b(this.f11598b.get(i) == null, (Object) "Listener should be set only once");
        this.f11598b.put(i, eib);
        if (this.f11603g == null) {
            glk.m17970a("Babel_Permissions", "Not registering " + i, new Object[0]);
        } else {
            m13966a(i);
        }
    }

    private void m13966a(int i) {
        this.f11603g.mo3604a(i, new jtf(this, i));
    }

    public void mo1886a(eie eie, List<String> list) {
        m13968a(eie, (List) list, null);
    }

    private void m13968a(eie eie, List<String> list, eid eid) {
        if (this.f11599c.get(eie.f11595c) != null) {
            glk.m17979c("Babel_Permissions", "Ignoring duplicate permission request: " + eie.f11595c, new Object[0]);
            return;
        }
        this.f11599c.put(eie.f11595c, eie);
        if (this.f11602f.mo1883a((List) list)) {
            gwb.m1863a(new eij(this, list, eie.f11595c));
            return;
        }
        int i = eie.f11595c;
        if (!m13970a(i, (List) list, null)) {
            this.f11603g.mo3605a(new jte(this), i, list);
        }
    }

    private void m13967a(int i, List<eic> list, boolean z, boolean z2) {
        if (i != 0) {
            iid a = ((iih) jyn.m25426a(this.f11597a, iih.class)).mo1979a(this.f11604h.mo2317a());
            for (eic eic : list) {
                mda mda = new mda();
                mda.f27431a = eic.f11580a;
                mda.f27432b = Boolean.valueOf(z);
                mda.f27433c = Boolean.valueOf(z2);
                mda.f27434d = Boolean.valueOf(eic.f11581b);
                a.mo1693b().mo1707a(mda).mo1714c(i);
            }
        }
    }

    private boolean m13970a(int i, List<String> list, eid eid) {
        boolean z;
        boolean z2 = true;
        if (eid != null) {
            bm.m6138a(eid.f11585a != 0, (Object) "rationaleLayoutRes must be non-zero");
            for (String shouldShowRequestPermissionRationale : list) {
                if (this.f11600d.shouldShowRequestPermissionRationale(shouldShowRequestPermissionRationale)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            Context context = this.f11597a;
            int i2 = eid.f11585a;
            int i3 = eid.f11586b;
            if (i2 == 0) {
                z2 = false;
            }
            ba.m4578a(z2, (Object) "Layout resource must be specified");
            Intent intent = new Intent(context, RationaleActivity.class);
            intent.putExtra("original_request_code", i);
            intent.putExtra("permissions", new ArrayList(list));
            intent.putExtra("layout_res", i2);
            intent.putExtra("background_color_res", i3);
            this.f11601e.m24035a(gwb.tp, intent);
        }
        return z;
    }

    public void m13972a(int i, List<eic> list) {
        for (eic eic : list) {
            if (!eic.f11581b) {
                Toast.makeText(this.f11597a, gwb.tt, 0).show();
                break;
            }
        }
        eib eib = (eib) this.f11598b.get(i);
        eie eie = (eie) this.f11599c.get(i);
        this.f11599c.remove(i);
        eib.mo748a(list, eie.f11594b);
    }
}
