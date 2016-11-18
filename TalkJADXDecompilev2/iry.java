package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.WindowManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class iry implements ito {
    public iuc A = new iuc(0, 0);
    public iuc B = new iuc(16, 10);
    public int C = 0;
    int D = 0;
    boolean E = true;
    private final ise a;
    private final isf b;
    private final isd c;
    private final isg d;
    private final isc e;
    private final isb f;
    private final irz g;
    private int h = 0;
    private boolean i;
    public final Context r;
    public itr s;
    final List<isa> t;
    public HandlerThread u;
    public Handler v;
    public itq w;
    public boolean x;
    public final Object y = new Object();
    public its z;

    public abstract boolean a();

    public abstract boolean b();

    protected abstract iuc c();

    protected abstract void d();

    protected abstract void e();

    protected iry(Context context) {
        this.r = context;
        this.t = new CopyOnWriteArrayList();
        this.f = new isb(this);
        this.g = new irz(this);
        this.a = new ise(this);
        this.b = new isf(this);
        this.c = new isd(this);
        this.d = new isg(this);
        this.e = new isc(this);
        this.D = o();
    }

    public void a(ite ite, itq itq) {
        gwb.aJ();
        synchronized (this.y) {
            this.u = new HandlerThread("CameraOpenThread");
            this.u.start();
            this.v = new Handler(this.u.getLooper());
            this.e.enable();
            this.z = itq.l();
            this.w = itq;
        }
    }

    public void a(ite ite) {
        gwb.aJ();
        synchronized (this.y) {
            this.w = null;
            this.e.disable();
            c(false);
            synchronized (this.y) {
                this.u.quit();
                this.u = null;
                this.v = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r5) {
        /*
        r4 = this;
        r0 = 0;
        r1 = 1;
        defpackage.gwb.aJ();
        r4.x = r5;
        r3 = r4.y;
        monitor-enter(r3);
        r2 = r4.C;	 Catch:{ all -> 0x0035 }
        if (r2 != 0) goto L_0x0017;
    L_0x000e:
        r2 = r4.a();	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x0025;
    L_0x0014:
        r2 = r1;
    L_0x0015:
        r4.C = r2;	 Catch:{ all -> 0x0035 }
    L_0x0017:
        r2 = r4.C;	 Catch:{ all -> 0x0035 }
        if (r2 != 0) goto L_0x002f;
    L_0x001b:
        r0 = "vclib";
        r1 = "No camera supported on this device, can not enable";
        r2 = 6;
        defpackage.itx.a(r2, r0, r1);	 Catch:{ all -> 0x0035 }
        monitor-exit(r3);	 Catch:{ all -> 0x0035 }
    L_0x0024:
        return;
    L_0x0025:
        r2 = r4.b();	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x002d;
    L_0x002b:
        r2 = 2;
        goto L_0x0015;
    L_0x002d:
        r2 = r0;
        goto L_0x0015;
    L_0x002f:
        r2 = r4.w;	 Catch:{ all -> 0x0035 }
        if (r2 != 0) goto L_0x0038;
    L_0x0033:
        monitor-exit(r3);	 Catch:{ all -> 0x0035 }
        goto L_0x0024;
    L_0x0035:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0035 }
        throw r0;
    L_0x0038:
        monitor-exit(r3);	 Catch:{ all -> 0x0035 }
        r2 = r4.w;
        if (r5 != 0) goto L_0x003e;
    L_0x003d:
        r0 = r1;
    L_0x003e:
        r2.b(r0);
        if (r5 == 0) goto L_0x0047;
    L_0x0043:
        r4.m();
        goto L_0x0024;
    L_0x0047:
        r4.c(r1);
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: iry.a(boolean):void");
    }

    public boolean g() {
        return this.x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r4) {
        /*
        r3 = this;
        r2 = 1;
        defpackage.gwb.aJ();
        r1 = r3.y;
        monitor-enter(r1);
        r0 = r3.C;	 Catch:{ all -> 0x001d }
        if (r4 != r0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x000c:
        return;
    L_0x000d:
        if (r4 != r2) goto L_0x0020;
    L_0x000f:
        r0 = r3.a();	 Catch:{ all -> 0x001d }
        if (r0 != 0) goto L_0x0020;
    L_0x0015:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x001d }
        r2 = "Tried to use front camera, but no front camera detected";
        r0.<init>(r2);	 Catch:{ all -> 0x001d }
        throw r0;	 Catch:{ all -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
    L_0x0020:
        r0 = 2;
        if (r4 != r0) goto L_0x0031;
    L_0x0023:
        r0 = r3.b();	 Catch:{ all -> 0x001d }
        if (r0 != 0) goto L_0x0031;
    L_0x0029:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x001d }
        r2 = "Tried to use rear camera, but no rear camera detected";
        r0.<init>(r2);	 Catch:{ all -> 0x001d }
        throw r0;	 Catch:{ all -> 0x001d }
    L_0x0031:
        r3.C = r4;	 Catch:{ all -> 0x001d }
        r0 = 1;
        r3.c(r0);	 Catch:{ all -> 0x001d }
        r0 = r3.C;	 Catch:{ all -> 0x001d }
        if (r0 != 0) goto L_0x003d;
    L_0x003b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x000c;
    L_0x003d:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        r0 = r3.x;
        if (r0 == 0) goto L_0x000c;
    L_0x0042:
        r3.m();
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: iry.a(int):void");
    }

    public int h() {
        int i;
        synchronized (this.y) {
            i = this.C;
        }
        return i;
    }

    public int i() {
        int i;
        synchronized (this.y) {
            i = this.A.a;
        }
        return i;
    }

    public int j() {
        int i;
        synchronized (this.y) {
            i = this.A.b;
        }
        return i;
    }

    public void a(isa isa) {
        gwb.aJ();
        synchronized (this.y) {
            this.t.add(isa);
            if (this.A.a > 0) {
                isa.a(this.A.a, this.A.b);
            }
        }
    }

    public void b(isa isa) {
        gwb.aJ();
        synchronized (this.y) {
            this.t.remove(isa);
        }
    }

    public void b(boolean z) {
        this.E = true;
    }

    void k() {
        gwb.aJ();
        synchronized (this.y) {
            if (this.i) {
                iuc iuc;
                String valueOf;
                itx.a(3, "vclib", "Encoder caps=" + this.z.a + "x" + this.z.b);
                this.A = c();
                iuc c = c();
                if (f()) {
                    this.A = new iuc(this.A.b, this.A.a);
                    if (this instanceof iro) {
                        iuc = this.A;
                        for (isa a : this.t) {
                            a.a(this.A.a, this.A.b);
                        }
                        valueOf = String.valueOf(this.A);
                        itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 31).append("CaptureDimensions preview size=").append(valueOf).toString());
                        this.w.a(new itp().a(this.A.a, this.A.b, iuc.a, iuc.b).a((360 - o()) % 360));
                        this.w.c(this.C != 1);
                        return;
                    }
                }
                iuc = c;
                while (r4.hasNext()) {
                    a.a(this.A.a, this.A.b);
                }
                valueOf = String.valueOf(this.A);
                itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 31).append("CaptureDimensions preview size=").append(valueOf).toString());
                this.w.a(new itp().a(this.A.a, this.A.b, iuc.a, iuc.b).a((360 - o()) % 360));
                if (this.C != 1) {
                }
                this.w.c(this.C != 1);
                return;
            }
        }
    }

    private boolean f() {
        boolean z = false;
        synchronized (this.y) {
            if (this.h == 90 || this.h == 270) {
                if (this.D == 0 || this.D == 180) {
                    z = true;
                }
            } else {
                if (this.D == 90 || this.D == 270) {
                    z = true;
                }
            }
        }
        return z;
    }

    protected final void l() {
        gwb.a(this.a, true);
    }

    protected void m() {
        if (this.v != null) {
            this.v.removeCallbacks(this.f);
            this.v.post(this.f);
        }
    }

    protected void c(boolean z) {
        if (this.v != null) {
            this.v.removeCallbacks(this.f);
            if (z) {
                this.v.post(this.g);
                return;
            }
        }
        this.g.run();
    }

    protected final void b(int i) {
        synchronized (this.y) {
            this.i = true;
            this.h = i;
        }
        itx.a(3, "vclib", "Reporting camera open event");
        gwb.a(this.b, true);
        gwb.a(this.d, true);
    }

    protected final void n() {
        synchronized (this.y) {
            this.i = false;
        }
        itx.a(3, "vclib", "Reporting camera close event");
        gwb.a(this.c, true);
    }

    protected final int o() {
        switch (((WindowManager) this.r.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 0:
                return 0;
            case 1:
                return 90;
            case 2:
                return 180;
            case 3:
                return 270;
            default:
                itx.a("vclib", "Bad rotation");
                return 0;
        }
    }
}
