package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class yu implements OnGlobalLayoutListener {
    final /* synthetic */ yt a;

    yu(yt ytVar) {
        this.a = ytVar;
    }

    public void onGlobalLayout() {
        if (this.a.d() && !this.a.a.g()) {
            View view = this.a.b;
            if (view == null || !view.isShown()) {
                this.a.c();
            } else {
                this.a.a.a();
            }
        }
    }
}
