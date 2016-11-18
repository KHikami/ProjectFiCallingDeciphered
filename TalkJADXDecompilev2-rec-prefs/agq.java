package p000;

import android.os.Build.VERSION;
import android.view.View.OnSystemUiVisibilityChangeListener;

final class agq implements OnSystemUiVisibilityChangeListener {
    final /* synthetic */ agp f685a;

    agq(agp agp) {
        this.f685a = agp;
    }

    public void onSystemUiVisibilityChange(int i) {
        if (VERSION.SDK_INT >= 19 && i == 0 && this.f685a.f662d == 3846) {
            this.f685a.m1139a(false, true);
        }
    }
}
