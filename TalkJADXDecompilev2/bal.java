package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class bal extends InputStream {
    private static final Queue<bal> a = baq.a(0);
    private InputStream b;
    private IOException c;

    public static bal a(InputStream inputStream) {
        bal bal;
        synchronized (a) {
            bal = (bal) a.poll();
        }
        if (bal == null) {
            bal = new bal();
        }
        bal.b(inputStream);
        return bal;
    }

    bal() {
    }

    private void b(InputStream inputStream) {
        this.b = inputStream;
    }

    public int available() {
        return this.b.available();
    }

    public void close() {
        this.b.close();
    }

    public void mark(int i) {
        this.b.mark(i);
    }

    public boolean markSupported() {
        return this.b.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.b.read(bArr);
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.b.read(bArr, i, i2);
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    public synchronized void reset() {
        this.b.reset();
    }

    public long skip(long j) {
        try {
            return this.b.skip(j);
        } catch (IOException e) {
            this.c = e;
            return 0;
        }
    }

    public int read() {
        try {
            return this.b.read();
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    public IOException a() {
        return this.c;
    }

    public void b() {
        this.c = null;
        this.b = null;
        synchronized (a) {
            a.offer(this);
        }
    }
}
