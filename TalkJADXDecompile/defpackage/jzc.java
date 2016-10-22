package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: jzc */
public class jzc extends kct implements jyq {
    public final jyn E;
    private kbz n;
    private boolean o;

    public jzc() {
        this.E = new jyn();
    }

    public jyn getBinder() {
        return this.E;
    }

    public void onCreate(Bundle bundle) {
        jyn b = jyn.b(getApplicationContext());
        this.E.a((Context) this);
        this.E.a(b);
        a(bundle);
        if (this.o) {
            j();
            this.E.a();
            this.n = this.F.a(new jzd(this, bundle));
            super.onCreate(bundle);
            return;
        }
        String valueOf = String.valueOf(getComponentName().toShortString());
        throw new jzb(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Activity ").append(valueOf).append(" did not call through to super.onAttachBinder()").toString());
    }

    public void onDestroy() {
        this.F.b(this.n);
        super.onDestroy();
    }

    public void a(Bundle bundle) {
        this.o = true;
        this.E.a(new jzg(this, this.F));
    }

    private void j() {
        for (jzk a : this.E.c(jzk.class)) {
            a.a(this, this.F);
        }
    }
}
