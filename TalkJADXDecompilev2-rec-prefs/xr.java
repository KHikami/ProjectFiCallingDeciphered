package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class xr implements OnGlobalLayoutListener {
    final /* synthetic */ xq f35733a;

    xr(xq xqVar) {
        this.f35733a = xqVar;
    }

    public void onGlobalLayout() {
        if (this.f35733a.mo4527d() && this.f35733a.f35709b.size() > 0 && !((xu) this.f35733a.f35709b.get(0)).f35739a.g()) {
            View view = this.f35733a.f35710c;
            if (view == null || !view.isShown()) {
                this.f35733a.mo4524c();
                return;
            }
            for (xu xuVar : this.f35733a.f35709b) {
                xuVar.f35739a.a();
            }
        }
    }
}
