package p000;

import java.net.SocketAddress;
import java.util.Arrays;

public final class olt {
    private final SocketAddress f33183a;
    private final ojh f33184b;

    public olt(SocketAddress socketAddress, ojh ojh) {
        this.f33183a = (SocketAddress) bm.a(socketAddress);
        this.f33184b = (ojh) bm.a(ojh);
    }

    public SocketAddress m38697a() {
        return this.f33183a;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f33183a);
        String valueOf2 = String.valueOf(this.f33184b);
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
        if (mez.b(this.f33183a, olt.f33183a) && mez.b(this.f33184b, olt.f33184b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33183a, this.f33184b});
    }
}
