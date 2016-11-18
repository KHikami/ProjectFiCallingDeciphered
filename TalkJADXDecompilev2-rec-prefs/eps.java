package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class eps {
    private static final boolean f11999a = false;
    private String f12000b;
    private String f12001c;
    private long f12002d;
    private int f12003e;
    private String f12004f;
    private boolean f12005g;
    private final fzw f12006h;
    private final iih f12007i;
    private final bbm f12008j;

    static {
        kae kae = glk.f15568o;
    }

    public eps(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("phone_verification", 0);
        this.f12000b = sharedPreferences.getString("account_name", null);
        this.f12001c = sharedPreferences.getString("phone_number", null);
        this.f12002d = sharedPreferences.getLong("verification_time", 0);
        this.f12003e = sharedPreferences.getInt("verification_state", 100);
        this.f12004f = sharedPreferences.getString("last_successful_number", null);
        this.f12006h = (fzw) jyn.m25426a(context, fzw.class);
        this.f12007i = (iih) jyn.m25426a(context, iih.class);
        this.f12008j = (bbm) jyn.m25426a(context, bbm.class);
    }

    private boolean m14225e() {
        boolean z;
        synchronized (this) {
            if (this.f12003e == 104) {
                z = false;
            } else {
                m14222a(101, this.f12000b, this.f12001c, this.f12005g);
                if (f11999a) {
                    String str = this.f12000b;
                    String str2 = this.f12001c;
                    new StringBuilder((String.valueOf(str).length() + 47) + String.valueOf(str2).length()).append("Retrying phone verification.  Account: ").append(str).append(" Phone: ").append(str2);
                }
                z = m14226f();
            }
        }
        return z;
    }

    public boolean m14231a(String str, String str2, epv epv) {
        boolean e;
        synchronized (this) {
            if (m14230a() && this.f12001c.equals(str)) {
                e = m14225e();
            } else {
                m14222a(101, str2, str, epv == epv.ENABLED);
                e = m14226f();
            }
        }
        return e;
    }

    private boolean m14226f() {
        bko a = fde.m14994a(this.f12000b);
        if (a == null || fde.m15015d(a)) {
            glk.m17981d("Babel", "Account not ready. Skip phone verification", new Object[0]);
            m14224b(105, false);
            gwb.m1823a(a, 2046);
            return false;
        }
        if (f11999a) {
            String str = this.f12000b;
            String str2 = this.f12001c;
            new StringBuilder((String.valueOf(str).length() + 47) + String.valueOf(str2).length()).append("Starting phone verification.  Account: ").append(str).append(" Phone: ").append(str2);
        }
        RealTimeChatService.m9089c(a, this.f12001c);
        return true;
    }

    public void m14228a(int i, boolean z) {
        m14224b(i, z);
    }

    private void m14224b(int i, boolean z) {
        synchronized (this) {
            if (z) {
                gwb.m1823a(fde.m14994a(this.f12000b), 2048);
            }
            m14222a(i, this.f12000b, this.f12001c, this.f12005g);
            if (i == 105) {
                glk.m17970a("Babel", "Sending verification failure notification", new Object[0]);
                if (z) {
                    eps.m14223a(epu.FAILURE_NO_RETRY);
                } else {
                    eps.m14223a(epu.FAILURE_RETRY);
                }
            } else if (i == 104) {
                glk.m17970a("Babel", "Sending verifcation success notification", new Object[0]);
                eps.m14223a(epu.SUCCESS);
            }
        }
    }

    private static void m14223a(epu epu) {
        ik a = ik.m22097a(gwb.m1400H());
        Intent intent = new Intent("phone_verification_outcome");
        intent.putExtra("phone_verification_result", epu);
        a.m22101a(intent);
    }

    public void m14229a(String str) {
        synchronized (this) {
            if (f11999a) {
                String str2 = this.f12000b;
                String str3 = this.f12001c;
                new StringBuilder(((String.valueOf(str2).length() + 68) + String.valueOf(str3).length()) + String.valueOf(str).length()).append("Finishing phone verification.  Account: ").append(str2).append(" Phone: ").append(str3).append(" Verification Code: ").append(str);
            }
            bko a = fde.m14994a(this.f12000b);
            if (a == null || fde.m15015d(a)) {
                glk.m17981d("Babel", "Account not ready. Abort phone verification", new Object[0]);
                gwb.m1823a(a, 2046);
                m14222a(105, this.f12000b, this.f12001c, this.f12005g);
                return;
            }
            m14222a(103, this.f12000b, this.f12001c, this.f12005g);
            RealTimeChatService.m9024a(a, this.f12001c, str, this.f12005g);
        }
    }

    public boolean m14230a() {
        boolean z;
        synchronized (this) {
            z = this.f12003e >= 101 && this.f12003e <= 103;
        }
        return z;
    }

    public int m14232b() {
        int i;
        synchronized (this) {
            i = this.f12003e;
        }
        return i;
    }

    public String m14235c() {
        return this.f12001c;
    }

    public void m14233b(String str) {
        this.f12001c = str;
    }

    public String m14236d() {
        return this.f12004f;
    }

    private void m14222a(int i, String str, String str2, boolean z) {
        if (f11999a) {
            new StringBuilder(38).append("Setting verification state:").append(i);
        }
        this.f12003e = i;
        this.f12000b = str;
        this.f12001c = str2;
        this.f12005g = z;
        bko a = fde.m14994a(this.f12000b);
        switch (i) {
            case 101:
                gwb.m1823a(a, 2042);
                break;
            case 103:
                gwb.m1823a(a, 2044);
                break;
            case 104:
                gwb.m1823a(a, 1598);
                break;
            case 105:
                gwb.m1823a(a, 2045);
                break;
        }
        Editor edit = gwb.m1400H().getSharedPreferences("phone_verification", 0).edit();
        edit.putString("account_name", this.f12000b);
        edit.putString("phone_number", this.f12001c);
        edit.putInt("verification_state", this.f12003e);
        if (this.f12003e == 101) {
            this.f12002d = glj.m17956a();
            edit.putLong("verification_time", this.f12002d);
        }
        if (i == 104) {
            this.f12004f = this.f12001c;
            edit.putString("last_successful_number", this.f12004f);
        }
        edit.apply();
    }

    public ept m14227a(bko bko) {
        String a;
        if (TextUtils.equals(bko.m5629a(), this.f12000b)) {
            a = glq.m18002a(gwb.m1400H(), this.f12001c, glu.f15611c);
            if (m14230a()) {
                return new ept(102, a);
            }
        }
        ArrayList r = bko.m5649r();
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
                stringBuilder.append(glq.m18002a(gwb.m1400H(), a, glu.f15611c));
            }
            return new ept(100, stringBuilder.toString());
        }
        String f = glq.m18025f(gwb.m1400H());
        if (TextUtils.isEmpty(f)) {
            f = this.f12004f;
        }
        if (TextUtils.isEmpty(f)) {
            f = null;
        } else {
            f = glq.m18002a(gwb.m1400H(), f, glu.f15611c);
        }
        return new ept(101, f);
    }

    public boolean m14234b(bko bko) {
        int i;
        boolean e = glq.m18023e(gwb.m1400H());
        iie a = this.f12007i.mo1979a(bko.m5638g()).mo1693b().mo1697a(1, TimeUnit.DAYS);
        if (e) {
            i = 2295;
        } else {
            i = 2296;
        }
        a.mo1714c(i);
        if (!(bko.m5655x() || this.f12008j.mo456p(bko.m5638g()))) {
            Object obj;
            for (bko q : fde.m15037o()) {
                if (q.m5648q()) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj == null && !this.f12006h.mo2146a(bko.m5638g())) {
                return true;
            }
        }
        return false;
    }
}
