import android.content.Context;
import android.os.ConditionVariable;
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
    private final Context a;
    private final fnp b;
    private final jcf c;
    private final CopyOnWriteArrayList<fne> d;
    private final bhl e;
    private final Queue<bhm> f;
    private final long g;
    private final Object h;
    private final Map<Integer, fnf> i;
    private final ConcurrentMap<Integer, ConditionVariable> j;

    public fnq(Context context, fnp fnp) {
        this.h = new Object();
        this.a = context;
        this.d = new CopyOnWriteArrayList();
        this.e = (bhl) jyn.a(context, bhl.class);
        this.f = new LinkedList();
        this.i = new HashMap();
        this.j = new ConcurrentHashMap();
        this.b = fnp;
        this.c = (jcf) jyn.a(context, jcf.class);
        this.g = TimeUnit.MILLISECONDS.convert(gwb.a(context, "babel_ac_registration_renew_window_seconds", fls.a), TimeUnit.SECONDS);
    }

    private boolean c() {
        return ((fnh) jyn.a(this.a, fnh.class)).a();
    }

    public fnd a(int i) {
        int i2 = 1;
        bko e = fde.e(i);
        boolean c = this.c.a(i).c("sms_only");
        if (c) {
            glk.d("Babel_Registration", "Attempting to schedule registration for SMS only account %d", Integer.valueOf(i));
        }
        if (c) {
            return null;
        }
        synchronized (this.h) {
            if (this.i.get(Integer.valueOf(i)) == fnf.PENDING) {
                return null;
            }
            fnd a = this.b.a(i);
            if (!c()) {
                if (a != null && glj.a() - a.g <= this.g) {
                    i2 = 0;
                }
                if (i2 == 0) {
                    return a;
                }
            }
            a(e);
            return null;
        }
    }

    private void a(bko bko) {
        int g = bko.g();
        a(g, fnf.PENDING);
        new Object[1][0] = Integer.valueOf(g);
        bhm fnk = new fnk(bko, true);
        if (c()) {
            bhm fnj = new fnj(g);
            this.f.add(fnk);
            this.e.a(fnj);
            return;
        }
        this.e.a(fnk);
    }

    public void b(int i) {
        new Object[1][0] = Integer.valueOf(i);
        bko e = fde.e(i);
        if (e != null) {
            this.e.a(new fnu(e));
        }
    }

    public void a(String str) {
        int[] c = fde.c(false);
        if (c.length == 0) {
            glk.d("Babel_Registration", "All accounts removed", new Object[0]);
            return;
        }
        int i = c[0];
        bko e = fde.e(i);
        fzw fzw = (fzw) jyn.a(this.a, fzw.class);
        if (e == null || fde.d(e) || fzw.a(i)) {
            glk.d("Babel_Registration", "No existing logged in Hangouts account available to perform unregistration.", new Object[0]);
            return;
        }
        if (fde.a(edo.a(str)) != null) {
            glk.e("Babel_Registration", "Removing a valid account by mistake:accountName=%s, accountGaia=%s", glk.b(fde.a(edo.a(str)).a()), str);
            return;
        }
        Object[] objArr = new Object[]{Integer.valueOf(i), str};
        if (fdq.I.b(i)) {
            this.e.a(new fnw(e, str));
        } else {
            RealTimeChatService.a(i, str);
        }
    }

    public void a(fne fne) {
        if (fne != null) {
            this.d.add(fne);
        }
    }

    public void b(fne fne) {
        if (fne != null) {
            this.d.remove(fne);
        }
    }

    public void a() {
        this.e.a(new fnt(this.a));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(fnn r12, int r13) {
        /*
        r11 = this;
        r10 = r11.h;
        monitor-enter(r10);
        r3 = r12.l();	 Catch:{ all -> 0x0070 }
        r4 = 0;
        r0 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x0070 }
        if (r0 != 0) goto L_0x001c;
    L_0x000e:
        r0 = 47;
        r0 = r3.indexOf(r0);	 Catch:{ all -> 0x0070 }
        if (r0 < 0) goto L_0x001c;
    L_0x0016:
        r0 = r0 + 1;
        r4 = r3.substring(r0);	 Catch:{ all -> 0x0070 }
    L_0x001c:
        r1 = new fnd;	 Catch:{ all -> 0x0070 }
        r5 = r12.m();	 Catch:{ all -> 0x0070 }
        r6 = r12.n();	 Catch:{ all -> 0x0070 }
        r7 = r12.o();	 Catch:{ all -> 0x0070 }
        r8 = glj.a();	 Catch:{ all -> 0x0070 }
        r2 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0070 }
        r0 = r12.k();	 Catch:{ all -> 0x0070 }
        switch(r0) {
            case 1: goto L_0x003b;
            case 2: goto L_0x0073;
            default: goto L_0x0039;
        };	 Catch:{ all -> 0x0070 }
    L_0x0039:
        monitor-exit(r10);	 Catch:{ all -> 0x0070 }
    L_0x003a:
        return;
    L_0x003b:
        r0 = fnf.REGISTERED;	 Catch:{ all -> 0x0070 }
        r2 = r11.b;	 Catch:{ all -> 0x0070 }
        r2.a(r1);	 Catch:{ all -> 0x0070 }
        r1 = r0;
    L_0x0043:
        r0 = 2;
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0070 }
        r2 = 0;
        r3 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x0070 }
        r0[r2] = r3;	 Catch:{ all -> 0x0070 }
        r2 = 1;
        r0[r2] = r1;	 Catch:{ all -> 0x0070 }
        r0 = r11.j;	 Catch:{ all -> 0x0070 }
        r2 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x0070 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x0070 }
        r0 = (android.os.ConditionVariable) r0;	 Catch:{ all -> 0x0070 }
        if (r0 == 0) goto L_0x006b;
    L_0x005e:
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0070 }
        r3 = 0;
        r4 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x0070 }
        r2[r3] = r4;	 Catch:{ all -> 0x0070 }
        r0.open();	 Catch:{ all -> 0x0070 }
    L_0x006b:
        r11.a(r13, r1);	 Catch:{ all -> 0x0070 }
        monitor-exit(r10);	 Catch:{ all -> 0x0070 }
        goto L_0x003a;
    L_0x0070:
        r0 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x0070 }
        throw r0;
    L_0x0073:
        r0 = fnf.NOT_REGISTERED;	 Catch:{ all -> 0x0070 }
        r1 = r11.b;	 Catch:{ all -> 0x0070 }
        r1.b(r13);	 Catch:{ all -> 0x0070 }
        r1 = r0;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: fnq.a(fnn, int):void");
    }

    private void a(int i, fnf fnf) {
        if (this.i.get(Integer.valueOf(i)) != fnf) {
            fnd a = this.b.a(i);
            this.i.put(Integer.valueOf(i), fnf);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((fne) it.next()).a(i, a, fnf);
            }
        }
    }

    void b() {
        synchronized (this.h) {
            new Object[1][0] = Integer.valueOf(this.f.size());
            while (!this.f.isEmpty()) {
                this.e.a((bhm) this.f.remove());
            }
        }
    }

    void a(int i, fdo fdo) {
        bko e = fde.e(i);
        synchronized (this.h) {
            if (fdo != null) {
                int c = fdo.c();
                if (!(gwb.n(c) || gwb.o(c))) {
                    glk.d("Babel_Registration", String.format("Cannot recover from babel client error: %d not rescheduling registration", new Object[]{Integer.valueOf(c)}), (Throwable) fdo);
                    ConditionVariable conditionVariable = (ConditionVariable) this.j.get(Integer.valueOf(i));
                    if (conditionVariable != null) {
                        this.j.remove(Integer.valueOf(i));
                        conditionVariable.open();
                    }
                    return;
                }
            }
            glk.c("Babel_Registration", String.format("Account registration failed for account %d, retrying", new Object[]{Integer.valueOf(i)}), (Throwable) fdo);
            a(e);
        }
    }
}
