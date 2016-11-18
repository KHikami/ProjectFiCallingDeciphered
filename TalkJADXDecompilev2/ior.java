package defpackage;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class ior implements iop {
    private static final ioq e = new ios();
    final int a;
    final iow b;
    final List<iou> c;
    volatile boolean d;
    private final Queue<iou> f;
    private ioq g;

    public ior(Context context, String str) {
        this(icb.a(context.getContentResolver(), "babel_vclib_apiary_max_response_size_kb", 50), new iow(context, str, new iot()));
    }

    private ior(int i, iow iow) {
        this.a = i;
        this.b = iow;
        this.f = new LinkedList();
        this.c = new LinkedList();
        this.d = false;
        this.g = e;
    }

    public void a(String str, long j) {
        iil.b("null authToken provided!", (Object) str);
        itx.a(3, "vclib", "Setting authToken: %s, neverSet: %s", str, Boolean.valueOf(!this.b.a()));
        this.b.a(str, j);
        if (!this.b.a()) {
            while (!this.f.isEmpty()) {
                a((iou) this.f.remove());
            }
        }
    }

    public void a(ioq ioq) {
        if (ioq != null) {
            this.g = ioq;
        } else {
            this.g = e;
        }
    }

    public void a(long j, String str, byte[] bArr, int i) {
        a(j, str, bArr, i, this.g);
    }

    public void a(String str, byte[] bArr, int i, ioq ioq) {
        a(0, str, bArr, i, ioq);
    }

    public void a() {
        if (!this.d) {
            this.d = true;
            for (iou b : this.c) {
                b.b();
            }
            this.c.clear();
            this.f.clear();
            this.b.b();
        }
    }

    public void finalize() {
        iil.a("ApiaryClientImpl has not been released!", this.d);
    }

    private void a(long j, String str, byte[] bArr, int i, ioq ioq) {
        ba.b(!this.d);
        iou iou = new iou(this, j, str, bArr, i, ioq);
        if (this.b.a()) {
            a(iou);
        } else {
            this.f.add(iou);
        }
    }

    private void a(iou iou) {
        this.c.add(iou);
        iou.a();
    }
}
