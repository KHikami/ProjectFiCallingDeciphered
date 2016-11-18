package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class jsl<T extends ReadableByteChannel> implements ReadableByteChannel {
    private final jsi a;
    private final T b;

    public jsl(T t, jsh jsh, long j) {
        this(t, new jsi(jsh, j));
    }

    private jsl(T t, jsi jsi) {
        this.b = t;
        this.a = jsi;
    }

    public int read(ByteBuffer byteBuffer) {
        int read = this.b.read(byteBuffer);
        if (read >= 0) {
            this.a.b((long) read);
        }
        return read;
    }

    public boolean isOpen() {
        return this.b.isOpen();
    }

    public void close() {
        this.b.close();
    }
}
