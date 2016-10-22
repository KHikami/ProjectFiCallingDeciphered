package io.grpc.internal;

import dhn;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
final class bl extends FilterInputStream {
    private final int a;
    private long b;
    private long c;

    bl(InputStream inputStream, int i) {
        super(inputStream);
        this.c = -1;
        this.a = i;
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.b++;
        }
        a();
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        a();
        return read;
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.b += skip;
        a();
        return skip;
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.c = this.b;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.c == -1) {
            throw new IOException("Mark not set");
        } else {
            this.in.reset();
            this.b = this.c;
        }
    }

    private final void a() {
        if (this.b > ((long) this.a)) {
            throw dhn.i.a(String.format("Compressed frame exceeds maximum frame size: %d. Bytes read: %d", new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)})).b();
        }
    }
}
