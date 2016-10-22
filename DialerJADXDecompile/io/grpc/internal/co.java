package io.grpc.internal;

import dlu;

/* compiled from: PG */
public class co {
    public final dlu a;
    public int b;
    public int c;

    public void a(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }

    public void a(byte b) {
        this.a.a((int) b);
        this.b--;
        this.c++;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public co(dlu dlu, int i) {
        this.a = dlu;
        this.b = i;
    }

    public dlu c() {
        return this.a;
    }
}
