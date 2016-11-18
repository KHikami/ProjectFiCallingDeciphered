package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kgb extends FilterInputStream {
    private final kga a;

    public kgb(InputStream inputStream, Logger logger, Level level, int i) {
        super(inputStream);
        this.a = new kga(logger, level, i);
    }

    public int read() {
        int read = super.read();
        this.a.write(read);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.a.write(bArr, i, read);
        }
        return read;
    }

    public void close() {
        this.a.close();
        super.close();
    }
}
