package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: dh */
final class dh implements OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ dk d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ boolean g;
    final /* synthetic */ dr h;
    final /* synthetic */ dr i;
    final /* synthetic */ dg j;

    dh(dg dgVar, View view, Object obj, ArrayList arrayList, dk dkVar, Object obj2, Object obj3, boolean z, dr drVar, dr drVar2) {
        this.j = dgVar;
        this.a = view;
        this.b = obj;
        this.c = arrayList;
        this.d = dkVar;
        this.e = obj2;
        this.f = obj3;
        this.g = z;
        this.h = drVar;
        this.i = drVar2;
    }

    public boolean onPreDraw() {
        ky a;
        ho hoVar;
        dg dgVar;
        dk dkVar;
        View view;
        dk dkVar2;
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        gwb.a(this.b, this.c);
        this.c.remove(this.d.d);
        gwb.a(this.e, this.f, this.b, this.c, false);
        this.c.clear();
        dg dgVar2 = this.j;
        dk dkVar3 = this.d;
        boolean z = this.g;
        dr drVar = this.h;
        ky kyVar = new ky();
        View view2 = drVar.getView();
        if (!(view2 == null || dgVar2.u == null)) {
            gwb.a((Map) kyVar, view2);
            if (z) {
                a = dg.a(dgVar2.u, dgVar2.v, kyVar);
                if (z) {
                    if (drVar.ah != null) {
                        hoVar = drVar.ah;
                    }
                    dg.b(dkVar3, a, true);
                } else {
                    if (drVar.ai != null) {
                        hoVar = drVar.ai;
                    }
                    dgVar2.a(dkVar3, a, true);
                }
                gwb.a(this.b, this.d.d, (Map) a, this.c);
                dgVar = this.j;
                dkVar = this.d;
                if (!(dgVar.v == null || a.isEmpty())) {
                    view = (View) a.get(dgVar.v.get(0));
                    if (view != null) {
                        dkVar.c.a = view;
                    }
                }
                dgVar = this.j;
                dkVar2 = this.d;
                dg.a(this.h, this.i, this.g, a);
                gwb.a(this.e, this.f, this.b, this.c, true);
                return true;
            }
            kyVar.b(dgVar2.v);
        }
        a = kyVar;
        if (z) {
            if (drVar.ah != null) {
                hoVar = drVar.ah;
            }
            dg.b(dkVar3, a, true);
        } else {
            if (drVar.ai != null) {
                hoVar = drVar.ai;
            }
            dgVar2.a(dkVar3, a, true);
        }
        gwb.a(this.b, this.d.d, (Map) a, this.c);
        dgVar = this.j;
        dkVar = this.d;
        view = (View) a.get(dgVar.v.get(0));
        if (view != null) {
            dkVar.c.a = view;
        }
        dgVar = this.j;
        dkVar2 = this.d;
        dg.a(this.h, this.i, this.g, a);
        gwb.a(this.e, this.f, this.b, this.c, true);
        return true;
    }
}
