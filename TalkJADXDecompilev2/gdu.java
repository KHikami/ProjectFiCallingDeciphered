package defpackage;

import android.content.Context;
import java.util.Locale;

final class gdu implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ gdt b;

    gdu(gdt gdt, Context context) {
        this.b = gdt;
        this.a = context;
    }

    public void run() {
        int i = 0;
        gdt.e(this.a);
        gdt.f(this.a);
        gdt gdt = this.b;
        Context context = this.a;
        if (!giw.e(context)) {
            biw g = gwb.g(context);
            String[] split;
            int length;
            if (gwb.L(context)) {
                split = g.a("babel_tycho_only_short_codes", "+1611,+1711,+1911").split(",");
                length = split.length;
                while (i < length) {
                    glq.a().b.add(split[i]);
                    i++;
                }
            } else {
                split = g.a("babel_gv_supported_service_codes", "+1611,+1711,+1911").split(",");
                length = split.length;
                while (i < length) {
                    glq.a().b.add(split[i]);
                    i++;
                }
            }
            String a = g.a("babel_us_anonymous_call_prefix", "*67");
            glq.a().c.put(Locale.US.getCountry(), a);
        }
        gwb.g(this.a).a(new gdw(this.a));
        ggc.a.add(new gge(this.a));
    }
}
