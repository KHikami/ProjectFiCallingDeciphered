package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kgc extends FilterOutputStream {
    final kga f21640a;

    public kgc(OutputStream outputStream, Logger logger, Level level, int i) {
        super(outputStream);
        this.f21640a = new kga(logger, level, i);
    }

    public void write(int i) {
        this.out.write(i);
        this.f21640a.write(i);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f21640a.write(bArr, i, i2);
    }

    public void close() {
        this.f21640a.close();
        super.close();
    }
}
