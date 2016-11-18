package p000;

import android.graphics.RectF;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.libraries.hangouts.video.internal.GlRemoteRenderer;
import com.google.android.libraries.hangouts.video.internal.GlRemoteRenderer.RendererFrameOutputData;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;
import com.google.android.libraries.hangouts.video.internal.Renderer;
import com.google.android.libraries.hangouts.video.internal.RendererManager;

public final class inj extends iok implements ime {
    final ijt f18137a;
    final MediaCodecDecoder f18138b;
    final imo f18139c;
    final GlRemoteRenderer f18140d;
    Renderer f18141e;
    int f18142f;
    int f18143g;
    Surface f18144h;
    private final RendererManager f18145i;
    private final ijf f18146j;
    private final inq f18147k = new inq(this);
    private final inp f18148t = new inp(this);
    private final inr f18149u = new inr(this);
    private final ins f18150v = new ins(this);
    private final RendererFrameOutputData f18151w = new RendererFrameOutputData();
    private final boolean f18152x;
    private boolean f18153y;

    public inj(ijn ijn, ind ind) {
        int i;
        super(ind, ijn.m21968f());
        this.f18137a = ijn.m21967e();
        this.f18145i = ijn.m21969g();
        this.f18146j = (ijf) this.f18137a.m22077f().m21926a(ijf.class);
        ijn.mo3224o();
        this.f18152x = icb.m21567a(ijn.m21949a().getContentResolver(), "babel_hangout_hardware_decode_use_gl", false);
        this.o = ind.m22335c().m22973o();
        if (ind.m22335c().m22971m().isEmpty()) {
            i = 0;
        } else {
            i = ((Integer) ind.m22335c().m22971m().get(0)).intValue();
        }
        this.f18142f = i;
        this.f18138b = ijn.m21971i().m10304a((ime) this);
        if (!(this.f18138b == null || this.f18142f == 0)) {
            this.f18138b.m10380d(this.f18142f);
        }
        if (this.f18152x || this.f18138b == null) {
            itx.m23282a("vclib", "%s: Decoding video directly to surface is not supported.", mo3277f());
            this.f18139c = null;
        } else {
            itx.m23282a("vclib", "%s: Decoding video directly to surface is supported.", mo3277f());
            this.f18139c = new imo(this.f18145i, this.f18138b, this);
        }
        this.f18140d = new GlRemoteRenderer(this.f18145i, this.f18138b, this.m, this);
        this.f18141e = this.f18140d;
        this.m.m22233a(new ink(this));
        if (this.f18142f != 0) {
            m22387l();
        }
        String valueOf = String.valueOf(ind.m22332a());
        mab mab = (mab) this.f18146j.mo3365b().get(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(2).toString());
        if (mab != null) {
            m22373a(mab);
        }
        this.f18137a.m22037a(this.f18148t);
        this.f18146j.mo3363a(this.f18147k);
    }

    public void mo3275b() {
        this.f18153y = false;
        this.f18137a.m22056b(this.f18148t);
        this.f18146j.mo3366b(this.f18147k);
        this.m.m22236c(this);
        if (this.f18140d != null) {
            this.f18140d.m10321e();
        }
        if (this.f18139c != null) {
            this.f18139c.m22314b();
        }
        if (this.f18138b != null) {
            this.f18138b.m10388l();
        }
        if (this.f18144h != null) {
            this.f18144h.release();
            this.f18144h = null;
        }
        this.m.m22233a(new inl(this));
    }

    void m22377c() {
        this.f18138b.m10381e().post(new inn(this));
    }

    public void mo3273a(Object obj) {
        super.mo3273a(obj);
        iil.m21875b("Cannot bind to a null surface", obj);
        if (this.f18141e == this.f18140d) {
            itx.m23282a("vclib", "Rendering %s using opengl", this.l.m22332a());
            this.m.m22235b((iok) this);
            m22387l();
        } else {
            itx.m23282a("vclib", "Rendering %s using mediacodec", this.l.m22332a());
            m22377c();
        }
        this.f18153y = true;
    }

    void m22376b(int i) {
        if (i != this.f18142f) {
            itx.m23282a("vclib", "Updating ssrc for %s", this.l.m22332a());
            this.m.m22233a(new ino(this, i));
        }
    }

    public boolean m22379d() {
        return this.f18153y;
    }

    private void m22368m() {
        itp itp = (itp) this.n.get();
        float f = (float) this.f18151w.frameWidth;
        float f2 = (float) this.f18151w.frameHeight;
        if (((float) itp.m23263b()) != f || ((float) itp.m23265c()) != f2) {
            itp = itp.m23257a();
            itp.m23259a(this.f18151w.frameWidth, this.f18151w.frameHeight);
            if (this.f18151w.cropRight > 0 || this.f18151w.cropBottom > 0) {
                itp.m23264b(new RectF(((float) this.f18151w.cropLeft) / f, ((float) this.f18151w.cropTop) / f2, ((f - 1.0f) - ((float) this.f18151w.cropRight)) / f, ((f2 - 1.0f) - ((float) this.f18151w.cropBottom)) / f2));
            } else {
                itp.m23264b(new RectF());
            }
            this.n.set(itp);
        }
    }

