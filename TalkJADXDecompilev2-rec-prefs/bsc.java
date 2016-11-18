package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;
import java.util.Collection;

final class bsc implements jza, kcf, kci, kck, kcq {
    private final Context f4309a;
    private bry f4310b;
    private jca f4311c;
    private bbm f4312d;
    private cgr f4313e;
    private bpe f4314f;
    private iih f4315g;
    private cbt f4316h;
    private MenuItem f4317i;

    public bsc(Context context, kbu kbu) {
        this.f4309a = context;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4310b = (bry) jyn.m25443a(bry.class);
        this.f4311c = (jca) jyn.m25443a(jca.class);
        this.f4312d = (bbm) jyn.m25443a(bbm.class);
        this.f4313e = (cgr) jyn.m25443a(cgr.class);
        this.f4314f = (bpe) jyn.m25443a(bpe.class);
        this.f4315g = (iih) jyn.m25443a(iih.class);
        this.f4316h = (cbt) jyn.m25454b(cbt.class);
    }

    public boolean mo670a(Menu menu) {
        this.f4317i = menu.add(0, gwb.jN, 0, bc.iU);
        this.f4317i.setIcon(R$drawable.bm);
        this.f4317i.setShowAsAction(0);
        return true;
    }

    public boolean mo672b(Menu menu) {
        int i = 0;
        bpd a = this.f4313e.mo931a();
        if (a == null) {
            this.f4317i.setVisible(false);
        } else {
            boolean z;
            boolean z2;
            int a2 = this.f4311c.mo2317a();
            int e = this.f4313e.mo947e();
            int i2 = a.f4147b;
            boolean g = this.f4312d.mo447g(a2);
            if (!this.f4310b.mo880b() || g || !this.f4313e.mo939a(bpo.class) || this.f4313e.mo953j() || ((m6526a() && (e == 2 || !fyi.m16613a(a2, i2))) || this.f4310b.mo879a() || this.f4313e.mo951h())) {
                z = false;
            } else {
                z = true;
            }
            if (this.f4316h != null) {
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
            this.f4317i.setVisible(z);
            MenuItem menuItem = this.f4317i;
            Context context = this.f4309a;
            if (e == 2) {
                i2 = bc.iU;
            } else if (m6526a()) {
                i2 = bc.hh;
            } else {
                i2 = bc.iY;
            }
            menuItem.setTitle(context.getString(i2));
        }
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.jN) {
            return false;
        }
        if (this.f4313e.mo931a() == null) {
            return true;
        }
        int i;
        bcj bcj;
        bxt bxt;
        iie b = this.f4315g.mo1979a(this.f4311c.mo2317a()).mo1693b();
        if (this.f4313e.mo947e() == 2) {
            i = 3273;
        } else if (m6526a()) {
            i = 3309;
        } else {
            i = 3274;
        }
        b.mo1714c(i);
        bko e = fde.m15018e(this.f4311c.mo2317a());
        boolean z = this.f4313e.mo947e() == 2;
        String str = this.f4313e.mo931a().f4146a;
        Collection a = this.f4314f.mo961a();
        if (z) {
            bcj = bcj.INVITE_MORE_TO_GROUPCHAT;
        } else {
            bcj = bcj.UPGRADE_TO_GROUPCHAT;
        }
        if (m6526a()) {
            bxt = bxt.SMS_MESSAGE;
        } else {
            bxt = bxt.HANGOUTS_MESSAGE;
        }
        this.f4309a.startActivity(gwb.m1545a(e, str, a, bcj, bxt));
        return true;
    }

    private boolean m6526a() {
        return gwb.m2254i(this.f4313e.mo931a().f4147b);
    }
}
