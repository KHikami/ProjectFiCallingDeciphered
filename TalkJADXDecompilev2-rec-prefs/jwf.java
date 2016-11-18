package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class jwf implements jza, kco, kcq {
    private jwg f21157a;
    private final onc<PreferenceScreen> f21158b;
    private jxg f21159c = null;
    private PreferenceScreen f21160d;
    private boolean f21161e = false;

    public jwf(jwg jwg, kbu kbu) {
        this.f21157a = jwg;
        this.f21158b = null;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f21159c = (jxg) jyn.m25443a(jxg.class);
    }

    public void z_() {
        this.f21160d = this.f21159c != null ? this.f21159c.mo3625b() : (PreferenceScreen) this.f21158b.mo1297a();
        if (!this.f21161e) {
            this.f21157a.mo495a();
        }
        this.f21161e = true;
    }

    public jwi m25336a(jwi jwi) {
        this.f21160d.m10483c(jwi);
        return jwi;
    }
}
