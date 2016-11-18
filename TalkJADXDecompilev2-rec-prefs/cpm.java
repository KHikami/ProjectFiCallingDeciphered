package p000;

import android.content.Context;
import android.content.SharedPreferences;

final class cpm implements cpf {
    private final SharedPreferences f8794a;

    cpm(Context context) {
        this.f8794a = context.getSharedPreferences("use_custom_tabs", 0);
    }

    void m10649a(Context context, boolean z) {
        int i;
        this.f8794a.edit().putBoolean("use_custom_tabs", z).apply();
        iie b = ((iih) jyn.m25426a(context, iih.class)).mo1979a(((jca) jyn.m25426a(context, jca.class)).mo2317a()).mo1693b();
        if (z) {
            i = 3413;
        } else {
            i = 3414;
        }
        b.mo1714c(i);
    }

    public boolean mo1376a() {
        return this.f8794a.getBoolean("use_custom_tabs", true);
    }

    public jwi mo1375a(Context context) {
        cpd cpd = (cpd) jyn.m25433b(context, cpd.class);
        if (cpd == null || !cpd.mo1373b()) {
            return null;
        }
        jwi jxk = new jxk(context);
        jxk.m5148g(gwb.nE);
        jxk.m5150h(gwb.nD);
        jxk.mo534a(mo1376a());
        jxk.m5121a(new cpn(this, context));
        return jxk;
    }
}
