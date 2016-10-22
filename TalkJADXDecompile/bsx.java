import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;

final class bsx implements jza, kcf, kci, kck, kcq {
    private final Context a;
    private bst b;
    private jca c;
    private biw d;
    private cgr e;
    private bpe f;
    private iih g;
    private MenuItem h;
    private MenuItem i;

    public bsx(Context context, kbu kbu) {
        this.a = context;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (bst) jyn.a(bst.class);
        this.c = (jca) jyn.a(jca.class);
        this.d = (biw) jyn.a(biw.class);
        this.e = (cgr) jyn.a(cgr.class);
        this.f = (bpe) jyn.a(bpe.class);
        this.g = (iih) jyn.a(iih.class);
    }

    public boolean a(Menu menu) {
        this.h = menu.add(0, gwb.jW, 0, gwb.jY);
        this.h.setIcon(R$drawable.bZ);
        this.h.setShowAsAction(2);
        this.i = menu.add(0, gwb.jV, 0, gwb.jX);
        this.i.setIcon(R$drawable.ch);
        this.i.setShowAsAction(2);
        return true;
    }

    public boolean b(Menu menu) {
        boolean z = false;
        if (this.e.a() == null) {
            this.h.setVisible(false);
            this.i.setVisible(false);
        } else {
            gmd gmd = new gmd(this.a, this.b.a());
            boolean c = gmd.c();
            boolean a = gmd.a();
            glk.a("Babel_StartCallMenuItem", "canContactViaHangouts: " + c + " canPhoneCall: " + a, new Object[0]);
            boolean z2 = this.d.a("babel_enable_viral_flow_v1", true) && fde.d().length > 0 && this.e.e() != 2 && this.f.e() == null;
            MenuItem menuItem = this.h;
            if ((c || z2) && this.e.a(bpp.class) && !this.e.j()) {
                z2 = true;
            } else {
                z2 = false;
            }
            menuItem.setVisible(z2);
            MenuItem menuItem2 = this.i;
            if ((c || a) && this.e.a(bpn.class) && !this.e.j()) {
                z = true;
            }
            menuItem2.setVisible(z);
        }
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() == gwb.jW) {
            this.g.a(this.c.a()).b().c(1535);
            this.b.a(bxt.VIDEO_CALL, 63, 3035);
            return true;
        } else if (menuItem.getItemId() != gwb.jV) {
            return false;
        } else {
            this.g.a(this.c.a()).b().c(1534);
            this.b.a(bxt.AUDIO_CALL, 63, 3035);
            return true;
        }
    }
}
