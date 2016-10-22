package defpackage;

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.Collections;
import java.util.List;

/* renamed from: fue */
public final class fue extends jzn implements bod, jwg {
    jca a;
    fit b;
    fuk c;
    jxk d;
    private jwb e;
    private jwb f;
    private jwb g;
    private PreferenceCategory h;

    public fue() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (jca) this.binder.a(jca.class);
        this.b = (fit) this.binder.a(fit.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && bundle.containsKey("pending_notify_invite_settings_request_id")) {
            boolean z = bundle.getBoolean("pending_notify_invite_settings_new_value");
            if (z != bkq.g(this.context, this.a.a())) {
                int i = bundle.getInt("pending_notify_invite_settings_request_id");
                boolean z2 = bundle.getBoolean("pending_notify_invite_settings_old_value");
                czd czd = new czd(this.context);
                czd.a(getString(bc.V));
                this.c = new fuk(this, i, z2, z, czd);
                this.b.a(this.c);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.c != null) {
            bundle.putInt("pending_notify_invite_settings_request_id", this.c.a);
            bundle.putBoolean("pending_notify_invite_settings_old_value", this.c.b);
            bundle.putBoolean("pending_notify_invite_settings_new_value", this.c.c);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        bnz.a.compareAndSet(this, null);
        if (this.c != null) {
            this.b.b(this.c);
            this.c.d.a();
        }
    }

    public void a() {
        int a = this.a.a();
        bnz.a.set(this);
        bnz.a(a);
        jwo jwo = new jwo(this.context);
        PreferenceScreen b = ((jxg) this.binder.a(jxg.class)).b();
        this.d = new jxk(this.context);
        this.d.a(new fuf(this, a));
        this.d.c(this.context.getString(bc.hQ));
        b.c(this.d);
        this.f = a(bc.Y, false, ets.EMAIL_ACL);
        b.c(this.f);
        this.g = a(bc.Z, false, ets.PHONE_ACL);
        b.c(this.g);
        this.e = a(bc.aa, true, ets.PUBLIC_ACL);
        b.c(this.e);
        this.h = jwo.a(getString(bc.uA));
        b();
    }

    void b() {
        int a = this.a.a();
        if (this.c != null) {
            this.d.a(this.c.c);
        } else {
            this.d.a(bkq.g(this.context, a));
        }
        this.e.a(bnz.d(a));
        this.e.b(this.e.i());
        if (this.f != null) {
            this.f.a(bnz.f(a));
            this.f.b(this.f.i());
        }
        if (this.g != null) {
            this.g.a(bnz.e(a));
            this.g.b(this.g.i());
        }
        PreferenceScreen b = ((jxg) this.binder.a(jxg.class)).b();
        List<boc> c = bnz.c(a);
        if (c.size() > 0) {
            b.c(this.h);
            this.h.c();
            Collections.sort(c, new fug(this));
            for (boc boc : c) {
                jwi a2 = a(true, ets.CIRCLE_ACL, boc.b, boc.c);
                a2.c(boc.c);
                a2.a(boc.c);
                a2.a(boc.d);
                a2.b(a2.i());
                this.h.c(a2);
            }
            return;
        }
        b.d(this.h);
    }

    private jwb a(int i, boolean z, ets ets) {
        jwb a = a(z, ets, null, null);
        a.g(i);
        a.a(i);
        return a;
    }

    private jwb a(boolean z, ets ets, String str, String str2) {
        jwb jwb = new jwb(this.context);
        if (z) {
            jwb.b(gwb.dg);
            jwb.c(gwb.di);
        } else {
            jwb.b(gwb.df);
            jwb.c(gwb.dh);
        }
        jwb.a(new fuh(this, str, str2, jwb, ets));
        return jwb;
    }

    public void N_() {
        gwb.a(new fui(this));
    }
}
