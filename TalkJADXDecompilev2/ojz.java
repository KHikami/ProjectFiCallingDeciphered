package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ojz {
    static final Logger a = Logger.getLogger(ojz.class.getName());
    public static final ojz b = new ojz(null);
    private static final Object[][] c = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));
    private static final oke<okg> d = new oke("deadline");
    private static final ThreadLocal<ojz> e = new oka();
    private final ojz f = null;
    private final Object[][] g;
    private final boolean h;
    private ArrayList<okd> i;
    private okc j = new okf(this);
    private final boolean k;

    public static ojz a() {
        ojz ojz = (ojz) e.get();
        if (ojz == null) {
            return b;
        }
        return ojz;
    }

    private ojz(ojz ojz) {
        Object[][] objArr = new Object[1][];
        objArr[0] = new Object[]{d, null};
        this.g = objArr;
        this.h = false;
        this.k = false;
    }

    public ojz b() {
        ojz a = ojz.a();
        e.set(this);
        return a;
    }

    public void a(ojz ojz) {
        bm.a((Object) ojz, (Object) "toAttach");
        if (ojz.b() != this) {
            a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
    }

    public boolean c() {
        if (this.f == null || !this.h) {
            return false;
        }
        return this.f.c();
    }

    public Throwable d() {
        if (this.f == null || !this.h) {
            return null;
        }
        return this.f.d();
    }

    public okg e() {
        return (okg) d.a(this);
    }

    public void a(okc okc, Executor executor) {
        bm.a((Object) okc, (Object) "cancellationListener");
        bm.a((Object) executor, (Object) "executor");
        if (this.k) {
            okd okd = new okd(this, executor, okc);
            synchronized (this) {
                if (c()) {
                    okd.a();
                } else if (this.i == null) {
                    this.i = new ArrayList();
                    this.i.add(okd);
                    this.f.a(this.j, gwb.aT());
                } else {
                    this.i.add(okd);
                }
            }
        }
    }

    public void a(okc okc) {
        if (this.k) {
            synchronized (this) {
                if (this.i != null) {
                    for (int size = this.i.size() - 1; size >= 0; size--) {
                        if (((okd) this.i.get(size)).a == okc) {
                            this.i.remove(size);
                            break;
                        }
                    }
                    if (this.i.isEmpty()) {
                        this.f.a(this.j);
                        this.i = null;
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void f() {
        /*
        r4 = this;
        r2 = 0;
        r0 = r4.k;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return;
    L_0x0006:
        monitor-enter(r4);
        r0 = r4.i;	 Catch:{ all -> 0x000d }
        if (r0 != 0) goto L_0x0010;
    L_0x000b:
        monitor-exit(r4);	 Catch:{ all -> 0x000d }
        goto L_0x0005;
    L_0x000d:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x000d }
        throw r0;
    L_0x0010:
        r3 = r4.i;	 Catch:{ all -> 0x000d }
        r0 = 0;
        r4.i = r0;	 Catch:{ all -> 0x000d }
        monitor-exit(r4);	 Catch:{ all -> 0x000d }
        r1 = r2;
    L_0x0017:
        r0 = r3.size();
        if (r1 >= r0) goto L_0x0036;
    L_0x001d:
        r0 = r3.get(r1);
        r0 = (okd) r0;
        r0 = r0.a;
        r0 = r0 instanceof okf;
        if (r0 != 0) goto L_0x0032;
    L_0x0029:
        r0 = r3.get(r1);
        r0 = (okd) r0;
        r0.a();
    L_0x0032:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0017;
    L_0x0036:
        r0 = r3.size();
        if (r2 >= r0) goto L_0x0054;
    L_0x003c:
        r0 = r3.get(r2);
        r0 = (okd) r0;
        r0 = r0.a;
        r0 = r0 instanceof okf;
        if (r0 == 0) goto L_0x0051;
    L_0x0048:
        r0 = r3.get(r2);
        r0 = (okd) r0;
        r0.a();
    L_0x0051:
        r2 = r2 + 1;
        goto L_0x0036;
    L_0x0054:
        r0 = r4.f;
        r1 = r4.j;
        r0.a(r1);
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: ojz.f():void");
    }

    Object a(oke<?> oke_) {
        while (true) {
            for (int i = 0; i < this.g.length; i++) {
                if (oke_.equals(this.g[i][0])) {
                    return this.g[i][1];
                }
            }
            if (this.f == null) {
                return null;
            }
            this = this.f;
        }
    }
}
