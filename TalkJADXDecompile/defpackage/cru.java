package defpackage;

import android.view.View;
import android.widget.RelativeLayout.LayoutParams;

/* renamed from: cru */
final class cru implements csd {
    final /* synthetic */ crq a;

    cru(crq crq) {
        this.a = crq;
    }

    public int a(View view) {
        return ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public void a(View view, int i) {
        ((LayoutParams) view.getLayoutParams()).bottomMargin = i;
    }
}
