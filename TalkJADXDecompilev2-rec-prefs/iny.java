package p000;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.libraries.hangouts.video.internal.EncoderManager;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class iny extends iok implements ilb, itq {
    private int f18202A = 1;
    private float[] f18203B = ity.f19013a;
    private float[] f18204C = new float[16];
    private float[] f18205D = new float[16];
    private boolean f18206E;
    final imy f18207a;
    final AtomicInteger f18208b = new AtomicInteger(0);
    final Runnable f18209c = new inz(this);
    final AtomicBoolean f18210d = new AtomicBoolean(false);
    int f18211e = 0;
    SurfaceTexture f18212f;
    Surface f18213g;
    ila f18214h;
    boolean f18215i;
    itr f18216j;
    itt f18217k = new itt();
    private final ioj f18218t = new ioj(this);
    private final ijn f18219u;
    private final EncoderManager f18220v;
    private final Object f18221w = new Object();
    private final AtomicReference<itp> f18222x = new AtomicReference(new itp());
    private long f18223y = -1;
    private volatile long f18224z = -1;

    public iny(ijn ijn) {
        super(ijn.m21966d().m22346d(), ijn.m21968f());
        this.f18219u = ijn;
        this.f18207a = new imy(ijn);
        this.f18220v = ijn.m21970h();
        ijn.m21967e().m22037a(this.f18218t);
        this.m.m22233a(new iob(this));
        if (ijn.m21967e().m22072d()) {
            this.f18215i = true;
            m22444k();
        }
    }

    public void m22435c() {
        this.f18219u.m21967e().m22056b(this.f18218t);
        this.f18207a.m22320a();
        this.m.m22233a(new ioc(this));
    }

    public void mo3275b() {
        this.f18217k.f19006a = null;
        this.m.m22233a(new iod(this));
        if (m22425s()) {
            gwb.m1865a(this.f18209c, true);
        } else {
            this.m.m22236c(this);
        }
        mo3283a((itp) this.f18222x.get());
    }

    void m22437d() {
        mo3282a(-1);
        mo3287c(false);
        mo3284a(null);
        mo3285b(1);
        mo3283a(new itp());
    }

    public void mo3273a(Object obj) {
        if (!obj.equals(this.p)) {
            super.mo3273a(obj);
            if (obj instanceof SurfaceTexture) {
                this.f18217k.f19006a = (SurfaceTexture) obj;
            }
            if (m22425s()) {
                gwb.m1865a(this.f18209c, true);
            } else {
                this.m.m22235b((iok) this);
            }
            mo3283a((itp) this.f18222x.get());
        }
    }

    void m22443j() {
        synchronized (this.f18221w) {
            this.f18211e = gwb.av();
            this.f18212f = new SurfaceTexture(this.f18211e);
            if (((itp) this.f18222x.get()).m23266d() > 0) {
                this.f18212f.setDefaultBufferSize(((itp) this.f18222x.get()).m23266d(), ((itp) this.f18222x.get()).m23267e());
            }
            this.f18213g = new Surface(this.f18212f);
            this.f18217k.f19007b.add(this.f18213g);
            this.f18217k.f19008c = this.f18212f;
            this.f18212f.setOnFrameAvailableListener(new ioe(this));
            gwb.m1865a(this.f18209c, true);
            this.f18214h = this.f18220v.m10311a(this.f18219u, (ilb) this);
            this.f18214h.mo1312a();
            m22446m();
        }
    }

    public boolean mo3276e() {
        boolean z;
        long j;
        boolean z2;
        iil.m21875b("Attempted to processFrame without initializing.", this.f18212f);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = 0;
        boolean andSet = this.f18208b.getAndSet(0);
        if (andSet <= false) {
            try {
                this.f18212f.updateTexImage();
                this.f18212f.getTransformMatrix(this.f18205D);
                ity.m23290a(this.f18205D, this.f18203B, this.f18204C);
                j2 = this.f18212f.getTimestamp();
                if (andSet > true) {
                    itx.m23277a(3, "vclib", "Skipped encoding " + (andSet - 1) + " frames");
                }
            } catch (Throwable e) {
                itx.m23281a("vclib", "Failed to updateTexImage", e);
                return false;
            }
        }
        int g = mo3278g();
        if (this.o || g == 0) {
            z = false;
            j = j2;
            z2 = false;
        } else if (this.f18224z == -1) {
            z = andSet;
            j = j2;
            z2 = true;
        } else {
            if (elapsedRealtime >= this.f18223y + this.f18224z) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = andSet;
            j = 1000000 * elapsedRealtime;
        }
        if (z2) {
            this.f18223y = elapsedRealtime;
            if (!this.f18214h.mo1315a(this.f18211e, j, true, this.f18204C)) {
                itx.m23277a(5, "vclib", "Failed to encode frame.");
            }
        }
        if (this.f18224z != -1) {
            this.m.m22232a(this, Math.max(1, this.f18224z - (SystemClock.elapsedRealtime() - elapsedRealtime)));
        }
        if (z <= false) {
            return true;
        }
        return false;
    }

    public String mo3277f() {
        return "InputCapture";
    }

    public int mo3278g() {
        return this.f18211e;
    }

    float[] mo3280i() {
        return this.f18204C;
    }

    public boolean mo3279h() {
        return true;
    }

    public void mo3286b(boolean z) {
        mo3274a(z);
        m22444k();
    }

    void m22444k() {
        if (this.f18215i) {
            this.f18219u.m21967e().m22045a(this.o);
        }
    }

    public its mo3288l() {
        its its = new its();
        iud c = iks.m22205c(m22426t());
        its.f19000a = c.m23302a().f19032a;
        its.f19001b = c.m23302a().f19033b;
        its.f19002c = c.m23304c();
        c = iks.m22201a();
        its.f19003d = c.m23302a().f19032a;
        its.f19004e = c.m23302a().f19033b;
        its.f19005f = c.m23304c();
        return its;
    }

    public void mo3283a(itp itp) {
        if (itp.equals((itp) this.f18222x.get()) && this.f18206E == m22425s()) {
            gwb.m1865a(this.f18209c, true);
            return;
        }
        itx.m23279a(3, "vclib", "Changing capture format from %s to %s", this.f18222x.get(), itp);
        this.f18222x.set(itp);
        gwb.m1863a(new iof(this, itp.m23271i()));
        this.m.m22233a(new iog(this));
        itp a = itp.m23257a();
        this.f18206E = m22425s();
        if (!this.f18206E) {
            a.m23258a(0);
            a.m23259a(itp.m23263b(), itp.m23265c());
        }
        this.n.set(a);
    }

    public void mo3282a(int i) {
        if (i == -1) {
            this.f18224z = -1;
        } else {
            this.f18224z = (long) (1000 / i);
        }
    }

    public void mo3287c(boolean z) {
        this.m.m22233a(new ioh(this, z));
    }

    public void mo3284a(itr itr) {
        this.f18216j = itr;
        gwb.m1865a(this.f18209c, true);
    }

    public void mo3285b(int i) {
        if (this.f18202A != i) {
            this.f18202A = i;
            mo3283a((itp) this.f18222x.get());
            gwb.m1865a(this.f18209c, true);
        }
    }

    private boolean m22425s() {
        return this.f18202A > 1 && this.p != null;
    }

    private int m22426t() {
        if (this.f18214h != null) {
            int b = this.f18214h.mo1316b();
            if (b != -1) {
                return b;
            }
        }
        return 0;
    }

    void m22446m() {
        itp itp = (itp) this.f18222x.get();
        if (itp.m23263b() == 0 || itp.m23265c() == 0) {
            itx.m23277a(3, "vclib", "Ignoring capture size area of 0");
            return;
        }
        iuc iuc = new iuc(itp.m23263b(), itp.m23265c());
        this.f18212f.setDefaultBufferSize(itp.m23266d(), itp.m23267e());
        if (this.f18214h != null) {
            this.f18214h.mo1313a(iuc.f19032a, iuc.f19033b, itp.m23271i());
        }
        this.f18203B = ity.m23291a(itp.m23270h());
    }

    public void mo3281a() {
        m22446m();
        if (this.f18216j != null) {
            gwb.m1863a(new ioa(this));
        }
    }
}
