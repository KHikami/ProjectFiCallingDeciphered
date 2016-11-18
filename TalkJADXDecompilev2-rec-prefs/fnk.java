package p000;

import android.content.Context;
import android.content.res.Configuration;

class fnk extends fhb implements bhm {
    private static final boolean f13507b = false;
    private final boolean f13508a = true;

    static {
        kae kae = glk.f15568o;
    }

    public fnk(bko bko, boolean z) {
        super(bko);
    }

    public static boolean m15716a(Context context, bko bko) {
        boolean b = ((fbx) jyn.m25426a(context, fbx.class)).mo1972b(context, bko);
        if (!b) {
            for (dis a : jyn.m25438c(context, dis.class)) {
                if (a.mo2193a(context, bko)) {
                    return true;
                }
            }
        }
        return b;
    }

    public void w_() {
        Context H = gwb.m1400H();
        fnh fnh = (fnh) jyn.m25426a(H, fnh.class);
        if (fnh.m15708c()) {
            String b = fnh.m15707b();
            Configuration configuration = H.getResources().getConfiguration();
            int i = configuration.smallestScreenWidthDp;
            boolean a = ((fvv) jyn.m25426a(H, fvv.class)).m16337a(this.f5736c.f12721a);
            String c = glq.m18014c(glq.m18025f(H), glq.m18039j(H));
            fzw fzw = (fzw) jyn.m25426a(H, fzw.class);
            long a2 = giw.m17752a();
            boolean c2 = dgg.m11692a().m11710c();
            String packageName = H.getPackageName();
            boolean z = this.f13508a;
            boolean i2 = fde.m15028i();
            boolean b2 = fzw.mo2148b(this.f5736c.f12721a);
            boolean a3 = fnk.m15716a(H, this.f5736c.f12722b);
            int i3 = configuration.mcc;
            int i4 = configuration.mnc;
            if (!this.f5736c.f12722b.m5631a(c)) {
                c = null;
            }
            m8039a(fnm.m15728a(b, a2, c2, packageName, z, i, i2, b2, a3, i3, i4, a, c));
            return;
        }
        glk.m17982e("Babel_Registration", "GCM registration not done before registering account", new Object[0]);
        ((fnq) jyn.m25426a(H, fnc.class)).m15754a(this.f5736c.f12721a, null);
    }

    public int mo539a(Context context, bhb bhb) {
        ((iih) jyn.m25426a(context, iih.class)).mo1979a(this.f5736c.f12721a).mo1693b().mo1714c(3226);
        return super.mo1991a(bhb);
    }
}
