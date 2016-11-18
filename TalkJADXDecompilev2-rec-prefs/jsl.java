package p000;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class jsl<T extends ReadableByteChannel> implements ReadableByteChannel {
    private final jsi f20989a;
    private final T f20990b;

    public jsl(T t, jsh jsh, long j) {
        this(t, new jsi(jsh, j));
    }

    private jsl(T t, jsi jsi) {
        this.f20990b = t;
        this.f20989a = jsi;
    }

    public int read(ByteBuffer byteBuffer) {
        int read = this.f20990b.read(byteBuffer);
        if (read >= 0) {
            this.f20989a.m25165b((long) read);
        }
        return read;
    }

    public boolean isOpen() {
        return this.f20990b.isOpen();
    }

    public void close() {
        this.f20990b.close();
    }
}
