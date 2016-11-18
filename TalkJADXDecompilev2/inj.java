package defpackage;

import android.graphics.RectF;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.libraries.hangouts.video.internal.GlRemoteRenderer;
import com.google.android.libraries.hangouts.video.internal.GlRemoteRenderer.RendererFrameOutputData;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;
import com.google.android.libraries.hangouts.video.internal.Renderer;
import com.google.android.libraries.hangouts.video.internal.RendererManager;

public final class inj extends iok implements ime {
    final ijt a;
    final MediaCodecDecoder b;
    final imo c;
    final GlRemoteRenderer d;
    Renderer e;
    int f;
    int g;
    Surface h;
    private final RendererManager i;
    private final ijf j;
    private final inq k = new inq(this);
    private final inp t = new inp(this);
    private final inr u = new inr(this);
    private final ins v = new ins(this);
    private final RendererFrameOutputData w = new RendererFrameOutputData();
    private final boolean x;
    private boolean y;

    public inj(ijn ijn, ind ind) {
        int i;
        super(ind, ijn.f());
        this.a = ijn.e();
        this.i = ijn.g();
        this.j = (ijf) this.a.f().a(ijf.class);
        ijn.o();
        this.x = icb.a(ijn.a().getContentResolver(), "babel_hangout_hardware_decode_use_gl", false);
        this.o = ind.c().o();
        if (ind.c().m().isEmpty()) {
            i = 0;
        } else {
            i = ((Integer) ind.c().m().get(0)).intValue();
        }
        this.f = i;
        this.b = ijn.i().a((ime) this);
        if (!(this.b == null || this.f == 0)) {
            this.b.d(this.f);
        }
        if (this.x || this.b == null) {
            itx.a("vclib", "%s: Decoding video directly to surface is not supported.", f());
            this.c = null;
        } else {
            itx.a("vclib", "%s: Decoding video directly to surface is supported.", f());
            this.c = new imo(this.i, this.b, this);
        }
        this.d = new GlRemoteRenderer(this.i, this.b, this.m, this);
        this.e = this.d;
        this.m.a(new ink(this));
        if (this.f != 0) {
            l();
        }
        String valueOf = String.valueOf(ind.a());
        mab mab = (mab) this.j.b().get(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(2).toString());
        if (mab != null) {
            a(mab);
        }
        this.a.a(this.t);
        this.j.a(this.k);
    }

    public void b() {
        this.y = false;
        this.a.b(this.t);
        this.j.b(this.k);
        this.m.c(this);
        if (this.d != null) {
            this.d.e();
        }
        if (this.c != null) {
            this.c.b();
        }
        if (this.b != null) {
            this.b.l();
        }
        if (this.h != null) {
            this.h.release();
            this.h = null;
        }
        this.m.a(new inl(this));
    }

    void c() {
        this.b.e().post(new inn(this));
    }

    public void a(Object obj) {
        super.a(obj);
        iil.b("Cannot bind to a null surface", obj);
        if (this.e == this.d) {
            itx.a("vclib", "Rendering %s using opengl", this.l.a());
            this.m.b((iok) this);
            l();
        } else {
            itx.a("vclib", "Rendering %s using mediacodec", this.l.a());
            c();
        }
        this.y = true;
    }

    void b(int i) {
        if (i != this.f) {
            itx.a("vclib", "Updating ssrc for %s", this.l.a());
            this.m.a(new ino(this, i));
        }
    }

    public boolean d() {
        return this.y;
    }

    private void m() {
        itp itp = (itp) this.n.get();
        float f = (float) this.w.frameWidth;
        float f2 = (float) this.w.frameHeight;
        if (((float) itp.b()) != f || ((float) itp.c()) != f2) {
            itp = itp.a();
            itp.a(this.w.frameWidth, this.w.frameHeight);
            if (this.w.cropRight > 0 || this.w.cropBottom > 0) {
                itp.b(new RectF(((float) this.w.cropLeft) / f, ((float) this.w.cropTop) / f2, ((f - 1.0f) - ((float) this.w.cropRight)) / f, ((f2 - 1.0f) - ((float) this.w.cropBottom)) / f2));
            } else {
                itp.b(new RectF());
            }
            this.n.set(itp);
        }
    }

    boolean e() {
        boolean z = false;
        if (this.f != 0) {
            if (this.e == this.d) {
                z = this.d.a(this.w);
                if (z && this.w.frameWidth > 0 && this.w.frameHeight > 0) {
                    m();
                }
            } else {
                itx.a(6, "vclib", "Something is calling RemoteVideoSource.processFrame but we aren't rendering with GL.");
            }
        }
        return z;
    }

