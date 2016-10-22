package defpackage;

import android.content.Context;
import java.net.InetAddress;
import java.net.Socket;
import java.security.PrivateKey;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: hha */
public final class hha extends SSLSocketFactory {
    private static final TrustManager[] m;
    SSLSocketFactory a;
    SSLSocketFactory b;
    TrustManager[] c;
    KeyManager[] d;
    byte[] e;
    byte[] f;
    PrivateKey g;
    final Context h;
    final int i;
    final boolean j;
    final boolean k;
    final String l;

    static {
        m = new TrustManager[]{new hhb()};
    }

    public hha(Context context, int i, boolean z, boolean z2, String str) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = context.getApplicationContext();
        this.i = i;
        this.j = true;
        this.k = true;
        this.l = null;
    }

    private synchronized SSLSocketFactory a() {
        SSLSocketFactory sSLSocketFactory;
        if (this.k) {
            if (this.l != null) {
                if (this.b == null) {
                    this.b = hhc.a().a(this.h, null, null, this.l);
                }
            } else if (this.b == null) {
                this.b = hhc.a().a(this.h, null, null, this.j);
            }
            sSLSocketFactory = this.b;
        } else {
            if (this.a == null) {
                this.a = hhc.a().a(this.h, null, m, this.j);
            }
            sSLSocketFactory = this.a;
        }
        return sSLSocketFactory;
    }

    private static void a(Socket socket, int i) {
        Throwable e;
        String valueOf;
        if (socket != null) {
            try {
                socket.getClass().getMethod("setHandshakeTimeout", new Class[]{Integer.TYPE}).invoke(socket, new Object[]{Integer.valueOf(i)});
            } catch (Throwable e2) {
                Throwable th = e2;
                e2 = th.getCause();
                if (e2 instanceof RuntimeException) {
                    throw ((RuntimeException) e2);
                }
                valueOf = String.valueOf(socket.getClass());
                throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Failed to invoke setSocketHandshakeTimeout on ").append(valueOf).toString(), th);
            } catch (NoSuchMethodException e3) {
                e2 = e3;
                valueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 45).append(valueOf).append(" does not implement setSocketHandshakeTimeout").toString(), e2);
            } catch (IllegalAccessException e4) {
                e2 = e4;
                valueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 45).append(valueOf).append(" does not implement setSocketHandshakeTimeout").toString(), e2);
            }
        }
    }

    private static void a(Socket socket, String str) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if (session == null) {
                throw new SSLException("Cannot verify SSL socket without session");
            } else if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(str, session)) {
                String str2 = "Cannot verify hostname: ";
                String valueOf = String.valueOf(str);
                throw new SSLPeerUnverifiedException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("Attempt to verify non-SSL socket");
    }

    private static void a(Socket socket, PrivateKey privateKey) {
        Throwable e;
        String valueOf;
        if (socket != null) {
            try {
                socket.getClass().getMethod("setChannelIdPrivateKey", new Class[]{PrivateKey.class}).invoke(socket, new Object[]{null});
            } catch (Throwable e2) {
                Throwable th = e2;
                e2 = th.getCause();
                if (e2 instanceof RuntimeException) {
                    throw ((RuntimeException) e2);
                }
                valueOf = String.valueOf(socket.getClass());
                throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Failed to invoke setChannelIdPrivateKey on ").append(valueOf).toString(), th);
            } catch (NoSuchMethodException e3) {
                e2 = e3;
                valueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 42).append(valueOf).append(" does not implement setChannelIdPrivateKey").toString(), e2);
            } catch (IllegalAccessException e4) {
                e2 = e4;
                valueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 42).append(valueOf).append(" does not implement setChannelIdPrivateKey").toString(), e2);
            }
        }
    }

    private static void a(Socket socket, byte[] bArr) {
        Throwable e;
        String valueOf;
        if (socket != null) {
            try {
                socket.getClass().getMethod("setNpnProtocols", new Class[]{byte[].class}).invoke(socket, new Object[]{null});
            } catch (Throwable e2) {
                Throwable th = e2;
                e2 = th.getCause();
                if (e2 instanceof RuntimeException) {
                    throw ((RuntimeException) e2);
                }
                valueOf = String.valueOf(socket.getClass());
                throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to invoke setNpnProtocols on ").append(valueOf).toString(), th);
            } catch (NoSuchMethodException e3) {
                e2 = e3;
                valueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 35).append(valueOf).append(" does not implement setNpnProtocols").toString(), e2);
            } catch (IllegalAccessException e4) {
                e2 = e4;
                valueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 35).append(valueOf).append(" does not implement setNpnProtocols").toString(), e2);
            }
        }
    }

    private static void b(Socket socket, byte[] bArr) {
        Throwable e;
        String valueOf;
        if (socket != null) {
            try {
                socket.getClass().getMethod("setAlpnProtocols", new Class[]{byte[].class}).invoke(socket, new Object[]{null});
            } catch (Throwable e2) {
                Throwable th = e2;
                e2 = th.getCause();
                if (e2 instanceof RuntimeException) {
                    throw ((RuntimeException) e2);
                }
                valueOf = String.valueOf(socket.getClass());
                throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 37).append("Failed to invoke setAlpnProtocols on ").append(valueOf).toString(), th);
            } catch (NoSuchMethodException e3) {
                e2 = e3;
                valueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 36).append(valueOf).append(" does not implement setAlpnProtocols").toString(), e2);
            } catch (IllegalAccessException e4) {
                e2 = e4;
                valueOf = String.valueOf(socket.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 36).append(valueOf).append(" does not implement setAlpnProtocols").toString(), e2);
            }
        }
    }

    public Socket createSocket() {
        Socket createSocket = a().createSocket();
        hha.a(createSocket, null);
        hha.b(createSocket, null);
        hha.a(createSocket, this.i);
        hha.a(createSocket, null);
        return createSocket;
    }

    public Socket createSocket(String str, int i) {
        Socket createSocket = a().createSocket(str, i);
        hha.a(createSocket, null);
        hha.b(createSocket, null);
        hha.a(createSocket, this.i);
        hha.a(createSocket, null);
        if (this.k) {
            hha.a(createSocket, str);
        }
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = a().createSocket(str, i, inetAddress, i2);
        hha.a(createSocket, null);
        hha.b(createSocket, null);
        hha.a(createSocket, this.i);
        hha.a(createSocket, null);
        if (this.k) {
            hha.a(createSocket, str);
        }
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = a().createSocket(inetAddress, i);
        hha.a(createSocket, null);
        hha.b(createSocket, null);
        hha.a(createSocket, this.i);
        hha.a(createSocket, null);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = a().createSocket(inetAddress, i, inetAddress2, i2);
        hha.a(createSocket, null);
        hha.b(createSocket, null);
        hha.a(createSocket, this.i);
        hha.a(createSocket, null);
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = a().createSocket(socket, str, i, z);
        hha.a(createSocket, null);
        hha.b(createSocket, null);
        hha.a(createSocket, this.i);
        hha.a(createSocket, null);
        if (this.k) {
            hha.a(createSocket, str);
        }
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return a().getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return a().getSupportedCipherSuites();
    }
}
