package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dkh */
final class dkh implements OnClickListener {
    final /* synthetic */ dkf a;

    dkh(dkf dkf) {
        this.a = dkf;
    }

    public void onClick(View view) {
        if (this.a.o) {
            this.a.e.a(this.a);
            this.a.e();
            this.a.f();
        }
        this.a.o = true;
    }
}
