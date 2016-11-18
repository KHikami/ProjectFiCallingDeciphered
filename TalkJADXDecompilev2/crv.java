package defpackage;

import android.view.View;
import android.widget.RelativeLayout.LayoutParams;

final class crv implements csd {
    final /* synthetic */ crq a;

    crv(crq crq) {
        this.a = crq;
    }

    public int a(View view) {
        return ((LayoutParams) view.getLayoutParams()).topMargin;
    }

    public void a(View view, int i) {
        ((LayoutParams) view.getLayoutParams()).topMargin = i;
    }
}
