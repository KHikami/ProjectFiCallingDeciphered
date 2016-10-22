package io.grpc.internal;

import java.io.OutputStream;

/* compiled from: PG */
final class bp extends OutputStream {
    private final byte[] a;
    private /* synthetic */ bn b;

    bp(bn bnVar) {
        this.b = bnVar;
        this.a = new byte[1];
    }

    public final void write(int i) {
        this.a[0] = (byte) i;
        write(this.a, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.b.a(bArr, i, i2);
    }
}
