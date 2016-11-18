package p000;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

final class cxy implements OnClickListener {
    final /* synthetic */ cxl f9318a;
    final /* synthetic */ cxv f9319b;

    cxy(cxv cxv, cxl cxl) {
        this.f9319b = cxv;
        this.f9318a = cxl;
    }

    public void onClick(View view) {
        cxv cxv = this.f9319b;
        Context context = view.getContext();
        cxl cxl = this.f9318a;
        if (cxv.f9303n == null) {
            cxv.f9303n = cxl;
            cxl.mo1880a(context);
        }
    }
}
