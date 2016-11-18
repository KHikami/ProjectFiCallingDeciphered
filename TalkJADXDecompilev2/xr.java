package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class xr implements OnGlobalLayoutListener {
    final /* synthetic */ xq a;

    xr(xq xqVar) {
        this.a = xqVar;
    }

    public void onGlobalLayout() {
        if (this.a.d() && this.a.b.size() > 0 && !((xu) this.a.b.get(0)).a.g()) {
            View view = this.a.c;
            if (view == null || !view.isShown()) {
                this.a.c();
                return;
            }
            for (xu xuVar : this.a.b) {
                xuVar.a.a();
            }
        }
    }
}
