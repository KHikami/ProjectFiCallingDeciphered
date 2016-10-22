package defpackage;

import android.content.Context;

/* renamed from: evr */
public class evr extends esw {
    private static final long serialVersionUID = 1;
    public final String c;

    public evr(String str) {
        this.c = str;
    }

    public nzf a(String str, int i, int i2) {
        muu muu = new muu();
        muu.a = this.c;
        nzf lwa = new lwa();
        lwa.b = Integer.valueOf(2);
        lwa.a = muu;
        return lwa;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public void a(Context context, bko bko, fdo fdo) {
        gwb.a(bko, 2049);
        eps eps = (eps) jyn.b(context, eps.class);
        if (eps != null) {
            eps.a(105, false);
        }
    }

    public String g() {
        return "devices/startphonenumberverification";
    }
}
