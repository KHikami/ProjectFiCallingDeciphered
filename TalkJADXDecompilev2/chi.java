package defpackage;

import android.os.Bundle;
import android.view.View;

final class chi implements kbm, kcn, kcq {
    chj a;
    private bkm b;

    chi(chj chj) {
        this.a = chj;
    }

    void a(bkm bkm) {
        this.b = bkm;
    }

    public void b(Bundle bundle) {
        bundle.putParcelable("draft", this.a.ab());
    }

    public void a(View view, Bundle bundle) {
        if (bundle != null) {
            this.a.b((bkm) bundle.getParcelable("draft"));
        } else if (this.b != null) {
            this.a.b(this.b);
        } else {
            this.a.N();
        }
    }
}
