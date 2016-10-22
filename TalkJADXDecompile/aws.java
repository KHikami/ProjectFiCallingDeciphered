import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class aws {
    private final ByteBuffer a;

    public aws(byte[] bArr, int i) {
        this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    public void a(ByteOrder byteOrder) {
        this.a.order(byteOrder);
    }

    public int a() {
        return this.a.remaining();
    }

    public int a(int i) {
        return this.a.getInt(i);
    }

    public short b(int i) {
        return this.a.getShort(i);
    }
}
