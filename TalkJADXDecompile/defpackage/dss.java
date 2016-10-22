package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dss */
final class dss implements OnClickListener {
    final /* synthetic */ dso a;

    dss(dso dso) {
        this.a = dso;
    }

    public void onClick(View view) {
        if (this.a.c() != null) {
            this.a.c().dismiss();
        }
    }
}
