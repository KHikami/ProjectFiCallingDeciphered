package p000;

import android.content.Context;
import java.util.Locale;

final class gdu implements Runnable {
    final /* synthetic */ Context f14793a;
    final /* synthetic */ gdt f14794b;

    gdu(gdt gdt, Context context) {
        this.f14794b = gdt;
        this.f14793a = context;
    }

    public void run() {
        int i = 0;
        gdt.m17077e(this.f14793a);
        gdt.m17078f(this.f14793a);
        gdt gdt = this.f14794b;
        Context context = this.f14793a;
        if (!giw.m17760e(context)) {
            biw g = gwb.m2214g(context);
            String[] split;
            int length;
            if (gwb.m1422L(context)) {
                split = g.mo562a("babel_tycho_only_short_codes", "+1611,+1711,+1911").split(",");
                length = split.length;
                while (i < length) {
                    glq.m18000a().f15599b.add(split[i]);
                    i++;
                }
            } else {
                split = g.mo562a("babel_gv_supported_service_codes", "+1611,+1711,+1911").split(",");
                length = split.length;
                while (i < length) {
                    glq.m18000a().f15599b.add(split[i]);
                    i++;
                }
            }
            String a = g.mo562a("babel_us_anonymous_call_prefix", "*67");
            glq.m18000a().f15600c.put(Locale.US.getCountry(), a);
        }
        gwb.m2214g(this.f14793a).mo563a(new gdw(this.f14793a));
        ggc.f15219a.add(new gge(this.f14793a));
    }
}
