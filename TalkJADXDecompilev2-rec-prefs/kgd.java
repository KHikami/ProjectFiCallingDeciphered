package p000;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kgd implements kgm {
    private final kgm f21641a;
    private final int f21642b;
    private final Level f21643c;
    private final Logger f21644d;

    public kgd(kgm kgm, Logger logger, Level level, int i) {
        this.f21641a = kgm;
        this.f21644d = logger;
        this.f21643c = level;
        this.f21642b = i;
    }

    public void writeTo(OutputStream outputStream) {
        OutputStream kgc = new kgc(outputStream, this.f21644d, this.f21643c, this.f21642b);
        try {
            this.f21641a.writeTo(kgc);
            outputStream.flush();
        } finally {
            kgc.f21640a.close();
        }
    }
}
