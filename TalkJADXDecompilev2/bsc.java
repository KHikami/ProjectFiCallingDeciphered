package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;
import java.util.Collection;

final class bsc implements jza, kcf, kci, kck, kcq {
    private final Context a;
    private bry b;
    private jca c;
    private bbm d;
    private cgr e;
    private bpe f;
    private iih g;
    private cbt h;
    private MenuItem i;

    public bsc(Context context, kbu kbu) {
        this.a = context;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (bry) jyn.a(bry.class);
        this.c = (jca) jyn.a(jca.class);
        this.d = (bbm) jyn.a(bbm.class);
        this.e = (cgr) jyn.a(cgr.class);
        this.f = (bpe) jyn.a(bpe.class);
        this.g = (iih) jyn.a(iih.class);
        this.h = (cbt) jyn.b(cbt.class);
    }

    public boolean a(Menu menu) {
        this.i = menu.add(0, gwb.jN, 0, bc.iU);
        this.i.setIcon(R$drawable.bm);
        this.i.setShowAsAction(0);
        return true;
    }

    public boolean b(Menu menu) {
        int i = 0;
        bpd a = this.e.a();
        if (a == null) {
            this.i.setVisible(false);
        } else {
            boolean z;
            boolean z2;
            int a2 = this.c.a();
            int e = this.e.e();
            int i2 = a.b;
            boolean g = this.d.g(a2);
            if (!this.b.b() || g || !this.e.a(bpo.class) || this.e.j() || ((a() && (e == 2 || !fyi.a(a2, i2))) || this.b.a() || this.e.h())) {
                z = false;
            } else {
                z = true;
            }
            if (this.h != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (e == 1) {
                    i = 1;
                }
                z &= i;
            }
            this.i.setVisible(z);
            MenuItem menuItem = this.i;
            Context context = this.a;
            if (e == 2) {
                i2 = bc.iU;
            } else if (a()) {
                i2 = bc.hh;
            } else {
                i2 = bc.iY;
            }
            menuItem.setTitle(context.getString(i2));
        }
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.jN) {
            return false;
        }
        if (this.e.a() == null) {
            return true;
        }
        int i;
        bcj bcj;
        bxt bxt;
        iie b = this.g.a(this.c.a()).b();
        if (this.e.e() == 2) {
            i = 3273;
        } else if (a()) {
            i = 3309;
        } else {
            i = 3274;
        }
        b.c(i);
        bko e = fde.e(this.c.a());
        boolean z = this.e.e() == 2;
        String str = this.e.a().a;
        Collection a = this.f.a();
        if (z) {
            bcj = bcj.INVITE_MORE_TO_GROUPCHAT;
        } else {
            bcj = bcj.UPGRADE_TO_GROUPCHAT;
        }
        if (a()) {
            bxt = bxt.SMS_MESSAGE;
        } else {
            bxt = bxt.HANGOUTS_MESSAGE;
        }
        this.a.startActivity(gwb.a(e, str, a, bcj, bxt));
        return true;
    }

    private boolean a() {
        return gwb.i(this.e.a().b);
    }
}
