package p000;

import java.io.OutputStream;

public final class kfg extends OutputStream {
    public long f21559a;

    public void write(byte[] bArr, int i, int i2) {
        this.f21559a += (long) i2;
    }

    public void write(int i) {
        this.f21559a++;
    }
}
