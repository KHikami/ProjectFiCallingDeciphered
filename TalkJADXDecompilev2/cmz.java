package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class cmz implements OnGlobalLayoutListener {
    final /* synthetic */ int a;
    final /* synthetic */ cmy b;

    cmz(cmy cmy, int i) {
        this.b = cmy;
        this.a = i;
    }

    public void onGlobalLayout() {
        int width = this.b.b.getWidth();
        if (width != 0) {
            this.b.b.b((width / 2) - (this.a / 2));
        }
    }
}
