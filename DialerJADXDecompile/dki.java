import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
final class dki extends InputStream implements dgl {
    private dem a;
    private ByteArrayInputStream b;

    public dki(dem dem) {
        this.a = dem;
    }

    private final void a() {
        if (this.a != null) {
            this.b = new ByteArrayInputStream(dem.a(this.a));
            this.a = null;
        }
    }

    public final int read() {
        a();
        if (this.b != null) {
            return this.b.read();
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.a != null) {
            int c = this.a.c();
            if (c == 0) {
                this.a = null;
                this.b = null;
                return -1;
            } else if (i2 >= c) {
                def a = def.a(bArr, i, c);
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

    public final int available() {
        if (this.a != null) {
            return this.a.c();
        }
        if (this.b != null) {
            return this.b.available();
        }
        return 0;
    }
}
