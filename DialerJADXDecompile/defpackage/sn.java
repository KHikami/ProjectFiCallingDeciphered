package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: PG */
/* renamed from: sn */
final class sn implements OnGlobalLayoutListener {
    private /* synthetic */ sm a;

    sn(sm smVar) {
        this.a = smVar;
    }

    public final void onGlobalLayout() {
        if (this.a.d() && this.a.b.size() > 0 && !((sq) this.a.b.get(0)).a.p) {
            View view = this.a.c;
            if (view == null || !view.isShown()) {
                this.a.c();
                return;
            }
            for (sq sqVar : this.a.b) {
                sqVar.a.b();
            }
        }
    }
}
