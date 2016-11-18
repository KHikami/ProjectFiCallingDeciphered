package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class ckj implements OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ cki b;

    ckj(cki cki, View view) {
        this.b = cki;
        this.a = view;
    }

    public boolean onPreDraw() {
        int[] iArr = new int[]{this.a.getWidth(), this.a.getHeight()};
        this.b.e = iArr;
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
