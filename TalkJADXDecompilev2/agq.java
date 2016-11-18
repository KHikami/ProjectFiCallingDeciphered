package defpackage;

import android.os.Build.VERSION;
import android.view.View.OnSystemUiVisibilityChangeListener;

final class agq implements OnSystemUiVisibilityChangeListener {
    final /* synthetic */ agp a;

    agq(agp agp) {
        this.a = agp;
    }

    public void onSystemUiVisibilityChange(int i) {
        if (VERSION.SDK_INT >= 19 && i == 0 && this.a.d == 3846) {
            this.a.a(false, true);
        }
    }
}
