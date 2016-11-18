package p000;

import android.content.Context;
import android.os.Bundle;

public class jyy extends kcs implements jyq {
    private kbz f6232a;
    private boolean f6233b;
    public final jyn f6234j = new jyn();

    public jyn getBinder() {
        return this.f6234j;
    }

    public void onCreate(Bundle bundle) {
        jyn b = jyn.m25435b(getApplicationContext());
        this.f6234j.m25451a((Context) this);
        this.f6234j.m25453a(b);
        mo1092a(bundle);
        if (this.f6233b) {
            mo1171a();
            this.f6234j.m25450a();
            this.f6232a = this.k.m25513a(new jyz(this, bundle));
            super.onCreate(bundle);
            return;
        }
        String valueOf = String.valueOf(getComponentName().toShortString());
        throw new jzb(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Activity ").append(valueOf).append(" did not call through to super.onAttachBinder()").toString());
    }

    public void onDestroy() {
        this.k.m25522b(this.f6232a);
        super.onDestroy();
    }

    public void mo1092a(Bundle bundle) {
        this.f6233b = true;
        this.f6234j.m25449a(new jzg(this, this.k));
    }

    private void mo1171a() {
        for (jzk a : this.f6234j.m25457c(jzk.class)) {
            a.mo3629a(this, this.k);
        }
    }
}
