package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class bal extends InputStream {
    private static final Queue<bal> f2732a = baq.m4684a(0);
    private InputStream f2733b;
    private IOException f2734c;

    public static bal m4670a(InputStream inputStream) {
        bal bal;
        synchronized (f2732a) {
            bal = (bal) f2732a.poll();
        }
        if (bal == null) {
            bal = new bal();
        }
        bal.m4671b(inputStream);
        return bal;
    }

    bal() {
    }

    private void m4671b(InputStream inputStream) {
        this.f2733b = inputStream;
    }

    public int available() {
        return this.f2733b.available();
    }

    public void close() {
        this.f2733b.close();
    }

    public void mark(int i) {
        this.f2733b.mark(i);
    }

    public boolean markSupported() {
        return this.f2733b.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f2733b.read(bArr);
        } catch (IOException e) {
            this.f2734c = e;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f2733b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f2734c = e;
            return -1;
        }
    }

    public synchronized void reset() {
        this.f2733b.reset();
    }

    public long skip(long j) {
        try {
            return this.f2733b.skip(j);
        } catch (IOException e) {
            this.f2734c = e;
            return 0;
        }
    }

    public int read() {
        try {
            return this.f2733b.read();
        } catch (IOException e) {
            this.f2734c = e;
            return -1;
        }
    }

    public IOException m4672a() {
        return this.f2734c;
    }

    public void m4673b() {
        this.f2734c = null;
        this.f2733b = null;
        synchronized (f2732a) {
            f2732a.offer(this);
        }
    }
}
