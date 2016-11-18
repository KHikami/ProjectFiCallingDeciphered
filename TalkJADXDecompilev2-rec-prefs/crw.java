package p000;

import android.os.Build.VERSION;
import android.view.View.OnSystemUiVisibilityChangeListener;

final class crw implements OnSystemUiVisibilityChangeListener {
    final /* synthetic */ crq f8966a;

    crw(crq crq) {
        this.f8966a = crq;
    }

    public void onSystemUiVisibilityChange(int i) {
        if (VERSION.SDK_INT >= 19 && (i & 2) == 0) {
            this.f8966a.m10837a(csk.f8985a);
        }
    }
}
