package p000;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class cmz implements OnGlobalLayoutListener {
    final /* synthetic */ int f5676a;
    final /* synthetic */ cmy f5677b;

    cmz(cmy cmy, int i) {
        this.f5677b = cmy;
        this.f5676a = i;
    }

    public void onGlobalLayout() {
        int width = this.f5677b.f5632b.getWidth();
        if (width != 0) {
            this.f5677b.f5632b.m8369b((width / 2) - (this.f5676a / 2));
        }
    }
}
