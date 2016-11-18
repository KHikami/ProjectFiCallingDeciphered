package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class yu implements OnGlobalLayoutListener {
    final /* synthetic */ yt f35863a;

    yu(yt ytVar) {
        this.f35863a = ytVar;
    }

    public void onGlobalLayout() {
        if (this.f35863a.mo4527d() && !this.f35863a.f35844a.g()) {
            View view = this.f35863a.f35845b;
            if (view == null || !view.isShown()) {
                this.f35863a.mo4524c();
            } else {
                this.f35863a.f35844a.a();
            }
        }
    }
}
