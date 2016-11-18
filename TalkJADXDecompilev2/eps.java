package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class eps {
    private static final boolean a = false;
    private String b;
    private String c;
    private long d;
    private int e;
    private String f;
    private boolean g;
    private final fzw h;
    private final iih i;
    private final bbm j;

    static {
        kae kae = glk.o;
    }

    public eps(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("phone_verification", 0);
        this.b = sharedPreferences.getString("account_name", null);
        this.c = sharedPreferences.getString("phone_number", null);
        this.d = sharedPreferences.getLong("verification_time", 0);
        this.e = sharedPreferences.getInt("verification_state", 100);
        this.f = sharedPreferences.getString("last_successful_number", null);
        this.h = (fzw) jyn.a(context, fzw.class);
        this.i = (iih) jyn.a(context, iih.class);
        this.j = (bbm) jyn.a(context, bbm.class);
    }

    private boolean e() {
        boolean z;
        synchronized (this) {
            if (this.e == 104) {
                z = false;
            } else {
                a(101, this.b, this.c, this.g);
                if (a) {
                    String str = this.b;
                    String str2 = this.c;
                    new StringBuilder((String.valueOf(str).length() + 47) + String.valueOf(str2).length()).append("Retrying phone verification.  Account: ").append(str).append(" Phone: ").append(str2);
                }
                z = f();
            }
        }
        return z;
    }

    public boolean a(String str, String str2, epv epv) {
        boolean e;
        synchronized (this) {
            if (a() && this.c.equals(str)) {
                e = e();
            } else {
                a(101, str2, str, epv == epv.ENABLED);
                e = f();
            }
        }
        return e;
    }

    private boolean f() {
        bko a = fde.a(this.b);
        if (a == null || fde.d(a)) {
            glk.d("Babel", "Account not ready. Skip phone verification", new Object[0]);
            b(105, false);
            gwb.a(a, 2046);
            return false;
        }
        if (a) {
            String str = this.b;
            String str2 = this.c;
            new StringBuilder((String.valueOf(str).length() + 47) + String.valueOf(str2).length()).append("Starting phone verification.  Account: ").append(str).append(" Phone: ").append(str2);
        }
        RealTimeChatService.c(a, this.c);
        return true;
    }

    public void a(int i, boolean z) {
        b(i, z);
    }

    private void b(int i, boolean z) {
        synchronized (this) {
            if (z) {
                gwb.a(fde.a(this.b), 2048);
            }
            a(i, this.b, this.c, this.g);
            if (i == 105) {
                glk.a("Babel", "Sending verification failure notification", new Object[0]);
                if (z) {
                    eps.a(epu.FAILURE_NO_RETRY);
                } else {
                    eps.a(epu.FAILURE_RETRY);
                }
            } else if (i == 104) {
                glk.a("Babel", "Sending verifcation success notification", new Object[0]);
                eps.a(epu.SUCCESS);
            }
        }
    }

    private static void a(epu epu) {
        ik a = ik.a(gwb.H());
        Intent intent = new Intent("phone_verification_outcome");
        intent.putExtra("phone_verification_result", epu);
        a.a(intent);
    }

    public void a(String str) {
        synchronized (this) {
            if (a) {
                String str2 = this.b;
                String str3 = this.c;
                new StringBuilder(((String.valueOf(str2).length() + 68) + String.valueOf(str3).length()) + String.valueOf(str).length()).append("Finishing phone verification.  Account: ").append(str2).append(" Phone: ").append(str3).append(" Verification Code: ").append(str);
            }
            bko a = fde.a(this.b);
            if (a == null || fde.d(a)) {
                glk.d("Babel", "Account not ready. Abort phone verification", new Object[0]);
                gwb.a(a, 2046);
                a(105, this.b, this.c, this.g);
                return;
            }
            a(103, this.b, this.c, this.g);
            RealTimeChatService.a(a, this.c, str, this.g);
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this) {
            z = this.e >= 101 && this.e <= 103;
        }
        return z;
    }

    public int b() {
        int i;
        synchronized (this) {
            i = this.e;
        }
        return i;
    }

    public String c() {
        return this.c;
    }

    public void b(String str) {
        this.c = str;
    }

    public String d() {
        return this.f;
    }

    private void a(int i, String str, String str2, boolean z) {
        if (a) {
            new StringBuilder(38).append("Setting verification state:").append(i);
        }
        this.e = i;
        this.b = str;
        this.c = str2;
        this.g = z;
        bko a = fde.a(this.b);
        switch (i) {
            case 101:
                gwb.a(a, 2042);
                break;
            case 103:
                gwb.a(a, 2044);
                break;
            case 104:
                gwb.a(a, 1598);
                break;
            case 105:
                gwb.a(a, 2045);
                break;
        }
        Editor edit = gwb.H().getSharedPreferences("phone_verification", 0).edit();
        edit.putString("account_name", this.b);
        edit.putString("phone_number", this.c);
        edit.putInt("verification_state", this.e);
        if (this.e == 101) {
            this.d = glj.a();
            edit.putLong("verification_time", this.d);
        }
        if (i == 104) {
            this.f = this.c;
            edit.putString("last_successful_number", this.f);
        }
        edit.apply();
    }

    public ept a(bko bko) {
        String a;
        if (TextUtils.equals(bko.a(), this.b)) {
            a = glq.a(gwb.H(), this.c, glu.c);
            if (a()) {
                return new ept(102, a);
            }
        }
        ArrayList r = bko.r();
        if (r.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            r = r;
            int size = r.size();
            int i = 0;
            while (i < size) {
                Object obj = r.get(i);
                i++;
                a = (String) obj;
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(glq.a(gwb.H(), a, glu.c));
            }
            return new ept(100, stringBuilder.toString());
        }
        String f = glq.f(gwb.H());
        if (TextUtils.isEmpty(f)) {
            f = this.f;
        }
        if (TextUtils.isEmpty(f)) {
            f = null;
        } else {
            f = glq.a(gwb.H(), f, glu.c);
        }
        return new ept(101, f);
    }

    public boolean b(bko bko) {
        int i;
        boolean e = glq.e(gwb.H());
        iie a = this.i.a(bko.g()).b().a(1, TimeUnit.DAYS);
        if (e) {
            i = 2295;
        } else {
            i = 2296;
        }
        a.c(i);
        if (!(bko.x() || this.j.p(bko.g()))) {
            Object obj;
            for (bko q : fde.o()) {
                if (q.q()) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj == null && !this.h.a(bko.g())) {
                return true;
            }
        }
        return false;
    }
}
