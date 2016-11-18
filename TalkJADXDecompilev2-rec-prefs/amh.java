package p000;

import java.io.ByteArrayOutputStream;

public final class amh extends ByteArrayOutputStream {
    private final amc f1282a;

    public amh(amc amc, int i) {
        this.f1282a = amc;
        this.buf = this.f1282a.m2894a(Math.max(i, 256));
    }

    public void close() {
        this.f1282a.m2893a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f1282a.m2893a(this.buf);
    }

    private void m2899a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.f1282a.m2894a((this.count + i) << 1);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f1282a.m2893a(this.buf);
            this.buf = a;
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m2899a(i2);
        super.write(bArr, i, i2);
    }

    public synchronized void write(int i) {
        m2899a(1);
        super.write(i);
    }
}
