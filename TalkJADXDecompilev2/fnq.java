package defpackage;

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
    private final Context a;
    private final fnp b;
    private final jcf c;
    private final CopyOnWriteArrayList<fne> d;
    private final bhl e;
    private final Queue<bhm> f;
    private final long g;
    private final Object h = new Object();
    private final Map<Integer, fnf> i;
    private final ConcurrentMap<Integer, ConditionVariable> j;

    public fnq(Context context, fnp fnp) {
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

    void a(fnn fnn, int i) {
        synchronized (this.h) {
            fnf fnf;
            String l = fnn.l();
            String str = null;
            if (!TextUtils.isEmpty(l)) {
                int indexOf = l.indexOf(47);
                if (indexOf >= 0) {
                    str = l.substring(indexOf + 1);
                }
            }
            fnd fnd = new fnd(i, l, str, fnn.m(), fnn.n(), fnn.o(), glj.a());
            fnf fnf2;
            switch (fnn.k()) {
                case 1:
                    fnf2 = fnf.REGISTERED;
                    this.b.a(fnd);
                    fnf = fnf2;
                    break;
                case 2:
                    fnf2 = fnf.NOT_REGISTERED;
                    this.b.b(i);
                    fnf = fnf2;
                    break;
                default:
                    return;
            }
            Object[] objArr = new Object[]{Integer.valueOf(i), fnf};
            ConditionVariable conditionVariable = (ConditionVariable) this.j.get(Integer.valueOf(i));
            if (conditionVariable != null) {
                new Object[1][0] = Integer.valueOf(i);
                conditionVariable.open();
            }
            a(i, fnf);
        }
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(int r8, defpackage.fdo r9) {
        /*
        r7 = this;
        r0 = defpackage.fde.e(r8);
        r1 = r7.h;
        monitor-enter(r1);
        if (r9 == 0) goto L_0x004a;
    L_0x0009:
        r2 = r9.c();	 Catch:{ all -> 0x0064 }
        r3 = defpackage.gwb.n(r2);	 Catch:{ all -> 0x0064 }
        if (r3 != 0) goto L_0x004a;
    L_0x0013:
        r3 = defpackage.gwb.o(r2);	 Catch:{ all -> 0x0064 }
        if (r3 != 0) goto L_0x004a;
    L_0x0019:
        r0 = "Babel_Registration";
        r3 = "Cannot recover from babel client error: %d not rescheduling registration";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0064 }
        r5 = 0;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0064 }
        r4[r5] = r2;	 Catch:{ all -> 0x0064 }
        r2 = java.lang.String.format(r3, r4);	 Catch:{ all -> 0x0064 }
        defpackage.glk.d(r0, r2, r9);	 Catch:{ all -> 0x0064 }
        r0 = r7.j;	 Catch:{ all -> 0x0064 }
        r2 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x0064 }
        r0 = r0.get(r2);	 Catch:{ all -> 0x0064 }
        r0 = (android.os.ConditionVariable) r0;	 Catch:{ all -> 0x0064 }
        if (r0 == 0) goto L_0x0048;
    L_0x003c:
        r2 = r7.j;	 Catch:{ all -> 0x0064 }
        r3 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x0064 }
        r2.remove(r3);	 Catch:{ all -> 0x0064 }
        r0.open();	 Catch:{ all -> 0x0064 }
    L_0x0048:
        monitor-exit(r1);	 Catch:{ all -> 0x0064 }
    L_0x0049:
        return;
    L_0x004a:
        r2 = "Babel_Registration";
        r3 = "Account registration failed for account %d, retrying";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0064 }
        r5 = 0;
        r6 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x0064 }
        r4[r5] = r6;	 Catch:{ all -> 0x0064 }
        r3 = java.lang.String.format(r3, r4);	 Catch:{ all -> 0x0064 }
        defpackage.glk.c(r2, r3, r9);	 Catch:{ all -> 0x0064 }
        r7.a(r0);	 Catch:{ all -> 0x0064 }
        monitor-exit(r1);	 Catch:{ all -> 0x0064 }
        goto L_0x0049;
    L_0x0064:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0064 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fnq.a(int, fdo):void");
    }
}
