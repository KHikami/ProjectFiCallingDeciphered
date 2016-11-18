package defpackage;

import android.content.Context;
import android.view.View;

public final class zi extends yl {
    final /* synthetic */ zh a;

    public zi(zh zhVar, Context context, yv yvVar, View view) {
        this.a = zhVar;
        super(context, yvVar, view, false, gwb.B);
        if (!((yc) yvVar.getItem()).i()) {
            View view2;
            if (zhVar.g == null) {
                view2 = (View) zhVar.f;
            } else {
                view2 = zhVar.g;
            }
            a(view2);
        }
        a(zhVar.k);
    }

    protected void e() {
        this.a.i = null;
        this.a.l = 0;
        super.e();
    }
}
