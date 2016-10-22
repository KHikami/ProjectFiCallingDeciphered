package io.grpc.internal;

import java.io.OutputStream;

final class cj extends OutputStream {
    final /* synthetic */ ch a;
    private final byte[] b;

    cj(ch chVar) {
        this.a = chVar;
        this.b = new byte[1];
    }

    public void write(int i) {
        this.b[0] = (byte) i;
        write(this.b, 0, 1);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }
}
