package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

public final class jqe {
    public kog m25010a(Context context, String str, jrl jrl, jrr jrr, jrk jrk, boolean z) {
        int i;
        kog kog = new kog();
        String a = jrr.m25112h().m24960a();
        kog.f22496a = str;
        kog.f22497b = jrl.m25067e();
        kog.f22500e = jrl.m25068f();
        kog.f22498c = jrl.m25069g();
        kog.f22507l = jrl.m25071i();
        kog.f22518w = a;
        if (jrk != jrk.NO_POLICY) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            kog.f22490F = jqe.m25008a(jrk);
            kog.f22502g = Boolean.valueOf(jrk == jrk.STANDARD);
        } else {
            kog.f22502g = Boolean.valueOf(jrr.m25106b());
        }
        if (z) {
            kog.f22492H = jqe.m25009a(context);
        }
        String h = jrl.m25070h();
        if (TextUtils.isEmpty(h)) {
            h = jpt.m24958a(a);
        }
        kog.f22506k = h;
        kog.f22493I = jrl.m25081s().m25089a();
        kog.f22521z = new String[]{h};
        Object j = jrr.m25114j();
        if (!TextUtils.isEmpty(j)) {
            kog.f22486B = j;
        }
        kog.f22520y = new kot();
        kog.f22520y.f22577a = Integer.valueOf(jrl.m25074l());
        kog.f22512q = Long.valueOf(jrr.m25110f() / 1000);
        if (jrr.m25116l() != null) {
            kog.f22516u = new kob();
            kog.f22516u.f22472b = new kos();
            kog.f22516u.f22472b.f22575a = jrr.m25116l();
        } else if (gwb.m2053b(context, jrr.m25111g())) {
            kog.f22516u = new kob();
            kog.f22516u.f22472b = new kos();
            kog.f22516u.f22472b.f22575a = new mzw();
            kog.f22516u.f22472b.f22575a.b = 8;
        }
        if (jrr.m25117m() != null) {
            kog.f22517v = new kod();
            kog.f22517v.f22478a = jrr.m25117m();
        }
        if (jrr.m25119o() > 0) {
            kog.f22494J = new koi();
            kog.f22494J.f22527a = Integer.valueOf(jrr.m25119o());
        }
        kog.f22503h = jrr.m25108d();
        kou n = jrr.m25118n();
        if (n != null) {
            kog.f22489E = n;
            kog.f22518w = null;
            kog.f22521z = null;
            kog.f22490F = jqe.m25008a(jrk.USE_MANUAL_UPLOAD_SERVER_SETTING);
            kog.f22487C = 3;
            kog.f22502g = null;
            kog.f22506k = null;
            kog.f22513r = null;
            kog.f22503h = null;
            kog.f22517v = null;
            kog.f22514s = null;
            kog.f22512q = null;
            kog.f22520y = null;
            kog.f22488D = new nsc();
        }
        return kog;
    }

    private static koc m25009a(Context context) {
        koc koc = new koc();
        koc.f22477d = Build.MANUFACTURER;
        koc.f22476c = Build.MODEL;
        koc.f22474a = Build.SERIAL;
        try {
            koc.f22475b = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (SecurityException e) {
        }
        return koc;
    }

    private static int m25008a(jrk jrk) {
        switch (jqf.f20791a[jrk.ordinal()]) {
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
