package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: qq */
final class qq extends mh {
    private /* synthetic */ ql a;

    qq(ql qlVar) {
        this.a = qlVar;
    }

    public final void b(View view) {
        kn.c(this.a.q, 1.0f);
        this.a.t.a(null);
        this.a.t = null;
    }

    public final void a(View view) {
        this.a.q.setVisibility(0);
        this.a.q.sendAccessibilityEvent(32);
        if (this.a.q.getParent() != null) {
            kn.n((View) this.a.q.getParent());
        }
    }
}
