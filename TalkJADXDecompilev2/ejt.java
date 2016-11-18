package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import java.util.Random;

public final class ejt extends ig<ahk> implements ahj, bnq {
    private static final Random a = new Random();
    private final bko b;
    private final int c;
    private gkc d;
    private bnn e;
    private final Context f;

    public /* synthetic */ void b(Object obj) {
        a((ahk) obj);
    }

    public ejt(Context context, String str, int i, bko bko) {
        super(context);
        this.f = context;
        this.b = bko;
        this.c = i;
        a(str, this.c);
    }

    public void a(String str) {
        a(str, this.c);
    }

    private void a(String str, int i) {
        Context context = this.f;
        bko bko = this.b;
        int i2 = -1;
        switch (i) {
            case 1:
                i2 = blc.a(context);
                break;
            case 2:
                i2 = context.getResources().getDimensionPixelSize(gwb.eC);
                break;
            case 3:
                int a = gwb.a(Integer.valueOf(agp.b));
                i2 = ((biw) jyn.a(context, biw.class)).a("babel_pull_image_resolution_var_range", 50);
                if (i2 <= 0) {
                    i2 = a;
                    break;
                } else {
                    i2 = a.nextInt(i2) + a;
                    break;
                }
        }
        gkc d = new gkc(str, bko.a()).a(i2, i2).a(false).d(false);
        if (i == 1) {
            d.b(true);
        }
        this.d = d;
        this.e = new bnn(this.d, this, true, null);
    }

    protected void i() {
        ((fsi) jyn.a(o(), fsi.class)).a(this.e);
    }

    private void a(ahk ahk) {
        if (!s() && q()) {
            super.b((Object) ahk);
        }
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (bnn == this.e) {
            this.e = null;
            ahk ahk = new ahk();
            if (z) {
                ahk.c = 0;
                if (gjo == null) {
                    iil.b("Expected non-null", (Object) gkt);
                    Object d = gkt.d();
                    iil.b("Expected non-null", d);
                    d.setDensity(160);
                    ahk.a = new BitmapDrawable(this.f.getResources(), d);
                } else if (!gjo.f()) {
                    ahk.a = new gol(gjo);
                }
                a(ahk);
            }
            ahk.c = 1;
            a(ahk);
        } else if (gkt != null) {
            gkt.b();
        }
    }
}
