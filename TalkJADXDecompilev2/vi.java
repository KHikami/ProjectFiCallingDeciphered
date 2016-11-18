package defpackage;

import android.view.View;

final class vi implements no {
    final /* synthetic */ vg a;

    vi(vg vgVar) {
        this.a = vgVar;
    }

    public qb a(View view, qb qbVar) {
        int b = qbVar.b();
        int h = this.a.h(b);
        if (b != h) {
            qbVar = qbVar.a(qbVar.a(), h, qbVar.c(), qbVar.d());
        }
        return oa.a(view, qbVar);
    }
}
