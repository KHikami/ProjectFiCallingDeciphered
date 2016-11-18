package defpackage;

import java.net.SocketAddress;
import java.util.Arrays;

public final class olt {
    private final SocketAddress a;
    private final ojh b;

    public olt(SocketAddress socketAddress, ojh ojh) {
        this.a = (SocketAddress) bm.a(socketAddress);
        this.b = (ojh) bm.a(ojh);
    }

    public SocketAddress a() {
        return this.a;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("[address=").append(valueOf).append(", attrs=").append(valueOf2).append("]").toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        olt olt = (olt) obj;
        if (mez.b(this.a, olt.a) && mez.b(this.b, olt.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