    boolean mo3276e() {
        boolean z = false;
        if (this.f18142f != 0) {
            if (this.f18141e == this.f18140d) {
                z = this.f18140d.m10317a(this.f18151w);
                if (z && this.f18151w.frameWidth > 0 && this.f18151w.frameHeight > 0) {
                    m22368m();
                }
            } else {
                itx.m23277a(6, "vclib", "Something is calling RemoteVideoSource.processFrame but we aren't rendering with GL.");
            }
        }
        return z;
    }

    public void mo3274a(boolean z) {
        super.mo3274a(z);
        m22387l();
    }

    public String mo3277f() {
        String str = "Remote:";
        String valueOf = String.valueOf(this.l.m22332a());
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    int mo3278g() {
        if (this.f18141e == this.f18140d) {
            return this.f18140d.m10319c();
        }
        itx.m23277a(6, "vclib", "Something is using RemoteVideoSource's texture name but we aren't rendering with GL.");
        return -1;
    }

    boolean mo3279h() {
        if (this.f18141e == this.f18140d) {
            return this.f18140d.m10320d();
        }
        itx.m23277a(6, "vclib", "Something is using RemoteVideoSource's texture type but we aren't rendering with GL.");
        return false;
    }

    float[] mo3280i() {
        if (this.f18141e == this.f18140d) {
            return this.f18140d.m10322f();
        }
        itx.m23277a(6, "vclib", "Something is using RemoteVideoSource's transform but we aren't rendering with GL.");
        return ity.f19013a;
    }

    public void m22385j() {
        if (this.f18141e == this.f18139c) {
            this.f18139c.m22312a();
        } else {
            this.f18140d.m10323g();
        }
    }

    void m22373a(mab mab) {
        float f = 0.0f;
        itp a = ((itp) this.n.get()).m23257a();
        if (mab.f27088g == null || mab.f27088g.f27098c == null || mab.f27088g.f27098c.length == 0) {
            a.m23261a(new RectF());
            a.m23262a(false);
        } else {
            float f2 = 1.0f;
            float f3 = 1.0f;
            float f4 = 0.0f;
            for (mag mag : mab.f27088g.f27098c) {
                f3 = Math.min(mag.f27100a.floatValue(), f3);
                f2 = Math.min(mag.f27101b.floatValue(), f2);
                f4 = Math.max(mag.f27102c.floatValue(), f4);
                f = Math.max(mag.f27103d.floatValue(), f);
            }
            a.m23261a(new RectF(f3, f2, f4, f));
            a.m23262a(gwb.m1507a(mab.f27088g.f27096a) == 2);
        }
        this.n.set(a);
    }

    int m22386k() {
        if (this.f18138b != null) {
            int f = this.f18138b.m10382f();
            if (f != -1) {
                return f;
            }
        }
        return 0;
    }

    public void mo3271a(int i) {
        itx.m23282a("vclib", "%s: Codec type switched to: %s", mo3277f(), Integer.valueOf(i));
        m22387l();
        if (!this.f18152x) {
            gwb.m2042b(this.f18150v);
            gwb.m1864a(this.f18150v, 10);
        }
    }

    public void mo3272a(MediaFormat mediaFormat) {
        itp a = ((itp) this.n.get()).m23257a();
        inj.m22367a(mediaFormat, a);
        this.n.set(a);
    }

    public void mo3270a() {
        if (!this.f18152x) {
            gwb.m2042b(this.f18150v);
            gwb.m1864a(this.f18150v, 10);
        }
    }

    public static void m22367a(MediaFormat mediaFormat, itp itp) {
        int integer;
        int i = 0;
        int integer2 = mediaFormat.getInteger("width");
        int integer3 = mediaFormat.getInteger("height");
        itp.m23259a(integer2, integer3);
        int integer4 = mediaFormat.containsKey("crop-left") ? mediaFormat.getInteger("crop-left") : 0;
        if (mediaFormat.containsKey("crop-top")) {
            integer = mediaFormat.getInteger("crop-top");
        } else {
            integer = 0;
        }
        int integer5 = mediaFormat.containsKey("crop-right") ? mediaFormat.getInteger("crop-right") : integer2 - 1;
        int integer6 = mediaFormat.containsKey("crop-bottom") ? mediaFormat.getInteger("crop-bottom") : integer3 - 1;
        if (integer4 < 0 || integer4 >= integer2 || integer < 0 || integer >= integer3 || integer5 < 0 || integer5 >= integer2 || integer6 < 0 || integer6 >= integer3) {
            itx.m23288c("vclib", "Unexpected crop values: width: %d height: %d crop-left: %d crop-top: %d crop-right: %d crop-bottom: %d", Integer.valueOf(integer2), Integer.valueOf(integer3), Integer.valueOf(integer4), Integer.valueOf(integer), Integer.valueOf(integer5), Integer.valueOf(integer6));
            integer5 = integer2 - 1;
            integer4 = integer3 - 1;
            integer = 0;
        } else {
            i = integer4;
            integer4 = integer6;
        }
        if (integer5 > 0 || integer4 > 0) {
            itp.m23264b(new RectF(((float) i) / ((float) integer2), ((float) integer) / ((float) integer3), ((float) ((integer2 - 1) - integer5)) / ((float) integer2), ((float) ((integer3 - 1) - integer4)) / ((float) integer3)));
        } else {
            itp.m23264b(new RectF());
        }
    }

    public void m22378c(int i) {
        this.f18143g = i;
        m22387l();
    }

    public void m22387l() {
        gwb.m2042b(this.f18149u);
        gwb.m1864a(this.f18149u, 100);
    }
}
