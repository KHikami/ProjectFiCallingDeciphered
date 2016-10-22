package io.grpc.internal;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

final class ci extends OutputStream {
    final List<dm> a;
    final /* synthetic */ ch b;
    private dm c;

    ci(ch chVar) {
        this.b = chVar;
        this.a = new ArrayList();
    }

    public void write(int i) {
        if (this.c == null || this.c.a() <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
            return;
        }
        this.c.a((byte) i);
    }

    public void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            this.c = this.b.a.a(i2);
            this.a.add(this.c);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.c.a());
            if (min == 0) {
                this.c = this.b.a.a(Math.max(i2, this.c.b() << 1));
                this.a.add(this.c);
            } else {
                this.c.a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
