package p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class jxc implements jxg, kbk, kbm, kcn, kcq {
    private final jvw f21196a;
    private ew f21197b;
    private jxd f21198c;
    private PreferenceScreen f21199d;

    public <T extends jvw & jxd> jxc(T t, kbu kbu) {
        this(t, (jxd) t, kbu);
    }

    private jxc(jvw jvw, jxd jxd, kbu kbu) {
        this.f21196a = jvw;
        this.f21198c = (jxd) ba.m4536a((Object) jxd);
        kbu.m25514a((kcq) this);
    }

    public void mo645b(Bundle bundle) {
    }

    public void mo3624a() {
        PreferenceScreen a = this.f21196a.m16201b().m25359a(this.f21196a.f13971a);
        this.f21196a.m16199a(a);
        this.f21199d = a;
    }

    public void mo917a(View view, Bundle bundle) {
        if (bundle == null) {
            this.f21197b = this.f21196a.getChildFragmentManager().mo1845a();
            this.f21198c.mo2091a();
            this.f21197b.mo1522a();
            this.f21197b = null;
        }
    }

    public void m25386a(dr drVar) {
        this.f21197b.mo1528a(drVar, null);
    }

    public PreferenceScreen mo3625b() {
        if (this.f21199d != null) {
            return this.f21199d;
        }
        throw new IllegalStateException("PreferenceScreen cannot be accessed before OnCreateView");
    }
}
