package p000;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class jsm<T extends WritableByteChannel> implements WritableByteChannel {
    private final jsi f20991a;
    private final T f20992b;

    public jsm(T t, jsh jsh) {
        this.f20992b = t;
        this.f20991a = new jsi(jsh);
    }

    public int write(ByteBuffer byteBuffer) {
        int write = this.f20992b.write(byteBuffer);
        this.f20991a.m25165b((long) write);
        return write;
    }

    public boolean isOpen() {
        return this.f20992b.isOpen();
    }

    public void close() {
        this.f20992b.close();
    }

    public void m25168a(long j) {
        this.f20991a.m25164a(j);
    }

    public T m25167a() {
        return this.f20992b;
    }
}
