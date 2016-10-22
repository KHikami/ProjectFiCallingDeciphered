package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: jls */
final class jls {
    private int a;

    jls() {
    }

    public jlq a(Context context) {
        this.a = gwb.aA(context);
        return b(context);
    }

    private jlq b(Context context) {
        jlr a;
        if (this.a < 48) {
            Resources resources = context.getApplicationContext().getResources();
            a = new jlr().a(resources.getInteger(gwb.zc)).c(resources.getInteger(gwb.za)).b(resources.getInteger(gwb.zb)).b((long) resources.getInteger(gwb.zd)).a((long) resources.getInteger(gwb.zd));
        } else if (this.a < 64) {
            a = a(context, gwb.yS, gwb.yR);
        } else {
            a = a(context, gwb.yU, gwb.yT);
        }
        return a.a(true).c();
    }

    private jlr a(Context context, int i, int i2) {
        jlr b = new jlr().a(jls.b(context, gwb.yW, i)).c(jls.b(context, gwb.yZ, i2)).b(jls.b(context, gwb.yV, i2));
        int integer = context.getApplicationContext().getResources().getInteger(i2);
        if (b.b() > integer) {
            b.b(Math.round((((float) integer) / ((float) b.b())) * ((float) b.a())));
        }
        Resources resources = context.getApplicationContext().getResources();
        return b.b((long) resources.getInteger(gwb.yY)).a((long) resources.getInteger(gwb.yX));
    }

    private static int b(Context context, int i, int i2) {
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
