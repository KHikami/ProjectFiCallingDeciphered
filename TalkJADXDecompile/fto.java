import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fto extends jzn implements jgf, jwg {
    jca a;
    bko b;
    jgg c;
    boolean d;
    private jwo e;
    private PreferenceCategory f;

    public fto() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (jca) this.binder.a(jca.class);
        this.c = (jgg) this.binder.a(jgg.class);
        this.c.a((jgf) this);
    }

    public void onResume() {
        super.onResume();
        this.f.c();
        PreferenceCategory preferenceCategory = this.f;
        eps eps = (eps) this.binder.a(eps.class);
        if (this.binder.b(eqa.class) != null) {
            int i;
            int i2;
            CharSequence string;
            ept a = eps.a(this.b);
            switch (a.a) {
                case 100:
                    i = bc.il;
                    i2 = bc.ii;
                    break;
                default:
                    i = bc.ik;
                    i2 = bc.ij;
                    break;
            }
            String str = a.b;
            jwi jwi = new jwi(this.context);
            jwi.g(i);
            if (str != null) {
                string = getString(i2, glq.i(this.context, str));
            } else {
                string = null;
            }
            jwi.b(string);
            jwi.a(new fts(this));
            preferenceCategory.c(jwi);
        }
        beo beo = (beo) jyn.b(this.context, beo.class);
        if (beo != null) {
            beo.a(getActivity(), this.lifecycle, this.f, this.a.a());
        }
        jwi jwi2 = new jwi(this.context);
        jwi2.g(bc.fp);
        jwi2.a(new ftp(this));
        this.f.c(jwi2);
        jwi2 = new jwi(this.context);
        jwi2.g(bc.fQ);
        jwi2.a(new ftq(this));
        this.f.c(jwi2);
        jwi2 = new jwi(this.context);
        jwi2.g(bc.kj);
        this.f.c(jwi2);
        jwi2.a(new ftr(this));
    }

    public void a() {
        this.b = fde.e(this.a.a());
        this.e = new jwo(this.context);
        this.f = this.e.a(bc.i);
    }

    public void a(String str, jgz jgz, jgw jgw) {
        if ("Babel_Sign_out".equals(str)) {
            int i = jgz.d().getInt("account_id");
            if (i == this.a.a()) {
                getActivity().finish();
            }
            fde.i(i);
        }
    }
}
