package defpackage;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: fnk */
class fnk extends fhb implements bhm {
    private static final boolean b;
    private final boolean a;

    static {
        kae kae = glk.o;
        b = false;
    }

    public fnk(bko bko, boolean z) {
        super(bko);
        this.a = true;
    }

    public static boolean a(Context context, bko bko) {
        boolean b = ((fbx) jyn.a(context, fbx.class)).b(context, bko);
        if (!b) {
            for (dis a : jyn.c(context, dis.class)) {
                if (a.a(context, bko)) {
                    return true;
                }
            }
        }
        return b;
    }

    public void w_() {
        Context H = gwb.H();
        fnh fnh = (fnh) jyn.a(H, fnh.class);
        if (fnh.c()) {
            String b = fnh.b();
            Configuration configuration = H.getResources().getConfiguration();
            int i = configuration.smallestScreenWidthDp;
            boolean a = ((fvv) jyn.a(H, fvv.class)).a(this.c.a);
            String c = glq.c(glq.f(H), glq.j(H));
            fzw fzw = (fzw) jyn.a(H, fzw.class);
            long a2 = giw.a();
            boolean c2 = dgg.a().c();
            String packageName = H.getPackageName();
            boolean z = this.a;
            boolean i2 = fde.i();
            boolean b2 = fzw.b(this.c.a);
            boolean a3 = fnk.a(H, this.c.b);
            int i3 = configuration.mcc;
            int i4 = configuration.mnc;
            if (!this.c.b.a(c)) {
                c = null;
            }
            a(fnm.a(b, a2, c2, packageName, z, i, i2, b2, a3, i3, i4, a, c));
            return;
        }
        glk.e("Babel_Registration", "GCM registration not done before registering account", new Object[0]);
        ((fnq) jyn.a(H, fnc.class)).a(this.c.a, null);
    }

    public int a(Context context, bhb bhb) {
        ((iih) jyn.a(context, iih.class)).a(this.c.a).b().c(3226);
        return super.a(bhb);
    }
}
