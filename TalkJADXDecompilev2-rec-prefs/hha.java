package p000;

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

public final class hha extends SSLSocketFactory {
    private static final TrustManager[] f16947m = new TrustManager[]{new hhb()};
    SSLSocketFactory f16948a = null;
    SSLSocketFactory f16949b = null;
    TrustManager[] f16950c = null;
    KeyManager[] f16951d = null;
    byte[] f16952e = null;
    byte[] f16953f = null;
    PrivateKey f16954g = null;
    final Context f16955h;
    final int f16956i;
    final boolean f16957j;
    final boolean f16958k;
    final String f16959l;

    public hha(Context context, int i, boolean z, boolean z2, String str) {
        this.f16955h = context.getApplicationContext();
        this.f16956i = i;
        this.f16957j = true;
        this.f16958k = true;
        this.f16959l = null;
    }

    private synchronized SSLSocketFactory m19781a() {
        SSLSocketFactory sSLSocketFactory;
        if (this.f16958k) {
            if (this.f16959l != null) {
                if (this.f16949b == null) {
                    this.f16949b = hhc.m19787a().m19789a(this.f16955h, null, null, this.f16959l);
                }
            } else if (this.f16949b == null) {
                this.f16949b = hhc.m19787a().m19790a(this.f16955h, null, null, this.f16957j);
            }
            sSLSocketFactory = this.f16949b;
        } else {
            if (this.f16948a == null) {
                this.f16948a = hhc.m19787a().m19790a(this.f16955h, null, f16947m, this.f16957j);
            }
            sSLSocketFactory = this.f16948a;
        }
        return sSLSocketFactory;
    }

    private static void m19782a(Socket socket, int i) {
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

    private static void m19783a(Socket socket, String str) {
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

    private static void m19784a(Socket socket, PrivateKey privateKey) {
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

    private static void m19785a(Socket socket, byte[] bArr) {
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

    private static void m19786b(Socket socket, byte[] bArr) {
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
        Socket createSocket = m19781a().createSocket();
        hha.m19785a(createSocket, null);
        hha.m19786b(createSocket, null);
        hha.m19782a(createSocket, this.f16956i);
        hha.m19784a(createSocket, null);
        return createSocket;
    }

    public Socket createSocket(String str, int i) {
        Socket createSocket = m19781a().createSocket(str, i);
        hha.m19785a(createSocket, null);
        hha.m19786b(createSocket, null);
        hha.m19782a(createSocket, this.f16956i);
        hha.m19784a(createSocket, null);
        if (this.f16958k) {
            hha.m19783a(createSocket, str);
        }
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = m19781a().createSocket(str, i, inetAddress, i2);
        hha.m19785a(createSocket, null);
        hha.m19786b(createSocket, null);
        hha.m19782a(createSocket, this.f16956i);
        hha.m19784a(createSocket, null);
        if (this.f16958k) {
            hha.m19783a(createSocket, str);
        }
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = m19781a().createSocket(inetAddress, i);
        hha.m19785a(createSocket, null);
        hha.m19786b(createSocket, null);
        hha.m19782a(createSocket, this.f16956i);
        hha.m19784a(createSocket, null);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = m19781a().createSocket(inetAddress, i, inetAddress2, i2);
        hha.m19785a(createSocket, null);
        hha.m19786b(createSocket, null);
        hha.m19782a(createSocket, this.f16956i);
        hha.m19784a(createSocket, null);
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = m19781a().createSocket(socket, str, i, z);
        hha.m19785a(createSocket, null);
        hha.m19786b(createSocket, null);
        hha.m19782a(createSocket, this.f16956i);
        hha.m19784a(createSocket, null);
        if (this.f16958k) {
            hha.m19783a(createSocket, str);
        }
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return m19781a().getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return m19781a().getSupportedCipherSuites();
    }
}
