package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: uf */
final class uf implements Runnable {
    private ui a;
    private /* synthetic */ ud b;

    public uf(ud udVar, ui uiVar) {
        this.b = udVar;
        this.a = uiVar;
    }

    public final void run() {
        if (this.b.c != null) {
            su suVar = this.b.c;
            if (suVar.b != null) {
                suVar.b.a(suVar);
            }
        }
        View view = (View) this.b.e;
        if (!(view == null || view.getWindowToken() == null || !this.a.b())) {
            this.b.i = this.a;
        }
        this.b.k = null;
    }
}
