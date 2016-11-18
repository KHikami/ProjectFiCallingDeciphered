package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class jsm<T extends WritableByteChannel> implements WritableByteChannel {
    private final jsi a;
    private final T b;

    public jsm(T t, jsh jsh) {
        this.b = t;
        this.a = new jsi(jsh);
    }

    public int write(ByteBuffer byteBuffer) {
        int write = this.b.write(byteBuffer);
        this.a.b((long) write);
        return write;
    }

    public boolean isOpen() {
        return this.b.isOpen();
    }

    public void close() {
        this.b.close();
    }

    public void a(long j) {
        this.a.a(j);
    }

    public T a() {
        return this.b;
    }
}
