package p000;

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fto extends jzn implements jgf, jwg {
    jca f13975a;
    bko f13976b;
    jgg f13977c;
    boolean f13978d;
    private jwo f13979e;
    private PreferenceCategory f13980f;

    public fto() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f13975a = (jca) this.binder.m25443a(jca.class);
        this.f13977c = (jgg) this.binder.m25443a(jgg.class);
        this.f13977c.m24129a((jgf) this);
    }

    public void onResume() {
        super.onResume();
        this.f13980f.mo1328c();
        PreferenceCategory preferenceCategory = this.f13980f;
        eps eps = (eps) this.binder.m25443a(eps.class);
        if (this.binder.m25454b(eqa.class) != null) {
            int i;
            int i2;
            CharSequence string;
            ept a = eps.m14227a(this.f13976b);
            switch (a.f12009a) {
                case 100:
                    i = bc.il;
                    i2 = bc.ii;
                    break;
                default:
                    i = bc.ik;
                    i2 = bc.ij;
                    break;
            }
            String str = a.f12010b;
            jwi jwi = new jwi(this.context);
            jwi.m5148g(i);
            if (str != null) {
                string = getString(i2, glq.m18038i(this.context, str));
            } else {
                string = null;
            }
            jwi.mo2102b(string);
            jwi.m5122a(new fts(this));
            preferenceCategory.m10483c(jwi);
        }
        beo beo = (beo) jyn.m25433b(this.context, beo.class);
        if (beo != null) {
            beo.mo515a(getActivity(), this.lifecycle, this.f13980f, this.f13975a.mo2317a());
        }
        jwi jwi2 = new jwi(this.context);
        jwi2.m5148g(bc.fp);
        jwi2.m5122a(new ftp(this));
        this.f13980f.m10483c(jwi2);
        jwi2 = new jwi(this.context);
        jwi2.m5148g(bc.fQ);
        jwi2.m5122a(new ftq(this));
        this.f13980f.m10483c(jwi2);
        jwi2 = new jwi(this.context);
        jwi2.m5148g(bc.kj);
        this.f13980f.m10483c(jwi2);
        jwi2.m5122a(new ftr(this));
    }

    public void mo495a() {
        this.f13976b = fde.m15018e(this.f13975a.mo2317a());
        this.f13979e = new jwo(this.context);
        this.f13980f = this.f13979e.m25341a(bc.f2952i);
    }

    public void mo662a(String str, jgz jgz, jgw jgw) {
        if ("Babel_Sign_out".equals(str)) {
            int i = jgz.m24192d().getInt("account_id");
            if (i == this.f13975a.mo2317a()) {
                getActivity().finish();
            }
            fde.m15027i(i);
        }
    }
}
