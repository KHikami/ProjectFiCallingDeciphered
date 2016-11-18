package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class epj implements Runnable {
    private final gma f11987a = gma.m18073a("StartupLogger");
    private final Context f11988b;

    public epj(Context context) {
        this.f11988b = context;
    }

    public void run() {
        int a;
        int i;
        String b = this.f11987a.m18078b("Stats");
        jcf jcf = (jcf) jyn.m25426a(this.f11988b, jcf.class);
        fzw fzw = (fzw) jyn.m25426a(this.f11988b, fzw.class);
        for (Integer num : jcf.mo3453a()) {
            if (!fzw.mo2146a(gwb.m1507a(num))) {
                a = gwb.m1507a(num);
                break;
            }
        }
        a = -1;
        iid a2 = ((iih) jyn.m25426a(this.f11988b, iih.class)).mo1979a(a);
        mcg mcg = new mcg();
        if (fde.m15028i()) {
            mcg.f27318a = Integer.valueOf(1);
            a2.mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(2811);
        } else {
            Object obj = "";
            if (VERSION.SDK_INT >= 19) {
                obj = Sms.getDefaultSmsPackage(this.f11988b);
            }
            if (!TextUtils.isEmpty(obj)) {
                if (obj.contains("com.google.android.apps.messaging")) {
                    mcg.f27318a = Integer.valueOf(2);
                    a2.mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(2812);
                } else {
                    mcg.f27318a = Integer.valueOf(3);
                    a2.mo1693b().mo1697a(1, TimeUnit.DAYS).mo1714c(2813);
                }
            }
        }
        boolean d = ((fzw) jyn.m25426a(this.f11988b, fzw.class)).mo2155d();
        iie a3 = a2.mo1693b().mo1697a(1, TimeUnit.DAYS);
        if (d) {
            i = 2814;
        } else {
            i = 2815;
        }
        a3.mo1714c(i);
        mcg.f27319b = Boolean.valueOf(d);
        boolean i2 = fde.m15028i();
        int size = jcf.mo3453a().size();
        mcg.f27320c = Integer.valueOf(3);
        if (size == 1) {
            if (i2) {
                mcg.f27320c = Integer.valueOf(1);
            }
        } else if (size > 1 && i2) {
            mcg.f27320c = Integer.valueOf(2);
        }
        ba.m4548a(a, glj.m17963b(), 10, ba.m4618c().m12790a(mcg).m12786a(2001));
        this.f11987a.m18079c(b);
    }
}
