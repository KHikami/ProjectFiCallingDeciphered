package p000;

import android.os.Bundle;
import android.view.View;

final class chi implements kbm, kcn, kcq {
    chj f5327a;
    private bkm f5328b;

    chi(chj chj) {
        this.f5327a = chj;
    }

    void m7652a(bkm bkm) {
        this.f5328b = bkm;
    }

    public void mo645b(Bundle bundle) {
        bundle.putParcelable("draft", this.f5327a.ab());
    }

    public void mo917a(View view, Bundle bundle) {
        if (bundle != null) {
            this.f5327a.mo850b((bkm) bundle.getParcelable("draft"));
        } else if (this.f5328b != null) {
            this.f5327a.mo850b(this.f5328b);
        } else {
            this.f5327a.mo829N();
        }
    }
}
