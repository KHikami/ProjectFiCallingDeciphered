package io.grpc.internal;

import bm;
import java.io.InputStream;
import okq;

final class co extends InputStream implements okq {
    final cm a;

    public co(cm cmVar) {
        this.a = (cm) bm.a((Object) cmVar, (Object) "buffer");
    }

    public int available() {
        return this.a.a();
    }

    public int read() {
        if (this.a.a() == 0) {
            return -1;
        }
        return this.a.b();
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.a.a() == 0) {
            return -1;
        }
        int min = Math.min(this.a.a(), i2);
        this.a.a(bArr, i, min);
        return min;
    }
}
