package p000;

import java.net.ConnectException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import org.apache.http.HttpHost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public final class aje extends DefaultClientConnectionOperator {
    private static final PlainSocketFactory f1000a = new PlainSocketFactory();
    private final boolean f1001b;

    public aje(SchemeRegistry schemeRegistry, boolean z) {
        super(schemeRegistry);
        this.f1001b = z;
    }

    private ArrayList<InetAddress> m2608a(String str) {
        ArrayList<InetAddress> arrayList = new ArrayList();
        for (Object obj : InetAddress.getAllByName(str)) {
            if (this.f1001b && (obj instanceof Inet6Address)) {
                arrayList.add(obj);
            } else if (!this.f1001b && (obj instanceof Inet4Address)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openConnection(OperatedClientConnection operatedClientConnection, HttpHost httpHost, InetAddress inetAddress, HttpContext httpContext, HttpParams httpParams) {
        if (operatedClientConnection == null) {
            throw new IllegalArgumentException("Connection must not be null.");
        } else if (httpHost == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (httpParams == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (operatedClientConnection.isOpen()) {
            throw new IllegalArgumentException("Connection must not be open.");
        } else {
            LayeredSocketFactory layeredSocketFactory;
            SocketFactory socketFactory;
            Scheme scheme = this.schemeRegistry.getScheme(httpHost.getSchemeName());
            SocketFactory socketFactory2 = scheme.getSocketFactory();
            if (socketFactory2 instanceof LayeredSocketFactory) {
                layeredSocketFactory = (LayeredSocketFactory) socketFactory2;
                socketFactory = f1000a;
            } else {
                layeredSocketFactory = null;
                socketFactory = socketFactory2;
            }
            ArrayList a = m2608a(httpHost.getHostName());
            int i = 0;
            while (i < a.size()) {
                Socket createSocket = socketFactory.createSocket();
                operatedClientConnection.opening(createSocket, httpHost);
                try {
                    Socket connectSocket = socketFactory.connectSocket(createSocket, ((InetAddress) a.get(i)).getHostAddress(), scheme.resolvePort(httpHost.getPort()), inetAddress, 0, httpParams);
                    if (createSocket != connectSocket) {
                        operatedClientConnection.opening(connectSocket, httpHost);
                        createSocket = connectSocket;
                    }
                    prepareSocket(createSocket, httpContext, httpParams);
                    if (layeredSocketFactory != null) {
                        connectSocket = layeredSocketFactory.createSocket(createSocket, httpHost.getHostName(), scheme.resolvePort(httpHost.getPort()), true);
                        if (connectSocket != createSocket) {
                            operatedClientConnection.opening(connectSocket, httpHost);
                        }
                        operatedClientConnection.openCompleted(socketFactory2.isSecure(connectSocket), httpParams);
                        return;
                    }
                    operatedClientConnection.openCompleted(socketFactory2.isSecure(createSocket), httpParams);
                    return;
                } catch (Throwable e) {
                    if (i == a.size() - 1) {
                        ConnectException connectException;
                        if (e instanceof ConnectException) {
                            connectException = (ConnectException) e;
                        } else {
                            connectException = (ConnectException) new ConnectException(e.getMessage()).initCause(e);
                        }
                        throw new HttpHostConnectException(httpHost, connectException);
                    }
                } catch (ConnectTimeoutException e2) {
                    if (i == a.size() - 1) {
                        throw e2;
                    }
                }
            }
        }
    }
}
