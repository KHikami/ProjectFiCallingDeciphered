import java.nio.ByteBuffer;

public final class axg implements aog<ByteBuffer> {
    private final ByteBuffer a;

    public /* synthetic */ Object a() {
        return c();
    }

    public axg(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    private ByteBuffer c() {
        this.a.position(0);
        return this.a;
    }

    public void b() {
    }
}
