package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;

/* renamed from: cbn */
final class cbn implements jza, kcf, kci, kck, kcq {
    private final Context a;
    private cbi b;
    private jca c;
    private jek d;
    private cgr e;
    private iih f;
    private MenuItem g;

    public cbn(Context context, kbu kbu) {
        this.a = context;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (cbi) jyn.a(cbi.class);
        this.c = (jca) jyn.a(jca.class);
        this.d = (jek) jyn.a(jek.class);
        this.e = (cgr) jyn.a(cgr.class);
        this.f = (iih) jyn.a(iih.class);
    }

    public boolean a(Menu menu) {
        this.g = menu.add(0, gwb.kZ, 0, gwb.lb);
        this.g.setIcon(R$drawable.br);
        return true;
    }

    public boolean b(Menu menu) {
        boolean z;
        boolean z2 = false;
        bpd a = this.e.a();
        int e = this.e.e();
        if (a != null || e == 2) {
            z = true;
        } else {
            z = false;
        }
        MenuItem menuItem = this.g;
        if (z && !this.e.j()) {
            z2 = true;
        }
        menuItem.setVisible(z2);
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.kZ) {
            return false;
        }
        bpd a = this.e.a();
        if (a == null || a.a == null) {
            return true;
        }
        String str;
        String str2;
        this.f.a(this.c.a()).b().c(3271);
        int e = this.e.e();
        if (e == 2) {
            str = null;
            str2 = null;
        } else {
            str = a.h.c();
            str2 = a.h.b();
        }
        Intent a2 = ((cbk) jyn.a(this.a, cbk.class)).a(this.c.a(), a.a, this.e.f(), e, a.b, this.b.g(), this.b.e(), this.b.d(), this.e.g(), this.b.b(), this.e.h(), this.b.a(), this.b.c(), this.b.f(), str, str2);
        Parcelable h = this.b.h();
        if (h != null) {
            h.putExtra("conversation_id", a.a);
            a2.putExtra("share_intent", h);
        }
        this.d.a(gwb.lB, a2);
        return true;
    }
}
