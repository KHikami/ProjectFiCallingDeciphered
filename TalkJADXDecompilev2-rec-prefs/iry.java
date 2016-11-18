package p000;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.WindowManager;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class iry implements ito {
    public iuc f18785A = new iuc(0, 0);
    public iuc f18786B = new iuc(16, 10);
    public int f18787C = 0;
    int f18788D = 0;
    boolean f18789E = true;
    private final ise f18790a;
    private final isf f18791b;
    private final isd f18792c;
    private final isg f18793d;
    private final isc f18794e;
    private final isb f18795f;
    private final irz f18796g;
    private int f18797h = 0;
    private boolean f18798i;
    public final Context f18799r;
    public itr f18800s;
    final List<isa> f18801t;
    public HandlerThread f18802u;
    public Handler f18803v;
    public itq f18804w;
    public boolean f18805x;
    public final Object f18806y = new Object();
    public its f18807z;

    public abstract boolean mo3387a();

    public abstract boolean mo3388b();

    protected abstract iuc mo3389c();

    protected abstract void mo3390d();

    protected abstract void mo3391e();

    protected iry(Context context) {
        this.f18799r = context;
        this.f18801t = new CopyOnWriteArrayList();
        this.f18795f = new isb(this);
        this.f18796g = new irz(this);
        this.f18790a = new ise(this);
        this.f18791b = new isf(this);
        this.f18792c = new isd(this);
        this.f18793d = new isg(this);
        this.f18794e = new isc(this);
        this.f18788D = m23077o();
    }

    public void mo1321a(ite ite, itq itq) {
        gwb.aJ();
        synchronized (this.f18806y) {
            this.f18802u = new HandlerThread("CameraOpenThread");
            this.f18802u.start();
            this.f18803v = new Handler(this.f18802u.getLooper());
            this.f18794e.enable();
            this.f18807z = itq.mo3288l();
            this.f18804w = itq;
        }
    }

    public void mo1320a(ite ite) {
        gwb.aJ();
        synchronized (this.f18806y) {
            this.f18804w = null;
            this.f18794e.disable();
            m23066c(false);
            synchronized (this.f18806y) {
                this.f18802u.quit();
                this.f18802u = null;
                this.f18803v = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m23059a(boolean z) {
        boolean z2 = false;
        gwb.aJ();
        this.f18805x = z;
        synchronized (this.f18806y) {
            if (this.f18787C == 0) {
                int i = mo3387a() ? 1 : mo3388b() ? 2 : 0;
                this.f18787C = i;
            }
            if (this.f18787C == 0) {
                itx.m23277a(6, "vclib", "No camera supported on this device, can not enable");
            } else if (this.f18804w == null) {
            }
        }
    }

    public boolean mo1322g() {
        return this.f18805x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m23055a(int i) {
        gwb.aJ();
        synchronized (this.f18806y) {
            if (i == this.f18787C) {
            } else if (i != 1 || mo3387a()) {
                if (i == 2) {
                    if (!mo3388b()) {
                        throw new IllegalStateException("Tried to use rear camera, but no rear camera detected");
                    }
                }
                this.f18787C = i;
                m23066c(true);
                if (this.f18787C == 0) {
                }
            } else {
                throw new IllegalStateException("Tried to use front camera, but no front camera detected");
            }
        }
    }

    public int m23070h() {
        int i;
        synchronized (this.f18806y) {
            i = this.f18787C;
        }
        return i;
    }

    public int m23071i() {
        int i;
        synchronized (this.f18806y) {
            i = this.f18785A.f19032a;
        }
        return i;
    }

    public int m23072j() {
        int i;
        synchronized (this.f18806y) {
            i = this.f18785A.f19033b;
        }
        return i;
    }

    public void m23056a(isa isa) {
        gwb.aJ();
        synchronized (this.f18806y) {
            this.f18801t.add(isa);
            if (this.f18785A.f19032a > 0) {
                isa.mo1433a(this.f18785A.f19032a, this.f18785A.f19033b);
            }
        }
    }

    public void m23062b(isa isa) {
        gwb.aJ();
        synchronized (this.f18806y) {
            this.f18801t.remove(isa);
        }
    }

    public void m23063b(boolean z) {
        this.f18789E = true;
    }

    void m23073k() {
        gwb.aJ();
        synchronized (this.f18806y) {
            if (this.f18798i) {
                iuc iuc;
                String valueOf;
                itx.m23277a(3, "vclib", "Encoder caps=" + this.f18807z.f19000a + "x" + this.f18807z.f19001b);
                this.f18785A = mo3389c();
                iuc c = mo3389c();
                if (mo3393f()) {
                    this.f18785A = new iuc(this.f18785A.f19033b, this.f18785A.f19032a);
                    if (this instanceof iro) {
                        iuc = this.f18785A;
                        for (isa a : this.f18801t) {
                            a.mo1433a(this.f18785A.f19032a, this.f18785A.f19033b);
                        }
                        valueOf = String.valueOf(this.f18785A);
                        itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 31).append("CaptureDimensions preview size=").append(valueOf).toString());
                        this.f18804w.mo3283a(new itp().m23260a(this.f18785A.f19032a, this.f18785A.f19033b, iuc.f19032a, iuc.f19033b).m23258a((360 - m23077o()) % 360));
                        this.f18804w.mo3287c(this.f18787C != 1);
                        return;
                    }
                }
                iuc = c;
                while (r4.hasNext()) {
                    a.mo1433a(this.f18785A.f19032a, this.f18785A.f19033b);
                }
                valueOf = String.valueOf(this.f18785A);
                itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 31).append("CaptureDimensions preview size=").append(valueOf).toString());
                this.f18804w.mo3283a(new itp().m23260a(this.f18785A.f19032a, this.f18785A.f19033b, iuc.f19032a, iuc.f19033b).m23258a((360 - m23077o()) % 360));
                if (this.f18787C != 1) {
                }
                this.f18804w.mo3287c(this.f18787C != 1);
                return;
            }
        }
    }

    private boolean mo3393f() {
        boolean z = false;
        synchronized (this.f18806y) {
            if (this.f18797h == 90 || this.f18797h == 270) {
                if (this.f18788D == 0 || this.f18788D == 180) {
                    z = true;
                }
            } else {
                if (this.f18788D == 90 || this.f18788D == 270) {
                    z = true;
                }
            }
        }
        return z;
    }

    protected final void m23074l() {
        gwb.m1865a(this.f18790a, true);
    }

    protected void m23075m() {
        if (this.f18803v != null) {
            this.f18803v.removeCallbacks(this.f18795f);
            this.f18803v.post(this.f18795f);
        }
    }

    protected void m23066c(boolean z) {
        if (this.f18803v != null) {
            this.f18803v.removeCallbacks(this.f18795f);
            if (z) {
                this.f18803v.post(this.f18796g);
                return;
            }
        }
        this.f18796g.run();
    }

    protected final void m23061b(int i) {
        synchronized (this.f18806y) {
            this.f18798i = true;
            this.f18797h = i;
        }
        itx.m23277a(3, "vclib", "Reporting camera open event");
        gwb.m1865a(this.f18791b, true);
        gwb.m1865a(this.f18793d, true);
    }

    protected final void m23076n() {
        synchronized (this.f18806y) {
            this.f18798i = false;
        }
        itx.m23277a(3, "vclib", "Reporting camera close event");
        gwb.m1865a(this.f18792c, true);
    }

    protected final int m23077o() {
        switch (((WindowManager) this.f18799r.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 0:
                return 0;
            case 1:
                return 90;
            case 2:
                return 180;
            case 3:
                return 270;
            default:
                itx.m23280a("vclib", "Bad rotation");
                return 0;
        }
    }
}
