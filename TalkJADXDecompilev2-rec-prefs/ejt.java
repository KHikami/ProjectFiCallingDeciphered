package p000;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import java.util.Random;

public final class ejt extends ig<ahk> implements ahj, bnq {
    private static final Random f11664a = new Random();
    private final bko f11665b;
    private final int f11666c;
    private gkc f11667d;
    private bnn f11668e;
    private final Context f11669f;

    public /* synthetic */ void mo212b(Object obj) {
        m14027a((ahk) obj);
    }

    public ejt(Context context, String str, int i, bko bko) {
        super(context);
        this.f11669f = context;
        this.f11665b = bko;
        this.f11666c = i;
        m14028a(str, this.f11666c);
    }

    public void mo211a(String str) {
        m14028a(str, this.f11666c);
    }

    private void m14028a(String str, int i) {
        Context context = this.f11669f;
        bko bko = this.f11665b;
        int i2 = -1;
        switch (i) {
            case 1:
                i2 = blc.m5739a(context);
                break;
            case 2:
                i2 = context.getResources().getDimensionPixelSize(gwb.eC);
                break;
            case 3:
                int a = gwb.m1507a(Integer.valueOf(agp.f645b));
                i2 = ((biw) jyn.m25426a(context, biw.class)).mo560a("babel_pull_image_resolution_var_range", 50);
                if (i2 <= 0) {
                    i2 = a;
                    break;
                } else {
                    i2 = f11664a.nextInt(i2) + a;
                    break;
                }
        }
        gkc d = new gkc(str, bko.m5629a()).m5548a(i2, i2).m5550a(false).m5558d(false);
        if (i == 1) {
            d.m5555b(true);
        }
        this.f11667d = d;
        this.f11668e = new bnn(this.f11667d, this, true, null);
    }

    protected void mo214i() {
        ((fsi) jyn.m25426a(m1286o(), fsi.class)).mo2072a(this.f11668e);
    }

    private void m14027a(ahk ahk) {
        if (!m1290s() && m1288q()) {
            super.mo212b((Object) ahk);
        }
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (bnn == this.f11668e) {
            this.f11668e = null;
            ahk ahk = new ahk();
            if (z) {
                ahk.f793c = 0;
                if (gjo == null) {
                    iil.m21875b("Expected non-null", (Object) gkt);
                    Object d = gkt.m17897d();
                    iil.m21875b("Expected non-null", d);
                    d.setDensity(160);
                    ahk.f791a = new BitmapDrawable(this.f11669f.getResources(), d);
                } else if (!gjo.m17842f()) {
                    ahk.f791a = new gol(gjo);
                }
                m14027a(ahk);
            }
            ahk.f793c = 1;
            m14027a(ahk);
        } else if (gkt != null) {
            gkt.mo2292b();
        }
    }
}
