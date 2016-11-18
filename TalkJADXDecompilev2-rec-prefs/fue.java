package p000;

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.Collections;
import java.util.List;

public final class fue extends jzn implements bod, jwg {
    jca f14008a;
    fit f14009b;
    fuk f14010c;
    jxk f14011d;
    private jwb f14012e;
    private jwb f14013f;
    private jwb f14014g;
    private PreferenceCategory f14015h;

    public fue() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f14008a = (jca) this.binder.m25443a(jca.class);
        this.f14009b = (fit) this.binder.m25443a(fit.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && bundle.containsKey("pending_notify_invite_settings_request_id")) {
            boolean z = bundle.getBoolean("pending_notify_invite_settings_new_value");
            if (z != bkq.m5696g(this.context, this.f14008a.mo2317a())) {
                int i = bundle.getInt("pending_notify_invite_settings_request_id");
                boolean z2 = bundle.getBoolean("pending_notify_invite_settings_old_value");
                czd czd = new czd(this.context);
                czd.mo1486a(getString(bc.f2938V));
                this.f14010c = new fuk(this, i, z2, z, czd);
                this.f14009b.mo2007a(this.f14010c);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f14010c != null) {
            bundle.putInt("pending_notify_invite_settings_request_id", this.f14010c.f14031a);
            bundle.putBoolean("pending_notify_invite_settings_old_value", this.f14010c.f14032b);
            bundle.putBoolean("pending_notify_invite_settings_new_value", this.f14010c.f14033c);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        bnz.f4077a.compareAndSet(this, null);
        if (this.f14010c != null) {
            this.f14009b.mo2016b(this.f14010c);
            this.f14010c.f14034d.mo1484a();
        }
    }

    public void mo495a() {
        int a = this.f14008a.mo2317a();
        bnz.f4077a.set(this);
        bnz.m6271a(a);
        jwo jwo = new jwo(this.context);
        PreferenceScreen b = ((jxg) this.binder.m25443a(jxg.class)).mo3625b();
        this.f14011d = new jxk(this.context);
        this.f14011d.m5121a(new fuf(this, a));
        this.f14011d.m5131c(this.context.getString(bc.hQ));
        b.m10483c(this.f14011d);
        this.f14013f = m16247a(bc.f2941Y, false, ets.EMAIL_ACL);
        b.m10483c(this.f14013f);
        this.f14014g = m16247a(bc.f2942Z, false, ets.PHONE_ACL);
        b.m10483c(this.f14014g);
        this.f14012e = m16247a(bc.aa, true, ets.PUBLIC_ACL);
        b.m10483c(this.f14012e);
        this.f14015h = jwo.m25342a(getString(bc.uA));
        m16250b();
    }

    void m16250b() {
        int a = this.f14008a.mo2317a();
        if (this.f14010c != null) {
            this.f14011d.mo534a(this.f14010c.f14033c);
        } else {
            this.f14011d.mo534a(bkq.m5696g(this.context, a));
        }
        this.f14012e.m16373a(bnz.m6278d(a));
        this.f14012e.mo2102b(this.f14012e.m16387i());
        if (this.f14013f != null) {
            this.f14013f.m16373a(bnz.m6280f(a));
            this.f14013f.mo2102b(this.f14013f.m16387i());
        }
        if (this.f14014g != null) {
            this.f14014g.m16373a(bnz.m6279e(a));
            this.f14014g.mo2102b(this.f14014g.m16387i());
        }
        PreferenceScreen b = ((jxg) this.binder.m25443a(jxg.class)).mo3625b();
        List<boc> c = bnz.m6277c(a);
        if (c.size() > 0) {
            b.m10483c(this.f14015h);
            this.f14015h.mo1328c();
            Collections.sort(c, new fug(this));
            for (boc boc : c) {
                jwi a2 = m16248a(true, ets.CIRCLE_ACL, boc.f4084b, boc.f4085c);
                a2.m5131c(boc.f4085c);
                a2.m16363a(boc.f4085c);
                a2.m16373a(boc.f4086d);
                a2.mo2102b(a2.m16387i());
                this.f14015h.m10483c(a2);
            }
            return;
        }
        b.m10485d(this.f14015h);
    }

    private jwb m16247a(int i, boolean z, ets ets) {
        jwb a = m16248a(z, ets, null, null);
        a.m5148g(i);
        a.m16360a(i);
        return a;
    }

    private jwb m16248a(boolean z, ets ets, String str, String str2) {
        jwb jwb = new jwb(this.context);
        if (z) {
            jwb.m16378b(gwb.dg);
            jwb.m16381c(gwb.di);
        } else {
            jwb.m16378b(gwb.df);
            jwb.m16381c(gwb.dh);
        }
        jwb.m5121a(new fuh(this, str, str2, jwb, ets));
        return jwb;
    }

    public void N_() {
        gwb.m1863a(new fui(this));
    }
}
