package p000;

import com.google.android.libraries.hangouts.video.internal.LibjingleSoftwareEncoder;
import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;
import java.util.concurrent.TimeUnit;

public final class ikt implements ila {
    final ijn f17945a;
    final ild f17946b;
    final ikx f17947c;
    ilb f17948d;
    int f17949e;
    boolean f17950f;
    iuc f17951g;
    private MediaCodecSimulcastEncoder f17952h;
    private LibjingleSoftwareEncoder f17953i;
    private int f17954j;
    private long f17955k = 0;
    private float[] f17956l = null;
    private final float[] f17957m = new float[16];

    public ikt(ijn ijn, boolean z, ilb ilb, int i, int i2) {
        this.f17945a = ijn;
        this.f17948d = ilb;
        this.f17946b = ijn.m21968f();
        this.f17954j = 0;
        if (z) {
            this.f17952h = new MediaCodecSimulcastEncoder(ijn, i, i2);
        }
        this.f17953i = new LibjingleSoftwareEncoder(ijn.m21969g());
        this.f17947c = new ikx(this);
        gwb.m1863a(new iku(this, ijn));
    }

    public void mo1312a() {
        if (this.f17952h != null) {
            this.f17952h.mo1312a();
        }
        if (this.f17953i != null) {
            this.f17953i.mo1312a();
        }
    }

    private iuc m22208d() {
        int b = iks.m22205c(mo1316b() != -1 ? mo1316b() : 0).m23303b();
        if (this.f17949e != 0) {
            b = Math.min(this.f17949e, b);
        }
        return iuc.m23298a(this.f17951g, b);
    }

    public void mo1314a(boolean z) {
        float[] fArr;
        if (z) {
            fArr = ity.f19014b;
        } else {
            fArr = null;
        }
        this.f17956l = fArr;
    }

    public void mo1313a(int i, int i2, boolean z) {
        this.f17950f = z;
        this.f17951g = new iuc(i, i2);
        iuc d = z ? this.f17951g : m22208d();
        if (this.f17953i != null) {
            this.f17953i.mo1313a(d.f19032a, d.f19033b, z);
            if (!(this.f17952h == null || this.f17955k == 0)) {
                this.f17955k += TimeUnit.NANOSECONDS.toMillis(1);
                this.f17953i.m10359a(this.f17955k);
            }
        }
        if (this.f17952h != null) {
            this.f17952h.mo1313a(d.f19032a, d.f19033b, z);
        }
    }

    public boolean mo1315a(int i, long j, boolean z, float[] fArr) {
        float[] fArr2;
        boolean z2;
        if (this.f17956l != null) {
            ity.m23290a(fArr, this.f17956l, this.f17957m);
            fArr2 = this.f17957m;
        } else {
            fArr2 = fArr;
        }
        if (this.f17952h != null) {
            z2 = !this.f17952h.mo1315a(i, j, z, fArr2);
            if (!z2) {
                m22207a(this.f17952h.mo1316b());
                this.f17953i.m10359a(j);
            }
        } else {
            z2 = true;
        }
        if (z2) {
            this.f17953i.mo1315a(i, j, z, fArr2);
            m22207a(this.f17953i.mo1316b());
        }
        this.f17955k = j;
        return true;
    }

    public int mo1316b() {
        return this.f17954j;
    }

    private void m22207a(int i) {
        if (this.f17954j != i && i != -1) {
            this.f17954j = i;
            if (this.f17948d != null) {
                this.f17946b.m22233a(new ikv(this, i));
            }
        }
    }

    public void mo1317c() {
        gwb.m1863a(new ikw(this));
        if (this.f17952h != null) {
            this.f17952h.mo1317c();
            this.f17952h = null;
        }
        if (this.f17953i != null) {
            this.f17953i.mo1317c();
            this.f17953i = null;
        }
    }
}
