package io.grpc.internal;

final class w extends x {
    private int c;
    private /* synthetic */ int d;
    private /* synthetic */ byte[] e;

    w(u uVar, int i, byte[] bArr) {
        this.d = i;
        this.e = bArr;
        super((byte) 0);
        this.c = this.d;
    }

    public final int a(bs bsVar, int i) {
        bsVar.a(this.e, this.c, i);
        this.c += i;
        return 0;
    }
}
