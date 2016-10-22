import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class coy extends fjy<cpa> {
    private final cpa c;

    public coy(cpa cpa) {
        super(cpa);
        this.c = cpa;
    }

    protected euj a(Context context, int i, int i2) {
        return new cou(context, i, fom.HANGOUTS_API, i2, (cpa) this.a);
    }

    public long b() {
        return Long.MAX_VALUE;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        if (fdo.c() == 101 || fdo.c() == 102 || fdo.c() == 103) {
            return true;
        }
        return super.a(context, eaf, fdo);
    }

    public void a(Context context, int i, fdo fdo) {
        boolean z;
        String str;
        bko e = fde.e(i);
        String d = ((cpa) this.a).d();
        int c = fdo.c();
        if (TextUtils.isEmpty(d) || c != 113) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            RealTimeChatService.f(e, d);
        } else {
            String c2 = ((cpa) this.a).c();
            if (fdo != null) {
                c = fdo.c();
            } else {
                c = 0;
            }
            RealTimeChatService.a(e, d, c2, c);
            ((ect) jyn.a(context, ect.class)).d(e.g(), true);
        }
        if (!(fdo == null || fdo.c() == 0)) {
            gwb.a(e, 1523);
            ba.a(e.g(), glj.b(), 5, ba.c().a(fdo.c()).b(((cpa) this.a).c()).a(((cpa) this.a).d()));
        }
        if (fdo.c() != 121) {
            a(context);
        }
        String str2 = "Babel_ConvService";
        String valueOf = String.valueOf(getClass().getSimpleName());
        d = String.valueOf(this.c.c());
        if (fdo == null) {
            str = "null exception";
        } else {
            str = "error code: " + fdo.c();
        }
        glk.c(str2, new StringBuilder(((String.valueOf(valueOf).length() + 22) + String.valueOf(d).length()) + String.valueOf(str).length()).append(valueOf).append(" for ").append(d).append(" has failed with ").append(str).toString(), new Object[0]);
    }

    public String K_() {
        return "event_queue";
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return true;
    }

    public boolean a(String str) {
        return str.startsWith(((cpa) this.a).c());
    }

    public boolean a(ead ead) {
        return false;
    }

    static void a(Context context) {
        new Handler(Looper.getMainLooper()).post(new coz(context));
    }

    public List<bhc> e() {
        List<bhc> arrayList = new ArrayList();
        arrayList.add(new bhc(this.c.c()));
        return arrayList;
    }

    public void a(Context context, eaf eaf) {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String valueOf2 = String.valueOf(this.c.c());
        glk.c("Babel_ConvService", new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append(valueOf).append(" for ").append(valueOf2).append(" is being processed").toString(), new Object[0]);
        super.a(context, eaf);
        valueOf = String.valueOf(getClass().getSimpleName());
        valueOf2 = String.valueOf(this.c.c());
        glk.c("Babel_ConvService", new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append(valueOf).append(" for ").append(valueOf2).append(" has been processed").toString(), new Object[0]);
    }
}
