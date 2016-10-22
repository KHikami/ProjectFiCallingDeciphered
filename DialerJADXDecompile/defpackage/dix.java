package defpackage;

import io.grpc.internal.bs;
import io.grpc.internal.d;

/* compiled from: PG */
/* renamed from: dix */
final class dix extends d {
    private final dlu a;

    dix(dlu dlu) {
        this.a = dlu;
    }

    public final int a() {
        return (int) this.a.b;
    }

    public final int b() {
        return this.a.c() & 255;
    }

    public final void a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int a = this.a.a(bArr, i, i2);
            if (a == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i2 + " bytes");
            }
            i2 -= a;
            i += a;
        }
    }

    public final bs c(int i) {
        dlu dlu = new dlu();
        dlu.a_(this.a, (long) i);
        return new dix(dlu);
    }

    public final void close() {
        this.a.g();
    }
}
