package p000;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class ior implements iop {
    private static final ioq f18592e = new ios();
    final int f18593a;
    final iow f18594b;
    final List<iou> f18595c;
    volatile boolean f18596d;
    private final Queue<iou> f18597f;
    private ioq f18598g;

    public ior(Context context, String str) {
        this(icb.m21560a(context.getContentResolver(), "babel_vclib_apiary_max_response_size_kb", 50), new iow(context, str, new iot()));
    }

    private ior(int i, iow iow) {
        this.f18593a = i;
        this.f18594b = iow;
        this.f18597f = new LinkedList();
        this.f18595c = new LinkedList();
        this.f18596d = false;
        this.f18598g = f18592e;
    }

    public void mo3349a(String str, long j) {
        iil.m21875b("null authToken provided!", (Object) str);
        itx.m23279a(3, "vclib", "Setting authToken: %s, neverSet: %s", str, Boolean.valueOf(!this.f18594b.m22802a()));
        this.f18594b.m22801a(str, j);
        if (!this.f18594b.m22802a()) {
            while (!this.f18597f.isEmpty()) {
                m22782a((iou) this.f18597f.remove());
            }
        }
    }

    public void mo3348a(ioq ioq) {
        if (ioq != null) {
            this.f18598g = ioq;
        } else {
            this.f18598g = f18592e;
        }
    }

    public void mo3347a(long j, String str, byte[] bArr, int i) {
        m22781a(j, str, bArr, i, this.f18598g);
    }

    public void mo3350a(String str, byte[] bArr, int i, ioq ioq) {
        m22781a(0, str, bArr, i, ioq);
    }

    public void mo3346a() {
        if (!this.f18596d) {
            this.f18596d = true;
            for (iou b : this.f18595c) {
                b.m22798b();
            }
            this.f18595c.clear();
            this.f18597f.clear();
            this.f18594b.m22803b();
        }
    }

    public void finalize() {
        iil.m21874a("ApiaryClientImpl has not been released!", this.f18596d);
    }

    private void m22781a(long j, String str, byte[] bArr, int i, ioq ioq) {
        ba.m4609b(!this.f18596d);
        iou iou = new iou(this, j, str, bArr, i, ioq);
        if (this.f18594b.m22802a()) {
            m22782a(iou);
        } else {
            this.f18597f.add(iou);
        }
    }

    private void m22782a(iou iou) {
        this.f18595c.add(iou);
        iou.m22792a();
    }
}
