package p000;

import android.content.Context;
import android.os.Bundle;

public class jzc extends kct implements jyq {
    public final jyn f6043E = new jyn();
    private kbz f6044n;
    private boolean f6045o;

    public jyn getBinder() {
        return this.f6043E;
    }

    public void onCreate(Bundle bundle) {
        jyn b = jyn.m25435b(getApplicationContext());
        this.f6043E.m25451a((Context) this);
        this.f6043E.m25453a(b);
        mo1084a(bundle);
        if (this.f6045o) {
            mo1085j();
            this.f6043E.m25450a();
            this.f6044n = this.F.m25513a(new jzd(this, bundle));
            super.onCreate(bundle);
            return;
        }
        String valueOf = String.valueOf(getComponentName().toShortString());
        throw new jzb(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Activity ").append(valueOf).append(" did not call through to super.onAttachBinder()").toString());
    }

    public void onDestroy() {
        this.F.m25522b(this.f6044n);
        super.onDestroy();
    }

    public void mo1084a(Bundle bundle) {
        this.f6045o = true;
        this.f6043E.m25449a(new jzg(this, this.F));
    }

    private void mo1085j() {
        for (jzk a : this.f6043E.m25457c(jzk.class)) {
            a.mo3629a(this, this.F);
        }
    }
}
