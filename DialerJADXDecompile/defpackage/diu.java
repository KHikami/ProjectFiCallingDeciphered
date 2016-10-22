package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* renamed from: diu */
class diu {
    static diu a;
    private static final djj b;
    private final djj c;

    diu(djj djj) {
        this.c = (djj) cob.i((Object) djj);
    }

    private static diu a(ClassLoader classLoader) {
        Object obj = 1;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                obj = null;
            }
        }
        if (obj != null) {
            return new div(b, div.b);
        }
        return new diu(b);
    }

    public String a(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            b(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String a = a(sSLSocket);
            if (a != null) {
                return a;
            }
            throw new RuntimeException("protocol negotiation failed");
        } finally {
            this.c.a(sSLSocket);
        }
    }

    protected void b(SSLSocket sSLSocket, String str, List list) {
        this.c.a(sSLSocket, str, list);
    }

    public String a(SSLSocket sSLSocket) {
        return this.c.b(sSLSocket);
    }

    static {
        b = djj.b;
        a = diu.a(diu.class.getClassLoader());
    }
}
