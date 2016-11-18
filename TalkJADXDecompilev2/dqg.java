package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.TimeUnit;

class dqg implements dqc, jnh {
    private final Context a;
    private final SharedPreferences b;

    dqg(Context context) {
        this.a = context;
        this.b = context.getSharedPreferences("interaction_prefs", 0);
    }

    private static String b(int i) {
        return "account_" + i + "_";
    }

    private String c(int i) {
        return String.valueOf(dqg.b(i)).concat("login_time");
    }

    public void a(int i, dqd dqd) {
        long j = this.b.getLong(c(i), 0);
        long a = ((jhx) jyn.a(this.a, jhx.class)).a();
        if (a < TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS) + j) {
            a(i, 2591);
            a(i, dqd.d);
        }
        if (a < j + TimeUnit.MILLISECONDS.convert(7, TimeUnit.DAYS)) {
            a(i, 2595);
            a(i, dqd.e);
        }
    }

    public void a(int i) {
        jch a = ((jcf) jyn.a(this.a, jcf.class)).a(i);
        if (a.b()) {
            if (!a.c("sms_only")) {
                Editor edit = this.b.edit();
                edit.remove(c(i));
                String b = dqg.b(i);
                for (String str : this.b.getAll().keySet()) {
                    if (str.startsWith(b)) {
                        edit.remove(str);
                    }
                }
                edit.apply();
            }
        } else if (a.a() && !this.b.contains(c(i))) {
            this.b.edit().putLong(c(i), ((jhx) jyn.a(this.a, jhx.class)).a()).apply();
            a(i, 2590);
        }
    }

    private void a(int i, int i2) {
        String valueOf = String.valueOf(dqg.b(i));
        String stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29).append(valueOf).append("logged_impression_").append(i2).toString();
        if (!this.b.getBoolean(stringBuilder, false)) {
            ((iih) jyn.a(this.a, iih.class)).a(i).b().c(i2);
            this.b.edit().putBoolean(stringBuilder, true).apply();
        }
    }
}
