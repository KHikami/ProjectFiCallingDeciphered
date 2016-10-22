package io.grpc.internal;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
final class bo extends OutputStream {
    final List a;
    private co b;
    private /* synthetic */ bn c;

    bo(bn bnVar) {
        this.c = bnVar;
        this.a = new ArrayList();
    }

    public final void write(int i) {
        if (this.b == null || this.b.a() <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
            return;
        }
        this.b.a((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            this.b = this.c.f.a(i2);
            this.a.add(this.b);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.b.a());
            if (min == 0) {
                this.b = this.c.f.a(Math.max(i2, this.b.b() << 1));
                this.a.add(this.b);
            } else {
                this.b.a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
