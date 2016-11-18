package p000;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

final class byv extends cbc implements byu, jza {
    jca f4796a;
    byq f4797b;
    dw f4798c;
    iih f4799d;
    fit f4800e;
    fmf f4801f;
    bko f4802g;
    private ed f4803i;
    private jxz f4804j = new byw(this);

    protected byv(Context context, kbu kbu) {
        super(context, kbu);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4796a = (jca) jyn.m25443a(jca.class);
        this.f4797b = (byq) jyn.m25443a(byq.class);
        this.f4798c = (dw) jyn.m25443a(dw.class);
        this.f4803i = (ed) jyn.m25443a(ed.class);
        this.f4799d = (iih) jyn.m25443a(iih.class);
        this.f4800e = (fit) jyn.m25443a(fit.class);
        this.f4801f = (fmf) jyn.m25443a(fmf.class);
        this.f4802g = fde.m15018e(this.f4796a.mo2317a());
    }

    public String mo783b() {
        if (m6968h() == null) {
            return "";
        }
        if (this.f4797b.m6959s()) {
            return this.h.getString(gwb.kt, new Object[]{r0});
        }
        return this.h.getString(gwb.ks, new Object[]{r0});
    }

    public boolean mo780e() {
        if (this.f4797b.m6938d() != 1 || this.f4797b.m6948h()) {
            return false;
        }
        return true;
    }

    public void mo782g() {
        if (!m6970a()) {
            glk.m17982e("Babel_BlockConversation", "Not able to block/unblock when clicking on block/unblock option", new Object[0]);
        } else if (this.f4797b.m6959s()) {
            this.f4799d.mo1979a(this.f4796a.mo2317a()).mo1693b().mo1714c(3300);
            this.f4800e.mo2008a(this.f4801f.mo2036a(-1), this.f4796a.mo2317a(), this.f4797b.m6957q().f11213b.f11244a, this.f4797b.m6957q().f11213b.f11245b, this.f4797b.m6957q().f11216e, false, true);
            Toast.makeText(this.h, this.h.getString(bc.jJ, new Object[]{m6968h()}), 0).show();
            this.f4797b.m6937c(false);
            this.f4797b.m6961u();
        } else {
            CharSequence string;
            this.f4799d.mo1979a(this.f4796a.mo2317a()).mo1693b().mo1714c(3299);
            String h = m6968h();
            String string2 = this.h.getString(bc.iG, new Object[]{h});
            if (this.f4797b.m6960t()) {
                string = this.h.getString(bc.iC);
            } else if (gwb.m2254i(this.f4797b.m6942e())) {
                string = this.h.getString(bc.iD);
            } else {
                string = this.h.getString(bc.iF);
            }
            jxy a = jxy.m7674a(string2, string, this.h.getString(bc.iE), this.h.getString(bc.f2931O), 0, 0, gwb.iE);
            a.m7677a(this.f4804j);
            a.mo2341a(this.f4803i, null);
            this.f4799d.mo1979a(this.f4796a.mo2317a()).mo1693b().mo1714c(1818);
        }
    }

    boolean m6970a() {
        if (this.f4797b.m6938d() != 1 || this.f4797b.m6957q() == null) {
            return false;
        }
        return true;
    }

    private String m6968h() {
        if (this.f4797b.m6957q() != null) {
            return gld.m17947d(this.f4797b.m6957q().f11216e);
        }
        return null;
    }
}
