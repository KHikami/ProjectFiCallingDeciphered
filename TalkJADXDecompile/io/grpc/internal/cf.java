package io.grpc.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import olv;

final class cf extends FilterInputStream {
    private final int a;
    private long b;
    private long c;

    cf(InputStream inputStream, int i) {
        super(inputStream);
        this.c = -1;
        this.a = i;
    }

    public int read() {
        int read = this.in.read();
        if (read != -1) {
            this.b++;
        }
        a();
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        a();
        return read;
    }

    public long skip(long j) {
        long skip = this.in.skip(j);
        this.b += skip;
        a();
        return skip;
    }

    public synchronized void mark(int i) {
        this.in.mark(i);
        this.c = this.b;
    }

    public synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.c == -1) {
            throw new IOException("Mark not set");
        } else {
            this.in.reset();
            this.b = this.c;
        }
    }

    private void a() {
        if (this.b > ((long) this.a)) {
            throw olv.p.a(String.format("Compressed frame exceeds maximum frame size: %d. Bytes read: %d. If this is normal, increase the maxMessageSize in the channel/server builder", new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)})).e();
        }
    }
}
