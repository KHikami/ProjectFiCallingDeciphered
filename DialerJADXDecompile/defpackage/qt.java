package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: qt */
final class qt extends mh {
    private /* synthetic */ qs a;

    qt(qs qsVar) {
        this.a = qsVar;
    }

    public final void b(View view) {
        this.a.a.q.setVisibility(8);
        if (this.a.a.r != null) {
            this.a.a.r.dismiss();
        } else if (this.a.a.q.getParent() instanceof View) {
            kn.n((View) this.a.a.q.getParent());
        }
        this.a.a.q.removeAllViews();
        this.a.a.t.a(null);
        this.a.a.t = null;
    }
}
