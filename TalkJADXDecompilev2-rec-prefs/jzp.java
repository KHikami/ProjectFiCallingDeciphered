package p000;

import android.content.Context;
import android.os.Bundle;

public class jzp extends kcw implements jyq {
    private kbz f5955n;
    private boolean f5956o;
    public final jyn f5957p = new jyn();

    public jyn getBinder() {
        return this.f5957p;
    }

    public void onCreate(Bundle bundle) {
        jyn b = jyn.m25435b(getApplicationContext());
        this.f5957p.m25451a((Context) this);
        this.f5957p.m25453a(b);
        mo1139a(bundle);
        if (this.f5956o) {
            mo1056g();
            this.f5957p.m25450a();
            this.f5955n = this.q.m25513a(new jzq(this, bundle));
            super.onCreate(bundle);
            return;
        }
        String valueOf = String.valueOf(getComponentName().toShortString());
        throw new jzb(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Activity ").append(valueOf).append(" did not call through to super.onAttachBinder()").toString());
    }

    public void onDestroy() {
        this.q.m25522b(this.f5955n);
        super.onDestroy();
    }

    public void mo1139a(Bundle bundle) {
        this.f5956o = true;
        this.f5957p.m25449a(new jzg(this, this.q));
    }

    private void mo1056g() {
        for (jzk a : this.f5957p.m25457c(jzk.class)) {
            a.mo3629a(this, this.q);
        }
    }
}
