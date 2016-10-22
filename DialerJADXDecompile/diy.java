import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
final class diy {
    private static final List a;

    static {
        a = Collections.unmodifiableList(Arrays.asList(new djn[]{djn.HTTP_2}));
    }

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, dje dje) {
        String[] strArr;
        cob.i((Object) sSLSocketFactory);
        cob.i((Object) socket);
        cob.i((Object) dje);
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        if (dje.b != null) {
            strArr = (String[]) djp.a(String.class, dje.b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        dje a = new djf(dje).a(strArr).b((String[]) djp.a(String.class, dje.c, sSLSocket.getEnabledProtocols())).a();
        sSLSocket.setEnabledProtocols(a.c);
        strArr = a.b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
        Object a2 = diu.a.a(sSLSocket, str, dje.d ? a : null);
        cob.b("h2".equals(a2), "Only \"h2\" is supported, but negotiated protocol is %s", a2);
        if (djh.a.verify(str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        String str2 = "Cannot verify hostname: ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            valueOf = str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        throw new SSLPeerUnverifiedException(valueOf);
    }
}
