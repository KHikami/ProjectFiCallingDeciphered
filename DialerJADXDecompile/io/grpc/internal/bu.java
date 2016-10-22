package io.grpc.internal;

import cob;
import dgl;
import java.io.InputStream;

/* compiled from: PG */
final class bu extends InputStream implements dgl {
    private bs a;

    public bu(bs bsVar) {
        this.a = (bs) cob.b((Object) bsVar, (Object) "buffer");
    }

    public final int available() {
        return this.a.a();
    }

    public final int read() {
        if (this.a.a() == 0) {
            return -1;
        }
        return this.a.b();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.a.a() == 0) {
            return -1;
        }
        int min = Math.min(this.a.a(), i2);
        this.a.a(bArr, i, min);
        return min;
    }
}
