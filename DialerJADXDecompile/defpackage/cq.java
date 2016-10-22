package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cq */
final class cq implements OnPreDrawListener {
    private /* synthetic */ View a;
    private /* synthetic */ Object b;
    private /* synthetic */ ArrayList c;
    private /* synthetic */ ct d;
    private /* synthetic */ Object e;
    private /* synthetic */ Object f;
    private /* synthetic */ boolean g;
    private /* synthetic */ db h;
    private /* synthetic */ db i;
    private /* synthetic */ cp j;

    cq(cp cpVar, View view, Object obj, ArrayList arrayList, ct ctVar, Object obj2, Object obj3, boolean z, db dbVar, db dbVar2) {
        this.j = cpVar;
        this.a = view;
        this.b = obj;
        this.c = arrayList;
        this.d = ctVar;
        this.e = obj2;
        this.f = obj3;
        this.g = z;
        this.h = dbVar;
        this.i = dbVar2;
    }

    public final boolean onPreDraw() {
        hv a;
        fx fxVar;
        cp cpVar;
        ct ctVar;
        View view;
        ct ctVar2;
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        buf.a(this.b, this.c);
        this.c.remove(this.d.d);
        buf.a(this.e, this.f, this.b, this.c, false);
        this.c.clear();
        cp cpVar2 = this.j;
        ct ctVar3 = this.d;
        boolean z = this.g;
        db dbVar = this.h;
        Map hvVar = new hv();
        View view2 = dbVar.K;
        if (!(view2 == null || cpVar2.p == null)) {
            buf.a(hvVar, view2);
            if (z) {
                a = cp.a(cpVar2.p, cpVar2.q, (hv) hvVar);
                if (z) {
                    fxVar = dbVar.U;
                    cp.b(ctVar3, a, true);
                } else {
                    fxVar = dbVar.V;
                    cpVar2.a(ctVar3, a, true);
                }
                buf.a(this.b, this.d.d, (Map) a, this.c);
                cpVar = this.j;
                ctVar = this.d;
                if (!(cpVar.q == null || a.isEmpty())) {
                    view = (View) a.get(cpVar.q.get(0));
                    if (view != null) {
                        ctVar.c.a = view;
                    }
                }
                cpVar = this.j;
                ctVar2 = this.d;
                cp.a(this.h, this.i, this.g, a);
                buf.a(this.e, this.f, this.b, this.c, true);
                return true;
            }
            ib.a(hvVar, cpVar2.q);
        }
        Map map = hvVar;
        if (z) {
            fxVar = dbVar.U;
            cp.b(ctVar3, a, true);
        } else {
            fxVar = dbVar.V;
            cpVar2.a(ctVar3, a, true);
        }
        buf.a(this.b, this.d.d, (Map) a, this.c);
        cpVar = this.j;
        ctVar = this.d;
        view = (View) a.get(cpVar.q.get(0));
        if (view != null) {
            ctVar.c.a = view;
        }
        cpVar = this.j;
        ctVar2 = this.d;
        cp.a(this.h, this.i, this.g, a);
        buf.a(this.e, this.f, this.b, this.c, true);
        return true;
    }
}
