package p000;

import android.content.Context;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

final class fnq implements fnc {
    private final Context f13531a;
    private final fnp f13532b;
    private final jcf f13533c;
    private final CopyOnWriteArrayList<fne> f13534d;
    private final bhl f13535e;
    private final Queue<bhm> f13536f;
    private final long f13537g;
    private final Object f13538h = new Object();
    private final Map<Integer, fnf> f13539i;
    private final ConcurrentMap<Integer, ConditionVariable> f13540j;

    public fnq(Context context, fnp fnp) {
        this.f13531a = context;
        this.f13534d = new CopyOnWriteArrayList();
        this.f13535e = (bhl) jyn.m25426a(context, bhl.class);
        this.f13536f = new LinkedList();
        this.f13539i = new HashMap();
        this.f13540j = new ConcurrentHashMap();
        this.f13532b = fnp;
        this.f13533c = (jcf) jyn.m25426a(context, jcf.class);
        this.f13537g = TimeUnit.MILLISECONDS.convert(gwb.m1519a(context, "babel_ac_registration_renew_window_seconds", fls.f13424a), TimeUnit.SECONDS);
    }

    private boolean m15751c() {
        return ((fnh) jyn.m25426a(this.f13531a, fnh.class)).m15706a();
    }

    public fnd mo2044a(int i) {
        int i2 = 1;
        bko e = fde.m15018e(i);
        boolean c = this.f13533c.mo3456a(i).mo3448c("sms_only");
        if (c) {
            glk.m17981d("Babel_Registration", "Attempting to schedule registration for SMS only account %d", Integer.valueOf(i));
        }
        if (c) {
            return null;
        }
        synchronized (this.f13538h) {
            if (this.f13539i.get(Integer.valueOf(i)) == fnf.PENDING) {
                return null;
            }
            fnd a = this.f13532b.m15746a(i);
            if (!m15751c()) {
                if (a != null && glj.m17956a() - a.f13490g <= this.f13537g) {
                    i2 = 0;
                }
                if (i2 == 0) {
                    return a;
                }
            }
            m15750a(e);
            return null;
        }
    }

    private void m15750a(bko bko) {
        int g = bko.m5638g();
        m15749a(g, fnf.PENDING);
        new Object[1][0] = Integer.valueOf(g);
        bhm fnk = new fnk(bko, true);
        if (m15751c()) {
            bhm fnj = new fnj(g);
            this.f13536f.add(fnk);
            this.f13535e.mo550a(fnj);
            return;
        }
        this.f13535e.mo550a(fnk);
    }

    public void mo2048b(int i) {
        new Object[1][0] = Integer.valueOf(i);
        bko e = fde.m15018e(i);
        if (e != null) {
            this.f13535e.mo550a(new fnu(e));
        }
    }

    public void mo2047a(String str) {
        int[] c = fde.m15014c(false);
        if (c.length == 0) {
            glk.m17981d("Babel_Registration", "All accounts removed", new Object[0]);
            return;
        }
        int i = c[0];
        bko e = fde.m15018e(i);
        fzw fzw = (fzw) jyn.m25426a(this.f13531a, fzw.class);
        if (e == null || fde.m15015d(e) || fzw.mo2146a(i)) {
            glk.m17981d("Babel_Registration", "No existing logged in Hangouts account available to perform unregistration.", new Object[0]);
            return;
        }
        if (fde.m14993a(edo.m13604a(str)) != null) {
            glk.m17982e("Babel_Registration", "Removing a valid account by mistake:accountName=%s, accountGaia=%s", glk.m17974b(fde.m14993a(edo.m13604a(str)).m5629a()), str);
            return;
        }
        Object[] objArr = new Object[]{Integer.valueOf(i), str};
        if (fdq.f12767I.m14370b(i)) {
            this.f13535e.mo550a(new fnw(e, str));
        } else {
            RealTimeChatService.m8999a(i, str);
        }
    }

    public void mo2046a(fne fne) {
        if (fne != null) {
            this.f13534d.add(fne);
        }
    }

    public void mo2049b(fne fne) {
        if (fne != null) {
            this.f13534d.remove(fne);
        }
    }

    public void mo2045a() {
        this.f13535e.mo550a(new fnt(this.f13531a));
    }

    void m15756a(fnn fnn, int i) {
        synchronized (this.f13538h) {
            fnf fnf;
            String l = fnn.m15741l();
            String str = null;
            if (!TextUtils.isEmpty(l)) {
                int indexOf = l.indexOf(47);
                if (indexOf >= 0) {
                    str = l.substring(indexOf + 1);
                }
            }
            fnd fnd = new fnd(i, l, str, fnn.m15742m(), fnn.m15743n(), fnn.m15744o(), glj.m17956a());
            fnf fnf2;
            switch (fnn.m15740k()) {
                case 1:
                    fnf2 = fnf.REGISTERED;
                    this.f13532b.m15747a(fnd);
                    fnf = fnf2;
                    break;
                case 2:
                    fnf2 = fnf.NOT_REGISTERED;
                    this.f13532b.m15748b(i);
                    fnf = fnf2;
                    break;
                default:
                    return;
            }
            Object[] objArr = new Object[]{Integer.valueOf(i), fnf};
            ConditionVariable conditionVariable = (ConditionVariable) this.f13540j.get(Integer.valueOf(i));
            if (conditionVariable != null) {
                new Object[1][0] = Integer.valueOf(i);
                conditionVariable.open();
            }
            m15749a(i, fnf);
        }
    }

    private void m15749a(int i, fnf fnf) {
        if (this.f13539i.get(Integer.valueOf(i)) != fnf) {
            fnd a = this.f13532b.m15746a(i);
            this.f13539i.put(Integer.valueOf(i), fnf);
            Iterator it = this.f13534d.iterator();
            while (it.hasNext()) {
                ((fne) it.next()).mo500a(i, a, fnf);
            }
        }
    }

    void m15758b() {
        synchronized (this.f13538h) {
            new Object[1][0] = Integer.valueOf(this.f13536f.size());
            while (!this.f13536f.isEmpty()) {
                this.f13535e.mo550a((bhm) this.f13536f.remove());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m15754a(int i, fdo fdo) {
        bko e = fde.m15018e(i);
        synchronized (this.f13538h) {
            if (fdo != null) {
                int c = fdo.m15084c();
                if (!(gwb.m2308n(c) || gwb.m2317o(c))) {
                    glk.m17980d("Babel_Registration", String.format("Cannot recover from babel client error: %d not rescheduling registration", new Object[]{Integer.valueOf(c)}), (Throwable) fdo);
                    ConditionVariable conditionVariable = (ConditionVariable) this.f13540j.get(Integer.valueOf(i));
                    if (conditionVariable != null) {
                        this.f13540j.remove(Integer.valueOf(i));
                        conditionVariable.open();
                    }
                }
            }
            glk.m17978c("Babel_Registration", String.format("Account registration failed for account %d, retrying", new Object[]{Integer.valueOf(i)}), (Throwable) fdo);
            m15750a(e);
        }
    }
}
