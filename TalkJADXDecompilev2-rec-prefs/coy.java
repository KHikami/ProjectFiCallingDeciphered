package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class coy extends fjy<cpa> {
    private final cpa f8754c;

    public coy(cpa cpa) {
        super(cpa);
        this.f8754c = cpa;
    }

    protected euj mo1013a(Context context, int i, int i2) {
        return new cou(context, i, fom.HANGOUTS_API, i2, (cpa) this.a);
    }

    public long mo1017b() {
        return Long.MAX_VALUE;
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        if (fdo.m15084c() == 101 || fdo.m15084c() == 102 || fdo.m15084c() == 103) {
            return true;
        }
        return super.mo1008a(context, eaf, fdo);
    }

    public void mo1014a(Context context, int i, fdo fdo) {
        boolean z;
        String str;
        bko e = fde.m15018e(i);
        String d = ((cpa) this.a).m8181d();
        int c = fdo.m15084c();
        if (TextUtils.isEmpty(d) || c != 113) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            RealTimeChatService.m9112f(e, d);
        } else {
            String c2 = ((cpa) this.a).m8180c();
            if (fdo != null) {
                c = fdo.m15084c();
            } else {
                c = 0;
            }
            RealTimeChatService.m9022a(e, d, c2, c);
            ((ect) jyn.m25426a(context, ect.class)).mo1838d(e.m5638g(), true);
        }
        if (!(fdo == null || fdo.m15084c() == 0)) {
            gwb.m1823a(e, 1523);
            ba.m4548a(e.m5638g(), glj.m17963b(), 5, ba.m4618c().m12786a(fdo.m15084c()).m12794b(((cpa) this.a).m8180c()).m12789a(((cpa) this.a).m8181d()));
        }
        if (fdo.m15084c() != 121) {
            coy.m10594a(context);
        }
        String str2 = "Babel_ConvService";
        String valueOf = String.valueOf(getClass().getSimpleName());
        d = String.valueOf(this.f8754c.m8180c());
        if (fdo == null) {
            str = "null exception";
        } else {
            str = "error code: " + fdo.m15084c();
        }
        glk.m17979c(str2, new StringBuilder(((String.valueOf(valueOf).length() + 22) + String.valueOf(d).length()) + String.valueOf(str).length()).append(valueOf).append(" for ").append(d).append(" has failed with ").append(str).toString(), new Object[0]);
    }

    public String K_() {
        return "event_queue";
    }

    public boolean mo1018c() {
        return true;
    }

    public boolean mo1019d() {
        return true;
    }

    public boolean mo1016a(String str) {
        return str.startsWith(((cpa) this.a).m8180c());
    }

    public boolean mo1015a(ead ead) {
        return false;
    }

    static void m10594a(Context context) {
        new Handler(Looper.getMainLooper()).post(new coz(context));
    }

    public List<bhc> mo1010e() {
        List<bhc> arrayList = new ArrayList();
        arrayList.add(new bhc(this.f8754c.m8180c()));
        return arrayList;
    }

    public void mo1007a(Context context, eaf eaf) {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String valueOf2 = String.valueOf(this.f8754c.m8180c());
        glk.m17979c("Babel_ConvService", new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append(valueOf).append(" for ").append(valueOf2).append(" is being processed").toString(), new Object[0]);
        super.mo1007a(context, eaf);
        valueOf = String.valueOf(getClass().getSimpleName());
        valueOf2 = String.valueOf(this.f8754c.m8180c());
        glk.m17979c("Babel_ConvService", new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append(valueOf).append(" for ").append(valueOf2).append(" has been processed").toString(), new Object[0]);
    }
}
