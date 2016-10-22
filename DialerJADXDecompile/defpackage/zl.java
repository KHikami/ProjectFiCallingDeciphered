package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: zl */
public final class zl extends in {
    final RecyclerView a;
    final in b;

    public zl(RecyclerView recyclerView) {
        this.b = new zm(this);
        this.a = recyclerView;
    }

    final boolean a() {
        RecyclerView recyclerView = this.a;
        return !recyclerView.o || recyclerView.t || recyclerView.d.d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean performAccessibilityAction(android.view.View r8, int r9, android.os.Bundle r10) {
        /*
        r7 = this;
        r5 = -1;
        r2 = 1;
        r1 = 0;
        r0 = super.performAccessibilityAction(r8, r9, r10);
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        r1 = r2;
    L_0x000a:
        return r1;
    L_0x000b:
        r0 = r7.a();
        if (r0 != 0) goto L_0x000a;
    L_0x0011:
        r0 = r7.a;
        r0 = r0.k;
        if (r0 == 0) goto L_0x000a;
    L_0x0017:
        r0 = r7.a;
        r4 = r0.k;
        r0 = r4.e;
        r0 = r0.c;
        r0 = r4.e;
        r0 = r0.A;
        r0 = r4.e;
        if (r0 == 0) goto L_0x000a;
    L_0x0027:
        switch(r9) {
            case 4096: goto L_0x0065;
            case 8192: goto L_0x0037;
            default: goto L_0x002a;
        };
    L_0x002a:
        r0 = r1;
        r3 = r1;
    L_0x002c:
        if (r3 != 0) goto L_0x0030;
    L_0x002e:
        if (r0 == 0) goto L_0x000a;
    L_0x0030:
        r1 = r4.e;
        r1.scrollBy(r0, r3);
        r1 = r2;
        goto L_0x000a;
    L_0x0037:
        r0 = r4.e;
        r0 = defpackage.kn.b(r0, r5);
        if (r0 == 0) goto L_0x0096;
    L_0x003f:
        r0 = r4.m;
        r3 = r4.j();
        r0 = r0 - r3;
        r3 = r4.l();
        r0 = r0 - r3;
        r0 = -r0;
    L_0x004c:
        r3 = r4.e;
        r3 = defpackage.kn.a(r3, r5);
        if (r3 == 0) goto L_0x0091;
    L_0x0054:
        r3 = r4.l;
        r5 = r4.i();
        r3 = r3 - r5;
        r5 = r4.k();
        r3 = r3 - r5;
        r3 = -r3;
        r6 = r3;
        r3 = r0;
        r0 = r6;
        goto L_0x002c;
    L_0x0065:
        r0 = r4.e;
        r0 = defpackage.kn.b(r0, r2);
        if (r0 == 0) goto L_0x0094;
    L_0x006d:
        r0 = r4.m;
        r3 = r4.j();
        r0 = r0 - r3;
        r3 = r4.l();
        r0 = r0 - r3;
    L_0x0079:
        r3 = r4.e;
        r3 = defpackage.kn.a(r3, r2);
        if (r3 == 0) goto L_0x0091;
    L_0x0081:
        r3 = r4.l;
        r5 = r4.i();
        r3 = r3 - r5;
        r5 = r4.k();
        r3 = r3 - r5;
        r6 = r3;
        r3 = r0;
        r0 = r6;
        goto L_0x002c;
    L_0x0091:
        r3 = r0;
        r0 = r1;
        goto L_0x002c;
    L_0x0094:
        r0 = r1;
        goto L_0x0079;
    L_0x0096:
        r0 = r1;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: zl.performAccessibilityAction(android.view.View, int, android.os.Bundle):boolean");
    }

    public final void onInitializeAccessibilityNodeInfo(View view, mr mrVar) {
        int i = 1;
        super.onInitializeAccessibilityNodeInfo(view, mrVar);
        mrVar.a(RecyclerView.class.getName());
        if (!a() && this.a.k != null) {
            int i2;
            yz yzVar = this.a.k;
            zc zcVar = yzVar.e.c;
            zi ziVar = yzVar.e.A;
            if (kn.b(yzVar.e, -1) || kn.a(yzVar.e, -1)) {
                mrVar.a(8192);
                mrVar.c(true);
            }
            if (kn.b(yzVar.e, 1) || kn.a(yzVar.e, 1)) {
                mrVar.a(4096);
                mrVar.c(true);
            }
            if (yzVar.e == null || yzVar.e.j == null) {
                i2 = 1;
            } else if (yzVar.d()) {
                i2 = yzVar.e.j.a();
            } else {
                i2 = 1;
            }
            if (!(yzVar.e == null || yzVar.e.j == null || !yzVar.c())) {
                i = yzVar.e.j.a();
            }
            mr.a.a(mrVar.b, new mz(mr.a.a(i2, i, false, 0)).a);
        }
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !a()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.k != null) {
                recyclerView.k.a(accessibilityEvent);
            }
        }
    }
}
