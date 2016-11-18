package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class aws {
    private final ByteBuffer f2447a;

    public aws(byte[] bArr, int i) {
        this.f2447a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    public void m4217a(ByteOrder byteOrder) {
        this.f2447a.order(byteOrder);
    }

    public int m4215a() {
        return this.f2447a.remaining();
    }

    public int m4216a(int i) {
        return this.f2447a.getInt(i);
    }

    public short m4218b(int i) {
        return this.f2447a.getShort(i);
    }
}
