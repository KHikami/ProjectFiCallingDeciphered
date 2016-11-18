package p000;

import android.view.View;
import android.widget.RelativeLayout.LayoutParams;

final class crv implements csd {
    final /* synthetic */ crq f8965a;

    crv(crq crq) {
        this.f8965a = crq;
    }

    public int mo1396a(View view) {
        return ((LayoutParams) view.getLayoutParams()).topMargin;
    }

    public void mo1397a(View view, int i) {
        ((LayoutParams) view.getLayoutParams()).topMargin = i;
    }
}
