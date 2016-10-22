package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: cxy */
final class cxy implements OnClickListener {
    final /* synthetic */ cxl a;
    final /* synthetic */ cxv b;

    cxy(cxv cxv, cxl cxl) {
        this.b = cxv;
        this.a = cxl;
    }

    public void onClick(View view) {
        cxv cxv = this.b;
        Context context = view.getContext();
        cxl cxl = this.a;
        if (cxv.n == null) {
            cxv.n = cxl;
            cxl.a(context);
        }
    }
}
