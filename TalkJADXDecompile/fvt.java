import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.SmsSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fvt extends jzn implements jwg {
    iid a;
    private jcf b;
    private jwo c;
    private PreferenceCategory d;

    public fvt() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.b = (jcf) this.binder.a(jcf.class);
    }

    public void onResume() {
        super.onResume();
        d();
    }

    private boolean b() {
        fzw fzw = (fzw) this.binder.a(fzw.class);
        if (!fzw.c() || fzw.f()) {
            return glq.c(gwb.H()) || fde.j() != null;
        } else {
            return false;
        }
    }

    public void a() {
        this.c = new jwo(this.context);
        d();
    }

    private void a(jwi jwi) {
        if (this.d == null) {
            this.d = this.c.a(bc.cQ);
        }
        this.d.c(jwi);
    }

    private void c() {
        if (this.d != null) {
            this.d.c();
        }
    }

    private void d() {
        int i = 0;
        if (glq.c(gwb.H()) || b()) {
            c();
            int b = this.b.b("SMS");
            this.a = ((iih) this.binder.a(iih.class)).a(b);
            fzw fzw = (fzw) this.binder.a(fzw.class);
            if (b()) {
                if (fzw.c()) {
                    a(((fwh) this.binder.a(fwh.class)).a(this.context));
                } else {
                    jwi jxk = new jxk(this.context);
                    a(jxk);
                    jxk.g(bc.cy);
                    jxk.h(bc.cx);
                    jxk.a(fzw.d());
                    jxk.a(new fvu(this, fzw));
                }
            }
            if (glq.c(gwb.H())) {
                Intent intent = new Intent(this.context, SmsSettingsActivity.class);
                intent.putExtra("account_id", b);
                a(this.c.a(getString(bc.kV), null, intent));
            }
        } else {
            c();
        }
        Class[] clsArr = new Class[]{cpf.class};
        int length = clsArr.length;
        while (i < length) {
            fwm fwm = (fwm) this.binder.b(clsArr[i]);
            if (fwm != null) {
                jwi a = fwm.a(this.context);
                if (a != null) {
                    a(a);
                }
            }
            i++;
        }
    }
}
