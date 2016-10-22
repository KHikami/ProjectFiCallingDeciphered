package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ihw */
public final class ihw implements auj<iht, ByteBuffer> {
    private final a a;
    private final a b;

    public ihw() {
        this(null, null);
    }

    private ihw(a aVar, a aVar2) {
        this.a = null;
        this.b = null;
    }

    public auh<iht, ByteBuffer> a(aup aup) {
        return new ihu(aup.a(atu.class, ByteBuffer.class), this.a, this.b);
    }
}
