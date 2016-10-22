import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

final class anf implements Closeable {
    final Charset a;
    private final InputStream b;
    private byte[] c;
    private int d;
    private int e;

    public anf(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private anf(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(anh.a)) {
            this.b = inputStream;
            this.a = charset;
            this.c = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public void close() {
        synchronized (this.b) {
            if (this.c != null) {
                this.c = null;
                this.b.close();
            }
        }
    }

    public String a() {
        String str;
        synchronized (this.b) {
            if (this.c == null) {
                throw new IOException("LineReader is closed");
            }
            int i;
            if (this.d >= this.e) {
                c();
            }
            int i2 = this.d;
            while (i2 != this.e) {
                if (this.c[i2] == (byte) 10) {
                    int i3 = (i2 == this.d || this.c[i2 - 1] != 13) ? i2 : i2 - 1;
                    str = new String(this.c, this.d, i3 - this.d, this.a.name());
                    this.d = i2 + 1;
                } else {
                    i2++;
                }
            }
            ByteArrayOutputStream ang = new ang(this, (this.e - this.d) + 80);
            loop1:
            while (true) {
                ang.write(this.c, this.d, this.e - this.d);
                this.e = -1;
                c();
                i = this.d;
                while (i != this.e) {
                    if (this.c[i] == (byte) 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.d) {
                ang.write(this.c, this.d, i - this.d);
            }
            this.d = i + 1;
            str = ang.toString();
        }
        return str;
    }

    public boolean b() {
        return this.e == -1;
    }

    private void c() {
        int read = this.b.read(this.c, 0, this.c.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.d = 0;
        this.e = read;
    }
}
