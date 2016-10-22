package io.grpc.internal;

import bm;
import java.nio.ByteBuffer;

public class dm {
    public final ByteBuffer a;

    public void a(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }

    public void a(byte b) {
        this.a.put(b);
    }

    public int a() {
        return this.a.remaining();
    }

    public int b() {
        return this.a.position();
    }

    public dm(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) bm.a((Object) byteBuffer, (Object) "buffer");
    }

    public ByteBuffer c() {
        return this.a;
    }
}
