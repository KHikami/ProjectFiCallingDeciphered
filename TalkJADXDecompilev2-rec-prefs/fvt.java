package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.SmsSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fvt extends jzn implements jwg {
    iid f14116a;
    private jcf f14117b;
    private jwo f14118c;
    private PreferenceCategory f14119d;

    public fvt() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f14117b = (jcf) this.binder.m25443a(jcf.class);
    }

    public void onResume() {
        super.onResume();
        m16333d();
    }

    private boolean m16331b() {
        fzw fzw = (fzw) this.binder.m25443a(fzw.class);
        if (!fzw.mo2151c() || fzw.mo2158f()) {
            return glq.m18015c(gwb.m1400H()) || fde.m15029j() != null;
        } else {
            return false;
        }
    }

    public void mo495a() {
        this.f14118c = new jwo(this.context);
        m16333d();
    }

    private void m16330a(jwi jwi) {
        if (this.f14119d == null) {
            this.f14119d = this.f14118c.m25341a(bc.cQ);
        }
        this.f14119d.m10483c(jwi);
    }

    private void m16332c() {
        if (this.f14119d != null) {
            this.f14119d.mo1328c();
        }
    }

    private void m16333d() {
        int i = 0;
        if (glq.m18015c(gwb.m1400H()) || m16331b()) {
            m16332c();
            int b = this.f14117b.mo3461b("SMS");
            this.f14116a = ((iih) this.binder.m25443a(iih.class)).mo1979a(b);
            fzw fzw = (fzw) this.binder.m25443a(fzw.class);
            if (m16331b()) {
                if (fzw.mo2151c()) {
                    m16330a(((fwh) this.binder.m25443a(fwh.class)).mo2104a(this.context));
                } else {
                    jwi jxk = new jxk(this.context);
                    m16330a(jxk);
                    jxk.m5148g(bc.cy);
                    jxk.m5150h(bc.cx);
                    jxk.mo534a(fzw.mo2155d());
                    jxk.m5121a(new fvu(this, fzw));
                }
            }
            if (glq.m18015c(gwb.m1400H())) {
                Intent intent = new Intent(this.context, SmsSettingsActivity.class);
                intent.putExtra("account_id", b);
                m16330a(this.f14118c.m25344a(getString(bc.kV), null, intent));
            }
        } else {
            m16332c();
        }
        Class[] clsArr = new Class[]{cpf.class};
        int length = clsArr.length;
        while (i < length) {
            fwm fwm = (fwm) this.binder.m25454b(clsArr[i]);
            if (fwm != null) {
                jwi a = fwm.mo1375a(this.context);
                if (a != null) {
                    m16330a(a);
                }
            }
            i++;
        }
    }
}
