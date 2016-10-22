import com.google.android.libraries.hangouts.video.internal.LibjingleSoftwareEncoder;
import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;
import java.util.concurrent.TimeUnit;

public final class ikt implements ila {
    final ijn a;
    final ild b;
    final ikx c;
    ilb d;
    int e;
    boolean f;
    iuc g;
    private MediaCodecSimulcastEncoder h;
    private LibjingleSoftwareEncoder i;
    private int j;
    private long k;
    private float[] l;
    private final float[] m;

    public ikt(ijn ijn, boolean z, ilb ilb, int i, int i2) {
        this.k = 0;
        this.l = null;
        this.m = new float[16];
        this.a = ijn;
        this.d = ilb;
        this.b = ijn.f();
        this.j = 0;
        if (z) {
            this.h = new MediaCodecSimulcastEncoder(ijn, i, i2);
        }
        this.i = new LibjingleSoftwareEncoder(ijn.g());
        this.c = new ikx(this);
        gwb.a(new iku(this, ijn));
    }

    public void a() {
        if (this.h != null) {
            this.h.a();
        }
        if (this.i != null) {
            this.i.a();
        }
    }

    private iuc d() {
        int b = iks.c(b() != -1 ? b() : 0).b();
        if (this.e != 0) {
            b = Math.min(this.e, b);
        }
        return iuc.a(this.g, b);
    }

    public void a(boolean z) {
        float[] fArr;
        if (z) {
            fArr = ity.b;
        } else {
            fArr = null;
        }
        this.l = fArr;
    }

    public void a(int i, int i2, boolean z) {
        this.f = z;
        this.g = new iuc(i, i2);
        iuc d = z ? this.g : d();
        if (this.i != null) {
            this.i.a(d.a, d.b, z);
            if (!(this.h == null || this.k == 0)) {
                this.k += TimeUnit.NANOSECONDS.toMillis(1);
                this.i.a(this.k);
            }
        }
        if (this.h != null) {
            this.h.a(d.a, d.b, z);
        }
    }

    public boolean a(int i, long j, boolean z, float[] fArr) {
        float[] fArr2;
        boolean z2;
        if (this.l != null) {
            ity.a(fArr, this.l, this.m);
            fArr2 = this.m;
        } else {
            fArr2 = fArr;
        }
        if (this.h != null) {
            z2 = !this.h.a(i, j, z, fArr2);
            if (!z2) {
                a(this.h.b());
                this.i.a(j);
            }
        } else {
            z2 = true;
        }
        if (z2) {
            this.i.a(i, j, z, fArr2);
            a(this.i.b());
        }
        this.k = j;
        return true;
    }

    public int b() {
        return this.j;
    }

    private void a(int i) {
        if (this.j != i && i != -1) {
            this.j = i;
            if (this.d != null) {
                this.b.a(new ikv(this, i));
            }
        }
    }

    public void c() {
        gwb.a(new ikw(this));
        if (this.h != null) {
            this.h.c();
            this.h = null;
        }
        if (this.i != null) {
            this.i.c();
            this.i = null;
        }
    }
}
