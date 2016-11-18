package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class omo extends InputStream implements okq {
    private nzf f33246a;
    private ByteArrayInputStream f33247b;

    public omo(nzf nzf) {
        this.f33246a = nzf;
    }

    private void m38757a() {
        if (this.f33246a != null) {
            this.f33247b = new ByteArrayInputStream(nzf.a(this.f33246a));
            this.f33246a = null;
        }
    }

    public int read() {
        m38757a();
        if (this.f33247b != null) {
            return this.f33247b.read();
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.f33246a != null) {
            int c = this.f33246a.c();
            if (c == 0) {
                this.f33246a = null;
                this.f33247b = null;
                return -1;
            } else if (i2 >= c) {
                nyu a = nyu.m37131a(bArr, i, c);
                this.f33246a.a(a);
                a.m37162a();
                this.f33246a = null;
                this.f33247b = null;
                return c;
            } else {
                m38757a();
            }
        }
        if (this.f33247b != null) {
            return this.f33247b.read(bArr, i, i2);
        }
        return -1;
    }

    public int available() {
        if (this.f33246a != null) {
            return this.f33246a.c();
        }
        if (this.f33247b != null) {
            return this.f33247b.available();
        }
        return 0;
    }
}
