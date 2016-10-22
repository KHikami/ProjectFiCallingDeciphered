package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: awr */
public final class awr implements awt {
    private final ByteBuffer a;

    public awr(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public int a() {
        return ((c() << 8) & 65280) | (c() & 255);
    }

    public short b() {
        return (short) (c() & 255);
    }

    public long a(long j) {
        int min = (int) Math.min((long) this.a.remaining(), j);
        this.a.position(this.a.position() + min);
        return (long) min;
    }

    public int a(byte[] bArr, int i) {
        int min = Math.min(i, this.a.remaining());
        this.a.get(bArr, 0, i);
        return min;
    }

    public int c() {
        if (this.a.remaining() <= 0) {
            return -1;
        }
        return this.a.get();
    }
}
