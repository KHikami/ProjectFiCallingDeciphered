package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class ckj implements OnPreDrawListener {
    final /* synthetic */ View f5507a;
    final /* synthetic */ cki f5508b;

    ckj(cki cki, View view) {
        this.f5508b = cki;
        this.f5507a = view;
    }

    public boolean onPreDraw() {
        int[] iArr = new int[]{this.f5507a.getWidth(), this.f5507a.getHeight()};
        this.f5508b.f5501e = iArr;
        this.f5507a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
