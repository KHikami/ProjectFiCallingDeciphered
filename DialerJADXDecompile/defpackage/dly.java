package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: dly */
public final class dly {
    static final Logger a;

    static {
        a = Logger.getLogger(dly.class.getName());
    }

    private dly() {
    }

    public static dlw a(dmh dmh) {
        if (dmh != null) {
            return new dmd(dmh);
        }
        throw new IllegalArgumentException("source == null");
    }

    public static dlv a(dmg dmg) {
        if (dmg != null) {
            return new dmc(dmg);
        }
        throw new IllegalArgumentException("sink == null");
    }

    public static dmg a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        dmi c = dly.c(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (c != null) {
            return new dlr(c, new dlz(c, outputStream));
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static dmh b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        dmi c = dly.c(socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (c != null) {
            return new dls(c, new dma(c, inputStream));
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    private static dlq c(Socket socket) {
        return new dmb(socket);
    }
}