    public void a(boolean z) {
        super.a(z);
        l();
    }

    public String f() {
        String str = "Remote:";
        String valueOf = String.valueOf(this.l.a());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    int g() {
        if (this.e == this.d) {
            return this.d.c();
        }
        itx.a(6, "vclib", "Something is using RemoteVideoSource's texture name but we aren't rendering with GL.");
        return -1;
    }

    boolean h() {
        if (this.e == this.d) {
            return this.d.d();
        }
        itx.a(6, "vclib", "Something is using RemoteVideoSource's texture type but we aren't rendering with GL.");
        return false;
    }

    float[] i() {
        if (this.e == this.d) {
            return this.d.f();
        }
        itx.a(6, "vclib", "Something is using RemoteVideoSource's transform but we aren't rendering with GL.");
        return ity.a;
    }

    public void j() {
        if (this.e == this.c) {
            this.c.a();
        } else {
            this.d.g();
        }
    }

    void a(mab mab) {
        float f = 0.0f;
        itp a = ((itp) this.n.get()).a();
        if (mab.g == null || mab.g.c == null || mab.g.c.length == 0) {
            a.a(new RectF());
            a.a(false);
        } else {
            float f2 = 1.0f;
            float f3 = 1.0f;
            float f4 = 0.0f;
            for (mag mag : mab.g.c) {
                f3 = Math.min(mag.a.floatValue(), f3);
                f2 = Math.min(mag.b.floatValue(), f2);
                f4 = Math.max(mag.c.floatValue(), f4);
                f = Math.max(mag.d.floatValue(), f);
            }
            a.a(new RectF(f3, f2, f4, f));
            a.a(gwb.a(mab.g.a) == 2);
        }
        this.n.set(a);
    }

    int k() {
        if (this.b != null) {
            int f = this.b.f();
            if (f != -1) {
                return f;
            }
        }
        return 0;
    }

    public void a(int i) {
        itx.a("vclib", "%s: Codec type switched to: %s", f(), Integer.valueOf(i));
        l();
        if (!this.x) {
            gwb.b(this.v);
            gwb.a(this.v, 10);
        }
    }

    public void a(MediaFormat mediaFormat) {
        itp a = ((itp) this.n.get()).a();
        inj.a(mediaFormat, a);
        this.n.set(a);
    }

    public void a() {
        if (!this.x) {
            gwb.b(this.v);
            gwb.a(this.v, 10);
        }
    }

    public static void a(MediaFormat mediaFormat, itp itp) {
        int integer;
        int i = 0;
        int integer2 = mediaFormat.getInteger("width");
        int integer3 = mediaFormat.getInteger("height");
        itp.a(integer2, integer3);
        int integer4 = mediaFormat.containsKey("crop-left") ? mediaFormat.getInteger("crop-left") : 0;
        if (mediaFormat.containsKey("crop-top")) {
            integer = mediaFormat.getInteger("crop-top");
        } else {
            integer = 0;
        }
        int integer5 = mediaFormat.containsKey("crop-right") ? mediaFormat.getInteger("crop-right") : integer2 - 1;
        int integer6 = mediaFormat.containsKey("crop-bottom") ? mediaFormat.getInteger("crop-bottom") : integer3 - 1;
        if (integer4 < 0 || integer4 >= integer2 || integer < 0 || integer >= integer3 || integer5 < 0 || integer5 >= integer2 || integer6 < 0 || integer6 >= integer3) {
            itx.c("vclib", "Unexpected crop values: width: %d height: %d crop-left: %d crop-top: %d crop-right: %d crop-bottom: %d", Integer.valueOf(integer2), Integer.valueOf(integer3), Integer.valueOf(integer4), Integer.valueOf(integer), Integer.valueOf(integer5), Integer.valueOf(integer6));
            integer5 = integer2 - 1;
            integer4 = integer3 - 1;
            integer = 0;
        } else {
            i = integer4;
            integer4 = integer6;
        }
        if (integer5 > 0 || integer4 > 0) {
            itp.b(new RectF(((float) i) / ((float) integer2), ((float) integer) / ((float) integer3), ((float) ((integer2 - 1) - integer5)) / ((float) integer2), ((float) ((integer3 - 1) - integer4)) / ((float) integer3)));
        } else {
            itp.b(new RectF());
        }
    }

    public void c(int i) {
        this.g = i;
        l();
    }

    public void l() {
        gwb.b(this.u);
        gwb.a(this.u, 100);
    }
}
