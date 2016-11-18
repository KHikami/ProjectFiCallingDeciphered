package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.TimeUnit;

class dqg implements dqc, jnh {
    private final Context f10337a;
    private final SharedPreferences f10338b;

    dqg(Context context) {
        this.f10337a = context;
        this.f10338b = context.getSharedPreferences("interaction_prefs", 0);
    }

    private static String m12487b(int i) {
        return "account_" + i + "_";
    }

    private String m12488c(int i) {
        return String.valueOf(dqg.m12487b(i)).concat("login_time");
    }

    public void mo1652a(int i, dqd dqd) {
        long j = this.f10338b.getLong(m12488c(i), 0);
        long a = ((jhx) jyn.m25426a(this.f10337a, jhx.class)).mo3524a();
        if (a < TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS) + j) {
            m12486a(i, 2591);
            m12486a(i, dqd.f10331d);
        }
        if (a < j + TimeUnit.MILLISECONDS.convert(7, TimeUnit.DAYS)) {
            m12486a(i, 2595);
            m12486a(i, dqd.f10332e);
        }
    }

    public void mo609a(int i) {
        jch a = ((jcf) jyn.m25426a(this.f10337a, jcf.class)).mo3456a(i);
        if (a.mo3442b()) {
            if (!a.mo3448c("sms_only")) {
                Editor edit = this.f10338b.edit();
                edit.remove(m12488c(i));
                String b = dqg.m12487b(i);
                for (String str : this.f10338b.getAll().keySet()) {
                    if (str.startsWith(b)) {
                        edit.remove(str);
                    }
                }
                edit.apply();
            }
        } else if (a.mo3437a() && !this.f10338b.contains(m12488c(i))) {
            this.f10338b.edit().putLong(m12488c(i), ((jhx) jyn.m25426a(this.f10337a, jhx.class)).mo3524a()).apply();
            m12486a(i, 2590);
        }
    }

    private void m12486a(int i, int i2) {
        String valueOf = String.valueOf(dqg.m12487b(i));
        String stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29).append(valueOf).append("logged_impression_").append(i2).toString();
        if (!this.f10338b.getBoolean(stringBuilder, false)) {
            ((iih) jyn.m25426a(this.f10337a, iih.class)).mo1979a(i).mo1693b().mo1714c(i2);
            this.f10338b.edit().putBoolean(stringBuilder, true).apply();
        }
    }
}
