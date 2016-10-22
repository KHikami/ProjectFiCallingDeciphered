import android.content.Context;
import android.content.SharedPreferences;

final class cpm implements cpf {
    private final SharedPreferences a;

    cpm(Context context) {
        this.a = context.getSharedPreferences("use_custom_tabs", 0);
    }

    void a(Context context, boolean z) {
        int i;
        this.a.edit().putBoolean("use_custom_tabs", z).apply();
        iie b = ((iih) jyn.a(context, iih.class)).a(((jca) jyn.a(context, jca.class)).a()).b();
        if (z) {
            i = 3413;
        } else {
            i = 3414;
        }
        b.c(i);
    }

    public boolean a() {
        return this.a.getBoolean("use_custom_tabs", true);
    }

    public jwi a(Context context) {
        cpd cpd = (cpd) jyn.b(context, cpd.class);
        if (cpd == null || !cpd.b()) {
            return null;
        }
        jwi jxk = new jxk(context);
        jxk.g(gwb.nE);
        jxk.h(gwb.nD);
        jxk.a(a());
        jxk.a(new cpn(this, context));
        return jxk;
    }
}
