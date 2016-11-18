package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;

final class dh implements OnPreDrawListener {
    final /* synthetic */ View f9734a;
    final /* synthetic */ Object f9735b;
    final /* synthetic */ ArrayList f9736c;
    final /* synthetic */ dk f9737d;
    final /* synthetic */ Object f9738e;
    final /* synthetic */ Object f9739f;
    final /* synthetic */ boolean f9740g;
    final /* synthetic */ dr f9741h;
    final /* synthetic */ dr f9742i;
    final /* synthetic */ dg f9743j;

    dh(dg dgVar, View view, Object obj, ArrayList arrayList, dk dkVar, Object obj2, Object obj3, boolean z, dr drVar, dr drVar2) {
        this.f9743j = dgVar;
        this.f9734a = view;
        this.f9735b = obj;
        this.f9736c = arrayList;
        this.f9737d = dkVar;
        this.f9738e = obj2;
        this.f9739f = obj3;
        this.f9740g = z;
        this.f9741h = drVar;
        this.f9742i = drVar2;
    }

    public boolean onPreDraw() {
        ky a;
        ho hoVar;
        dg dgVar;
        dk dkVar;
        View view;
        dk dkVar2;
        this.f9734a.getViewTreeObserver().removeOnPreDrawListener(this);
        gwb.m1861a(this.f9735b, this.f9736c);
        this.f9736c.remove(this.f9737d.f9982d);
        gwb.m1859a(this.f9738e, this.f9739f, this.f9735b, this.f9736c, false);
        this.f9736c.clear();
        dg dgVar2 = this.f9743j;
        dk dkVar3 = this.f9737d;
        boolean z = this.f9740g;
        dr drVar = this.f9741h;
        ky kyVar = new ky();
        View view2 = drVar.getView();
        if (!(view2 == null || dgVar2.f9661u == null)) {
            gwb.m1879a((Map) kyVar, view2);
            if (z) {
                a = dg.m11648a(dgVar2.f9661u, dgVar2.f9662v, kyVar);
                if (z) {
                    if (drVar.ah != null) {
                        hoVar = drVar.ah;
                    }
                    dg.m11657b(dkVar3, a, true);
                } else {
                    if (drVar.ai != null) {
                        hoVar = drVar.ai;
                    }
                    dgVar2.m11670a(dkVar3, a, true);
                }
                gwb.m1854a(this.f9735b, this.f9737d.f9982d, (Map) a, this.f9736c);
                dgVar = this.f9743j;
                dkVar = this.f9737d;
                if (!(dgVar.f9662v == null || a.isEmpty())) {
                    view = (View) a.get(dgVar.f9662v.get(0));
                    if (view != null) {
                        dkVar.f9981c.f12607a = view;
                    }
                }
                dgVar = this.f9743j;
                dkVar2 = this.f9737d;
                dg.m11652a(this.f9741h, this.f9742i, this.f9740g, a);
                gwb.m1859a(this.f9738e, this.f9739f, this.f9735b, this.f9736c, true);
                return true;
            }
            kyVar.m28022b(dgVar2.f9662v);
        }
        a = kyVar;
        if (z) {
            if (drVar.ah != null) {
                hoVar = drVar.ah;
            }
            dg.m11657b(dkVar3, a, true);
        } else {
            if (drVar.ai != null) {
                hoVar = drVar.ai;
            }
            dgVar2.m11670a(dkVar3, a, true);
        }
        gwb.m1854a(this.f9735b, this.f9737d.f9982d, (Map) a, this.f9736c);
        dgVar = this.f9743j;
        dkVar = this.f9737d;
        view = (View) a.get(dgVar.f9662v.get(0));
        if (view != null) {
            dkVar.f9981c.f12607a = view;
        }
        dgVar = this.f9743j;
        dkVar2 = this.f9737d;
        dg.m11652a(this.f9741h, this.f9742i, this.f9740g, a);
        gwb.m1859a(this.f9738e, this.f9739f, this.f9735b, this.f9736c, true);
        return true;
    }
}
