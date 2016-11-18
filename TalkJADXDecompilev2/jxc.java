package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class jxc implements jxg, kbk, kbm, kcn, kcq {
    private final jvw a;
    private ew b;
    private jxd c;
    private PreferenceScreen d;

    public <T extends jvw & jxd> jxc(T t, kbu kbu) {
        this(t, (jxd) t, kbu);
    }

    private jxc(jvw jvw, jxd jxd, kbu kbu) {
        this.a = jvw;
        this.c = (jxd) ba.a((Object) jxd);
        kbu.a((kcq) this);
    }

    public void b(Bundle bundle) {
    }

    public void a() {
        PreferenceScreen a = this.a.b().a(this.a.a);
        this.a.a(a);
        this.d = a;
    }

    public void a(View view, Bundle bundle) {
        if (bundle == null) {
            this.b = this.a.getChildFragmentManager().a();
            this.c.a();
            this.b.a();
            this.b = null;
        }
    }

    public void a(dr drVar) {
        this.b.a(drVar, null);
    }

    public PreferenceScreen b() {
        if (this.d != null) {
            return this.d;
        }
        throw new IllegalStateException("PreferenceScreen cannot be accessed before OnCreateView");
    }
}
