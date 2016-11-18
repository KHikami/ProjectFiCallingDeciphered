package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;

final class bsx implements jza, kcf, kci, kck, kcq {
    private final Context f4344a;
    private bst f4345b;
    private jca f4346c;
    private biw f4347d;
    private cgr f4348e;
    private bpe f4349f;
    private iih f4350g;
    private MenuItem f4351h;
    private MenuItem f4352i;

    public bsx(Context context, kbu kbu) {
        this.f4344a = context;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4345b = (bst) jyn.m25443a(bst.class);
        this.f4346c = (jca) jyn.m25443a(jca.class);
        this.f4347d = (biw) jyn.m25443a(biw.class);
        this.f4348e = (cgr) jyn.m25443a(cgr.class);
        this.f4349f = (bpe) jyn.m25443a(bpe.class);
        this.f4350g = (iih) jyn.m25443a(iih.class);
    }

    public boolean mo670a(Menu menu) {
        this.f4351h = menu.add(0, gwb.jW, 0, gwb.jY);
        this.f4351h.setIcon(R$drawable.bZ);
        this.f4351h.setShowAsAction(2);
        this.f4352i = menu.add(0, gwb.jV, 0, gwb.jX);
        this.f4352i.setIcon(R$drawable.ch);
        this.f4352i.setShowAsAction(2);
        return true;
    }

    public boolean mo672b(Menu menu) {
        boolean z = false;
        if (this.f4348e.mo931a() == null) {
            this.f4351h.setVisible(false);
            this.f4352i.setVisible(false);
        } else {
            gmd gmd = new gmd(this.f4344a, this.f4345b.mo905a());
            boolean c = gmd.m18084c();
            boolean a = gmd.m18082a();
            glk.m17970a("Babel_StartCallMenuItem", "canContactViaHangouts: " + c + " canPhoneCall: " + a, new Object[0]);
            boolean z2 = this.f4347d.mo564a("babel_enable_viral_flow_v1", true) && fde.m15016d().length > 0 && this.f4348e.mo947e() != 2 && this.f4349f.mo968e() == null;
            MenuItem menuItem = this.f4351h;
            if ((c || z2) && this.f4348e.mo939a(bpp.class) && !this.f4348e.mo953j()) {
                z2 = true;
            } else {
                z2 = false;
            }
            menuItem.setVisible(z2);
            MenuItem menuItem2 = this.f4352i;
            if ((c || a) && this.f4348e.mo939a(bpn.class) && !this.f4348e.mo953j()) {
                z = true;
            }
            menuItem2.setVisible(z);
        }
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() == gwb.jW) {
            this.f4350g.mo1979a(this.f4346c.mo2317a()).mo1693b().mo1714c(1535);
            this.f4345b.mo906a(bxt.VIDEO_CALL, 63, 3035);
            return true;
        } else if (menuItem.getItemId() != gwb.jV) {
            return false;
        } else {
            this.f4350g.mo1979a(this.f4346c.mo2317a()).mo1693b().mo1714c(1534);
            this.f4345b.mo906a(bxt.AUDIO_CALL, 63, 3035);
            return true;
        }
    }
}
