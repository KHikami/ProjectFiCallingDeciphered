package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class awr implements awt {
    private final ByteBuffer f2446a;

    public awr(ByteBuffer byteBuffer) {
        this.f2446a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public int mo402a() {
        return ((mo406c() << 8) & 65280) | (mo406c() & 255);
    }

    public short mo405b() {
        return (short) (mo406c() & 255);
    }

    public long mo404a(long j) {
        int min = (int) Math.min((long) this.f2446a.remaining(), j);
        this.f2446a.position(this.f2446a.position() + min);
        return (long) min;
    }

    public int mo403a(byte[] bArr, int i) {
        int min = Math.min(i, this.f2446a.remaining());
        this.f2446a.get(bArr, 0, i);
        return min;
    }

    public int mo406c() {
        if (this.f2446a.remaining() <= 0) {
            return -1;
        }
        return this.f2446a.get();
    }
}
