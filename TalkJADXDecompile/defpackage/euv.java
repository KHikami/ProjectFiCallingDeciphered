package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: euv */
public class euv extends esw {
    private static final long serialVersionUID = 1;
    public final String c;
    public final String d;
    public final boolean e;

    public euv(String str, String str2, boolean z) {
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public nzf a(String str, int i, int i2) {
        nzf lqy = new lqy();
        lqy.c = Boolean.valueOf(this.e);
        if (!TextUtils.isEmpty(this.d)) {
            muu muu = new muu();
            muu.a = this.c;
            lqy.a = muu;
            lqy.b = this.d;
        }
        return lqy;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public void a(Context context, bko bko, fdo fdo) {
        gwb.a(bko, 2050);
        eps eps = (eps) jyn.b(context, eps.class);
        if (eps != null) {
            eps.a(105, false);
        }
    }

    public String g() {
        return "devices/finishphonenumberverification";
    }
}
