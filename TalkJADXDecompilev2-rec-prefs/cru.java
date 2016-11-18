package p000;

import android.view.View;
import android.widget.RelativeLayout.LayoutParams;

final class cru implements csd {
    final /* synthetic */ crq f8964a;

    cru(crq crq) {
        this.f8964a = crq;
    }

    public int mo1396a(View view) {
        return ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public void mo1397a(View view, int i) {
        ((LayoutParams) view.getLayoutParams()).bottomMargin = i;
    }
}
