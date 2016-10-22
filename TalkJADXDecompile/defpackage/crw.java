package defpackage;

import android.os.Build.VERSION;
import android.view.View.OnSystemUiVisibilityChangeListener;

/* renamed from: crw */
final class crw implements OnSystemUiVisibilityChangeListener {
    final /* synthetic */ crq a;

    crw(crq crq) {
        this.a = crq;
    }

    public void onSystemUiVisibilityChange(int i) {
        if (VERSION.SDK_INT >= 19 && (i & 2) == 0) {
            this.a.a(csk.a);
        }
    }
}
