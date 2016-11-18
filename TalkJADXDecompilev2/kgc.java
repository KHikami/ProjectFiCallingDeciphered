package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kgc extends FilterOutputStream {
    final kga a;

    public kgc(OutputStream outputStream, Logger logger, Level level, int i) {
        super(outputStream);
        this.a = new kga(logger, level, i);
    }

    public void write(int i) {
        this.out.write(i);
        this.a.write(i);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.a.write(bArr, i, i2);
    }

    public void close() {
        this.a.close();
        super.close();
    }
}
