package defpackage;

import android.os.Bundle;

/* renamed from: dwp */
public final class dwp extends jzn implements jmi {
    private jmo a;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (jmo) this.binder.a(jmo.class);
    }

    public void a(jmu jmu) {
        this.a.b();
    }
}
