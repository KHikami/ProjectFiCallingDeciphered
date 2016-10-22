package defpackage;

import java.security.Security;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* renamed from: div */
final class div extends diu {
    static final diw b;
    private static final dji c;
    private static final dji d;
    private static final dji e;
    private static final dji f;
    private static final dji g;
    private static final dji h;
    private final diw i;

    static {
        c = new dji(null, "setUseSessionTickets", Boolean.TYPE);
        d = new dji(null, "setHostname", String.class);
        e = new dji(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        f = new dji(null, "setAlpnProtocols", byte[].class);
        g = new dji(byte[].class, "getNpnSelectedProtocol", new Class[0]);
        h = new dji(null, "setNpnProtocols", byte[].class);
        b = div.a(div.class.getClassLoader());
    }

    div(djj djj, diw diw) {
        super(djj);
        this.i = (diw) cob.b((Object) diw, (Object) "Unable to pick a TLS extension");
    }

    public final String a(SSLSocket sSLSocket, String str, List list) {
        String a = a(sSLSocket);
        if (a == null) {
            return super.a(sSLSocket, str, list);
        }
        return a;
    }

    protected final void b(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            c.a(sSLSocket, Boolean.valueOf(true));
            d.a(sSLSocket, str);
        }
        Object[] objArr = new Object[]{djj.a(list)};
        if (this.i == diw.ALPN_AND_NPN) {
            f.b(sSLSocket, objArr);
        }
        if (this.i != null) {
            h.b(sSLSocket, objArr);
            return;
        }
        throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
    }

    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        if (this.i == diw.ALPN_AND_NPN) {
            try {
                bArr = (byte[]) e.b(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, djp.b);
                }
            } catch (Exception e) {
            }
        }
        if (this.i != null) {
            try {
                bArr = (byte[]) g.b(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, djp.b);
                }
            } catch (Exception e2) {
            }
        }
        return null;
    }

    private static diw a(ClassLoader classLoader) {
        if (Security.getProvider("GmsCore_OpenSSL") != null) {
            return diw.ALPN_AND_NPN;
        }
        try {
            classLoader.loadClass("android.net.Network");
            return diw.ALPN_AND_NPN;
        } catch (ClassNotFoundException e) {
            try {
                classLoader.loadClass("android.app.ActivityOptions");
                return diw.NPN;
            } catch (ClassNotFoundException e2) {
                return null;
            }
        }
    }
}
