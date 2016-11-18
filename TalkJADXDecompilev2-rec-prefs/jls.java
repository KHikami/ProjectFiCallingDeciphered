package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

final class jls {
    private int f20451a;

    jls() {
    }

    public jlq m24677a(Context context) {
        this.f20451a = gwb.aA(context);
        return m24676b(context);
    }

    private jlq m24676b(Context context) {
        jlr a;
        if (this.f20451a < 48) {
            Resources resources = context.getApplicationContext().getResources();
            a = new jlr().m24666a(resources.getInteger(gwb.zc)).m24673c(resources.getInteger(gwb.za)).m24670b(resources.getInteger(gwb.zb)).m24671b((long) resources.getInteger(gwb.zd)).m24667a((long) resources.getInteger(gwb.zd));
        } else if (this.f20451a < 64) {
            a = m24674a(context, gwb.yS, gwb.yR);
        } else {
            a = m24674a(context, gwb.yU, gwb.yT);
        }
        return a.m24668a(true).m24672c();
    }

    private jlr m24674a(Context context, int i, int i2) {
        jlr b = new jlr().m24666a(jls.m24675b(context, gwb.yW, i)).m24673c(jls.m24675b(context, gwb.yZ, i2)).m24670b(jls.m24675b(context, gwb.yV, i2));
        int integer = context.getApplicationContext().getResources().getInteger(i2);
        if (b.m24669b() > integer) {
            b.m24670b(Math.round((((float) integer) / ((float) b.m24669b())) * ((float) b.m24665a())));
        }
        Resources resources = context.getApplicationContext().getResources();
        return b.m24671b((long) resources.getInteger(gwb.yY)).m24667a((long) resources.getInteger(gwb.yX));
    }

    private static int m24675b(Context context, int i, int i2) {
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics ay = gwb.ay(context);
        int i3 = (ay.heightPixels * ay.widthPixels) << 2;
        int integer = resources.getInteger(i2);
        if (i3 == 0) {
            return integer;
        }
        return Math.min((int) ((((long) i3) * ((long) resources.getInteger(i))) / 100), integer);
    }
}
