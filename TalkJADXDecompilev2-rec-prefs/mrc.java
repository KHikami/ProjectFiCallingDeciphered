package p000;

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

final class mrc implements mre {
    static final mrc f28144a = new mrc();

    mrc() {
    }

    public void mo3920a(Closeable closeable, Throwable th, Throwable th2) {
        Logger logger = mra.f28139a;
        Level level = Level.WARNING;
        String valueOf = String.valueOf(closeable);
        logger.log(level, new StringBuilder(String.valueOf(valueOf).length() + 42).append("Suppressing exception thrown when closing ").append(valueOf).toString(), th2);
    }
}
