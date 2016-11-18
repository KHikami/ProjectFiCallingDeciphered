package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;

final class cbn implements jza, kcf, kci, kck, kcq {
    private final Context f4958a;
    private cbi f4959b;
    private jca f4960c;
    private jek f4961d;
    private cgr f4962e;
    private iih f4963f;
    private MenuItem f4964g;

    public cbn(Context context, kbu kbu) {
        this.f4958a = context;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4959b = (cbi) jyn.m25443a(cbi.class);
        this.f4960c = (jca) jyn.m25443a(jca.class);
        this.f4961d = (jek) jyn.m25443a(jek.class);
        this.f4962e = (cgr) jyn.m25443a(cgr.class);
        this.f4963f = (iih) jyn.m25443a(iih.class);
    }

    public boolean mo670a(Menu menu) {
        this.f4964g = menu.add(0, gwb.kZ, 0, gwb.lb);
        this.f4964g.setIcon(R$drawable.br);
        return true;
    }

    public boolean mo672b(Menu menu) {
        boolean z;
        boolean z2 = false;
        bpd a = this.f4962e.mo931a();
        int e = this.f4962e.mo947e();
        if (a != null || e == 2) {
            z = true;
        } else {
            z = false;
        }
        MenuItem menuItem = this.f4964g;
        if (z && !this.f4962e.mo953j()) {
            z2 = true;
        }
        menuItem.setVisible(z2);
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.kZ) {
            return false;
        }
        bpd a = this.f4962e.mo931a();
        if (a == null || a.f4146a == null) {
            return true;
        }
        String str;
        String str2;
        this.f4963f.mo1979a(this.f4960c.mo2317a()).mo1693b().mo1714c(3271);
        int e = this.f4962e.mo947e();
        if (e == 2) {
            str = null;
            str2 = null;
        } else {
            str = a.f4153h.m13592c();
            str2 = a.f4153h.m13590b();
        }
        Intent a2 = ((cbk) jyn.m25426a(this.f4958a, cbk.class)).mo805a(this.f4960c.mo2317a(), a.f4146a, this.f4962e.mo949f(), e, a.f4147b, this.f4959b.mo913g(), this.f4959b.mo911e(), this.f4959b.mo910d(), this.f4962e.mo950g(), this.f4959b.mo908b(), this.f4962e.mo951h(), this.f4959b.mo907a(), this.f4959b.mo909c(), this.f4959b.mo912f(), str, str2);
        Parcelable h = this.f4959b.mo914h();
        if (h != null) {
            h.putExtra("conversation_id", a.f4146a);
            a2.putExtra("share_intent", h);
        }
        this.f4961d.m24035a(gwb.lB, a2);
        return true;
    }
}
