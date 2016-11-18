package p000;

import android.content.Context;
import android.view.View;

public final class zi extends yl {
    final /* synthetic */ zh f35905a;

    public zi(zh zhVar, Context context, yv yvVar, View view) {
        this.f35905a = zhVar;
        super(context, yvVar, view, false, gwb.B);
        if (!((yc) yvVar.getItem()).m41490i()) {
            View view2;
            if (zhVar.f35885g == null) {
                view2 = (View) zhVar.f;
            } else {
                view2 = zhVar.f35885g;
            }
            m41511a(view2);
        }
        m41513a(zhVar.f35889k);
    }

    protected void mo4549e() {
        this.f35905a.f35887i = null;
        this.f35905a.f35890l = 0;
        super.mo4549e();
    }
}
