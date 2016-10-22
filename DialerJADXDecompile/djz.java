import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: PG */
public final class djz implements dkg {
    static final Logger a;
    static final dlx b;

    static {
        a = Logger.getLogger(dkb.class.getName());
        b = dlx.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public final djr a(dlw dlw, boolean z) {
        return new djr(dlw, 4096, true);
    }

    public final djt a(dlv dlv, boolean z) {
        return new dkc(dlv, true);
    }

    static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    static IOException b(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    static int a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            short s2 = i - 1;
        }
        if (s <= s2) {
            return (short) (s2 - s);
        }
        throw b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(s2));
    }

    static int a(dlw dlw) {
        return (((dlw.c() & 255) << 16) | ((dlw.c() & 255) << 8)) | (dlw.c() & 255);
    }

    static void a(dlv dlv, int i) {
        dlv.g((i >>> 16) & 255);
        dlv.g((i >>> 8) & 255);
        dlv.g(i & 255);
    }
}
