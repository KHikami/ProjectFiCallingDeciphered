package p000;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kgb extends FilterInputStream {
    private final kga f21639a;

    public kgb(InputStream inputStream, Logger logger, Level level, int i) {
        super(inputStream);
        this.f21639a = new kga(logger, level, i);
    }

    public int read() {
        int read = super.read();
        this.f21639a.write(read);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f21639a.write(bArr, i, read);
        }
        return read;
    }

    public void close() {
        this.f21639a.close();
        super.close();
    }
}
