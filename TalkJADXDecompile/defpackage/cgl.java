package defpackage;

import android.widget.ListView;

/* renamed from: cgl */
final class cgl extends gqq {
    final /* synthetic */ cdr a;

    cgl(cdr cdr) {
        this.a = cdr;
    }

    public void a(boolean z) {
        if (!gwb.i(this.a.d())) {
            this.a.bt.a(!z);
        }
    }

    public void a() {
        if (this.a.bI != null) {
            ((ListView) this.a.bI).invalidateViews();
        }
    }
}
