package defpackage;

import android.content.Context;
import android.view.View;

final class zm extends yl {
    final /* synthetic */ zh a;

    public zm(zh zhVar, Context context, xy xyVar, View view, boolean z) {
        this.a = zhVar;
        super(context, xyVar, view, true, gwb.B);
        a(8388613);
        a(zhVar.k);
    }

    protected void e() {
        if (this.a.c != null) {
            this.a.c.close();
        }
        this.a.h = null;
        super.e();
    }
}
