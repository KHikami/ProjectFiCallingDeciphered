package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class jwf implements jza, kco, kcq {
    private jwg a;
    private final onc<PreferenceScreen> b;
    private jxg c = null;
    private PreferenceScreen d;
    private boolean e = false;

    public jwf(jwg jwg, kbu kbu) {
        this.a = jwg;
        this.b = null;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.c = (jxg) jyn.a(jxg.class);
    }

    public void z_() {
        this.d = this.c != null ? this.c.b() : (PreferenceScreen) this.b.a();
        if (!this.e) {
            this.a.a();
        }
        this.e = true;
    }

    public jwi a(jwi jwi) {
        this.d.c(jwi);
        return jwi;
    }
}
