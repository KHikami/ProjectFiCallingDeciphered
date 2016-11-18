package defpackage;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kgd implements kgm {
    private final kgm a;
    private final int b;
    private final Level c;
    private final Logger d;

    public kgd(kgm kgm, Logger logger, Level level, int i) {
        this.a = kgm;
        this.d = logger;
        this.c = level;
        this.b = i;
    }

    public void writeTo(OutputStream outputStream) {
        OutputStream kgc = new kgc(outputStream, this.d, this.c, this.b);
        try {
            this.a.writeTo(kgc);
            outputStream.flush();
        } finally {
            kgc.a.close();
        }
    }
}
