package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: jyy */
public class jyy extends kcs implements jyq {
    private kbz a;
    private boolean b;
    public final jyn j;

    public jyy() {
        this.j = new jyn();
    }

    public jyn getBinder() {
        return this.j;
    }

    public void onCreate(Bundle bundle) {
        jyn b = jyn.b(getApplicationContext());
        this.j.a((Context) this);
        this.j.a(b);
        a(bundle);
        if (this.b) {
            a();
            this.j.a();
            this.a = this.k.a(new jyz(this, bundle));
            super.onCreate(bundle);
            return;
        }
        String valueOf = String.valueOf(getComponentName().toShortString());
        throw new jzb(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Activity ").append(valueOf).append(" did not call through to super.onAttachBinder()").toString());
    }

    public void onDestroy() {
        this.k.b(this.a);
        super.onDestroy();
    }

    public void a(Bundle bundle) {
        this.b = true;
        this.j.a(new jzg(this, this.k));
    }

    private void a() {
        for (jzk a : this.j.c(jzk.class)) {
            a.a(this, this.k);
        }
    }
}
