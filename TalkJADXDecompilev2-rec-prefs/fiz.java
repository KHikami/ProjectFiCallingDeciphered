package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;

public class fiz extends fhb implements bhm {
    private static final boolean f13154b = false;
    private final boolean f13155a;

    static {
        kae kae = glk.f15568o;
    }

    public fiz(bko bko, boolean z) {
        super(bko);
        this.f13155a = z;
    }

    public void w_() {
        Context H = gwb.m1400H();
        if (ffh.m15192a().m15202c()) {
            Object e = ffh.m15192a().m15204e();
            if (TextUtils.isEmpty(e)) {
                glk.m17981d("Babel", "Register account with invalid gcm registration id", new Object[0]);
                return;
            }
            String str;
            Configuration configuration = H.getResources().getConfiguration();
            int i = configuration.smallestScreenWidthDp;
            boolean b = ((fbx) jyn.m25426a(H, fbx.class)).mo1972b(H, this.f5736c.f12722b);
            if (f13154b) {
                new StringBuilder(60).append("RegisterAccountOperation, userWantsIncomingPhoneCalls: ").append(b);
            }
            if (!b) {
                for (dis dis : jyn.m25438c(H, dis.class)) {
                    if (dis.mo2193a(H, this.f5736c.f12722b)) {
                        b = true;
                        if (f13154b) {
                            String valueOf = String.valueOf(dis);
                            new StringBuilder(String.valueOf(valueOf).length() + 55).append("RegisterAccountOperation, enabling because of handler: ").append(valueOf);
                        }
                    }
                }
            }
            boolean a = ((fvv) jyn.m25426a(H, fvv.class)).m16337a(this.f5736c.f12721a);
            if (giw.m17760e(H)) {
                str = null;
            } else {
                str = glq.m18014c(glq.m18025f(H), glq.m18039j(H));
            }
            fzw fzw = (fzw) jyn.m25426a(H, fzw.class);
            long a2 = giw.m17752a();
            boolean c = dgg.m11692a().m11710c();
            String packageName = H.getPackageName();
            boolean z = this.f13155a;
            boolean i2 = fde.m15028i();
            boolean b2 = fzw.mo2148b(this.f5736c.f12721a);
            int i3 = configuration.mcc;
            int i4 = configuration.mnc;
            if (!this.f5736c.f12722b.m5631a(str)) {
                str = null;
            }
            m8039a(fnm.m15728a(e, a2, c, packageName, z, i, i2, b2, b, i3, i4, a, str));
            return;
        }
        glk.m17982e("Babel_RegisterAcctOp", "GCM registration not done before registering account", new Object[0]);
    }

    public int mo539a(Context context, bhb bhb) {
        return super.mo1991a(bhb);
    }
}
