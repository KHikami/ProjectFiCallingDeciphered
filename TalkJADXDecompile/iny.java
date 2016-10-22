import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.libraries.hangouts.video.internal.EncoderManager;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class iny extends iok implements ilb, itq {
    private int A;
    private float[] B;
    private float[] C;
    private float[] D;
    private boolean E;
    final imy a;
    final AtomicInteger b;
    final Runnable c;
    final AtomicBoolean d;
    int e;
    SurfaceTexture f;
    Surface g;
    ila h;
    boolean i;
    itr j;
    itt k;
    private final ioj t;
    private final ijn u;
    private final EncoderManager v;
    private final Object w;
    private final AtomicReference<itp> x;
    private long y;
    private volatile long z;

    public iny(ijn ijn) {
        super(ijn.d().d(), ijn.f());
        this.t = new ioj(this);
        this.w = new Object();
        this.b = new AtomicInteger(0);
        this.x = new AtomicReference(new itp());
        this.c = new inz(this);
        this.d = new AtomicBoolean(false);
        this.e = 0;
        this.y = -1;
        this.z = -1;
        this.k = new itt();
        this.A = 1;
        this.B = ity.a;
        this.C = new float[16];
        this.D = new float[16];
        this.u = ijn;
        this.a = new imy(ijn);
        this.v = ijn.h();
        ijn.e().a(this.t);
        this.m.a(new iob(this));
        if (ijn.e().d()) {
            this.i = true;
            k();
        }
    }

    public void c() {
        this.u.e().b(this.t);
        this.a.a();
        this.m.a(new ioc(this));
    }

    public void b() {
        this.k.a = null;
        this.m.a(new iod(this));
        if (s()) {
            gwb.a(this.c, true);
        } else {
            this.m.c(this);
        }
        a((itp) this.x.get());
    }

    void d() {
        a(-1);
        c(false);
        a(null);
        b(1);
        a(new itp());
    }

    public void a(Object obj) {
        if (!obj.equals(this.p)) {
            super.a(obj);
            if (obj instanceof SurfaceTexture) {
                this.k.a = (SurfaceTexture) obj;
            }
            if (s()) {
                gwb.a(this.c, true);
            } else {
                this.m.b((iok) this);
            }
            a((itp) this.x.get());
        }
    }

    void j() {
        synchronized (this.w) {
            this.e = gwb.av();
            this.f = new SurfaceTexture(this.e);
            if (((itp) this.x.get()).d() > 0) {
                this.f.setDefaultBufferSize(((itp) this.x.get()).d(), ((itp) this.x.get()).e());
            }
            this.g = new Surface(this.f);
            this.k.b.add(this.g);
            this.k.c = this.f;
            this.f.setOnFrameAvailableListener(new ioe(this));
            gwb.a(this.c, true);
            this.h = this.v.a(this.u, (ilb) this);
            this.h.a();
            m();
        }
    }

    public boolean e() {
        boolean z;
        long j;
        boolean z2;
        iil.b("Attempted to processFrame without initializing.", this.f);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = 0;
        boolean andSet = this.b.getAndSet(0);
        if (andSet <= false) {
            try {
                this.f.updateTexImage();
                this.f.getTransformMatrix(this.D);
                ity.a(this.D, this.B, this.C);
                j2 = this.f.getTimestamp();
                if (andSet > true) {
                    itx.a(3, "vclib", "Skipped encoding " + (andSet - 1) + " frames");
                }
            } catch (Throwable e) {
                itx.a("vclib", "Failed to updateTexImage", e);
                return false;
            }
        }
        int g = g();
        if (this.o || g == 0) {
            z = false;
            j = j2;
            z2 = false;
        } else if (this.z == -1) {
            z = andSet;
            j = j2;
            z2 = true;
        } else {
            if (elapsedRealtime >= this.y + this.z) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = andSet;
            j = 1000000 * elapsedRealtime;
        }
        if (z2) {
            this.y = elapsedRealtime;
            if (!this.h.a(this.e, j, true, this.C)) {
                itx.a(5, "vclib", "Failed to encode frame.");
            }
        }
        if (this.z != -1) {
            this.m.a(this, Math.max(1, this.z - (SystemClock.elapsedRealtime() - elapsedRealtime)));
        }
        if (z <= false) {
            return true;
        }
        return false;
    }

    public String f() {
        return "InputCapture";
    }

    public int g() {
        return this.e;
    }

    float[] i() {
        return this.C;
    }

    public boolean h() {
        return true;
    }

    public void b(boolean z) {
        a(z);
        k();
    }

    void k() {
        if (this.i) {
            this.u.e().a(this.o);
        }
    }

    public its l() {
        its its = new its();
        iud c = iks.c(t());
        its.a = c.a().a;
        its.b = c.a().b;
        its.c = c.c();
        c = iks.a();
        its.d = c.a().a;
        its.e = c.a().b;
        its.f = c.c();
        return its;
    }

    public void a(itp itp) {
        if (itp.equals((itp) this.x.get()) && this.E == s()) {
            gwb.a(this.c, true);
            return;
        }
        itx.a(3, "vclib", "Changing capture format from %s to %s", this.x.get(), itp);
        this.x.set(itp);
        gwb.a(new iof(this, itp.i()));
        this.m.a(new iog(this));
        itp a = itp.a();
        this.E = s();
        if (!this.E) {
            a.a(0);
            a.a(itp.b(), itp.c());
        }
        this.n.set(a);
    }

    public void a(int i) {
        if (i == -1) {
            this.z = -1;
        } else {
            this.z = (long) (1000 / i);
        }
    }

    public void c(boolean z) {
        this.m.a(new ioh(this, z));
    }

    public void a(itr itr) {
        this.j = itr;
        gwb.a(this.c, true);
    }

    public void b(int i) {
        if (this.A != i) {
            this.A = i;
            a((itp) this.x.get());
            gwb.a(this.c, true);
        }
    }

    private boolean s() {
        return this.A > 1 && this.p != null;
    }

    private int t() {
        if (this.h != null) {
            int b = this.h.b();
            if (b != -1) {
                return b;
            }
        }
        return 0;
    }

    void m() {
        itp itp = (itp) this.x.get();
        if (itp.b() == 0 || itp.c() == 0) {
            itx.a(3, "vclib", "Ignoring capture size area of 0");
            return;
        }
        iuc iuc = new iuc(itp.b(), itp.c());
        this.f.setDefaultBufferSize(itp.d(), itp.e());
        if (this.h != null) {
            this.h.a(iuc.a, iuc.b, itp.i());
        }
        this.B = ity.a(itp.h());
    }

    public void a() {
        m();
        if (this.j != null) {
            gwb.a(new ioa(this));
        }
    }
}
