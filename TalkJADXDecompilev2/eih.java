package defpackage;

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
    Context a;
    final SparseArray<eib> b;
    public final SparseArray<eie> c;
    private Activity d;
    private jek e;
    private ehz f;
    private jsw g;
    private jca h;
    private jej i;

    eih(Activity activity, kbu kbu) {
        this(kbu);
        this.d = activity;
    }

    eih(kbu kbu) {
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.i = new eii(this);
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = context;
        this.f = (ehz) jyn.a(ehz.class);
        this.g = (jsw) jyn.a(jsw.class);
        for (int i = 0; i < this.b.size(); i++) {
            a(this.b.keyAt(i));
        }
        this.e = (jek) jyn.a(jek.class);
        this.e.a(gwb.tp, this.i);
        this.h = (jca) jyn.a(jca.class);
    }

    public void a(Bundle bundle) {
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
                    this.c.put(eie.c, eie);
                }
            }
        }
    }

    public void b(Bundle bundle) {
        if (this.c.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.c.size(); i++) {
                arrayList.add((eie) this.c.get(this.c.keyAt(i)));
            }
            bundle.putParcelableArrayList("permission_manager_pending_requests", arrayList);
        }
    }

    public void a(Activity activity) {
        this.d = activity;
    }

    public void a(int i, eib eib) {
        bm.b(this.b.get(i) == null, (Object) "Listener should be set only once");
        this.b.put(i, eib);
        if (this.g == null) {
            glk.a("Babel_Permissions", "Not registering " + i, new Object[0]);
        } else {
            a(i);
        }
    }

    private void a(int i) {
        this.g.a(i, new jtf(this, i));
    }

    public void a(eie eie, List<String> list) {
        a(eie, (List) list, null);
    }

    private void a(eie eie, List<String> list, eid eid) {
        if (this.c.get(eie.c) != null) {
            glk.c("Babel_Permissions", "Ignoring duplicate permission request: " + eie.c, new Object[0]);
            return;
        }
        this.c.put(eie.c, eie);
        if (this.f.a((List) list)) {
            gwb.a(new eij(this, list, eie.c));
            return;
        }
        int i = eie.c;
        if (!a(i, (List) list, null)) {
            this.g.a(new jte(this), i, list);
        }
    }

    private void a(int i, List<eic> list, boolean z, boolean z2) {
        if (i != 0) {
            iid a = ((iih) jyn.a(this.a, iih.class)).a(this.h.a());
            for (eic eic : list) {
                mda mda = new mda();
                mda.a = eic.a;
                mda.b = Boolean.valueOf(z);
                mda.c = Boolean.valueOf(z2);
                mda.d = Boolean.valueOf(eic.b);
                a.b().a(mda).c(i);
            }
        }
    }

    private boolean a(int i, List<String> list, eid eid) {
        boolean z;
        boolean z2 = true;
        if (eid != null) {
            bm.a(eid.a != 0, (Object) "rationaleLayoutRes must be non-zero");
            for (String shouldShowRequestPermissionRationale : list) {
                if (this.d.shouldShowRequestPermissionRationale(shouldShowRequestPermissionRationale)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            Context context = this.a;
            int i2 = eid.a;
            int i3 = eid.b;
            if (i2 == 0) {
                z2 = false;
            }
            ba.a(z2, (Object) "Layout resource must be specified");
            Intent intent = new Intent(context, RationaleActivity.class);
            intent.putExtra("original_request_code", i);
            intent.putExtra("permissions", new ArrayList(list));
            intent.putExtra("layout_res", i2);
            intent.putExtra("background_color_res", i3);
            this.e.a(gwb.tp, intent);
        }
        return z;
    }

    public void a(int i, List<eic> list) {
        for (eic eic : list) {
            if (!eic.b) {
                Toast.makeText(this.a, gwb.tt, 0).show();
                break;
            }
        }
        eib eib = (eib) this.b.get(i);
        eie eie = (eie) this.c.get(i);
        this.c.remove(i);
        eib.a(list, eie.b);
    }
}
