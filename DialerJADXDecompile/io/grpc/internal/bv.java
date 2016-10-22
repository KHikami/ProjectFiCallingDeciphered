package io.grpc.internal;

import cob;

/* compiled from: PG */
final class bv extends d {
    private int a;
    private int b;
    private byte[] c;

    bv(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private bv(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        cob.a(i >= 0, (Object) "offset must be >= 0");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        cob.a(z, (Object) "length must be >= 0");
        if (i + i2 > bArr.length) {
            z2 = false;
        }
        cob.a(z2, (Object) "offset + length exceeds array boundary");
        this.c = (byte[]) cob.b((Object) bArr, (Object) "bytes");
        this.a = i;
        this.b = i + i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final int b() {
        a(1);
        byte[] bArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    public final /* synthetic */ bs c(int i) {
        a(i);
        int i2 = this.a;
        this.a += i;
        return new bv(this.c, i2, i);
    }
}
