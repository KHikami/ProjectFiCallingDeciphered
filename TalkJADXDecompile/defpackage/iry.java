package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.WindowManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: iry */
public abstract class iry implements ito {
    public iuc A;
    public iuc B;
    public int C;
    int D;
    boolean E;
    private final ise a;
    private final isf b;
    private final isd c;
    private final isg d;
    private final isc e;
    private final isb f;
    private final irz g;
    private int h;
    private boolean i;
    public final Context r;
    public itr s;
    final List<isa> t;
    public HandlerThread u;
    public Handler v;
    public itq w;
    public boolean x;
    public final Object y;
    public its z;

    public abstract boolean a();

    public abstract boolean b();

    protected abstract iuc c();

    protected abstract void d();

    protected abstract void e();

    protected iry(Context context) {
        this.y = new Object();
        this.A = new iuc(0, 0);
        this.B = new iuc(16, 10);
        this.C = 0;
        this.h = 0;
        this.D = 0;
        this.E = true;
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

    public void a(boolean z) {
        boolean z2 = false;
        gwb.aJ();
        this.x = z;
        synchronized (this.y) {
            if (this.C == 0) {
                int i = a() ? 1 : b() ? 2 : 0;
                this.C = i;
            }
            if (this.C == 0) {
                itx.a(6, "vclib", "No camera supported on this device, can not enable");
            } else if (this.w == null) {
            } else {
                itq itq = this.w;
                if (!z) {
                    z2 = true;
                }
                itq.b(z2);
                if (z) {
                    m();
                } else {
                    c(true);
                }
            }
        }
    }

    public boolean g() {
        return this.x;
    }

    public void a(int i) {
        gwb.aJ();
        synchronized (this.y) {
            if (i == this.C) {
            } else if (i != 1 || a()) {
                if (i == 2) {
                    if (!b()) {
                        throw new IllegalStateException("Tried to use rear camera, but no rear camera detected");
                    }
                }
                this.C = i;
                c(true);
                if (this.C == 0) {
                    return;
                }
                if (this.x) {
                    m();
                }
            } else {
                throw new IllegalStateException("Tried to use front camera, but no front camera detected");
            }
        }
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
            case wi.w /*0*/:
                return 0;
            case wi.j /*1*/:
                return 90;
            case wi.l /*2*/:
                return 180;
            case wi.z /*3*/:
                return 270;
            default:
                itx.a("vclib", "Bad rotation");
                return 0;
        }
    }
}
