package defpackage;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

final class mrc implements mre {
    static final mrc a = new mrc();

    mrc() {
    }

    public void a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = mra.a;
        Level level = Level.WARNING;
        String valueOf = String.valueOf(closeable);
        logger.log(level, new StringBuilder(String.valueOf(valueOf).length() + 42).append("Suppressing exception thrown when closing ").append(valueOf).toString(), th2);
    }
}
