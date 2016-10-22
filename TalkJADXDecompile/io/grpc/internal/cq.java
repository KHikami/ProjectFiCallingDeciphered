package io.grpc.internal;

import bm;
import java.nio.ByteBuffer;

final class cq extends g {
    final ByteBuffer a;

    public /* synthetic */ cm c(int i) {
        return b(i);
    }

    cq(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) bm.a((Object) byteBuffer, (Object) "bytes");
    }

    public int a() {
        return this.a.remaining();
    }

    public int b() {
        a(1);
        return this.a.get() & 255;
    }

    public void a(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    private cq b(int i) {
        a(i);
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.limit(this.a.position() + i);
        this.a.position(this.a.position() + i);
        return new cq(duplicate);
    }
}
