package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class epj implements Runnable {
    private final gma a = gma.a("StartupLogger");
    private final Context b;

    public epj(Context context) {
        this.b = context;
    }

    public void run() {
        int a;
        int i;
        String b = this.a.b("Stats");
        jcf jcf = (jcf) jyn.a(this.b, jcf.class);
        fzw fzw = (fzw) jyn.a(this.b, fzw.class);
        for (Integer num : jcf.a()) {
            if (!fzw.a(gwb.a(num))) {
                a = gwb.a(num);
                break;
            }
        }
        a = -1;
        iid a2 = ((iih) jyn.a(this.b, iih.class)).a(a);
        mcg mcg = new mcg();
        if (fde.i()) {
            mcg.a = Integer.valueOf(1);
            a2.b().a(1, TimeUnit.DAYS).c(2811);
        } else {
            Object obj = "";
            if (VERSION.SDK_INT >= 19) {
                obj = Sms.getDefaultSmsPackage(this.b);
            }
            if (!TextUtils.isEmpty(obj)) {
                if (obj.contains("com.google.android.apps.messaging")) {
                    mcg.a = Integer.valueOf(2);
                    a2.b().a(1, TimeUnit.DAYS).c(2812);
                } else {
                    mcg.a = Integer.valueOf(3);
                    a2.b().a(1, TimeUnit.DAYS).c(2813);
                }
            }
        }
        boolean d = ((fzw) jyn.a(this.b, fzw.class)).d();
        iie a3 = a2.b().a(1, TimeUnit.DAYS);
        if (d) {
            i = 2814;
        } else {
            i = 2815;
        }
        a3.c(i);
        mcg.b = Boolean.valueOf(d);
        boolean i2 = fde.i();
        int size = jcf.a().size();
        mcg.c = Integer.valueOf(3);
        if (size == 1) {
            if (i2) {
                mcg.c = Integer.valueOf(1);
            }
        } else if (size > 1 && i2) {
            mcg.c = Integer.valueOf(2);
        }
        ba.a(a, glj.b(), 10, ba.c().a(mcg).a(2001));
        this.a.c(b);
    }
}
