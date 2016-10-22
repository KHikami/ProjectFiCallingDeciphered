package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;

/* renamed from: fiz */
public class fiz extends fhb implements bhm {
    private static final boolean b;
    private final boolean a;

    static {
        kae kae = glk.o;
        b = false;
    }

    public fiz(bko bko, boolean z) {
        super(bko);
        this.a = z;
    }

    public void w_() {
        Context H = gwb.H();
        if (ffh.a().c()) {
            Object e = ffh.a().e();
            if (TextUtils.isEmpty(e)) {
                glk.d("Babel", "Register account with invalid gcm registration id", new Object[0]);
                return;
            }
            String str;
            Configuration configuration = H.getResources().getConfiguration();
            int i = configuration.smallestScreenWidthDp;
            boolean b = ((fbx) jyn.a(H, fbx.class)).b(H, this.c.b);
            if (b) {
                new StringBuilder(60).append("RegisterAccountOperation, userWantsIncomingPhoneCalls: ").append(b);
            }
            if (!b) {
                for (dis dis : jyn.c(H, dis.class)) {
                    if (dis.a(H, this.c.b)) {
                        b = true;
                        if (b) {
                            String valueOf = String.valueOf(dis);
                            new StringBuilder(String.valueOf(valueOf).length() + 55).append("RegisterAccountOperation, enabling because of handler: ").append(valueOf);
                        }
                    }
                }
            }
            boolean a = ((fvv) jyn.a(H, fvv.class)).a(this.c.a);
            if (giw.e(H)) {
                str = null;
            } else {
                str = glq.c(glq.f(H), glq.j(H));
            }
            fzw fzw = (fzw) jyn.a(H, fzw.class);
            long a2 = giw.a();
            boolean c = dgg.a().c();
            String packageName = H.getPackageName();
            boolean z = this.a;
            boolean i2 = fde.i();
            boolean b2 = fzw.b(this.c.a);
            int i3 = configuration.mcc;
            int i4 = configuration.mnc;
            if (!this.c.b.a(str)) {
                str = null;
            }
            a(fnm.a(e, a2, c, packageName, z, i, i2, b2, b, i3, i4, a, str));
            return;
        }
        glk.e("Babel_RegisterAcctOp", "GCM registration not done before registering account", new Object[0]);
    }

    public int a(Context context, bhb bhb) {
        return super.a(bhb);
    }
}
