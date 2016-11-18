package defpackage;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;

public final class aje extends DefaultClientConnectionOperator {
    private static final PlainSocketFactory a = new PlainSocketFactory();
    private final boolean b;

    public aje(SchemeRegistry schemeRegistry, boolean z) {
        super(schemeRegistry);
        this.b = z;
    }

    private ArrayList<InetAddress> a(String str) {
        ArrayList<InetAddress> arrayList = new ArrayList();
        for (Object obj : InetAddress.getAllByName(str)) {
            if (this.b && (obj instanceof Inet6Address)) {
                arrayList.add(obj);
            } else if (!this.b && (obj instanceof Inet4Address)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void openConnection(org.apache.http.conn.OperatedClientConnection r15, org.apache.http.HttpHost r16, java.net.InetAddress r17, org.apache.http.protocol.HttpContext r18, org.apache.http.params.HttpParams r19) {
        /*
        r14 = this;
        if (r15 != 0) goto L_0x000a;
    L_0x0002:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Connection must not be null.";
        r2.<init>(r3);
        throw r2;
    L_0x000a:
        if (r16 != 0) goto L_0x0014;
    L_0x000c:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Target host must not be null.";
        r2.<init>(r3);
        throw r2;
    L_0x0014:
        if (r19 != 0) goto L_0x001e;
    L_0x0016:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Parameters must not be null.";
        r2.<init>(r3);
        throw r2;
    L_0x001e:
        r2 = r15.isOpen();
        if (r2 == 0) goto L_0x002c;
    L_0x0024:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Connection must not be open.";
        r2.<init>(r3);
        throw r2;
    L_0x002c:
        r2 = r14.schemeRegistry;
        r3 = r16.getSchemeName();
        r12 = r2.getScheme(r3);
        r9 = r12.getSocketFactory();
        r2 = r9 instanceof org.apache.http.conn.scheme.LayeredSocketFactory;
        if (r2 == 0) goto L_0x00ac;
    L_0x003e:
        r3 = a;
        r2 = r9;
        r2 = (org.apache.http.conn.scheme.LayeredSocketFactory) r2;
        r10 = r2;
        r2 = r3;
    L_0x0045:
        r3 = r16.getHostName();
        r13 = r14.a(r3);
        r3 = 0;
        r11 = r3;
    L_0x004f:
        r3 = r13.size();
        if (r11 >= r3) goto L_0x00ab;
    L_0x0055:
        r3 = r2.createSocket();
        r0 = r16;
        r15.opening(r3, r0);
        r4 = r13.get(r11);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r4 = (java.net.InetAddress) r4;	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r4 = r4.getHostAddress();	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r5 = r16.getPort();	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r5 = r12.resolvePort(r5);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r7 = 0;
        r6 = r17;
        r8 = r19;
        r4 = r2.connectSocket(r3, r4, r5, r6, r7, r8);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        if (r3 == r4) goto L_0x0081;
    L_0x007b:
        r0 = r16;
        r15.opening(r4, r0);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r3 = r4;
    L_0x0081:
        r0 = r18;
        r1 = r19;
        r14.prepareSocket(r3, r0, r1);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        if (r10 == 0) goto L_0x00b0;
    L_0x008a:
        r4 = r16.getHostName();	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r5 = r16.getPort();	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r5 = r12.resolvePort(r5);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r6 = 1;
        r4 = r10.createSocket(r3, r4, r5, r6);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        if (r4 == r3) goto L_0x00a2;
    L_0x009d:
        r0 = r16;
        r15.opening(r4, r0);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
    L_0x00a2:
        r3 = r9.isSecure(r4);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r0 = r19;
        r15.openCompleted(r3, r0);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
    L_0x00ab:
        return;
    L_0x00ac:
        r2 = 0;
        r10 = r2;
        r2 = r9;
        goto L_0x0045;
    L_0x00b0:
        r3 = r9.isSecure(r3);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        r0 = r19;
        r15.openCompleted(r3, r0);	 Catch:{ SocketException -> 0x00ba, ConnectTimeoutException -> 0x00e2 }
        goto L_0x00ab;
    L_0x00ba:
        r3 = move-exception;
        r4 = r13.size();
        r4 = r4 + -1;
        if (r11 != r4) goto L_0x00ec;
    L_0x00c3:
        r2 = r3 instanceof java.net.ConnectException;
        if (r2 == 0) goto L_0x00d2;
    L_0x00c7:
        r2 = r3;
        r2 = (java.net.ConnectException) r2;
    L_0x00ca:
        r3 = new org.apache.http.conn.HttpHostConnectException;
        r0 = r16;
        r3.<init>(r0, r2);
        throw r3;
    L_0x00d2:
        r2 = new java.net.ConnectException;
        r4 = r3.getMessage();
        r2.<init>(r4);
        r2 = r2.initCause(r3);
        r2 = (java.net.ConnectException) r2;
        goto L_0x00ca;
    L_0x00e2:
        r3 = move-exception;
        r4 = r13.size();
        r4 = r4 + -1;
        if (r11 != r4) goto L_0x00ec;
    L_0x00eb:
        throw r3;
    L_0x00ec:
        r3 = r11 + 1;
        r11 = r3;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: aje.openConnection(org.apache.http.conn.OperatedClientConnection, org.apache.http.HttpHost, java.net.InetAddress, org.apache.http.protocol.HttpContext, org.apache.http.params.HttpParams):void");
    }
}
