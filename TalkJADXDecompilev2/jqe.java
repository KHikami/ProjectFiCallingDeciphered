package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

public final class jqe {
    public kog a(Context context, String str, jrl jrl, jrr jrr, jrk jrk, boolean z) {
        int i;
        kog kog = new kog();
        String a = jrr.h().a();
        kog.a = str;
        kog.b = jrl.e();
        kog.e = jrl.f();
        kog.c = jrl.g();
        kog.l = jrl.i();
        kog.w = a;
        if (jrk != jrk.NO_POLICY) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            kog.F = jqe.a(jrk);
            kog.g = Boolean.valueOf(jrk == jrk.STANDARD);
        } else {
            kog.g = Boolean.valueOf(jrr.b());
        }
        if (z) {
            kog.H = jqe.a(context);
        }
        String h = jrl.h();
        if (TextUtils.isEmpty(h)) {
            h = jpt.a(a);
        }
        kog.k = h;
        kog.I = jrl.s().a();
        kog.z = new String[]{h};
        Object j = jrr.j();
        if (!TextUtils.isEmpty(j)) {
            kog.B = j;
        }
        kog.y = new kot();
        kog.y.a = Integer.valueOf(jrl.l());
        kog.q = Long.valueOf(jrr.f() / 1000);
        if (jrr.l() != null) {
            kog.u = new kob();
            kog.u.b = new kos();
            kog.u.b.a = jrr.l();
        } else if (gwb.b(context, jrr.g())) {
            kog.u = new kob();
            kog.u.b = new kos();
            kog.u.b.a = new mzw();
            kog.u.b.a.b = 8;
        }
        if (jrr.m() != null) {
            kog.v = new kod();
            kog.v.a = jrr.m();
        }
        if (jrr.o() > 0) {
            kog.J = new koi();
            kog.J.a = Integer.valueOf(jrr.o());
        }
        kog.h = jrr.d();
        kou n = jrr.n();
        if (n != null) {
            kog.E = n;
            kog.w = null;
            kog.z = null;
            kog.F = jqe.a(jrk.USE_MANUAL_UPLOAD_SERVER_SETTING);
            kog.C = 3;
            kog.g = null;
            kog.k = null;
            kog.r = null;
            kog.h = null;
            kog.v = null;
            kog.s = null;
            kog.q = null;
            kog.y = null;
            kog.D = new nsc();
        }
        return kog;
    }

    private static koc a(Context context) {
        koc koc = new koc();
        koc.d = Build.MANUFACTURER;
        koc.c = Build.MODEL;
        koc.a = Build.SERIAL;
        try {
            koc.b = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (SecurityException e) {
        }
        return koc;
    }

    private static int a(jrk jrk) {
        switch (jqf.a[jrk.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                String valueOf = String.valueOf(jrk);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("unknown storage policy: ").append(valueOf).toString());
        }
    }
}
