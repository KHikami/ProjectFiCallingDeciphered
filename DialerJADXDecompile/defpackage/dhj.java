package defpackage;

import java.net.SocketAddress;

/* compiled from: PG */
/* renamed from: dhj */
public final class dhj {
    final SocketAddress a;
    private final dfc b;

    public dhj(SocketAddress socketAddress, dfc dfc) {
        this.a = socketAddress;
        this.b = dfc;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("[address=").append(valueOf).append(", attrs=").append(valueOf2).append("]").toString();
    }
}
