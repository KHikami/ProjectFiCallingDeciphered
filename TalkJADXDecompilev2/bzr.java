package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class bzr implements OnClickListener {
    final /* synthetic */ bzq a;

    bzr(bzq bzq) {
        this.a = bzq;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.h();
        for (String a : this.a.b.b()) {
            this.a.d.a(this.a.a.a(), a, 1);
        }
        this.a.e.a(this.a.a.a()).b().c(3186);
        if (this.a.b.p() != null && this.a.b.p().d()) {
            this.a.e.a(this.a.a.a()).b().c(3335);
        }
        this.a.b.d(1);
    }
}
