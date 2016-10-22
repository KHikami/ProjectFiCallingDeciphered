package io.grpc.internal;

import bm;

final class cp extends g {
    int a;
    final int b;
    final byte[] c;

    public /* synthetic */ cm c(int i) {
        return b(i);
    }

    cp(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private cp(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        bm.a(i >= 0, (Object) "offset must be >= 0");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        bm.a(z, (Object) "length must be >= 0");
        if (i + i2 > bArr.length) {
            z2 = false;
        }
        bm.a(z2, (Object) "offset + length exceeds array boundary");
        this.c = (byte[]) bm.a((Object) bArr, (Object) "bytes");
        this.a = i;
        this.b = i + i2;
    }

    public int a() {
        return this.b - this.a;
    }

    public int b() {
        a(1);
        byte[] bArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    public void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    private cp b(int i) {
        a(i);
        int i2 = this.a;
        this.a += i;
        return new cp(this.c, i2, i);
    }
}
