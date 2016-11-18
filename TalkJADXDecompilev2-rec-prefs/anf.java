package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

final class anf implements Closeable {
    final Charset f1864a;
    private final InputStream f1865b;
    private byte[] f1866c;
    private int f1867d;
    private int f1868e;

    public anf(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private anf(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(anh.f1870a)) {
            this.f1865b = inputStream;
            this.f1864a = charset;
            this.f1866c = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public void close() {
        synchronized (this.f1865b) {
            if (this.f1866c != null) {
                this.f1866c = null;
                this.f1865b.close();
            }
        }
    }

    public String m3467a() {
        String str;
        synchronized (this.f1865b) {
            if (this.f1866c == null) {
                throw new IOException("LineReader is closed");
            }
            int i;
            if (this.f1867d >= this.f1868e) {
                m3466c();
            }
            int i2 = this.f1867d;
            while (i2 != this.f1868e) {
                if (this.f1866c[i2] == (byte) 10) {
                    int i3 = (i2 == this.f1867d || this.f1866c[i2 - 1] != (byte) 13) ? i2 : i2 - 1;
                    str = new String(this.f1866c, this.f1867d, i3 - this.f1867d, this.f1864a.name());
                    this.f1867d = i2 + 1;
                } else {
                    i2++;
                }
            }
            ByteArrayOutputStream ang = new ang(this, (this.f1868e - this.f1867d) + 80);
            loop1:
            while (true) {
                ang.write(this.f1866c, this.f1867d, this.f1868e - this.f1867d);
                this.f1868e = -1;
                m3466c();
                i = this.f1867d;
                while (i != this.f1868e) {
                    if (this.f1866c[i] == (byte) 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.f1867d) {
                ang.write(this.f1866c, this.f1867d, i - this.f1867d);
            }
            this.f1867d = i + 1;
            str = ang.toString();
        }
        return str;
    }

    public boolean m3468b() {
        return this.f1868e == -1;
    }

    private void m3466c() {
        int read = this.f1865b.read(this.f1866c, 0, this.f1866c.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f1867d = 0;
        this.f1868e = read;
    }
}
