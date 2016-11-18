package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

final class cxx implements OnClickListener {
    final /* synthetic */ cxv a;

    cxx(cxv cxv) {
        this.a = cxv;
    }

    public void onClick(View view) {
        if (!this.a.B) {
            this.a.b(true);
        }
    }
}
