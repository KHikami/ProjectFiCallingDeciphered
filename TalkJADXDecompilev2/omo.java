package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class omo extends InputStream implements okq {
    private nzf a;
    private ByteArrayInputStream b;

    public omo(nzf nzf) {
        this.a = nzf;
    }

    private void a() {
        if (this.a != null) {
            this.b = new ByteArrayInputStream(nzf.a(this.a));
            this.a = null;
        }
    }

    public int read() {
        a();
        if (this.b != null) {
            return this.b.read();
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.a != null) {
            int c = this.a.c();
            if (c == 0) {
                this.a = null;
                this.b = null;
                return -1;
            } else if (i2 >= c) {
                nyu a = nyu.a(bArr, i, c);
                this.a.a(a);
                a.a();
                this.a = null;
                this.b = null;
                return c;
            } else {
                a();
            }
        }
        if (this.b != null) {
            return this.b.read(bArr, i, i2);
        }
        return -1;
    }

    public int available() {
        if (this.a != null) {
            return this.a.c();
        }
        if (this.b != null) {
            return this.b.available();
        }
        return 0;
    }
}
