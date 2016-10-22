package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: jzp */
public class jzp extends kcw implements jyq {
    private kbz n;
    private boolean o;
    public final jyn p;

    public jzp() {
        this.p = new jyn();
    }

    public jyn getBinder() {
        return this.p;
    }

    public void onCreate(Bundle bundle) {
        jyn b = jyn.b(getApplicationContext());
        this.p.a((Context) this);
        this.p.a(b);
        a(bundle);
        if (this.o) {
            g();
            this.p.a();
            this.n = this.q.a(new jzq(this, bundle));
            super.onCreate(bundle);
            return;
        }
        String valueOf = String.valueOf(getComponentName().toShortString());
        throw new jzb(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Activity ").append(valueOf).append(" did not call through to super.onAttachBinder()").toString());
    }

    public void onDestroy() {
        this.q.b(this.n);
        super.onDestroy();
    }

    public void a(Bundle bundle) {
        this.o = true;
        this.p.a(new jzg(this, this.q));
    }

    private void g() {
        for (jzk a : this.p.c(jzk.class)) {
            a.a(this, this.q);
        }
    }
}
